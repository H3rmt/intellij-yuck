package com.github.h3rmt.intellijyuck.psi

import com.intellij.psi.PsiElement

interface YuckBooleanExpression : YuckCompositeElement {
  fun isTrue(): Boolean

  fun getFalse(): PsiElement?
  fun getTrue(): PsiElement?
}