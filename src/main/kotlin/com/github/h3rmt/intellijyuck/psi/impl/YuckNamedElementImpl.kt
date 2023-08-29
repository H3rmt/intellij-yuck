package com.github.h3rmt.intellijyuck.psi.impl

import com.github.h3rmt.intellijyuck.psi.YuckCompositeElement
import com.github.h3rmt.intellijyuck.psi.YuckNamedElement
import com.github.h3rmt.intellijyuck.stubs.YuckNamedStub
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.stubs.IStubElementType
import com.intellij.util.IncorrectOperationException

abstract class YuckNamedElementImpl<T : YuckNamedStub<*>> :
  YuckStubbedElementImpl<T>,
  YuckCompositeElement,
  YuckNamedElement {

  constructor(stub: T, nodeType: IStubElementType<*, *>) : super(stub, nodeType)
  constructor(node: ASTNode) : super(node)

  override fun getName(): String? = stub?.name ?: getIdentifier()?.text

  override fun setName(name: String): PsiElement {
    throw IncorrectOperationException("Not implemented")
  }
}