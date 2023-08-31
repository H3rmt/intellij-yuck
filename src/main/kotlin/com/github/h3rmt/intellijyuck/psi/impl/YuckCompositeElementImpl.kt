package com.github.h3rmt.intellijyuck.psi.impl

import com.github.h3rmt.intellijyuck.psi.YuckCompositeElement
import com.intellij.extapi.psi.ASTWrapperPsiElement
import com.intellij.lang.ASTNode

open class YuckCompositeElementImpl(node: ASTNode) : ASTWrapperPsiElement(node), YuckCompositeElement {
  override fun toString(): String {
    return node.elementType.toString()
  }
}