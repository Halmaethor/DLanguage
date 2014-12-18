// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageClassDeclaration extends PsiElement {

  @Nullable
  DLanguageBaseClassList getBaseClassList();

  @Nullable
  DLanguageConstraint getConstraint();

  @Nullable
  DLanguageStructBody getStructBody();

  @Nullable
  DLanguageTemplateParameters getTemplateParameters();

  @Nullable
  PsiElement getColon();

  @NotNull
  PsiElement getIdentifier();

  @NotNull
  PsiElement getKwClass();

  @Nullable
  PsiElement getSemicolon();

}
