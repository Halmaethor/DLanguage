// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageEnumBody extends PsiElement {

  @NotNull
  List<DLanguageEnumMember> getEnumMemberList();

  @Nullable
  PsiElement getCloseBrace();

  @Nullable
  PsiElement getOpenBrace();

  @Nullable
  PsiElement getSemicolon();

}
