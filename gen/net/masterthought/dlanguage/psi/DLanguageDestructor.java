// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageDestructor extends PsiElement {

  @Nullable
  DLanguageFunctionBody getFunctionBody();

  @NotNull
  List<DLanguageMemberFunctionAttribute> getMemberFunctionAttributeList();

  @NotNull
  PsiElement getCloseParens();

  @NotNull
  PsiElement getConcat();

  @NotNull
  PsiElement getKwThis();

  @NotNull
  PsiElement getOpenParens();

  @Nullable
  PsiElement getSemicolon();

}
