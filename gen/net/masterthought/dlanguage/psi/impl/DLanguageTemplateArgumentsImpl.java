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

public class DLanguageTemplateArgumentsImpl extends ASTWrapperPsiElement implements DLanguageTemplateArguments {

  public DLanguageTemplateArgumentsImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) ((DLanguageVisitor)visitor).visitTemplateArguments(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DLanguageTemplateArgumentList getTemplateArgumentList() {
    return findChildByClass(DLanguageTemplateArgumentList.class);
  }

  @Override
  @Nullable
  public DLanguageTemplateSingleArgument getTemplateSingleArgument() {
    return findChildByClass(DLanguageTemplateSingleArgument.class);
  }

  @Override
  @Nullable
  public PsiElement getCloseParens() {
    return findChildByType(CLOSE_PARENS);
  }

  @Override
  @NotNull
  public PsiElement getNot() {
    return findNotNullChildByType(NOT);
  }

  @Override
  @Nullable
  public PsiElement getOpenParens() {
    return findChildByType(OPEN_PARENS);
  }

}
