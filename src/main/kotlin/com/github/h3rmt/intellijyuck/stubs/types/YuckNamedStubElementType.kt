package com.github.h3rmt.intellijyuck.stubs.types

import com.github.h3rmt.intellijyuck.psi.YuckNamedElement
import com.github.h3rmt.intellijyuck.stubs.YuckNamedStub
import com.github.h3rmt.intellijyuck.stubs.index.YuckNamesIndex
import com.intellij.lang.ASTNode
import com.intellij.psi.stubs.IndexSink

abstract class YuckNamedStubElementType<S : YuckNamedStub<T>, T : YuckNamedElement>(debugName: String) :
  YuckStubElementType<S, T>(debugName) {

  override fun shouldCreateStub(node: ASTNode): Boolean {
    if (!super.shouldCreateStub(node))
      return false
    val psi = node.psi as? YuckNamedElement ?: return false
    val name = psi.name ?: return false
    return name.isNotEmpty()
  }

  override fun indexStub(stub: S, sink: IndexSink) {
    val name = stub.name ?: return
    if (shouldIndex() && name.isNotEmpty()) {

      sink.occurrence(YuckNamesIndex.KEY, name)

//      for (key in getExtraIndexKeys()) {
//        sink.occurrence(key, name)
//      }
    }
  }

  protected fun shouldIndex() = true

//  protected open fun getExtraIndexKeys() = emptyList<StubIndexKey<String, out YuckNamedElement>>()
}
