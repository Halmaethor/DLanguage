// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageInExpression extends PsiElement {

  @NotNull
  List<DLanguageShiftExpression> getShiftExpressionList();

  @NotNull
  PsiElement getKwIn();

  @Nullable
  PsiElement getNot();

}
