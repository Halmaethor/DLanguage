// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageForStatement extends PsiElement {

  @NotNull
  List<DLanguageDeclarationOrStatement> getDeclarationOrStatementList();

  @NotNull
  List<DLanguageExpression> getExpressionList();

  @NotNull
  PsiElement getCloseParens();

  @NotNull
  PsiElement getKwFor();

  @NotNull
  PsiElement getOpenParens();

  @NotNull
  PsiElement getSemicolon();

}
