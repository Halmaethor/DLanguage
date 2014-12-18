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

public class DLanguageAliasDeclarationImpl extends ASTWrapperPsiElement implements DLanguageAliasDeclaration {

  public DLanguageAliasDeclarationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLanguageVisitor) ((DLanguageVisitor)visitor).visitAliasDeclaration(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DLanguageAliasInitializer> getAliasInitializerList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLanguageAliasInitializer.class);
  }

  @Override
  @Nullable
  public DLanguageLinkageAttribute getLinkageAttribute() {
    return findChildByClass(DLanguageLinkageAttribute.class);
  }

  @Override
  @Nullable
  public DLanguageType getType() {
    return findChildByClass(DLanguageType.class);
  }

  @Override
  @Nullable
  public PsiElement getIdentifier() {
    return findChildByType(IDENTIFIER);
  }

  @Override
  @NotNull
  public PsiElement getKwAlias() {
    return findNotNullChildByType(KW_ALIAS);
  }

  @Override
  @NotNull
  public PsiElement getSemicolon() {
    return findNotNullChildByType(SEMICOLON);
  }

}
