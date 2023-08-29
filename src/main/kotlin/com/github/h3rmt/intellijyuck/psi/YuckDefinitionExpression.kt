package com.github.h3rmt.intellijyuck.psi

interface YuckDefinitionExpression : YuckCompositeElement {
  fun getReferenceName(): String
}