// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.psi.interfaces;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLanguageStructMemberInitializer extends PsiElement {

  @NotNull
  List<DLanguageNonVoidInitializer> getNonVoidInitializerList();

  @Nullable
  PsiElement getOpColon();

}
