package com.github.h3rmt.intellijyuck


import com.github.h3rmt.intellijyuck.psi.YuckCompositeElement
import com.github.h3rmt.intellijyuck.psi.YuckCustomWidgetDefinition
import com.github.h3rmt.intellijyuck.psi.YuckCustomWidgetReference
import com.github.h3rmt.intellijyuck.psi.YuckReferenceExpression
import com.github.h3rmt.intellijyuck.psi.YuckTypes
import com.github.h3rmt.intellijyuck.psi.YuckWindowDefinition
import com.intellij.codeInspection.ProblemHighlightType
import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.lang.annotation.HighlightSeverity
import com.intellij.openapi.diagnostic.logger
import com.intellij.psi.PsiElement
import com.intellij.psi.util.elementType


class YuckAnnotator : Annotator {
  val LOG = logger<YuckAnnotator>()
  override fun annotate(element: PsiElement, holder: AnnotationHolder) {
    if (holder.isBatchMode)
      return
    val parent = element.parent as? YuckCompositeElement ?: return

    if (element.elementType == YuckTypes.IDENTIFIER && parent is YuckReferenceExpression) {
//      LOG.warn("Annotating reference: ${element.text} ${element.elementType} ${parent.text} ${parent.elementType}")

      when (element.parent) {
        is YuckCustomWidgetReference -> {
          val properties = YuckUtil.find<YuckCustomWidgetDefinition>(element.project, element.text)
//          LOG.warn("Found ${properties.size} properties for ${element.text}")
          if (properties.isEmpty()) {
            holder.newAnnotation(HighlightSeverity.ERROR, "Unresolved Widget reference")
              .textAttributes(YuckColor.UNRESOLVEDREFERENCE.textAttributesKey)
              .highlightType(ProblemHighlightType.LIKE_UNKNOWN_SYMBOL)
              .needsUpdateOnTyping()
              .create()
          } else {
            holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
              .textAttributes(YuckColor.REFERENCE.textAttributesKey)
              .create()
          }
          return
        }

        else -> return
      }
    }

  }

}