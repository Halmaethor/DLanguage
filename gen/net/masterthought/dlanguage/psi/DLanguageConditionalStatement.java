// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageConditionalStatement extends PsiElement {

  @NotNull
  DLanguageCompileCondition getCompileCondition();

  @NotNull
  List<DLanguageDeclarationOrStatement> getDeclarationOrStatementList();

  @Nullable
  PsiElement getKwElse();

}
