// This is a generated file. Not intended for manual editing.
package com.github.h3rmt.intellijyuck.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.h3rmt.intellijyuck.psi.YuckTypes.*;
import com.github.h3rmt.intellijyuck.stubs.YuckWindowDefinitionStub;
import com.github.h3rmt.intellijyuck.psi.*;
import com.intellij.psi.stubs.IStubElementType;

public class YuckWindowDefinitionImpl extends YuckNamedElementImpl<YuckWindowDefinitionStub> implements YuckWindowDefinition {

  public YuckWindowDefinitionImpl(@NotNull YuckWindowDefinitionStub stub, @NotNull IStubElementType<?, ?> type) {
    super(stub, type);
  }

  public YuckWindowDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YuckVisitor visitor) {
    visitor.visitWindowDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YuckVisitor) accept((YuckVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public YuckBoxDefinition getBoxDefinition() {
    return PsiTreeUtil.getChildOfType(this, YuckBoxDefinition.class);
  }

  @Override
  @Nullable
  public YuckComboBoxTextDefinition getComboBoxTextDefinition() {
    return PsiTreeUtil.getChildOfType(this, YuckComboBoxTextDefinition.class);
  }

  @Override
  @Nullable
  public YuckCustomWidgetReference getCustomWidgetReference() {
    return PsiTreeUtil.getChildOfType(this, YuckCustomWidgetReference.class);
  }

  @Override
  @Nullable
  public YuckExpanderDefinition getExpanderDefinition() {
    return PsiTreeUtil.getChildOfType(this, YuckExpanderDefinition.class);
  }

  @Override
  @NotNull
  public List<YuckWindowProp> getWindowPropList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YuckWindowProp.class);
  }

  @Override
  @NotNull
  public PsiElement getDefwindow() {
    return notNullChild(findChildByType(DEFWINDOW));
  }

  @Override
  @NotNull
  public PsiElement getLparen() {
    return notNullChild(findChildByType(LPAREN));
  }

  @Override
  @Nullable
  public PsiElement getRparen() {
    return findChildByType(RPAREN);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

  @Override
  @NotNull
  public String getReferenceName() {
    return YuckPsiImplUtil.getReferenceName(this);
  }

}
