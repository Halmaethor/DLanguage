// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageCaseStatement extends PsiElement {

  @NotNull
  DLanguageArgumentList getArgumentList();

  @NotNull
  DLanguageDeclarationsAndStatements getDeclarationsAndStatements();

  @NotNull
  PsiElement getColon();

  @NotNull
  PsiElement getKwCase();

}
