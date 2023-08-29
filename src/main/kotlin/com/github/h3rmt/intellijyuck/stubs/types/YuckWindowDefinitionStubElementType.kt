package com.github.h3rmt.intellijyuck.stubs.types

import com.github.h3rmt.intellijyuck.psi.YuckWindowDefinition
import com.github.h3rmt.intellijyuck.psi.impl.YuckWindowDefinitionImpl
import com.github.h3rmt.intellijyuck.stubs.YuckWindowDefinitionStub
import com.intellij.psi.stubs.StubElement
import com.intellij.psi.stubs.StubInputStream
import com.intellij.psi.stubs.StubOutputStream

class YuckWindowDefinitionStubElementType(name: String) :
  YuckNamedStubElementType<YuckWindowDefinitionStub, YuckWindowDefinition>(name) {
  override fun createPsi(stub: YuckWindowDefinitionStub): YuckWindowDefinition {
    return YuckWindowDefinitionImpl(stub, this)
  }

  override fun createStub(psi: YuckWindowDefinition, parentStub: StubElement<*>?): YuckWindowDefinitionStub {
    return YuckWindowDefinitionStub(parentStub, this, psi.name)
  }

  override fun serialize(stub: YuckWindowDefinitionStub, dataStream: StubOutputStream) {
    dataStream.writeName(stub.name)
  }

  override fun deserialize(dataStream: StubInputStream, parentStub: StubElement<*>?): YuckWindowDefinitionStub {
    return YuckWindowDefinitionStub(parentStub, this, dataStream.readName())
  }
}
