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

public class DLanguageSharedStaticConstructorImpl extends ASTWrapperPsiElement implements DLanguageSharedStaticConstructor {

  public DLanguageSharedStaticConstructorImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) ((DLanguageVisitor)visitor).visitSharedStaticConstructor(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DLanguageFunctionBody getFunctionBody() {
    return findNotNullChildByClass(DLanguageFunctionBody.class);
  }

  @Override
  @NotNull
  public PsiElement getCloseParens() {
    return findNotNullChildByType(CLOSE_PARENS);
  }

  @Override
  @NotNull
  public PsiElement getKwShared() {
    return findNotNullChildByType(KW_SHARED);
  }

  @Override
  @NotNull
  public PsiElement getKwStatic() {
    return findNotNullChildByType(KW_STATIC);
  }

  @Override
  @NotNull
  public PsiElement getKwThis() {
    return findNotNullChildByType(KW_THIS);
  }

  @Override
  @NotNull
  public PsiElement getOpenParens() {
    return findNotNullChildByType(OPEN_PARENS);
  }

}
