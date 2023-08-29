package com.github.h3rmt.intellijyuck.psi

import com.intellij.psi.PsiElement

object YuckPsiImplUtil {
  @JvmStatic
  fun isTrue(o: YuckBooleanExpression): Boolean {
    return o.getTrue() != null
  }

  @JvmStatic
  fun getName(o: YuckNamedElement): String {
    return o.getIdentifier()?.text ?: ""
  }

  @JvmStatic
  fun setName(o: YuckNamedElement, newName: String): PsiElement {
    throw UnsupportedOperationException()
  }

  @JvmStatic
  fun getReferenceName(o: YuckWindowDefinition): String {
    return "Window " + (o.stub?.name ?: o.getIdentifier()?.text ?: "")
  }

  @JvmStatic
  fun getReferenceName(o: YuckCustomWidgetDefinition): String {
    return "Widget " + (o.stub?.name ?: o.getIdentifier()?.text ?: "")
  }

  @JvmStatic
  fun getReferenceName(o: YuckComboBoxTextDefinition): String {
    return "ComboBoxText"
  }

  @JvmStatic
  fun getReferenceName(o: YuckExpanderDefinition): String {
    return "Expander"
  }

  @JvmStatic
  fun getReferenceName(o: YuckBoxDefinition): String {
    return "Box"
  }


//    @JvmStatic
//    fun getQualifier(o: YuckWindowDefinition): YuckCompositeElement? {
//        return null
////        return PsiTreeUtil.getChildOfType(o, YuckExpression::class.java)
//    }
//
//    @JvmStatic
//    fun resolve(o: YuckWindowDefinition): YuckCompositeElement? {
//        return o.referenceExpression.resolve()
//    }
//
//    @JvmStatic
//    fun getQualifier(o: YuckWidgetDefinition): YuckCompositeElement? {
//        return null
////        return PsiTreeUtil.getChildOfType(o, YuckExpression::class.java)
//    }
//
//    @JvmStatic
//    fun resolve(o: YuckWidgetDefinition): YuckCompositeElement? {
//        return o.referenceExpression.resolve()
//    }
//
//    fun getReferenceExpression(): YuckReferenceExpression {
//        return notNullChild(VlangPsiTreeUtil.getChildOfType(this, VlangReferenceExpression::class.java))
//    }
}