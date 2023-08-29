// This is a generated file. Not intended for manual editing.
package com.github.h3rmt.intellijyuck.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.h3rmt.intellijyuck.psi.YuckTypes.*;
import com.github.h3rmt.intellijyuck.stubs.YuckCustomWidgetDefinitionStub;
import com.github.h3rmt.intellijyuck.psi.*;
import com.intellij.psi.stubs.IStubElementType;

public class YuckCustomWidgetDefinitionImpl extends YuckNamedElementImpl<YuckCustomWidgetDefinitionStub> implements YuckCustomWidgetDefinition {

  public YuckCustomWidgetDefinitionImpl(@NotNull YuckCustomWidgetDefinitionStub stub, @NotNull IStubElementType<?, ?> type) {
    super(stub, type);
  }

  public YuckCustomWidgetDefinitionImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YuckVisitor visitor) {
    visitor.visitCustomWidgetDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YuckVisitor) accept((YuckVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YuckBoxDefinition> getBoxDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YuckBoxDefinition.class);
  }

  @Override
  @NotNull
  public List<YuckComboBoxTextDefinition> getComboBoxTextDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YuckComboBoxTextDefinition.class);
  }

  @Override
  @Nullable
  public YuckCustomWidgetDefinitionBrackets getCustomWidgetDefinitionBrackets() {
    return PsiTreeUtil.getChildOfType(this, YuckCustomWidgetDefinitionBrackets.class);
  }

  @Override
  @NotNull
  public List<YuckCustomWidgetReference> getCustomWidgetReferenceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YuckCustomWidgetReference.class);
  }

  @Override
  @NotNull
  public List<YuckExpanderDefinition> getExpanderDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YuckExpanderDefinition.class);
  }

  @Override
  @NotNull
  public PsiElement getDefwidget() {
    return notNullChild(findChildByType(DEFWIDGET));
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

}
