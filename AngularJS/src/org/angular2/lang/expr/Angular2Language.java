// Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.angular2.lang.expr;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.javascript.DialectOptionHolder;
import com.intellij.lang.javascript.JSLanguageDialect;
import com.intellij.lang.javascript.parsing.JavaScriptParser;
import org.jetbrains.annotations.NotNull;

public class Angular2Language extends JSLanguageDialect {
  public static final Angular2Language INSTANCE = new Angular2Language();

  protected Angular2Language() {
    super("Angular2", DialectOptionHolder.OTHER);
  }

  @Override
  public String getFileExtension() {
    return "js";
  }

  @Override
  public JavaScriptParser<?, ?, ?, ?> createParser(@NotNull PsiBuilder builder) {
    throw new UnsupportedOperationException();
  }
}
