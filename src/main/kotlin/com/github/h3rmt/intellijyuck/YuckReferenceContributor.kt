package com.github.h3rmt.intellijyuck

import com.github.h3rmt.intellijyuck.psi.YuckCustomWidgetDefinition
import com.github.h3rmt.intellijyuck.psi.YuckCustomWidgetReference
import com.github.h3rmt.intellijyuck.psi.YuckFile
import com.github.h3rmt.intellijyuck.psi.YuckTypes
import com.intellij.patterns.PlatformPatterns
import com.intellij.psi.*
import com.intellij.util.ProcessingContext
import com.intellij.util.containers.toArray


class YuckReferenceContributor : PsiReferenceContributor() {
  override fun registerReferenceProviders(registrar: PsiReferenceRegistrar) {
    registrar.registerReferenceProvider(
      PlatformPatterns.psiElement(PsiComment::class.java)
        .inFile(
          PlatformPatterns.psiElement(YuckFile::class.java)
        ),
      YuckCommentReferenceProvider()
    )
  }

  class YuckCommentReferenceProvider : PsiReferenceProvider() {
    override fun getReferencesByElement(element: PsiElement, context: ProcessingContext): Array<out PsiReference> {
      val properties = YuckUtil.find<YuckCustomWidgetDefinition>(element.project)
      LOG.warn("properties: $properties element: $element")

      return properties.map {
        PsiReferenceBase.createSelfReference(element, element.textRange, it.parent)
      }.toArray(emptyArray())
    }
  }
}