// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageFunctionBody extends PsiElement {

  @Nullable
  DLanguageBlockStatement getBlockStatement();

  @Nullable
  DLanguageBodyStatement getBodyStatement();

  @Nullable
  DLanguageInStatement getInStatement();

  @Nullable
  DLanguageOutStatement getOutStatement();

}
