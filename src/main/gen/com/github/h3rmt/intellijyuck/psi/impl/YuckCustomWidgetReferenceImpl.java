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

public class YuckCustomWidgetReferenceImpl extends YuckCompositeElementImpl implements YuckCustomWidgetReference {

  public YuckCustomWidgetReferenceImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YuckVisitor visitor) {
    visitor.visitCustomWidgetReference(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YuckVisitor) accept((YuckVisitor)visitor);
    else super.accept(visitor);
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
  @NotNull
  public PsiElement getIdentifier() {
    return notNullChild(findChildByType(IDENTIFIER));
  }

  @Override
  @NotNull
  public String getName() {
    return YuckPsiImplUtil.getName(this);
  }

  @Override
  @NotNull
  public PsiElement setName(@NotNull String newName) {
    return YuckPsiImplUtil.setName(this, newName);
  }

}
