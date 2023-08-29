package com.github.h3rmt.intellijyuck.stubs.types

import com.github.h3rmt.intellijyuck.psi.YuckCustomWidgetDefinition
import com.github.h3rmt.intellijyuck.psi.impl.YuckCustomWidgetDefinitionImpl
import com.github.h3rmt.intellijyuck.stubs.YuckCustomWidgetDefinitionStub
import com.intellij.openapi.diagnostic.logger
import com.intellij.psi.stubs.StubElement
import com.intellij.psi.stubs.StubInputStream
import com.intellij.psi.stubs.StubOutputStream

class YuckCustomWidgetDefinitionStubElementType(name: String) :
  YuckNamedStubElementType<YuckCustomWidgetDefinitionStub, YuckCustomWidgetDefinition>(name) {
  private val LOG = logger<YuckCustomWidgetDefinitionStubElementType>()
    override fun createPsi(stub: YuckCustomWidgetDefinitionStub): YuckCustomWidgetDefinition {
    LOG.warn("createPsi: $stub")
    return YuckCustomWidgetDefinitionImpl(stub, this)
  }

  override fun createStub(psi: YuckCustomWidgetDefinition, parentStub: StubElement<*>?): YuckCustomWidgetDefinitionStub {
    LOG.warn("createStub: $psi")
    return YuckCustomWidgetDefinitionStub(parentStub, this, psi.name)
  }

  override fun serialize(stub: YuckCustomWidgetDefinitionStub, dataStream: StubOutputStream) {
    LOG.warn("serialize: $stub")
    dataStream.writeName(stub.name)
  }

  override fun deserialize(dataStream: StubInputStream, parentStub: StubElement<*>?): YuckCustomWidgetDefinitionStub {
    LOG.warn("deserialize: $parentStub")
    return YuckCustomWidgetDefinitionStub(parentStub, this, dataStream.readName())
  }
}
