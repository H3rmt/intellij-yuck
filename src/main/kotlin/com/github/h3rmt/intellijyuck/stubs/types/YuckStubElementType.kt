package com.github.h3rmt.intellijyuck.stubs.types

import com.github.h3rmt.intellijyuck.YuckLanguage
import com.github.h3rmt.intellijyuck.psi.YuckCompositeElement
import com.intellij.psi.stubs.IStubElementType
import com.intellij.psi.stubs.IndexSink
import com.intellij.psi.stubs.StubBase

abstract class YuckStubElementType<S : StubBase<T>, T : YuckCompositeElement>(debugName: String) :
  IStubElementType<S, T>(debugName, YuckLanguage) {

  override fun getExternalId() = "Yuck." + super.toString()

  override fun indexStub(stub: S, sink: IndexSink) {}
}
