// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageForeachStatement extends PsiElement {

  @NotNull
  DLanguageDeclarationOrStatement getDeclarationOrStatement();

  @NotNull
  List<DLanguageExpression> getExpressionList();

  @Nullable
  DLanguageForeachType getForeachType();

  @Nullable
  DLanguageForeachTypeList getForeachTypeList();

  @NotNull
  PsiElement getCloseParens();

  @Nullable
  PsiElement getDoubleDot();

  @Nullable
  PsiElement getKwForeach();

  @Nullable
  PsiElement getKwForeachReverse();

  @NotNull
  PsiElement getOpenParens();

  @NotNull
  PsiElement getSemicolon();

}
