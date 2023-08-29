// This is a generated file. Not intended for manual editing.
package com.github.h3rmt.intellijyuck.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.github.h3rmt.intellijyuck.psi.YuckTypes.*;
import com.github.h3rmt.intellijyuck.psi.*;

public class YuckExpanderDefinitionImpl extends YuckCompositeElementImpl implements YuckExpanderDefinition {

  public YuckExpanderDefinitionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YuckVisitor visitor) {
    visitor.visitExpanderDefinition(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YuckVisitor) accept((YuckVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<YuckActiveProp> getActivePropList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YuckActiveProp.class);
  }

  @Override
  @NotNull
  public List<YuckBoxDefinition> getBoxDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YuckBoxDefinition.class);
  }

  @Override
  @NotNull
  public List<YuckClassProp> getClassPropList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YuckClassProp.class);
  }

  @Override
  @NotNull
  public List<YuckComboBoxTextDefinition> getComboBoxTextDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YuckComboBoxTextDefinition.class);
  }

  @Override
  @NotNull
  public List<YuckCssProp> getCssPropList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YuckCssProp.class);
  }

  @Override
  @NotNull
  public List<YuckCustomWidgetReference> getCustomWidgetReferenceList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YuckCustomWidgetReference.class);
  }

  @Override
  @NotNull
  public List<YuckExpandProp> getExpandPropList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YuckExpandProp.class);
  }

  @Override
  @NotNull
  public List<YuckExpanderDefinition> getExpanderDefinitionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YuckExpanderDefinition.class);
  }

  @Override
  @NotNull
  public List<YuckHalignProp> getHalignPropList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YuckHalignProp.class);
  }

  @Override
  @NotNull
  public List<YuckHeightProp> getHeightPropList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YuckHeightProp.class);
  }

  @Override
  @NotNull
  public List<YuckHexpandProp> getHexpandPropList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YuckHexpandProp.class);
  }

  @Override
  @NotNull
  public List<YuckNameProp> getNamePropList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YuckNameProp.class);
  }

  @Override
  @NotNull
  public List<YuckStyleProp> getStylePropList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YuckStyleProp.class);
  }

  @Override
  @NotNull
  public List<YuckTooltipProp> getTooltipPropList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YuckTooltipProp.class);
  }

  @Override
  @NotNull
  public List<YuckValignProp> getValignPropList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YuckValignProp.class);
  }

  @Override
  @NotNull
  public List<YuckVexpandProp> getVexpandPropList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YuckVexpandProp.class);
  }

  @Override
  @NotNull
  public List<YuckVisibleProp> getVisiblePropList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YuckVisibleProp.class);
  }

  @Override
  @NotNull
  public List<YuckWidthProp> getWidthPropList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, YuckWidthProp.class);
  }

  @Override
  @NotNull
  public PsiElement getExpander() {
    return notNullChild(findChildByType(EXPANDER));
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

}
