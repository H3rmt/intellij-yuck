package com.github.h3rmt.intellijyuck.completion

import com.github.h3rmt.intellijyuck.YuckUtil
import com.github.h3rmt.intellijyuck.psi.YuckCustomWidgetDefinition
import com.intellij.psi.*
import com.intellij.util.ProcessingContext
import com.intellij.util.containers.toArray


class YuckReferenceContributor : PsiReferenceContributor() {
  override fun registerReferenceProviders(registrar: PsiReferenceRegistrar) {
//    registrar.registerReferenceProvider(
//      PlatformPatterns.psiElement(PsiComment::class.java)
//        .inFile(
//          PlatformPatterns.psiElement(YuckFile::class.java)
//        ),
//      YuckCommentReferenceProvider()
//    )
  }

  class YuckCommentReferenceProvider : PsiReferenceProvider() {
    override fun getReferencesByElement(element: PsiElement, context: ProcessingContext): Array<out PsiReference> {
      val properties = YuckUtil.find<YuckCustomWidgetDefinition>(element.project)
//      LOG.warn("properties: $properties element: $element")

      return properties.map {
        PsiReferenceBase.createSelfReference(element, element.textRange, it.parent)
      }.toArray(emptyArray())
    }
  }
}