package com.github.h3rmt.intellijyuck

import com.github.h3rmt.intellijyuck.psi.YuckCustomWidgetDefinition
import com.github.h3rmt.intellijyuck.psi.YuckCustomWidgetReference
import com.github.h3rmt.intellijyuck.psi.YuckDefinitionExpression
import com.github.h3rmt.intellijyuck.psi.YuckTypes
import com.intellij.codeInsight.daemon.LineMarkerInfo
import com.intellij.codeInsight.daemon.LineMarkerProviderDescriptor
import com.intellij.codeInsight.navigation.GotoImplementationHandler
import com.intellij.codeInsight.navigation.NavigationGutterIconBuilder
import com.intellij.icons.AllIcons
import com.intellij.ide.util.DefaultPsiElementCellRenderer
import com.intellij.ide.util.PsiElementListCellRenderer
import com.intellij.openapi.progress.ProgressManager
import com.intellij.openapi.util.Computable
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.tree.LeafPsiElement


class YuckLineMarkerProvider : LineMarkerProviderDescriptor() {
  override fun getName() = "Go to Implementations"

  override fun getLineMarkerInfo(element: PsiElement) = null


  override fun collectSlowLineMarkers(elements: List<PsiElement>, result: MutableCollection<in LineMarkerInfo<*>?>) {
    for (element in elements) {
      ProgressManager.checkCanceled()

      if (element !is LeafPsiElement || element.elementType != YuckTypes.IDENTIFIER)
        continue
      val parent = element.getParent()

      if (parent is YuckCustomWidgetDefinition) {
//        LOG.warn("Found widget definition: ${element.text} ${element.elementType} ${parent.text} ${parent.elementType}")
        val properties = YuckUtil.find<YuckCustomWidgetReference>(element.getProject(), element.text)
//        LOG.warn("Found ${properties} properties for ${element.text}")
        if (properties.isEmpty())
          continue


        val builder: NavigationGutterIconBuilder<PsiElement> =
          NavigationGutterIconBuilder.create(AllIcons.Gutter.ImplementingMethod)
            .setTargets(properties)
            .setTooltipText("Navigate to Widget reference")
            .setCellRenderer(object : Computable<PsiElementListCellRenderer<*>> {
              override fun compute(): DefaultPsiElementCellRenderer {
                return object : DefaultPsiElementCellRenderer() {
                  override fun getComparator(): Comparator<PsiElement> {
                    return GotoImplementationHandler.projectElementsFirst(element.project)
                      .thenComparing(super.getComparator())
                  }

                  override fun getElementText(element: PsiElement?): String {
                    val field = element as? YuckCustomWidgetReference ?: return super.getElementText(element)
//                    LOG.warn("element: ${field.text} ${field.elementType} ${parent.text} ${parent.elementType}")
                    val parent = field.parent as? YuckDefinitionExpression ?: return super.getElementText(field)
                    return parent.getReferenceName()
                  }
                }
              }
            }
            )
        result.add(builder.createLineMarkerInfo(element))
      }
    }
  }
}

