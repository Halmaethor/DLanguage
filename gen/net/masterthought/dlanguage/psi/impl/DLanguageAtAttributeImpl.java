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

public class DLanguageAtAttributeImpl extends ASTWrapperPsiElement implements DLanguageAtAttribute {

  public DLanguageAtAttributeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) ((DLanguageVisitor)visitor).visitAtAttribute(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLanguageArgumentList getArgumentList() {
    return findChildByClass(DLanguageArgumentList.class);
  }

  @Override
  @Nullable
  public DLanguageFunctionCallExpression getFunctionCallExpression() {
    return findChildByClass(DLanguageFunctionCallExpression.class);
  }

  @Override
  @NotNull
  public PsiElement getAt() {
    return findNotNullChildByType(AT);
  }

  @Override
  @Nullable
  public PsiElement getCloseParens() {
    return findChildByType(CLOSE_PARENS);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

  @Override
  @Nullable
  public PsiElement getOpenParens() {
    return findChildByType(OPEN_PARENS);
  }

}
