package com.github.h3rmt.intellijyuck.psi.impl

import com.github.h3rmt.intellijyuck.psi.YuckCompositeElement
import com.intellij.extapi.psi.StubBasedPsiElementBase
import com.intellij.lang.ASTNode
import com.intellij.psi.stubs.IStubElementType
import com.intellij.psi.stubs.StubBase

abstract class YuckStubbedElementImpl<T : StubBase<*>> : StubBasedPsiElementBase<T>, YuckCompositeElement {
  constructor(stub: T, nodeType: IStubElementType<*, *>) : super(stub, nodeType)
  constructor(node: ASTNode) : super(node)

  override fun toString() = elementType.toString()
}