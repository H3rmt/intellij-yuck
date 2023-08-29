package com.github.h3rmt.intellijyuck.stubs

import com.github.h3rmt.intellijyuck.stubs.types.YuckCustomWidgetDefinitionStubElementType
import com.github.h3rmt.intellijyuck.stubs.types.YuckStubElementType
import com.github.h3rmt.intellijyuck.stubs.types.YuckWindowDefinitionStubElementType
import com.intellij.openapi.diagnostic.logger
import com.intellij.psi.PsiElement
import com.intellij.psi.stubs.StubBase

object YuckElementTypeFactory {
  private val LOG = logger<YuckElementTypeFactory>()

  @JvmStatic
  fun stubFactory(name: String): YuckStubElementType<out StubBase<out PsiElement>, *> {
//    LOG.warn("stubFactory: $name")

    return when (name) {
      "CUSTOM_WIDGET_DEFINITION" -> YuckCustomWidgetDefinitionStubElementType(name)
      "WINDOW_DEFINITION" -> YuckWindowDefinitionStubElementType(name)

      else -> throw RuntimeException("Unknown element type: $name")
    }
  }
}