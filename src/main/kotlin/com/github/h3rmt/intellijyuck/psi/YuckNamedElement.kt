package com.github.h3rmt.intellijyuck.psi

import com.intellij.psi.PsiElement
import com.intellij.psi.PsiNamedElement

interface YuckNamedElement : YuckCompositeElement, PsiNamedElement {
  fun getIdentifier(): PsiElement?
}