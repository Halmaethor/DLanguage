// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguagePragmaExpression extends PsiElement {

  @Nullable
  DLanguageArgumentList getArgumentList();

  @NotNull
  PsiElement getCloseParens();

  @Nullable
  PsiElement getComma();

  @NotNull
  PsiElement getIdentifier();

  @NotNull
  PsiElement getKwPragma();

  @NotNull
  PsiElement getOpenParens();

}
