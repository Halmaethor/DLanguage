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

public class DLanguageLinkageAttributeImpl extends ASTWrapperPsiElement implements DLanguageLinkageAttribute {

  public DLanguageLinkageAttributeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) ((DLanguageVisitor)visitor).visitLinkageAttribute(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLanguageIdentifierChain getIdentifierChain() {
    return findChildByClass(DLanguageIdentifierChain.class);
  }

  @Override
  @NotNull
  public PsiElement getCloseParens() {
    return findNotNullChildByType(CLOSE_PARENS);
  }

  @Override
  @Nullable
  public PsiElement getComma() {
    return findChildByType(COMMA);
  }

  @Override
  @NotNull
  public PsiElement getIdentifier() {
    return findNotNullChildByType(IDENTIFIER);
  }

  @Override
  @Nullable
  public PsiElement getIncrement() {
    return findChildByType(INCREMENT);
  }

  @Override
  @NotNull
  public PsiElement getKwExtern() {
    return findNotNullChildByType(KW_EXTERN);
  }

  @Override
  @NotNull
  public PsiElement getOpenParens() {
    return findNotNullChildByType(OPEN_PARENS);
  }

}
