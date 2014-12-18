// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static net.masterthought.dlanguage.psi.DLanguageTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import net.masterthought.dlanguage.psi.*;

public class DLanguageAsmRelExpImpl extends ASTWrapperPsiElement implements DLanguageAsmRelExp {

  public DLanguageAsmRelExpImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) ((DLanguageVisitor)visitor).visitAsmRelExp(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DLanguageAsmShiftExp> getAsmShiftExpList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLanguageAsmShiftExp.class);
  }

  @Override
  @Nullable
  public PsiElement getGreaterEqual() {
    return findChildByType(GREATER_EQUAL);
  }

  @Override
  @Nullable
  public PsiElement getGreaterThan() {
    return findChildByType(GREATER_THAN);
  }

  @Override
  @Nullable
  public PsiElement getLessEqual() {
    return findChildByType(LESS_EQUAL);
  }

  @Override
  @Nullable
  public PsiElement getLessThan() {
    return findChildByType(LESS_THAN);
  }

}
