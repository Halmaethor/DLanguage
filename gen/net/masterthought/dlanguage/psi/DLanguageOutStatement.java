// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageOutStatement extends PsiElement {

  @NotNull
  DLanguageBlockStatement getBlockStatement();

  @Nullable
  PsiElement getCloseParens();

  @Nullable
  PsiElement getIdentifier();

  @NotNull
  PsiElement getKwOut();

  @Nullable
  PsiElement getOpenParens();

}
