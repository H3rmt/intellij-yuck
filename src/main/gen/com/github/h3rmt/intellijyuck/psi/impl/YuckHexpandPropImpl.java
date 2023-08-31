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

public class YuckHexpandPropImpl extends YuckCompositeElementImpl implements YuckHexpandProp {

  public YuckHexpandPropImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull YuckVisitor visitor) {
    visitor.visitHexpandProp(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YuckVisitor) accept((YuckVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PsiElement getHexpandprop() {
    return notNullChild(findChildByType(HEXPANDPROP));
  }

  @Override
  @Nullable
  public PsiElement getFalse() {
    return findChildByType(FALSE);
  }

  @Override
  @Nullable
  public PsiElement getTrue() {
    return findChildByType(TRUE);
  }

  @Override
  public boolean isTrue() {
    return YuckPsiImplUtil.isTrue(this);
  }

}
