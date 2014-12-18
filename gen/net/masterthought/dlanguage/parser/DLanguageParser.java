// This is a generated file. Not intended for manual editing.
package net.masterthought.dlanguage.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static net.masterthought.dlanguage.psi.DLanguageTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class DLanguageParser implements PsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ADD_EXPRESSION) {
      r = addExpression(b, 0);
    }
    else if (t == ALIAS_DECLARATION) {
      r = aliasDeclaration(b, 0);
    }
    else if (t == ALIAS_INITIALIZER) {
      r = aliasInitializer(b, 0);
    }
    else if (t == ALIAS_THIS_DECLARATION) {
      r = aliasThisDeclaration(b, 0);
    }
    else if (t == ALIGN_ATTRIBUTE) {
      r = alignAttribute(b, 0);
    }
    else if (t == AND_AND_EXPRESSION) {
      r = andAndExpression(b, 0);
    }
    else if (t == AND_EXPRESSION) {
      r = andExpression(b, 0);
    }
    else if (t == ARGUMENT_LIST) {
      r = argumentList(b, 0);
    }
    else if (t == ARGUMENTS) {
      r = arguments(b, 0);
    }
    else if (t == ARRAY_INITIALIZER) {
      r = arrayInitializer(b, 0);
    }
    else if (t == ARRAY_LITERAL) {
      r = arrayLiteral(b, 0);
    }
    else if (t == ARRAY_MEMBER_INITIALIZATION) {
      r = arrayMemberInitialization(b, 0);
    }
    else if (t == ASM_ADD_EXP) {
      r = asmAddExp(b, 0);
    }
    else if (t == ASM_AND_EXP) {
      r = asmAndExp(b, 0);
    }
    else if (t == ASM_BR_EXP) {
      r = asmBrExp(b, 0);
    }
    else if (t == ASM_EQUAL_EXP) {
      r = asmEqualExp(b, 0);
    }
    else if (t == ASM_EXP) {
      r = asmExp(b, 0);
    }
    else if (t == ASM_INSTRUCTION) {
      r = asmInstruction(b, 0);
    }
    else if (t == ASM_LOG_AND_EXP) {
      r = asmLogAndExp(b, 0);
    }
    else if (t == ASM_LOG_OR_EXP) {
      r = asmLogOrExp(b, 0);
    }
    else if (t == ASM_MUL_EXP) {
      r = asmMulExp(b, 0);
    }
    else if (t == ASM_OR_EXP) {
      r = asmOrExp(b, 0);
    }
    else if (t == ASM_PRIMARY_EXP) {
      r = asmPrimaryExp(b, 0);
    }
    else if (t == ASM_REL_EXP) {
      r = asmRelExp(b, 0);
    }
    else if (t == ASM_SHIFT_EXP) {
      r = asmShiftExp(b, 0);
    }
    else if (t == ASM_STATEMENT) {
      r = asmStatement(b, 0);
    }
    else if (t == ASM_TYPE_PREFIX) {
      r = asmTypePrefix(b, 0);
    }
    else if (t == ASM_UNA_EXP) {
      r = asmUnaExp(b, 0);
    }
    else if (t == ASM_XOR_EXP) {
      r = asmXorExp(b, 0);
    }
    else if (t == ASSERT_EXPRESSION) {
      r = assertExpression(b, 0);
    }
    else if (t == ASSIGN_EXPRESSION) {
      r = assignExpression(b, 0);
    }
    else if (t == ASSIGN_OPERATOR) {
      r = assignOperator(b, 0);
    }
    else if (t == ASSOC_ARRAY_LITERAL) {
      r = assocArrayLiteral(b, 0);
    }
    else if (t == AT_ATTRIBUTE) {
      r = atAttribute(b, 0);
    }
    else if (t == ATTRIBUTE) {
      r = attribute(b, 0);
    }
    else if (t == ATTRIBUTE_DECLARATION) {
      r = attributeDeclaration(b, 0);
    }
    else if (t == AUTO_DECLARATION) {
      r = autoDeclaration(b, 0);
    }
    else if (t == BASE_CLASS) {
      r = baseClass(b, 0);
    }
    else if (t == BASE_CLASS_LIST) {
      r = baseClassList(b, 0);
    }
    else if (t == BLOCK_STATEMENT) {
      r = blockStatement(b, 0);
    }
    else if (t == BODY_STATEMENT) {
      r = bodyStatement(b, 0);
    }
    else if (t == BREAK_STATEMENT) {
      r = breakStatement(b, 0);
    }
    else if (t == BUILTIN_TYPE) {
      r = builtinType(b, 0);
    }
    else if (t == CASE_RANGE_STATEMENT) {
      r = caseRangeStatement(b, 0);
    }
    else if (t == CASE_STATEMENT) {
      r = caseStatement(b, 0);
    }
    else if (t == CAST_EXPRESSION) {
      r = castExpression(b, 0);
    }
    else if (t == CAST_QUALIFIER) {
      r = castQualifier(b, 0);
    }
    else if (t == CATCH) {
      r = catch_(b, 0);
    }
    else if (t == CATCHES) {
      r = catches(b, 0);
    }
    else if (t == CLASS_DECLARATION) {
      r = classDeclaration(b, 0);
    }
    else if (t == CMP_EXPRESSION) {
      r = cmpExpression(b, 0);
    }
    else if (t == COMPILE_CONDITION) {
      r = compileCondition(b, 0);
    }
    else if (t == CONDITIONAL_DECLARATION) {
      r = conditionalDeclaration(b, 0);
    }
    else if (t == CONDITIONAL_STATEMENT) {
      r = conditionalStatement(b, 0);
    }
    else if (t == CONSTRAINT) {
      r = constraint(b, 0);
    }
    else if (t == CONSTRUCTOR) {
      r = constructor(b, 0);
    }
    else if (t == CONTINUE_STATEMENT) {
      r = continueStatement(b, 0);
    }
    else if (t == DEBUG_CONDITION) {
      r = debugCondition(b, 0);
    }
    else if (t == DEBUG_SPECIFICATION) {
      r = debugSpecification(b, 0);
    }
    else if (t == DECLARATION) {
      r = declaration(b, 0);
    }
    else if (t == DECLARATION_2) {
      r = declaration2(b, 0);
    }
    else if (t == DECLARATION_OR_STATEMENT) {
      r = declarationOrStatement(b, 0);
    }
    else if (t == DECLARATIONS_AND_STATEMENTS) {
      r = declarationsAndStatements(b, 0);
    }
    else if (t == DECLARATOR) {
      r = declarator(b, 0);
    }
    else if (t == DEFAULT_STATEMENT) {
      r = defaultStatement(b, 0);
    }
    else if (t == DELETE_EXPRESSION) {
      r = deleteExpression(b, 0);
    }
    else if (t == DEPRECATED) {
      r = deprecated(b, 0);
    }
    else if (t == DESTRUCTOR) {
      r = destructor(b, 0);
    }
    else if (t == DO_STATEMENT) {
      r = doStatement(b, 0);
    }
    else if (t == ENUM_BODY) {
      r = enumBody(b, 0);
    }
    else if (t == ENUM_DECLARATION) {
      r = enumDeclaration(b, 0);
    }
    else if (t == ENUM_MEMBER) {
      r = enumMember(b, 0);
    }
    else if (t == EPONYMOUS_TEMPLATE_DECLARATION) {
      r = eponymousTemplateDeclaration(b, 0);
    }
    else if (t == EQUAL_EXPRESSION) {
      r = equalExpression(b, 0);
    }
    else if (t == EXPRESSION) {
      r = expression(b, 0);
    }
    else if (t == EXPRESSION_STATEMENT) {
      r = expressionStatement(b, 0);
    }
    else if (t == FINAL_SWITCH_STATEMENT) {
      r = finalSwitchStatement(b, 0);
    }
    else if (t == FINALLY) {
      r = finally_(b, 0);
    }
    else if (t == FOR_STATEMENT) {
      r = forStatement(b, 0);
    }
    else if (t == FOREACH_STATEMENT) {
      r = foreachStatement(b, 0);
    }
    else if (t == FOREACH_TYPE) {
      r = foreachType(b, 0);
    }
    else if (t == FOREACH_TYPE_LIST) {
      r = foreachTypeList(b, 0);
    }
    else if (t == FUNCTION_ATTRIBUTE) {
      r = functionAttribute(b, 0);
    }
    else if (t == FUNCTION_BODY) {
      r = functionBody(b, 0);
    }
    else if (t == FUNCTION_CALL_EXPRESSION) {
      r = functionCallExpression(b, 0);
    }
    else if (t == FUNCTION_CALL_STATEMENT) {
      r = functionCallStatement(b, 0);
    }
    else if (t == FUNCTION_DECLARATION) {
      r = functionDeclaration(b, 0);
    }
    else if (t == FUNCTION_LITERAL_EXPRESSION) {
      r = functionLiteralExpression(b, 0);
    }
    else if (t == GOTO_STATEMENT) {
      r = gotoStatement(b, 0);
    }
    else if (t == IDENTIFIER_CHAIN) {
      r = identifierChain(b, 0);
    }
    else if (t == IDENTIFIER_LIST) {
      r = identifierList(b, 0);
    }
    else if (t == IDENTIFIER_OR_TEMPLATE_CHAIN) {
      r = identifierOrTemplateChain(b, 0);
    }
    else if (t == IDENTIFIER_OR_TEMPLATE_INSTANCE) {
      r = identifierOrTemplateInstance(b, 0);
    }
    else if (t == IDENTITY_EXPRESSION) {
      r = identityExpression(b, 0);
    }
    else if (t == IF_CONDITION) {
      r = ifCondition(b, 0);
    }
    else if (t == IF_STATEMENT) {
      r = ifStatement(b, 0);
    }
    else if (t == IMPORT_BIND) {
      r = importBind(b, 0);
    }
    else if (t == IMPORT_BINDINGS) {
      r = importBindings(b, 0);
    }
    else if (t == IMPORT_DECLARATION) {
      r = importDeclaration(b, 0);
    }
    else if (t == IMPORT_EXPRESSION) {
      r = importExpression(b, 0);
    }
    else if (t == IN_EXPRESSION) {
      r = inExpression(b, 0);
    }
    else if (t == IN_STATEMENT) {
      r = inStatement(b, 0);
    }
    else if (t == INDEX_EXPRESSION) {
      r = indexExpression(b, 0);
    }
    else if (t == INITIALIZE) {
      r = initialize(b, 0);
    }
    else if (t == INITIALIZER) {
      r = initializer(b, 0);
    }
    else if (t == INTERFACE_DECLARATION) {
      r = interfaceDeclaration(b, 0);
    }
    else if (t == INVARIANT) {
      r = invariant(b, 0);
    }
    else if (t == IS_EXPRESSION) {
      r = isExpression(b, 0);
    }
    else if (t == KEY_VALUE_PAIR) {
      r = keyValuePair(b, 0);
    }
    else if (t == KEY_VALUE_PAIRS) {
      r = keyValuePairs(b, 0);
    }
    else if (t == LABELED_STATEMENT) {
      r = labeledStatement(b, 0);
    }
    else if (t == LAMBDA_EXPRESSION) {
      r = lambdaExpression(b, 0);
    }
    else if (t == LAST_CATCH) {
      r = lastCatch(b, 0);
    }
    else if (t == LINKAGE_ATTRIBUTE) {
      r = linkageAttribute(b, 0);
    }
    else if (t == MEMBER_FUNCTION_ATTRIBUTE) {
      r = memberFunctionAttribute(b, 0);
    }
    else if (t == MIXIN_DECLARATION) {
      r = mixinDeclaration(b, 0);
    }
    else if (t == MIXIN_EXPRESSION) {
      r = mixinExpression(b, 0);
    }
    else if (t == MIXIN_TEMPLATE_DECLARATION) {
      r = mixinTemplateDeclaration(b, 0);
    }
    else if (t == MIXIN_TEMPLATE_NAME) {
      r = mixinTemplateName(b, 0);
    }
    else if (t == MODULE_DECLARATION) {
      r = moduleDeclaration(b, 0);
    }
    else if (t == MUL_EXPRESSION) {
      r = mulExpression(b, 0);
    }
    else if (t == NEW_ANON_CLASS_EXPRESSION) {
      r = newAnonClassExpression(b, 0);
    }
    else if (t == NEW_EXPRESSION) {
      r = newExpression(b, 0);
    }
    else if (t == NON_VOID_INITIALIZER) {
      r = nonVoidInitializer(b, 0);
    }
    else if (t == OPERANDS) {
      r = operands(b, 0);
    }
    else if (t == OR_EXPRESSION) {
      r = orExpression(b, 0);
    }
    else if (t == OR_OR_EXPRESSION) {
      r = orOrExpression(b, 0);
    }
    else if (t == OUT_STATEMENT) {
      r = outStatement(b, 0);
    }
    else if (t == PARAMETER) {
      r = parameter(b, 0);
    }
    else if (t == PARAMETER_ATTRIBUTE) {
      r = parameterAttribute(b, 0);
    }
    else if (t == PARAMETERS) {
      r = parameters(b, 0);
    }
    else if (t == POST_INC_DEC_EXPRESSION) {
      r = postIncDecExpression(b, 0);
    }
    else if (t == POSTBLIT) {
      r = postblit(b, 0);
    }
    else if (t == POW_EXPRESSION) {
      r = powExpression(b, 0);
    }
    else if (t == PRAGMA_DECLARATION) {
      r = pragmaDeclaration(b, 0);
    }
    else if (t == PRAGMA_EXPRESSION) {
      r = pragmaExpression(b, 0);
    }
    else if (t == PRE_INC_DEC_EXPRESSION) {
      r = preIncDecExpression(b, 0);
    }
    else if (t == PRIMARY_EXPRESSION) {
      r = primaryExpression(b, 0);
    }
    else if (t == REGISTER) {
      r = register(b, 0);
    }
    else if (t == REL_EXPRESSION) {
      r = relExpression(b, 0);
    }
    else if (t == REL_OPERATOR) {
      r = relOperator(b, 0);
    }
    else if (t == RETURN_STATEMENT) {
      r = returnStatement(b, 0);
    }
    else if (t == SCOPE_GUARD_STATEMENT) {
      r = scopeGuardStatement(b, 0);
    }
    else if (t == SHARED_STATIC_CONSTRUCTOR) {
      r = sharedStaticConstructor(b, 0);
    }
    else if (t == SHARED_STATIC_DESTRUCTOR) {
      r = sharedStaticDestructor(b, 0);
    }
    else if (t == SHIFT_EXPRESSION) {
      r = shiftExpression(b, 0);
    }
    else if (t == SINGLE_IMPORT) {
      r = singleImport(b, 0);
    }
    else if (t == SLICE_EXPRESSION) {
      r = sliceExpression(b, 0);
    }
    else if (t == STATEMENT) {
      r = statement(b, 0);
    }
    else if (t == STATEMENT_NO_CASE_NO_DEFAULT) {
      r = statementNoCaseNoDefault(b, 0);
    }
    else if (t == STATIC_ASSERT_DECLARATION) {
      r = staticAssertDeclaration(b, 0);
    }
    else if (t == STATIC_ASSERT_STATEMENT) {
      r = staticAssertStatement(b, 0);
    }
    else if (t == STATIC_CONSTRUCTOR) {
      r = staticConstructor(b, 0);
    }
    else if (t == STATIC_DESTRUCTOR) {
      r = staticDestructor(b, 0);
    }
    else if (t == STATIC_IF_CONDITION) {
      r = staticIfCondition(b, 0);
    }
    else if (t == STORAGE_CLASS) {
      r = storageClass(b, 0);
    }
    else if (t == STRUCT_BODY) {
      r = structBody(b, 0);
    }
    else if (t == STRUCT_DECLARATION) {
      r = structDeclaration(b, 0);
    }
    else if (t == STRUCT_INITIALIZER) {
      r = structInitializer(b, 0);
    }
    else if (t == STRUCT_MEMBER_INITIALIZER) {
      r = structMemberInitializer(b, 0);
    }
    else if (t == STRUCT_MEMBER_INITIALIZERS) {
      r = structMemberInitializers(b, 0);
    }
    else if (t == SWITCH_STATEMENT) {
      r = switchStatement(b, 0);
    }
    else if (t == SYMBOL) {
      r = symbol(b, 0);
    }
    else if (t == SYNCHRONIZED_STATEMENT) {
      r = synchronizedStatement(b, 0);
    }
    else if (t == TEMPLATE_ALIAS_PARAMETER) {
      r = templateAliasParameter(b, 0);
    }
    else if (t == TEMPLATE_ARGUMENT) {
      r = templateArgument(b, 0);
    }
    else if (t == TEMPLATE_ARGUMENT_LIST) {
      r = templateArgumentList(b, 0);
    }
    else if (t == TEMPLATE_ARGUMENTS) {
      r = templateArguments(b, 0);
    }
    else if (t == TEMPLATE_DECLARATION) {
      r = templateDeclaration(b, 0);
    }
    else if (t == TEMPLATE_INSTANCE) {
      r = templateInstance(b, 0);
    }
    else if (t == TEMPLATE_MIXIN_EXPRESSION) {
      r = templateMixinExpression(b, 0);
    }
    else if (t == TEMPLATE_PARAMETER) {
      r = templateParameter(b, 0);
    }
    else if (t == TEMPLATE_PARAMETER_LIST) {
      r = templateParameterList(b, 0);
    }
    else if (t == TEMPLATE_PARAMETERS) {
      r = templateParameters(b, 0);
    }
    else if (t == TEMPLATE_SINGLE_ARGUMENT) {
      r = templateSingleArgument(b, 0);
    }
    else if (t == TEMPLATE_THIS_PARAMETER) {
      r = templateThisParameter(b, 0);
    }
    else if (t == TEMPLATE_TUPLE_PARAMETER) {
      r = templateTupleParameter(b, 0);
    }
    else if (t == TEMPLATE_TYPE_PARAMETER) {
      r = templateTypeParameter(b, 0);
    }
    else if (t == TEMPLATE_VALUE_PARAMETER) {
      r = templateValueParameter(b, 0);
    }
    else if (t == TEMPLATE_VALUE_PARAMETER_DEFAULT) {
      r = templateValueParameterDefault(b, 0);
    }
    else if (t == TERNARY_EXPRESSION) {
      r = ternaryExpression(b, 0);
    }
    else if (t == THROW_STATEMENT) {
      r = throwStatement(b, 0);
    }
    else if (t == TRAITS_EXPRESSION) {
      r = traitsExpression(b, 0);
    }
    else if (t == TRY_STATEMENT) {
      r = tryStatement(b, 0);
    }
    else if (t == TYPE) {
      r = type(b, 0);
    }
    else if (t == TYPE_2) {
      r = type2(b, 0);
    }
    else if (t == TYPE_CONSTRUCTOR) {
      r = typeConstructor(b, 0);
    }
    else if (t == TYPE_CONSTRUCTORS) {
      r = typeConstructors(b, 0);
    }
    else if (t == TYPE_SPECIALIZATION) {
      r = typeSpecialization(b, 0);
    }
    else if (t == TYPE_SUFFIX) {
      r = typeSuffix(b, 0);
    }
    else if (t == TYPEID_EXPRESSION) {
      r = typeidExpression(b, 0);
    }
    else if (t == TYPEOF_EXPRESSION) {
      r = typeofExpression(b, 0);
    }
    else if (t == UNARY_EXPRESSION) {
      r = unaryExpression(b, 0);
    }
    else if (t == UNION_DECLARATION) {
      r = unionDeclaration(b, 0);
    }
    else if (t == UNITTEST) {
      r = unittest(b, 0);
    }
    else if (t == VARIABLE_DECLARATION) {
      r = variableDeclaration(b, 0);
    }
    else if (t == VECTOR) {
      r = vector(b, 0);
    }
    else if (t == VERSION_CONDITION) {
      r = versionCondition(b, 0);
    }
    else if (t == VERSION_SPECIFICATION) {
      r = versionSpecification(b, 0);
    }
    else if (t == WHILE_STATEMENT) {
      r = whileStatement(b, 0);
    }
    else if (t == WITH_STATEMENT) {
      r = withStatement(b, 0);
    }
    else if (t == XOR_EXPRESSION) {
      r = xorExpression(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return module(b, l + 1);
  }

  /* ********************************************************** */
  // mulExpression
  //      | addExpression (PLUS | MINUS | CONCAT) mulExpression
  public static boolean addExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "addExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<add expression>");
    r = mulExpression(b, l + 1);
    if (!r) r = addExpression_1(b, l + 1);
    exit_section_(b, l, m, ADD_EXPRESSION, r, false, null);
    return r;
  }

  // addExpression (PLUS | MINUS | CONCAT) mulExpression
  private static boolean addExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "addExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = addExpression(b, l + 1);
    r = r && addExpression_1_1(b, l + 1);
    r = r && mulExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PLUS | MINUS | CONCAT
  private static boolean addExpression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "addExpression_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    if (!r) r = consumeToken(b, CONCAT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_ALIAS aliasInitializer (COMMA aliasInitializer)* SEMICOLON
  //      | KW_ALIAS linkageAttribute? type IDENTIFIER SEMICOLON
  public static boolean aliasDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aliasDeclaration")) return false;
    if (!nextTokenIs(b, KW_ALIAS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = aliasDeclaration_0(b, l + 1);
    if (!r) r = aliasDeclaration_1(b, l + 1);
    exit_section_(b, m, ALIAS_DECLARATION, r);
    return r;
  }

  // KW_ALIAS aliasInitializer (COMMA aliasInitializer)* SEMICOLON
  private static boolean aliasDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aliasDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ALIAS);
    r = r && aliasInitializer(b, l + 1);
    r = r && aliasDeclaration_0_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA aliasInitializer)*
  private static boolean aliasDeclaration_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aliasDeclaration_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!aliasDeclaration_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "aliasDeclaration_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA aliasInitializer
  private static boolean aliasDeclaration_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aliasDeclaration_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && aliasInitializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_ALIAS linkageAttribute? type IDENTIFIER SEMICOLON
  private static boolean aliasDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aliasDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ALIAS);
    r = r && aliasDeclaration_1_1(b, l + 1);
    r = r && type(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // linkageAttribute?
  private static boolean aliasDeclaration_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aliasDeclaration_1_1")) return false;
    linkageAttribute(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER ASSIGN type
  public static boolean aliasInitializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aliasInitializer")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, ASSIGN);
    r = r && type(b, l + 1);
    exit_section_(b, m, ALIAS_INITIALIZER, r);
    return r;
  }

  /* ********************************************************** */
  // KW_ALIAS IDENTIFIER KW_THIS SEMICOLON
  public static boolean aliasThisDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "aliasThisDeclaration")) return false;
    if (!nextTokenIs(b, KW_ALIAS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_ALIAS, IDENTIFIER, KW_THIS, SEMICOLON);
    exit_section_(b, m, ALIAS_THIS_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // KW_ALIGN (OPEN_PARENS GROUP_INTEGER CLOSE_PARENS)?
  public static boolean alignAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alignAttribute")) return false;
    if (!nextTokenIs(b, KW_ALIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ALIGN);
    r = r && alignAttribute_1(b, l + 1);
    exit_section_(b, m, ALIGN_ATTRIBUTE, r);
    return r;
  }

  // (OPEN_PARENS GROUP_INTEGER CLOSE_PARENS)?
  private static boolean alignAttribute_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alignAttribute_1")) return false;
    alignAttribute_1_0(b, l + 1);
    return true;
  }

  // OPEN_PARENS GROUP_INTEGER CLOSE_PARENS
  private static boolean alignAttribute_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "alignAttribute_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PARENS, GROUP_INTEGER, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // orExpression
  //      | andAndExpression LOGICAL_AND orExpression
  public static boolean andAndExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "andAndExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<and and expression>");
    r = orExpression(b, l + 1);
    if (!r) r = andAndExpression_1(b, l + 1);
    exit_section_(b, l, m, AND_AND_EXPRESSION, r, false, null);
    return r;
  }

  // andAndExpression LOGICAL_AND orExpression
  private static boolean andAndExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "andAndExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = andAndExpression(b, l + 1);
    r = r && consumeToken(b, LOGICAL_AND);
    r = r && orExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // cmpExpression
  //      | andExpression AND cmpExpression
  public static boolean andExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "andExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<and expression>");
    r = cmpExpression(b, l + 1);
    if (!r) r = andExpression_1(b, l + 1);
    exit_section_(b, l, m, AND_EXPRESSION, r, false, null);
    return r;
  }

  // andExpression AND cmpExpression
  private static boolean andExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "andExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = andExpression(b, l + 1);
    r = r && consumeToken(b, AND);
    r = r && cmpExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // assignExpression (COMMA assignExpression?)*
  public static boolean argumentList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argumentList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<argument list>");
    r = assignExpression(b, l + 1);
    r = r && argumentList_1(b, l + 1);
    exit_section_(b, l, m, ARGUMENT_LIST, r, false, null);
    return r;
  }

  // (COMMA assignExpression?)*
  private static boolean argumentList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argumentList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!argumentList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "argumentList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA assignExpression?
  private static boolean argumentList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argumentList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && argumentList_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // assignExpression?
  private static boolean argumentList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "argumentList_1_0_1")) return false;
    assignExpression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // OPEN_PARENS argumentList? CLOSE_PARENS
  public static boolean arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && arguments_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, ARGUMENTS, r);
    return r;
  }

  // argumentList?
  private static boolean arguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments_1")) return false;
    argumentList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // OPEN_BRACKET CLOSE_BRACKET
  //      | OPEN_BRACKET arrayMemberInitialization (COMMA arrayMemberInitialization?)* CLOSE_BRACKET
  public static boolean arrayInitializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitializer")) return false;
    if (!nextTokenIs(b, OPEN_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parseTokens(b, 0, OPEN_BRACKET, CLOSE_BRACKET);
    if (!r) r = arrayInitializer_1(b, l + 1);
    exit_section_(b, m, ARRAY_INITIALIZER, r);
    return r;
  }

  // OPEN_BRACKET arrayMemberInitialization (COMMA arrayMemberInitialization?)* CLOSE_BRACKET
  private static boolean arrayInitializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitializer_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACKET);
    r = r && arrayMemberInitialization(b, l + 1);
    r = r && arrayInitializer_1_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA arrayMemberInitialization?)*
  private static boolean arrayInitializer_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitializer_1_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!arrayInitializer_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "arrayInitializer_1_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA arrayMemberInitialization?
  private static boolean arrayInitializer_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitializer_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && arrayInitializer_1_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // arrayMemberInitialization?
  private static boolean arrayInitializer_1_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayInitializer_1_2_0_1")) return false;
    arrayMemberInitialization(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // OPEN_BRACKET argumentList? CLOSE_BRACKET
  public static boolean arrayLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayLiteral")) return false;
    if (!nextTokenIs(b, OPEN_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACKET);
    r = r && arrayLiteral_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, ARRAY_LITERAL, r);
    return r;
  }

  // argumentList?
  private static boolean arrayLiteral_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayLiteral_1")) return false;
    argumentList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (assignExpression COLON)? nonVoidInitializer
  public static boolean arrayMemberInitialization(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayMemberInitialization")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<array member initialization>");
    r = arrayMemberInitialization_0(b, l + 1);
    r = r && nonVoidInitializer(b, l + 1);
    exit_section_(b, l, m, ARRAY_MEMBER_INITIALIZATION, r, false, null);
    return r;
  }

  // (assignExpression COLON)?
  private static boolean arrayMemberInitialization_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayMemberInitialization_0")) return false;
    arrayMemberInitialization_0_0(b, l + 1);
    return true;
  }

  // assignExpression COLON
  private static boolean arrayMemberInitialization_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arrayMemberInitialization_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignExpression(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // asmMulExp
  //      | asmAddExp (PLUS | MINUS) asmMulExp
  public static boolean asmAddExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmAddExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<asm add exp>");
    r = asmMulExp(b, l + 1);
    if (!r) r = asmAddExp_1(b, l + 1);
    exit_section_(b, l, m, ASM_ADD_EXP, r, false, null);
    return r;
  }

  // asmAddExp (PLUS | MINUS) asmMulExp
  private static boolean asmAddExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmAddExp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = asmAddExp(b, l + 1);
    r = r && asmAddExp_1_1(b, l + 1);
    r = r && asmMulExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PLUS | MINUS
  private static boolean asmAddExp_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmAddExp_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    if (!r) r = consumeToken(b, MINUS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // asmEqualExp (AND asmEqualExp)?
  public static boolean asmAndExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmAndExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<asm and exp>");
    r = asmEqualExp(b, l + 1);
    r = r && asmAndExp_1(b, l + 1);
    exit_section_(b, l, m, ASM_AND_EXP, r, false, null);
    return r;
  }

  // (AND asmEqualExp)?
  private static boolean asmAndExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmAndExp_1")) return false;
    asmAndExp_1_0(b, l + 1);
    return true;
  }

  // AND asmEqualExp
  private static boolean asmAndExp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmAndExp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && asmEqualExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // asmUnaExp
  //      | asmBrExp OPEN_BRACKET asmExp CLOSE_BRACKET
  public static boolean asmBrExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmBrExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<asm br exp>");
    r = asmUnaExp(b, l + 1);
    if (!r) r = asmBrExp_1(b, l + 1);
    exit_section_(b, l, m, ASM_BR_EXP, r, false, null);
    return r;
  }

  // asmBrExp OPEN_BRACKET asmExp CLOSE_BRACKET
  private static boolean asmBrExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmBrExp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = asmBrExp(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACKET);
    r = r && asmExp(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // asmRelExp ((EQUALS | NOT_EQUAL) asmRelExp)?
  public static boolean asmEqualExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmEqualExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<asm equal exp>");
    r = asmRelExp(b, l + 1);
    r = r && asmEqualExp_1(b, l + 1);
    exit_section_(b, l, m, ASM_EQUAL_EXP, r, false, null);
    return r;
  }

  // ((EQUALS | NOT_EQUAL) asmRelExp)?
  private static boolean asmEqualExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmEqualExp_1")) return false;
    asmEqualExp_1_0(b, l + 1);
    return true;
  }

  // (EQUALS | NOT_EQUAL) asmRelExp
  private static boolean asmEqualExp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmEqualExp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = asmEqualExp_1_0_0(b, l + 1);
    r = r && asmRelExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // EQUALS | NOT_EQUAL
  private static boolean asmEqualExp_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmEqualExp_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    if (!r) r = consumeToken(b, NOT_EQUAL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // asmLogOrExp (QUESTION asmExp COLON asmExp)?
  public static boolean asmExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<asm exp>");
    r = asmLogOrExp(b, l + 1);
    r = r && asmExp_1(b, l + 1);
    exit_section_(b, l, m, ASM_EXP, r, false, null);
    return r;
  }

  // (QUESTION asmExp COLON asmExp)?
  private static boolean asmExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmExp_1")) return false;
    asmExp_1_0(b, l + 1);
    return true;
  }

  // QUESTION asmExp COLON asmExp
  private static boolean asmExp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmExp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUESTION);
    r = r && asmExp(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && asmExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  //      | KW_ALIGN GROUP_INTEGER
  //      | KW_ALIGN IDENTIFIER
  //      | IDENTIFIER COLON asmInstruction
  //      | IDENTIFIER asmExp
  //      | IDENTIFIER operands
  public static boolean asmInstruction(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmInstruction")) return false;
    if (!nextTokenIs(b, "<asm instruction>", IDENTIFIER, KW_ALIGN)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<asm instruction>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = parseTokens(b, 0, KW_ALIGN, GROUP_INTEGER);
    if (!r) r = parseTokens(b, 0, KW_ALIGN, IDENTIFIER);
    if (!r) r = asmInstruction_3(b, l + 1);
    if (!r) r = asmInstruction_4(b, l + 1);
    if (!r) r = asmInstruction_5(b, l + 1);
    exit_section_(b, l, m, ASM_INSTRUCTION, r, false, null);
    return r;
  }

  // IDENTIFIER COLON asmInstruction
  private static boolean asmInstruction_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmInstruction_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    r = r && asmInstruction(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER asmExp
  private static boolean asmInstruction_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmInstruction_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && asmExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER operands
  private static boolean asmInstruction_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmInstruction_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && operands(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // asmOrExp (LOGICAL_AND asmOrExp)?
  public static boolean asmLogAndExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmLogAndExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<asm log and exp>");
    r = asmOrExp(b, l + 1);
    r = r && asmLogAndExp_1(b, l + 1);
    exit_section_(b, l, m, ASM_LOG_AND_EXP, r, false, null);
    return r;
  }

  // (LOGICAL_AND asmOrExp)?
  private static boolean asmLogAndExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmLogAndExp_1")) return false;
    asmLogAndExp_1_0(b, l + 1);
    return true;
  }

  // LOGICAL_AND asmOrExp
  private static boolean asmLogAndExp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmLogAndExp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOGICAL_AND);
    r = r && asmOrExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // asmLogAndExp (LOGICAL_OR asmLogAndExp)?
  public static boolean asmLogOrExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmLogOrExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<asm log or exp>");
    r = asmLogAndExp(b, l + 1);
    r = r && asmLogOrExp_1(b, l + 1);
    exit_section_(b, l, m, ASM_LOG_OR_EXP, r, false, null);
    return r;
  }

  // (LOGICAL_OR asmLogAndExp)?
  private static boolean asmLogOrExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmLogOrExp_1")) return false;
    asmLogOrExp_1_0(b, l + 1);
    return true;
  }

  // LOGICAL_OR asmLogAndExp
  private static boolean asmLogOrExp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmLogOrExp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LOGICAL_OR);
    r = r && asmLogAndExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // asmBrExp ((STAR | DIV | MOD) asmBrExp)?
  public static boolean asmMulExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmMulExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<asm mul exp>");
    r = asmBrExp(b, l + 1);
    r = r && asmMulExp_1(b, l + 1);
    exit_section_(b, l, m, ASM_MUL_EXP, r, false, null);
    return r;
  }

  // ((STAR | DIV | MOD) asmBrExp)?
  private static boolean asmMulExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmMulExp_1")) return false;
    asmMulExp_1_0(b, l + 1);
    return true;
  }

  // (STAR | DIV | MOD) asmBrExp
  private static boolean asmMulExp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmMulExp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = asmMulExp_1_0_0(b, l + 1);
    r = r && asmBrExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STAR | DIV | MOD
  private static boolean asmMulExp_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmMulExp_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STAR);
    if (!r) r = consumeToken(b, DIV);
    if (!r) r = consumeToken(b, MOD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // asmXorExp (OR asmXorExp)?
  public static boolean asmOrExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmOrExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<asm or exp>");
    r = asmXorExp(b, l + 1);
    r = r && asmOrExp_1(b, l + 1);
    exit_section_(b, l, m, ASM_OR_EXP, r, false, null);
    return r;
  }

  // (OR asmXorExp)?
  private static boolean asmOrExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmOrExp_1")) return false;
    asmOrExp_1_0(b, l + 1);
    return true;
  }

  // OR asmXorExp
  private static boolean asmOrExp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmOrExp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OR);
    r = r && asmXorExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // GROUP_INTEGER
  //      | GROUP_FLOAT
  //      | register
  //      | identifierChain
  //      | DOLLAR
  public static boolean asmPrimaryExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmPrimaryExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<asm primary exp>");
    r = consumeToken(b, GROUP_INTEGER);
    if (!r) r = consumeToken(b, GROUP_FLOAT);
    if (!r) r = register(b, l + 1);
    if (!r) r = identifierChain(b, l + 1);
    if (!r) r = consumeToken(b, DOLLAR);
    exit_section_(b, l, m, ASM_PRIMARY_EXP, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // asmShiftExp ((LESS_THAN | LESS_EQUAL | GREATER_THAN | GREATER_EQUAL) asmShiftExp)?
  public static boolean asmRelExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmRelExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<asm rel exp>");
    r = asmShiftExp(b, l + 1);
    r = r && asmRelExp_1(b, l + 1);
    exit_section_(b, l, m, ASM_REL_EXP, r, false, null);
    return r;
  }

  // ((LESS_THAN | LESS_EQUAL | GREATER_THAN | GREATER_EQUAL) asmShiftExp)?
  private static boolean asmRelExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmRelExp_1")) return false;
    asmRelExp_1_0(b, l + 1);
    return true;
  }

  // (LESS_THAN | LESS_EQUAL | GREATER_THAN | GREATER_EQUAL) asmShiftExp
  private static boolean asmRelExp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmRelExp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = asmRelExp_1_0_0(b, l + 1);
    r = r && asmShiftExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LESS_THAN | LESS_EQUAL | GREATER_THAN | GREATER_EQUAL
  private static boolean asmRelExp_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmRelExp_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LESS_THAN);
    if (!r) r = consumeToken(b, LESS_EQUAL);
    if (!r) r = consumeToken(b, GREATER_THAN);
    if (!r) r = consumeToken(b, GREATER_EQUAL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // asmAddExp ((LEFT_SHIFT | RIGHT_SHIFT | TRIPLE_RSHIFT) asmAddExp)?
  public static boolean asmShiftExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmShiftExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<asm shift exp>");
    r = asmAddExp(b, l + 1);
    r = r && asmShiftExp_1(b, l + 1);
    exit_section_(b, l, m, ASM_SHIFT_EXP, r, false, null);
    return r;
  }

  // ((LEFT_SHIFT | RIGHT_SHIFT | TRIPLE_RSHIFT) asmAddExp)?
  private static boolean asmShiftExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmShiftExp_1")) return false;
    asmShiftExp_1_0(b, l + 1);
    return true;
  }

  // (LEFT_SHIFT | RIGHT_SHIFT | TRIPLE_RSHIFT) asmAddExp
  private static boolean asmShiftExp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmShiftExp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = asmShiftExp_1_0_0(b, l + 1);
    r = r && asmAddExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_SHIFT | RIGHT_SHIFT | TRIPLE_RSHIFT
  private static boolean asmShiftExp_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmShiftExp_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_SHIFT);
    if (!r) r = consumeToken(b, RIGHT_SHIFT);
    if (!r) r = consumeToken(b, TRIPLE_RSHIFT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_ASM OPEN_BRACE asmInstruction+ CLOSE_BRACE
  public static boolean asmStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmStatement")) return false;
    if (!nextTokenIs(b, KW_ASM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_ASM, OPEN_BRACE);
    r = r && asmStatement_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, ASM_STATEMENT, r);
    return r;
  }

  // asmInstruction+
  private static boolean asmStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = asmInstruction(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!asmInstruction(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "asmStatement_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER IDENTIFIER
  //      | KW_BYTE IDENTIFIER
  //      | KW_SHORT IDENTIFIER
  //      | KW_INT IDENTIFIER
  //      | KW_FLOAT IDENTIFIER
  //      | KW_DOUBLE IDENTIFIER
  //      | KW_REAL IDENTIFIER
  public static boolean asmTypePrefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmTypePrefix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<asm type prefix>");
    r = parseTokens(b, 0, IDENTIFIER, IDENTIFIER);
    if (!r) r = parseTokens(b, 0, KW_BYTE, IDENTIFIER);
    if (!r) r = parseTokens(b, 0, KW_SHORT, IDENTIFIER);
    if (!r) r = parseTokens(b, 0, KW_INT, IDENTIFIER);
    if (!r) r = parseTokens(b, 0, KW_FLOAT, IDENTIFIER);
    if (!r) r = parseTokens(b, 0, KW_DOUBLE, IDENTIFIER);
    if (!r) r = parseTokens(b, 0, KW_REAL, IDENTIFIER);
    exit_section_(b, l, m, ASM_TYPE_PREFIX, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // asmTypePrefix asmExp
  //      | IDENTIFIER asmExp
  //      | PLUS asmUnaExp
  //      | MINUS asmUnaExp
  //      | NOT asmUnaExp
  //      | CONCAT asmUnaExp
  //      | asmPrimaryExp
  public static boolean asmUnaExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmUnaExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<asm una exp>");
    r = asmUnaExp_0(b, l + 1);
    if (!r) r = asmUnaExp_1(b, l + 1);
    if (!r) r = asmUnaExp_2(b, l + 1);
    if (!r) r = asmUnaExp_3(b, l + 1);
    if (!r) r = asmUnaExp_4(b, l + 1);
    if (!r) r = asmUnaExp_5(b, l + 1);
    if (!r) r = asmPrimaryExp(b, l + 1);
    exit_section_(b, l, m, ASM_UNA_EXP, r, false, null);
    return r;
  }

  // asmTypePrefix asmExp
  private static boolean asmUnaExp_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmUnaExp_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = asmTypePrefix(b, l + 1);
    r = r && asmExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER asmExp
  private static boolean asmUnaExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmUnaExp_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && asmExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PLUS asmUnaExp
  private static boolean asmUnaExp_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmUnaExp_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && asmUnaExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MINUS asmUnaExp
  private static boolean asmUnaExp_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmUnaExp_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MINUS);
    r = r && asmUnaExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NOT asmUnaExp
  private static boolean asmUnaExp_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmUnaExp_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && asmUnaExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CONCAT asmUnaExp
  private static boolean asmUnaExp_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmUnaExp_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONCAT);
    r = r && asmUnaExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // asmAndExp (XOR asmAndExp)?
  public static boolean asmXorExp(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmXorExp")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<asm xor exp>");
    r = asmAndExp(b, l + 1);
    r = r && asmXorExp_1(b, l + 1);
    exit_section_(b, l, m, ASM_XOR_EXP, r, false, null);
    return r;
  }

  // (XOR asmAndExp)?
  private static boolean asmXorExp_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmXorExp_1")) return false;
    asmXorExp_1_0(b, l + 1);
    return true;
  }

  // XOR asmAndExp
  private static boolean asmXorExp_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "asmXorExp_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, XOR);
    r = r && asmAndExp(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_ASSERT OPEN_PARENS assignExpression (COMMA assignExpression)? CLOSE_PARENS
  public static boolean assertExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertExpression")) return false;
    if (!nextTokenIs(b, KW_ASSERT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_ASSERT, OPEN_PARENS);
    r = r && assignExpression(b, l + 1);
    r = r && assertExpression_3(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, ASSERT_EXPRESSION, r);
    return r;
  }

  // (COMMA assignExpression)?
  private static boolean assertExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertExpression_3")) return false;
    assertExpression_3_0(b, l + 1);
    return true;
  }

  // COMMA assignExpression
  private static boolean assertExpression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assertExpression_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && assignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ternaryExpression (assignOperator assignExpression)?
  public static boolean assignExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<assign expression>");
    r = ternaryExpression(b, l + 1);
    r = r && assignExpression_1(b, l + 1);
    exit_section_(b, l, m, ASSIGN_EXPRESSION, r, false, null);
    return r;
  }

  // (assignOperator assignExpression)?
  private static boolean assignExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignExpression_1")) return false;
    assignExpression_1_0(b, l + 1);
    return true;
  }

  // assignOperator assignExpression
  private static boolean assignExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = assignOperator(b, l + 1);
    r = r && assignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ASSIGN
  //      | TRIPLE_RSHIFT_ASSIGN
  //      | RIGHT_SHIFT_ASSIGN
  //      | LEFT_SHIFT_ASSIGN
  //      | PLUS_ASSIGN
  //      | MINUS_ASSIGN
  //      | MULT_ASSIGN
  //      | MOD_ASSIGN
  //      | AND_ASSIGN
  //      | DIV_ASSIGN
  //      | OR_ASSIGN
  //      | POW_ASSIGN
  //      | XOR_ASSIGN
  //      | CONCAT_ASSIGN
  public static boolean assignOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<assign operator>");
    r = consumeToken(b, ASSIGN);
    if (!r) r = consumeToken(b, TRIPLE_RSHIFT_ASSIGN);
    if (!r) r = consumeToken(b, RIGHT_SHIFT_ASSIGN);
    if (!r) r = consumeToken(b, LEFT_SHIFT_ASSIGN);
    if (!r) r = consumeToken(b, PLUS_ASSIGN);
    if (!r) r = consumeToken(b, MINUS_ASSIGN);
    if (!r) r = consumeToken(b, MULT_ASSIGN);
    if (!r) r = consumeToken(b, MOD_ASSIGN);
    if (!r) r = consumeToken(b, AND_ASSIGN);
    if (!r) r = consumeToken(b, DIV_ASSIGN);
    if (!r) r = consumeToken(b, OR_ASSIGN);
    if (!r) r = consumeToken(b, POW_ASSIGN);
    if (!r) r = consumeToken(b, XOR_ASSIGN);
    if (!r) r = consumeToken(b, CONCAT_ASSIGN);
    exit_section_(b, l, m, ASSIGN_OPERATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OPEN_BRACKET keyValuePairs CLOSE_BRACKET
  public static boolean assocArrayLiteral(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assocArrayLiteral")) return false;
    if (!nextTokenIs(b, OPEN_BRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACKET);
    r = r && keyValuePairs(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, ASSOC_ARRAY_LITERAL, r);
    return r;
  }

  /* ********************************************************** */
  // AT (IDENTIFIER | OPEN_PARENS argumentList CLOSE_PARENS | functionCallExpression)
  public static boolean atAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atAttribute")) return false;
    if (!nextTokenIs(b, AT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AT);
    r = r && atAttribute_1(b, l + 1);
    exit_section_(b, m, AT_ATTRIBUTE, r);
    return r;
  }

  // IDENTIFIER | OPEN_PARENS argumentList CLOSE_PARENS | functionCallExpression
  private static boolean atAttribute_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atAttribute_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = atAttribute_1_1(b, l + 1);
    if (!r) r = functionCallExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPEN_PARENS argumentList CLOSE_PARENS
  private static boolean atAttribute_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "atAttribute_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && argumentList(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // alignAttribute
  //      | linkageAttribute
  //      | pragmaExpression
  //      | storageClass
  //      | KW_EXPORT
  //      | KW_PACKAGE
  //      | KW_PRIVATE
  //      | KW_PROTECTED
  //      | KW_PUBLIC
  public static boolean attribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<attribute>");
    r = alignAttribute(b, l + 1);
    if (!r) r = linkageAttribute(b, l + 1);
    if (!r) r = pragmaExpression(b, l + 1);
    if (!r) r = storageClass(b, l + 1);
    if (!r) r = consumeToken(b, KW_EXPORT);
    if (!r) r = consumeToken(b, KW_PACKAGE);
    if (!r) r = consumeToken(b, KW_PRIVATE);
    if (!r) r = consumeToken(b, KW_PROTECTED);
    if (!r) r = consumeToken(b, KW_PUBLIC);
    exit_section_(b, l, m, ATTRIBUTE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // attribute COLON
  public static boolean attributeDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributeDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<attribute declaration>");
    r = attribute(b, l + 1);
    r = r && consumeToken(b, COLON);
    exit_section_(b, l, m, ATTRIBUTE_DECLARATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // storageClass IDENTIFIER ASSIGN initializer (COMMA IDENTIFIER ASSIGN initializer)* SEMICOLON
  public static boolean autoDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "autoDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<auto declaration>");
    r = storageClass(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, ASSIGN);
    r = r && initializer(b, l + 1);
    r = r && autoDeclaration_4(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, AUTO_DECLARATION, r, false, null);
    return r;
  }

  // (COMMA IDENTIFIER ASSIGN initializer)*
  private static boolean autoDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "autoDeclaration_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!autoDeclaration_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "autoDeclaration_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA IDENTIFIER ASSIGN initializer
  private static boolean autoDeclaration_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "autoDeclaration_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFIER, ASSIGN);
    r = r && initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (typeofExpression DOT)? identifierOrTemplateChain
  public static boolean baseClass(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "baseClass")) return false;
    if (!nextTokenIs(b, "<base class>", IDENTIFIER, KW_TYPEOF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<base class>");
    r = baseClass_0(b, l + 1);
    r = r && identifierOrTemplateChain(b, l + 1);
    exit_section_(b, l, m, BASE_CLASS, r, false, null);
    return r;
  }

  // (typeofExpression DOT)?
  private static boolean baseClass_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "baseClass_0")) return false;
    baseClass_0_0(b, l + 1);
    return true;
  }

  // typeofExpression DOT
  private static boolean baseClass_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "baseClass_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeofExpression(b, l + 1);
    r = r && consumeToken(b, DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // baseClass (COMMA baseClass)*
  public static boolean baseClassList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "baseClassList")) return false;
    if (!nextTokenIs(b, "<base class list>", IDENTIFIER, KW_TYPEOF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<base class list>");
    r = baseClass(b, l + 1);
    r = r && baseClassList_1(b, l + 1);
    exit_section_(b, l, m, BASE_CLASS_LIST, r, false, null);
    return r;
  }

  // (COMMA baseClass)*
  private static boolean baseClassList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "baseClassList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!baseClassList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "baseClassList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA baseClass
  private static boolean baseClassList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "baseClassList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && baseClass(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OPEN_BRACE declarationsAndStatements? CLOSE_BRACE
  public static boolean blockStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockStatement")) return false;
    if (!nextTokenIs(b, OPEN_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && blockStatement_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, BLOCK_STATEMENT, r);
    return r;
  }

  // declarationsAndStatements?
  private static boolean blockStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "blockStatement_1")) return false;
    declarationsAndStatements(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_BODY blockStatement
  public static boolean bodyStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bodyStatement")) return false;
    if (!nextTokenIs(b, KW_BODY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_BODY);
    r = r && blockStatement(b, l + 1);
    exit_section_(b, m, BODY_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // KW_BREAK IDENTIFIER? SEMICOLON
  public static boolean breakStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "breakStatement")) return false;
    if (!nextTokenIs(b, KW_BREAK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_BREAK);
    r = r && breakStatement_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, BREAK_STATEMENT, r);
    return r;
  }

  // IDENTIFIER?
  private static boolean breakStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "breakStatement_1")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // KW_BOOL
  //     | KW_BYTE
  //     | KW_UBYTE
  //     | KW_SHORT
  //     | KW_USHORT
  //     | KW_INT
  //     | KW_UINT
  //     | KW_LONG
  //     | KW_ULONG
  //     | KW_CHAR
  //     | KW_WCHAR
  //     | KW_DCHAR
  //     | KW_FLOAT
  //     | KW_DOUBLE
  //     | KW_REAL
  //     | KW_IFLOAT
  //     | KW_IDOUBLE
  //     | KW_IREAL
  //     | KW_CFLOAT
  //     | KW_CDOUBLE
  //     | KW_CREAL
  //     | KW_VOID
  public static boolean builtinType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "builtinType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<builtin type>");
    r = consumeToken(b, KW_BOOL);
    if (!r) r = consumeToken(b, KW_BYTE);
    if (!r) r = consumeToken(b, KW_UBYTE);
    if (!r) r = consumeToken(b, KW_SHORT);
    if (!r) r = consumeToken(b, KW_USHORT);
    if (!r) r = consumeToken(b, KW_INT);
    if (!r) r = consumeToken(b, KW_UINT);
    if (!r) r = consumeToken(b, KW_LONG);
    if (!r) r = consumeToken(b, KW_ULONG);
    if (!r) r = consumeToken(b, KW_CHAR);
    if (!r) r = consumeToken(b, KW_WCHAR);
    if (!r) r = consumeToken(b, KW_DCHAR);
    if (!r) r = consumeToken(b, KW_FLOAT);
    if (!r) r = consumeToken(b, KW_DOUBLE);
    if (!r) r = consumeToken(b, KW_REAL);
    if (!r) r = consumeToken(b, KW_IFLOAT);
    if (!r) r = consumeToken(b, KW_IDOUBLE);
    if (!r) r = consumeToken(b, KW_IREAL);
    if (!r) r = consumeToken(b, KW_CFLOAT);
    if (!r) r = consumeToken(b, KW_CDOUBLE);
    if (!r) r = consumeToken(b, KW_CREAL);
    if (!r) r = consumeToken(b, KW_VOID);
    exit_section_(b, l, m, BUILTIN_TYPE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_CASE assignExpression COLON TRIPLE_DOT KW_CASE assignExpression COLON declarationsAndStatements
  public static boolean caseRangeStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseRangeStatement")) return false;
    if (!nextTokenIs(b, KW_CASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CASE);
    r = r && assignExpression(b, l + 1);
    r = r && consumeTokens(b, 0, COLON, TRIPLE_DOT, KW_CASE);
    r = r && assignExpression(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && declarationsAndStatements(b, l + 1);
    exit_section_(b, m, CASE_RANGE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // KW_CASE argumentList COLON declarationsAndStatements
  public static boolean caseStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "caseStatement")) return false;
    if (!nextTokenIs(b, KW_CASE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CASE);
    r = r && argumentList(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && declarationsAndStatements(b, l + 1);
    exit_section_(b, m, CASE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // KW_CAST OPEN_PARENS (type | castQualifier)? CLOSE_PARENS unaryExpression
  public static boolean castExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "castExpression")) return false;
    if (!nextTokenIs(b, KW_CAST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_CAST, OPEN_PARENS);
    r = r && castExpression_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    r = r && unaryExpression(b, l + 1);
    exit_section_(b, m, CAST_EXPRESSION, r);
    return r;
  }

  // (type | castQualifier)?
  private static boolean castExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "castExpression_2")) return false;
    castExpression_2_0(b, l + 1);
    return true;
  }

  // type | castQualifier
  private static boolean castExpression_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "castExpression_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    if (!r) r = castQualifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_CONST
  //     | KW_CONST KW_SHARED
  //     | KW_IMMUTABLE
  //     | KW_INOUT
  //     | KW_INOUT KW_SHARED
  //     | KW_SHARED
  //     | KW_SHARED KW_CONST
  //     | KW_SHARED KW_INOUT
  public static boolean castQualifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "castQualifier")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<cast qualifier>");
    r = consumeToken(b, KW_CONST);
    if (!r) r = parseTokens(b, 0, KW_CONST, KW_SHARED);
    if (!r) r = consumeToken(b, KW_IMMUTABLE);
    if (!r) r = consumeToken(b, KW_INOUT);
    if (!r) r = parseTokens(b, 0, KW_INOUT, KW_SHARED);
    if (!r) r = consumeToken(b, KW_SHARED);
    if (!r) r = parseTokens(b, 0, KW_SHARED, KW_CONST);
    if (!r) r = parseTokens(b, 0, KW_SHARED, KW_INOUT);
    exit_section_(b, l, m, CAST_QUALIFIER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_CATCH OPEN_PARENS type IDENTIFIER? CLOSE_PARENS declarationOrStatement
  public static boolean catch_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch_")) return false;
    if (!nextTokenIs(b, KW_CATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_CATCH, OPEN_PARENS);
    r = r && type(b, l + 1);
    r = r && catch__3(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    r = r && declarationOrStatement(b, l + 1);
    exit_section_(b, m, CATCH, r);
    return r;
  }

  // IDENTIFIER?
  private static boolean catch__3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catch__3")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // catch_+
  //      | catch_* lastCatch
  public static boolean catches(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catches")) return false;
    if (!nextTokenIs(b, KW_CATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = catches_0(b, l + 1);
    if (!r) r = catches_1(b, l + 1);
    exit_section_(b, m, CATCHES, r);
    return r;
  }

  // catch_+
  private static boolean catches_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catches_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = catch_(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!catch_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "catches_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // catch_* lastCatch
  private static boolean catches_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catches_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = catches_1_0(b, l + 1);
    r = r && lastCatch(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // catch_*
  private static boolean catches_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "catches_1_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!catch_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "catches_1_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // KW_CLASS IDENTIFIER (COLON baseClassList)? SEMICOLON
  //      | KW_CLASS IDENTIFIER (COLON baseClassList)? structBody
  //      | KW_CLASS IDENTIFIER templateParameters constraint? (COLON baseClassList)? structBody
  //      | KW_CLASS IDENTIFIER templateParameters (COLON baseClassList)? constraint? structBody
  public static boolean classDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration")) return false;
    if (!nextTokenIs(b, KW_CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = classDeclaration_0(b, l + 1);
    if (!r) r = classDeclaration_1(b, l + 1);
    if (!r) r = classDeclaration_2(b, l + 1);
    if (!r) r = classDeclaration_3(b, l + 1);
    exit_section_(b, m, CLASS_DECLARATION, r);
    return r;
  }

  // KW_CLASS IDENTIFIER (COLON baseClassList)? SEMICOLON
  private static boolean classDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_CLASS, IDENTIFIER);
    r = r && classDeclaration_0_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COLON baseClassList)?
  private static boolean classDeclaration_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_0_2")) return false;
    classDeclaration_0_2_0(b, l + 1);
    return true;
  }

  // COLON baseClassList
  private static boolean classDeclaration_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && baseClassList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_CLASS IDENTIFIER (COLON baseClassList)? structBody
  private static boolean classDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_CLASS, IDENTIFIER);
    r = r && classDeclaration_1_2(b, l + 1);
    r = r && structBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COLON baseClassList)?
  private static boolean classDeclaration_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_1_2")) return false;
    classDeclaration_1_2_0(b, l + 1);
    return true;
  }

  // COLON baseClassList
  private static boolean classDeclaration_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && baseClassList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_CLASS IDENTIFIER templateParameters constraint? (COLON baseClassList)? structBody
  private static boolean classDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_CLASS, IDENTIFIER);
    r = r && templateParameters(b, l + 1);
    r = r && classDeclaration_2_3(b, l + 1);
    r = r && classDeclaration_2_4(b, l + 1);
    r = r && structBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // constraint?
  private static boolean classDeclaration_2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_2_3")) return false;
    constraint(b, l + 1);
    return true;
  }

  // (COLON baseClassList)?
  private static boolean classDeclaration_2_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_2_4")) return false;
    classDeclaration_2_4_0(b, l + 1);
    return true;
  }

  // COLON baseClassList
  private static boolean classDeclaration_2_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_2_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && baseClassList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_CLASS IDENTIFIER templateParameters (COLON baseClassList)? constraint? structBody
  private static boolean classDeclaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_CLASS, IDENTIFIER);
    r = r && templateParameters(b, l + 1);
    r = r && classDeclaration_3_3(b, l + 1);
    r = r && classDeclaration_3_4(b, l + 1);
    r = r && structBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COLON baseClassList)?
  private static boolean classDeclaration_3_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_3_3")) return false;
    classDeclaration_3_3_0(b, l + 1);
    return true;
  }

  // COLON baseClassList
  private static boolean classDeclaration_3_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_3_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && baseClassList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // constraint?
  private static boolean classDeclaration_3_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "classDeclaration_3_4")) return false;
    constraint(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // shiftExpression
  //      | equalExpression
  //      | identityExpression
  //      | relExpression
  //      | inExpression
  public static boolean cmpExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cmpExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<cmp expression>");
    r = shiftExpression(b, l + 1);
    if (!r) r = equalExpression(b, l + 1);
    if (!r) r = identityExpression(b, l + 1);
    if (!r) r = relExpression(b, l + 1);
    if (!r) r = inExpression(b, l + 1);
    exit_section_(b, l, m, CMP_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // versionCondition
  //      | debugCondition
  //      | staticIfCondition
  public static boolean compileCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "compileCondition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<compile condition>");
    r = versionCondition(b, l + 1);
    if (!r) r = debugCondition(b, l + 1);
    if (!r) r = staticIfCondition(b, l + 1);
    exit_section_(b, l, m, COMPILE_CONDITION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // compileCondition declaration
  //      | compileCondition COLON declaration+
  //      | compileCondition declaration (KW_ELSE declaration)?
  public static boolean conditionalDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditionalDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<conditional declaration>");
    r = conditionalDeclaration_0(b, l + 1);
    if (!r) r = conditionalDeclaration_1(b, l + 1);
    if (!r) r = conditionalDeclaration_2(b, l + 1);
    exit_section_(b, l, m, CONDITIONAL_DECLARATION, r, false, null);
    return r;
  }

  // compileCondition declaration
  private static boolean conditionalDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditionalDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = compileCondition(b, l + 1);
    r = r && declaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // compileCondition COLON declaration+
  private static boolean conditionalDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditionalDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = compileCondition(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && conditionalDeclaration_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // declaration+
  private static boolean conditionalDeclaration_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditionalDeclaration_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declaration(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "conditionalDeclaration_1_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // compileCondition declaration (KW_ELSE declaration)?
  private static boolean conditionalDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditionalDeclaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = compileCondition(b, l + 1);
    r = r && declaration(b, l + 1);
    r = r && conditionalDeclaration_2_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KW_ELSE declaration)?
  private static boolean conditionalDeclaration_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditionalDeclaration_2_2")) return false;
    conditionalDeclaration_2_2_0(b, l + 1);
    return true;
  }

  // KW_ELSE declaration
  private static boolean conditionalDeclaration_2_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditionalDeclaration_2_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ELSE);
    r = r && declaration(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // compileCondition declarationOrStatement (KW_ELSE declarationOrStatement)?
  public static boolean conditionalStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditionalStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<conditional statement>");
    r = compileCondition(b, l + 1);
    r = r && declarationOrStatement(b, l + 1);
    r = r && conditionalStatement_2(b, l + 1);
    exit_section_(b, l, m, CONDITIONAL_STATEMENT, r, false, null);
    return r;
  }

  // (KW_ELSE declarationOrStatement)?
  private static boolean conditionalStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditionalStatement_2")) return false;
    conditionalStatement_2_0(b, l + 1);
    return true;
  }

  // KW_ELSE declarationOrStatement
  private static boolean conditionalStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "conditionalStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ELSE);
    r = r && declarationOrStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_IF OPEN_PARENS expression CLOSE_PARENS
  public static boolean constraint(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constraint")) return false;
    if (!nextTokenIs(b, KW_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_IF, OPEN_PARENS);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, CONSTRAINT, r);
    return r;
  }

  /* ********************************************************** */
  // KW_THIS templateParameters parameters memberFunctionAttribute* constraint? (functionBody | SEMICOLON)
  public static boolean constructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor")) return false;
    if (!nextTokenIs(b, KW_THIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_THIS);
    r = r && templateParameters(b, l + 1);
    r = r && parameters(b, l + 1);
    r = r && constructor_3(b, l + 1);
    r = r && constructor_4(b, l + 1);
    r = r && constructor_5(b, l + 1);
    exit_section_(b, m, CONSTRUCTOR, r);
    return r;
  }

  // memberFunctionAttribute*
  private static boolean constructor_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!memberFunctionAttribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "constructor_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // constraint?
  private static boolean constructor_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_4")) return false;
    constraint(b, l + 1);
    return true;
  }

  // functionBody | SEMICOLON
  private static boolean constructor_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionBody(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_CONTINUE IDENTIFIER? SEMICOLON
  public static boolean continueStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continueStatement")) return false;
    if (!nextTokenIs(b, KW_CONTINUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CONTINUE);
    r = r && continueStatement_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, CONTINUE_STATEMENT, r);
    return r;
  }

  // IDENTIFIER?
  private static boolean continueStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "continueStatement_1")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // KW_DEBUG (OPEN_PARENS (GROUP_INTEGER | IDENTIFIER) CLOSE_PARENS)?
  public static boolean debugCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "debugCondition")) return false;
    if (!nextTokenIs(b, KW_DEBUG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DEBUG);
    r = r && debugCondition_1(b, l + 1);
    exit_section_(b, m, DEBUG_CONDITION, r);
    return r;
  }

  // (OPEN_PARENS (GROUP_INTEGER | IDENTIFIER) CLOSE_PARENS)?
  private static boolean debugCondition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "debugCondition_1")) return false;
    debugCondition_1_0(b, l + 1);
    return true;
  }

  // OPEN_PARENS (GROUP_INTEGER | IDENTIFIER) CLOSE_PARENS
  private static boolean debugCondition_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "debugCondition_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && debugCondition_1_0_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  // GROUP_INTEGER | IDENTIFIER
  private static boolean debugCondition_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "debugCondition_1_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GROUP_INTEGER);
    if (!r) r = consumeToken(b, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_DEBUG ASSIGN (IDENTIFIER | GROUP_INTEGER) SEMICOLON
  public static boolean debugSpecification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "debugSpecification")) return false;
    if (!nextTokenIs(b, KW_DEBUG)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_DEBUG, ASSIGN);
    r = r && debugSpecification_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, DEBUG_SPECIFICATION, r);
    return r;
  }

  // IDENTIFIER | GROUP_INTEGER
  private static boolean debugSpecification_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "debugSpecification_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, GROUP_INTEGER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // attribute* declaration2
  public static boolean declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<declaration>");
    r = declaration_0(b, l + 1);
    r = r && declaration2(b, l + 1);
    exit_section_(b, l, m, DECLARATION, r, false, null);
    return r;
  }

  // attribute*
  private static boolean declaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!attribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declaration_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // aliasDeclaration
  //    | aliasThisDeclaration
  //    | classDeclaration
  //    | conditionalDeclaration
  //    | constructor
  //    | destructor
  //    | enumDeclaration
  //    | functionDeclaration
  //    | importDeclaration
  //    | interfaceDeclaration
  //    | mixinDeclaration
  //    | mixinTemplateDeclaration
  //    | pragmaDeclaration
  //    | sharedStaticConstructor
  //    | sharedStaticDestructor
  //    | staticAssertDeclaration
  //    | staticConstructor
  //    | staticDestructor
  //    | structDeclaration
  //    | templateDeclaration
  //    | unionDeclaration
  //    | unittest
  //    | variableDeclaration
  //    | attributeDeclaration
  //    | invariant
  //    | OPEN_BRACE declaration+ CLOSE_BRACE
  public static boolean declaration2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<declaration 2>");
    r = aliasDeclaration(b, l + 1);
    if (!r) r = aliasThisDeclaration(b, l + 1);
    if (!r) r = classDeclaration(b, l + 1);
    if (!r) r = conditionalDeclaration(b, l + 1);
    if (!r) r = constructor(b, l + 1);
    if (!r) r = destructor(b, l + 1);
    if (!r) r = enumDeclaration(b, l + 1);
    if (!r) r = functionDeclaration(b, l + 1);
    if (!r) r = importDeclaration(b, l + 1);
    if (!r) r = interfaceDeclaration(b, l + 1);
    if (!r) r = mixinDeclaration(b, l + 1);
    if (!r) r = mixinTemplateDeclaration(b, l + 1);
    if (!r) r = pragmaDeclaration(b, l + 1);
    if (!r) r = sharedStaticConstructor(b, l + 1);
    if (!r) r = sharedStaticDestructor(b, l + 1);
    if (!r) r = staticAssertDeclaration(b, l + 1);
    if (!r) r = staticConstructor(b, l + 1);
    if (!r) r = staticDestructor(b, l + 1);
    if (!r) r = structDeclaration(b, l + 1);
    if (!r) r = templateDeclaration(b, l + 1);
    if (!r) r = unionDeclaration(b, l + 1);
    if (!r) r = unittest(b, l + 1);
    if (!r) r = variableDeclaration(b, l + 1);
    if (!r) r = attributeDeclaration(b, l + 1);
    if (!r) r = invariant(b, l + 1);
    if (!r) r = declaration2_25(b, l + 1);
    exit_section_(b, l, m, DECLARATION_2, r, false, null);
    return r;
  }

  // OPEN_BRACE declaration+ CLOSE_BRACE
  private static boolean declaration2_25(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration2_25")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && declaration2_25_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // declaration+
  private static boolean declaration2_25_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration2_25_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = declaration(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declaration2_25_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // declaration
  //      | statement
  public static boolean declarationOrStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarationOrStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<declaration or statement>");
    r = declaration(b, l + 1);
    if (!r) r = statement(b, l + 1);
    exit_section_(b, l, m, DECLARATION_OR_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // declarationOrStatement+
  public static boolean declarationsAndStatements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarationsAndStatements")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<declarations and statements>");
    r = declarationOrStatement(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!declarationOrStatement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declarationsAndStatements", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, DECLARATIONS_AND_STATEMENTS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER (ASSIGN initializer)?
  public static boolean declarator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarator")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && declarator_1(b, l + 1);
    exit_section_(b, m, DECLARATOR, r);
    return r;
  }

  // (ASSIGN initializer)?
  private static boolean declarator_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarator_1")) return false;
    declarator_1_0(b, l + 1);
    return true;
  }

  // ASSIGN initializer
  private static boolean declarator_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declarator_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && initializer(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_DEFAULT COLON declarationsAndStatements
  public static boolean defaultStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "defaultStatement")) return false;
    if (!nextTokenIs(b, KW_DEFAULT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_DEFAULT, COLON);
    r = r && declarationsAndStatements(b, l + 1);
    exit_section_(b, m, DEFAULT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // KW_DELETE unaryExpression
  public static boolean deleteExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deleteExpression")) return false;
    if (!nextTokenIs(b, KW_DELETE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DELETE);
    r = r && unaryExpression(b, l + 1);
    exit_section_(b, m, DELETE_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // KW_DEPRECATED (OPEN_PARENS assignExpression CLOSE_PARENS)?
  public static boolean deprecated(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deprecated")) return false;
    if (!nextTokenIs(b, KW_DEPRECATED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DEPRECATED);
    r = r && deprecated_1(b, l + 1);
    exit_section_(b, m, DEPRECATED, r);
    return r;
  }

  // (OPEN_PARENS assignExpression CLOSE_PARENS)?
  private static boolean deprecated_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deprecated_1")) return false;
    deprecated_1_0(b, l + 1);
    return true;
  }

  // OPEN_PARENS assignExpression CLOSE_PARENS
  private static boolean deprecated_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "deprecated_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && assignExpression(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CONCAT KW_THIS OPEN_PARENS CLOSE_PARENS memberFunctionAttribute* (functionBody | SEMICOLON)
  public static boolean destructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "destructor")) return false;
    if (!nextTokenIs(b, CONCAT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CONCAT, KW_THIS, OPEN_PARENS, CLOSE_PARENS);
    r = r && destructor_4(b, l + 1);
    r = r && destructor_5(b, l + 1);
    exit_section_(b, m, DESTRUCTOR, r);
    return r;
  }

  // memberFunctionAttribute*
  private static boolean destructor_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "destructor_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!memberFunctionAttribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "destructor_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // functionBody | SEMICOLON
  private static boolean destructor_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "destructor_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionBody(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_DO statementNoCaseNoDefault KW_WHILE OPEN_PARENS expression CLOSE_PARENS SEMICOLON
  public static boolean doStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doStatement")) return false;
    if (!nextTokenIs(b, KW_DO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DO);
    r = r && statementNoCaseNoDefault(b, l + 1);
    r = r && consumeTokens(b, 0, KW_WHILE, OPEN_PARENS);
    r = r && expression(b, l + 1);
    r = r && consumeTokens(b, 0, CLOSE_PARENS, SEMICOLON);
    exit_section_(b, m, DO_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // SEMICOLON
  //      | OPEN_BRACE enumMember (COMMA enumMember?)* CLOSE_BRACE
  public static boolean enumBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumBody")) return false;
    if (!nextTokenIs(b, "<enum body>", OPEN_BRACE, SEMICOLON)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<enum body>");
    r = consumeToken(b, SEMICOLON);
    if (!r) r = enumBody_1(b, l + 1);
    exit_section_(b, l, m, ENUM_BODY, r, false, null);
    return r;
  }

  // OPEN_BRACE enumMember (COMMA enumMember?)* CLOSE_BRACE
  private static boolean enumBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumBody_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && enumMember(b, l + 1);
    r = r && enumBody_1_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA enumMember?)*
  private static boolean enumBody_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumBody_1_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!enumBody_1_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "enumBody_1_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA enumMember?
  private static boolean enumBody_1_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumBody_1_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && enumBody_1_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // enumMember?
  private static boolean enumBody_1_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumBody_1_2_0_1")) return false;
    enumMember(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_ENUM IDENTIFIER? (COLON type)? enumBody
  public static boolean enumDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDeclaration")) return false;
    if (!nextTokenIs(b, KW_ENUM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ENUM);
    r = r && enumDeclaration_1(b, l + 1);
    r = r && enumDeclaration_2(b, l + 1);
    r = r && enumBody(b, l + 1);
    exit_section_(b, m, ENUM_DECLARATION, r);
    return r;
  }

  // IDENTIFIER?
  private static boolean enumDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDeclaration_1")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  // (COLON type)?
  private static boolean enumDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDeclaration_2")) return false;
    enumDeclaration_2_0(b, l + 1);
    return true;
  }

  // COLON type
  private static boolean enumDeclaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumDeclaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  //      | (IDENTIFIER | type) ASSIGN assignExpression
  public static boolean enumMember(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumMember")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<enum member>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = enumMember_1(b, l + 1);
    exit_section_(b, l, m, ENUM_MEMBER, r, false, null);
    return r;
  }

  // (IDENTIFIER | type) ASSIGN assignExpression
  private static boolean enumMember_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumMember_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = enumMember_1_0(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && assignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER | type
  private static boolean enumMember_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enumMember_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_ENUM IDENTIFIER templateParameters ASSIGN assignExpression SEMICOLON
  public static boolean eponymousTemplateDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "eponymousTemplateDeclaration")) return false;
    if (!nextTokenIs(b, KW_ENUM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_ENUM, IDENTIFIER);
    r = r && templateParameters(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && assignExpression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, EPONYMOUS_TEMPLATE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // shiftExpression (EQUALS | NOT_EQUAL) shiftExpression
  public static boolean equalExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equalExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<equal expression>");
    r = shiftExpression(b, l + 1);
    r = r && equalExpression_1(b, l + 1);
    r = r && shiftExpression(b, l + 1);
    exit_section_(b, l, m, EQUAL_EXPRESSION, r, false, null);
    return r;
  }

  // EQUALS | NOT_EQUAL
  private static boolean equalExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "equalExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, EQUALS);
    if (!r) r = consumeToken(b, NOT_EQUAL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // assignExpression (COMMA assignExpression)*
  public static boolean expression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<expression>");
    r = assignExpression(b, l + 1);
    r = r && expression_1(b, l + 1);
    exit_section_(b, l, m, EXPRESSION, r, false, null);
    return r;
  }

  // (COMMA assignExpression)*
  private static boolean expression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!expression_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA assignExpression
  private static boolean expression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && assignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // expression SEMICOLON
  public static boolean expressionStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expressionStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<expression statement>");
    r = expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, EXPRESSION_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_FINAL switchStatement
  public static boolean finalSwitchStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "finalSwitchStatement")) return false;
    if (!nextTokenIs(b, KW_FINAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FINAL);
    r = r && switchStatement(b, l + 1);
    exit_section_(b, m, FINAL_SWITCH_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // KW_FINALLY declarationOrStatement
  public static boolean finally_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "finally_")) return false;
    if (!nextTokenIs(b, KW_FINALLY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FINALLY);
    r = r && declarationOrStatement(b, l + 1);
    exit_section_(b, m, FINALLY, r);
    return r;
  }

  /* ********************************************************** */
  // KW_FOR OPEN_PARENS declarationOrStatement expression? SEMICOLON expression? CLOSE_PARENS declarationOrStatement
  public static boolean forStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStatement")) return false;
    if (!nextTokenIs(b, KW_FOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_FOR, OPEN_PARENS);
    r = r && declarationOrStatement(b, l + 1);
    r = r && forStatement_3(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && forStatement_5(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    r = r && declarationOrStatement(b, l + 1);
    exit_section_(b, m, FOR_STATEMENT, r);
    return r;
  }

  // expression?
  private static boolean forStatement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStatement_3")) return false;
    expression(b, l + 1);
    return true;
  }

  // expression?
  private static boolean forStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "forStatement_5")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (KW_FOREACH | KW_FOREACH_REVERSE) OPEN_PARENS foreachTypeList SEMICOLON expression CLOSE_PARENS declarationOrStatement
  //      | (KW_FOREACH | KW_FOREACH_REVERSE) OPEN_PARENS foreachType SEMICOLON expression DOUBLE_DOT expression CLOSE_PARENS declarationOrStatement
  public static boolean foreachStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreachStatement")) return false;
    if (!nextTokenIs(b, "<foreach statement>", KW_FOREACH, KW_FOREACH_REVERSE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<foreach statement>");
    r = foreachStatement_0(b, l + 1);
    if (!r) r = foreachStatement_1(b, l + 1);
    exit_section_(b, l, m, FOREACH_STATEMENT, r, false, null);
    return r;
  }

  // (KW_FOREACH | KW_FOREACH_REVERSE) OPEN_PARENS foreachTypeList SEMICOLON expression CLOSE_PARENS declarationOrStatement
  private static boolean foreachStatement_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreachStatement_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = foreachStatement_0_0(b, l + 1);
    r = r && consumeToken(b, OPEN_PARENS);
    r = r && foreachTypeList(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    r = r && declarationOrStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_FOREACH | KW_FOREACH_REVERSE
  private static boolean foreachStatement_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreachStatement_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FOREACH);
    if (!r) r = consumeToken(b, KW_FOREACH_REVERSE);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KW_FOREACH | KW_FOREACH_REVERSE) OPEN_PARENS foreachType SEMICOLON expression DOUBLE_DOT expression CLOSE_PARENS declarationOrStatement
  private static boolean foreachStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreachStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = foreachStatement_1_0(b, l + 1);
    r = r && consumeToken(b, OPEN_PARENS);
    r = r && foreachType(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, DOUBLE_DOT);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    r = r && declarationOrStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_FOREACH | KW_FOREACH_REVERSE
  private static boolean foreachStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreachStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FOREACH);
    if (!r) r = consumeToken(b, KW_FOREACH_REVERSE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // typeConstructors? type? IDENTIFIER
  public static boolean foreachType(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreachType")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<foreach type>");
    r = foreachType_0(b, l + 1);
    r = r && foreachType_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    exit_section_(b, l, m, FOREACH_TYPE, r, false, null);
    return r;
  }

  // typeConstructors?
  private static boolean foreachType_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreachType_0")) return false;
    typeConstructors(b, l + 1);
    return true;
  }

  // type?
  private static boolean foreachType_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreachType_1")) return false;
    type(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // foreachType (COMMA foreachType)*
  public static boolean foreachTypeList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreachTypeList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<foreach type list>");
    r = foreachType(b, l + 1);
    r = r && foreachTypeList_1(b, l + 1);
    exit_section_(b, l, m, FOREACH_TYPE_LIST, r, false, null);
    return r;
  }

  // (COMMA foreachType)*
  private static boolean foreachTypeList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreachTypeList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!foreachTypeList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "foreachTypeList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA foreachType
  private static boolean foreachTypeList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "foreachTypeList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && foreachType(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // atAttribute
  //      | KW_PURE
  //      | KW_NOTHROW
  public static boolean functionAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionAttribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<function attribute>");
    r = atAttribute(b, l + 1);
    if (!r) r = consumeToken(b, KW_PURE);
    if (!r) r = consumeToken(b, KW_NOTHROW);
    exit_section_(b, l, m, FUNCTION_ATTRIBUTE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // blockStatement
  //      | (inStatement | outStatement | outStatement inStatement | inStatement outStatement)? bodyStatement
  public static boolean functionBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBody")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<function body>");
    r = blockStatement(b, l + 1);
    if (!r) r = functionBody_1(b, l + 1);
    exit_section_(b, l, m, FUNCTION_BODY, r, false, null);
    return r;
  }

  // (inStatement | outStatement | outStatement inStatement | inStatement outStatement)? bodyStatement
  private static boolean functionBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBody_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionBody_1_0(b, l + 1);
    r = r && bodyStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (inStatement | outStatement | outStatement inStatement | inStatement outStatement)?
  private static boolean functionBody_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBody_1_0")) return false;
    functionBody_1_0_0(b, l + 1);
    return true;
  }

  // inStatement | outStatement | outStatement inStatement | inStatement outStatement
  private static boolean functionBody_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBody_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = inStatement(b, l + 1);
    if (!r) r = outStatement(b, l + 1);
    if (!r) r = functionBody_1_0_0_2(b, l + 1);
    if (!r) r = functionBody_1_0_0_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // outStatement inStatement
  private static boolean functionBody_1_0_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBody_1_0_0_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = outStatement(b, l + 1);
    r = r && inStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // inStatement outStatement
  private static boolean functionBody_1_0_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionBody_1_0_0_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = inStatement(b, l + 1);
    r = r && outStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // unaryExpression templateArguments? arguments
  //      | type arguments
  public static boolean functionCallExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCallExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<function call expression>");
    r = functionCallExpression_0(b, l + 1);
    if (!r) r = functionCallExpression_1(b, l + 1);
    exit_section_(b, l, m, FUNCTION_CALL_EXPRESSION, r, false, null);
    return r;
  }

  // unaryExpression templateArguments? arguments
  private static boolean functionCallExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCallExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unaryExpression(b, l + 1);
    r = r && functionCallExpression_0_1(b, l + 1);
    r = r && arguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // templateArguments?
  private static boolean functionCallExpression_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCallExpression_0_1")) return false;
    templateArguments(b, l + 1);
    return true;
  }

  // type arguments
  private static boolean functionCallExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCallExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && arguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // functionCallExpression SEMICOLON
  public static boolean functionCallStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionCallStatement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<function call statement>");
    r = functionCallExpression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, l, m, FUNCTION_CALL_STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (storageClass | type) IDENTIFIER templateParameters? parameters memberFunctionAttribute* constraint? (functionBody | SEMICOLON)
  public static boolean functionDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<function declaration>");
    r = functionDeclaration_0(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && functionDeclaration_2(b, l + 1);
    r = r && parameters(b, l + 1);
    r = r && functionDeclaration_4(b, l + 1);
    r = r && functionDeclaration_5(b, l + 1);
    r = r && functionDeclaration_6(b, l + 1);
    exit_section_(b, l, m, FUNCTION_DECLARATION, r, false, null);
    return r;
  }

  // storageClass | type
  private static boolean functionDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = storageClass(b, l + 1);
    if (!r) r = type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // templateParameters?
  private static boolean functionDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_2")) return false;
    templateParameters(b, l + 1);
    return true;
  }

  // memberFunctionAttribute*
  private static boolean functionDeclaration_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!memberFunctionAttribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionDeclaration_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // constraint?
  private static boolean functionDeclaration_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_5")) return false;
    constraint(b, l + 1);
    return true;
  }

  // functionBody | SEMICOLON
  private static boolean functionDeclaration_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionDeclaration_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionBody(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ((KW_FUNCTION | KW_DELEGATE) type?)? (parameters functionAttribute*)? functionBody
  public static boolean functionLiteralExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLiteralExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<function literal expression>");
    r = functionLiteralExpression_0(b, l + 1);
    r = r && functionLiteralExpression_1(b, l + 1);
    r = r && functionBody(b, l + 1);
    exit_section_(b, l, m, FUNCTION_LITERAL_EXPRESSION, r, false, null);
    return r;
  }

  // ((KW_FUNCTION | KW_DELEGATE) type?)?
  private static boolean functionLiteralExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLiteralExpression_0")) return false;
    functionLiteralExpression_0_0(b, l + 1);
    return true;
  }

  // (KW_FUNCTION | KW_DELEGATE) type?
  private static boolean functionLiteralExpression_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLiteralExpression_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionLiteralExpression_0_0_0(b, l + 1);
    r = r && functionLiteralExpression_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_FUNCTION | KW_DELEGATE
  private static boolean functionLiteralExpression_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLiteralExpression_0_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FUNCTION);
    if (!r) r = consumeToken(b, KW_DELEGATE);
    exit_section_(b, m, null, r);
    return r;
  }

  // type?
  private static boolean functionLiteralExpression_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLiteralExpression_0_0_1")) return false;
    type(b, l + 1);
    return true;
  }

  // (parameters functionAttribute*)?
  private static boolean functionLiteralExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLiteralExpression_1")) return false;
    functionLiteralExpression_1_0(b, l + 1);
    return true;
  }

  // parameters functionAttribute*
  private static boolean functionLiteralExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLiteralExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameters(b, l + 1);
    r = r && functionLiteralExpression_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // functionAttribute*
  private static boolean functionLiteralExpression_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "functionLiteralExpression_1_0_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!functionAttribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "functionLiteralExpression_1_0_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // KW_GOTO (IDENTIFIER | KW_DEFAULT | KW_CASE expression?) SEMICOLON
  public static boolean gotoStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "gotoStatement")) return false;
    if (!nextTokenIs(b, KW_GOTO)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_GOTO);
    r = r && gotoStatement_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, GOTO_STATEMENT, r);
    return r;
  }

  // IDENTIFIER | KW_DEFAULT | KW_CASE expression?
  private static boolean gotoStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "gotoStatement_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, KW_DEFAULT);
    if (!r) r = gotoStatement_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_CASE expression?
  private static boolean gotoStatement_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "gotoStatement_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CASE);
    r = r && gotoStatement_1_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // expression?
  private static boolean gotoStatement_1_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "gotoStatement_1_2_1")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER (DOT IDENTIFIER)*
  public static boolean identifierChain(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifierChain")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && identifierChain_1(b, l + 1);
    exit_section_(b, m, IDENTIFIER_CHAIN, r);
    return r;
  }

  // (DOT IDENTIFIER)*
  private static boolean identifierChain_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifierChain_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!identifierChain_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "identifierChain_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // DOT IDENTIFIER
  private static boolean identifierChain_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifierChain_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER (COMMA IDENTIFIER)*
  public static boolean identifierList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifierList")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && identifierList_1(b, l + 1);
    exit_section_(b, m, IDENTIFIER_LIST, r);
    return r;
  }

  // (COMMA IDENTIFIER)*
  private static boolean identifierList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifierList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!identifierList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "identifierList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA IDENTIFIER
  private static boolean identifierList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifierList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifierOrTemplateInstance (DOT identifierOrTemplateInstance)*
  public static boolean identifierOrTemplateChain(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifierOrTemplateChain")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = identifierOrTemplateInstance(b, l + 1);
    r = r && identifierOrTemplateChain_1(b, l + 1);
    exit_section_(b, m, IDENTIFIER_OR_TEMPLATE_CHAIN, r);
    return r;
  }

  // (DOT identifierOrTemplateInstance)*
  private static boolean identifierOrTemplateChain_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifierOrTemplateChain_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!identifierOrTemplateChain_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "identifierOrTemplateChain_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // DOT identifierOrTemplateInstance
  private static boolean identifierOrTemplateChain_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifierOrTemplateChain_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && identifierOrTemplateInstance(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  //      | templateInstance
  public static boolean identifierOrTemplateInstance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifierOrTemplateInstance")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = templateInstance(b, l + 1);
    exit_section_(b, m, IDENTIFIER_OR_TEMPLATE_INSTANCE, r);
    return r;
  }

  /* ********************************************************** */
  // shiftExpression (KW_IS | NOT KW_IS) shiftExpression
  public static boolean identityExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identityExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<identity expression>");
    r = shiftExpression(b, l + 1);
    r = r && identityExpression_1(b, l + 1);
    r = r && shiftExpression(b, l + 1);
    exit_section_(b, l, m, IDENTITY_EXPRESSION, r, false, null);
    return r;
  }

  // KW_IS | NOT KW_IS
  private static boolean identityExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identityExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_IS);
    if (!r) r = parseTokens(b, 0, NOT, KW_IS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_AUTO IDENTIFIER ASSIGN expression
  //      | type IDENTIFIER ASSIGN expression
  //      | expression
  public static boolean ifCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifCondition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<if condition>");
    r = ifCondition_0(b, l + 1);
    if (!r) r = ifCondition_1(b, l + 1);
    if (!r) r = expression(b, l + 1);
    exit_section_(b, l, m, IF_CONDITION, r, false, null);
    return r;
  }

  // KW_AUTO IDENTIFIER ASSIGN expression
  private static boolean ifCondition_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifCondition_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_AUTO, IDENTIFIER, ASSIGN);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type IDENTIFIER ASSIGN expression
  private static boolean ifCondition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifCondition_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && consumeTokens(b, 0, IDENTIFIER, ASSIGN);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_IF OPEN_PARENS ifCondition CLOSE_PARENS declarationOrStatement (KW_ELSE declarationOrStatement)?
  public static boolean ifStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement")) return false;
    if (!nextTokenIs(b, KW_IF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_IF, OPEN_PARENS);
    r = r && ifCondition(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    r = r && declarationOrStatement(b, l + 1);
    r = r && ifStatement_5(b, l + 1);
    exit_section_(b, m, IF_STATEMENT, r);
    return r;
  }

  // (KW_ELSE declarationOrStatement)?
  private static boolean ifStatement_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_5")) return false;
    ifStatement_5_0(b, l + 1);
    return true;
  }

  // KW_ELSE declarationOrStatement
  private static boolean ifStatement_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ifStatement_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ELSE);
    r = r && declarationOrStatement(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER (ASSIGN IDENTIFIER)?
  public static boolean importBind(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importBind")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && importBind_1(b, l + 1);
    exit_section_(b, m, IMPORT_BIND, r);
    return r;
  }

  // (ASSIGN IDENTIFIER)?
  private static boolean importBind_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importBind_1")) return false;
    importBind_1_0(b, l + 1);
    return true;
  }

  // ASSIGN IDENTIFIER
  private static boolean importBind_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importBind_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ASSIGN, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // singleImport COLON importBind (COMMA importBind)*
  public static boolean importBindings(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importBindings")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = singleImport(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && importBind(b, l + 1);
    r = r && importBindings_3(b, l + 1);
    exit_section_(b, m, IMPORT_BINDINGS, r);
    return r;
  }

  // (COMMA importBind)*
  private static boolean importBindings_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importBindings_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!importBindings_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "importBindings_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA importBind
  private static boolean importBindings_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importBindings_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && importBind(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_IMPORT singleImport (COMMA singleImport)* (COMMA importBindings)? SEMICOLON
  //      | KW_IMPORT importBindings SEMICOLON
  public static boolean importDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importDeclaration")) return false;
    if (!nextTokenIs(b, KW_IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = importDeclaration_0(b, l + 1);
    if (!r) r = importDeclaration_1(b, l + 1);
    exit_section_(b, m, IMPORT_DECLARATION, r);
    return r;
  }

  // KW_IMPORT singleImport (COMMA singleImport)* (COMMA importBindings)? SEMICOLON
  private static boolean importDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_IMPORT);
    r = r && singleImport(b, l + 1);
    r = r && importDeclaration_0_2(b, l + 1);
    r = r && importDeclaration_0_3(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA singleImport)*
  private static boolean importDeclaration_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importDeclaration_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!importDeclaration_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "importDeclaration_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA singleImport
  private static boolean importDeclaration_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importDeclaration_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && singleImport(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA importBindings)?
  private static boolean importDeclaration_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importDeclaration_0_3")) return false;
    importDeclaration_0_3_0(b, l + 1);
    return true;
  }

  // COMMA importBindings
  private static boolean importDeclaration_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importDeclaration_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && importBindings(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_IMPORT importBindings SEMICOLON
  private static boolean importDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_IMPORT);
    r = r && importBindings(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_IMPORT OPEN_PARENS assignExpression CLOSE_PARENS
  public static boolean importExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "importExpression")) return false;
    if (!nextTokenIs(b, KW_IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_IMPORT, OPEN_PARENS);
    r = r && assignExpression(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, IMPORT_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // shiftExpression (KW_IN | NOT KW_IN) shiftExpression
  public static boolean inExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<in expression>");
    r = shiftExpression(b, l + 1);
    r = r && inExpression_1(b, l + 1);
    r = r && shiftExpression(b, l + 1);
    exit_section_(b, l, m, IN_EXPRESSION, r, false, null);
    return r;
  }

  // KW_IN | NOT KW_IN
  private static boolean inExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_IN);
    if (!r) r = parseTokens(b, 0, NOT, KW_IN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_IN blockStatement
  public static boolean inStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inStatement")) return false;
    if (!nextTokenIs(b, KW_IN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_IN);
    r = r && blockStatement(b, l + 1);
    exit_section_(b, m, IN_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // unaryExpression OPEN_BRACKET argumentList CLOSE_BRACKET
  public static boolean indexExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "indexExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<index expression>");
    r = unaryExpression(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACKET);
    r = r && argumentList(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, l, m, INDEX_EXPRESSION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SEMICOLON
  //      | statementNoCaseNoDefault
  public static boolean initialize(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initialize")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<initialize>");
    r = consumeToken(b, SEMICOLON);
    if (!r) r = statementNoCaseNoDefault(b, l + 1);
    exit_section_(b, l, m, INITIALIZE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_VOID
  //      | nonVoidInitializer
  public static boolean initializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<initializer>");
    r = consumeToken(b, KW_VOID);
    if (!r) r = nonVoidInitializer(b, l + 1);
    exit_section_(b, l, m, INITIALIZER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_INTERFACE IDENTIFIER (SEMICOLON | (templateParameters constraint?)? (COLON baseClassList)? structBody)
  public static boolean interfaceDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceDeclaration")) return false;
    if (!nextTokenIs(b, KW_INTERFACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_INTERFACE, IDENTIFIER);
    r = r && interfaceDeclaration_2(b, l + 1);
    exit_section_(b, m, INTERFACE_DECLARATION, r);
    return r;
  }

  // SEMICOLON | (templateParameters constraint?)? (COLON baseClassList)? structBody
  private static boolean interfaceDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceDeclaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, SEMICOLON);
    if (!r) r = interfaceDeclaration_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (templateParameters constraint?)? (COLON baseClassList)? structBody
  private static boolean interfaceDeclaration_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceDeclaration_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = interfaceDeclaration_2_1_0(b, l + 1);
    r = r && interfaceDeclaration_2_1_1(b, l + 1);
    r = r && structBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (templateParameters constraint?)?
  private static boolean interfaceDeclaration_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceDeclaration_2_1_0")) return false;
    interfaceDeclaration_2_1_0_0(b, l + 1);
    return true;
  }

  // templateParameters constraint?
  private static boolean interfaceDeclaration_2_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceDeclaration_2_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = templateParameters(b, l + 1);
    r = r && interfaceDeclaration_2_1_0_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // constraint?
  private static boolean interfaceDeclaration_2_1_0_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceDeclaration_2_1_0_0_1")) return false;
    constraint(b, l + 1);
    return true;
  }

  // (COLON baseClassList)?
  private static boolean interfaceDeclaration_2_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceDeclaration_2_1_1")) return false;
    interfaceDeclaration_2_1_1_0(b, l + 1);
    return true;
  }

  // COLON baseClassList
  private static boolean interfaceDeclaration_2_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "interfaceDeclaration_2_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && baseClassList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_INVARIANT (OPEN_PARENS CLOSE_PARENS)? blockStatement
  public static boolean invariant(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "invariant")) return false;
    if (!nextTokenIs(b, KW_INVARIANT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_INVARIANT);
    r = r && invariant_1(b, l + 1);
    r = r && blockStatement(b, l + 1);
    exit_section_(b, m, INVARIANT, r);
    return r;
  }

  // (OPEN_PARENS CLOSE_PARENS)?
  private static boolean invariant_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "invariant_1")) return false;
    invariant_1_0(b, l + 1);
    return true;
  }

  // OPEN_PARENS CLOSE_PARENS
  private static boolean invariant_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "invariant_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PARENS, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_IS OPEN_PARENS type IDENTIFIER? ((COLON | EQUALS) typeSpecialization (COMMA templateParameterList)?)? CLOSE_PARENS
  public static boolean isExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "isExpression")) return false;
    if (!nextTokenIs(b, KW_IS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_IS, OPEN_PARENS);
    r = r && type(b, l + 1);
    r = r && isExpression_3(b, l + 1);
    r = r && isExpression_4(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, IS_EXPRESSION, r);
    return r;
  }

  // IDENTIFIER?
  private static boolean isExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "isExpression_3")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  // ((COLON | EQUALS) typeSpecialization (COMMA templateParameterList)?)?
  private static boolean isExpression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "isExpression_4")) return false;
    isExpression_4_0(b, l + 1);
    return true;
  }

  // (COLON | EQUALS) typeSpecialization (COMMA templateParameterList)?
  private static boolean isExpression_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "isExpression_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = isExpression_4_0_0(b, l + 1);
    r = r && typeSpecialization(b, l + 1);
    r = r && isExpression_4_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COLON | EQUALS
  private static boolean isExpression_4_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "isExpression_4_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    if (!r) r = consumeToken(b, EQUALS);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA templateParameterList)?
  private static boolean isExpression_4_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "isExpression_4_0_2")) return false;
    isExpression_4_0_2_0(b, l + 1);
    return true;
  }

  // COMMA templateParameterList
  private static boolean isExpression_4_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "isExpression_4_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && templateParameterList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // assignExpression COLON assignExpression
  public static boolean keyValuePair(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyValuePair")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<key value pair>");
    r = assignExpression(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && assignExpression(b, l + 1);
    exit_section_(b, l, m, KEY_VALUE_PAIR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // keyValuePair (COMMA keyValuePair)* COMMA?
  public static boolean keyValuePairs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyValuePairs")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<key value pairs>");
    r = keyValuePair(b, l + 1);
    r = r && keyValuePairs_1(b, l + 1);
    r = r && keyValuePairs_2(b, l + 1);
    exit_section_(b, l, m, KEY_VALUE_PAIRS, r, false, null);
    return r;
  }

  // (COMMA keyValuePair)*
  private static boolean keyValuePairs_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyValuePairs_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!keyValuePairs_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "keyValuePairs_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA keyValuePair
  private static boolean keyValuePairs_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyValuePairs_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && keyValuePair(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // COMMA?
  private static boolean keyValuePairs_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "keyValuePairs_2")) return false;
    consumeToken(b, COMMA);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON declarationOrStatement
  public static boolean labeledStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "labeledStatement")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    r = r && declarationOrStatement(b, l + 1);
    exit_section_(b, m, LABELED_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER LAMBDA assignExpression
  //      | KW_FUNCTION parameters functionAttribute* LAMBDA assignExpression
  //      | KW_DELEGATE parameters functionAttribute* LAMBDA assignExpression
  //      | parameters functionAttribute* LAMBDA assignExpression
  public static boolean lambdaExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<lambda expression>");
    r = lambdaExpression_0(b, l + 1);
    if (!r) r = lambdaExpression_1(b, l + 1);
    if (!r) r = lambdaExpression_2(b, l + 1);
    if (!r) r = lambdaExpression_3(b, l + 1);
    exit_section_(b, l, m, LAMBDA_EXPRESSION, r, false, null);
    return r;
  }

  // IDENTIFIER LAMBDA assignExpression
  private static boolean lambdaExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, LAMBDA);
    r = r && assignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_FUNCTION parameters functionAttribute* LAMBDA assignExpression
  private static boolean lambdaExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_FUNCTION);
    r = r && parameters(b, l + 1);
    r = r && lambdaExpression_1_2(b, l + 1);
    r = r && consumeToken(b, LAMBDA);
    r = r && assignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // functionAttribute*
  private static boolean lambdaExpression_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaExpression_1_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!functionAttribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "lambdaExpression_1_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // KW_DELEGATE parameters functionAttribute* LAMBDA assignExpression
  private static boolean lambdaExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaExpression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DELEGATE);
    r = r && parameters(b, l + 1);
    r = r && lambdaExpression_2_2(b, l + 1);
    r = r && consumeToken(b, LAMBDA);
    r = r && assignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // functionAttribute*
  private static boolean lambdaExpression_2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaExpression_2_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!functionAttribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "lambdaExpression_2_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // parameters functionAttribute* LAMBDA assignExpression
  private static boolean lambdaExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaExpression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameters(b, l + 1);
    r = r && lambdaExpression_3_1(b, l + 1);
    r = r && consumeToken(b, LAMBDA);
    r = r && assignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // functionAttribute*
  private static boolean lambdaExpression_3_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lambdaExpression_3_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!functionAttribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "lambdaExpression_3_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // KW_CATCH statementNoCaseNoDefault
  public static boolean lastCatch(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lastCatch")) return false;
    if (!nextTokenIs(b, KW_CATCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_CATCH);
    r = r && statementNoCaseNoDefault(b, l + 1);
    exit_section_(b, m, LAST_CATCH, r);
    return r;
  }

  /* ********************************************************** */
  // KW_EXTERN OPEN_PARENS IDENTIFIER (INCREMENT (COMMA identifierChain)?)? CLOSE_PARENS
  public static boolean linkageAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "linkageAttribute")) return false;
    if (!nextTokenIs(b, KW_EXTERN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_EXTERN, OPEN_PARENS, IDENTIFIER);
    r = r && linkageAttribute_3(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, LINKAGE_ATTRIBUTE, r);
    return r;
  }

  // (INCREMENT (COMMA identifierChain)?)?
  private static boolean linkageAttribute_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "linkageAttribute_3")) return false;
    linkageAttribute_3_0(b, l + 1);
    return true;
  }

  // INCREMENT (COMMA identifierChain)?
  private static boolean linkageAttribute_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "linkageAttribute_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INCREMENT);
    r = r && linkageAttribute_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA identifierChain)?
  private static boolean linkageAttribute_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "linkageAttribute_3_0_1")) return false;
    linkageAttribute_3_0_1_0(b, l + 1);
    return true;
  }

  // COMMA identifierChain
  private static boolean linkageAttribute_3_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "linkageAttribute_3_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && identifierChain(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // functionAttribute
  //      | KW_IMMUTABLE
  //      | KW_INOUT
  //      | KW_SHARED
  //      | KW_CONST
  public static boolean memberFunctionAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "memberFunctionAttribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<member function attribute>");
    r = functionAttribute(b, l + 1);
    if (!r) r = consumeToken(b, KW_IMMUTABLE);
    if (!r) r = consumeToken(b, KW_INOUT);
    if (!r) r = consumeToken(b, KW_SHARED);
    if (!r) r = consumeToken(b, KW_CONST);
    exit_section_(b, l, m, MEMBER_FUNCTION_ATTRIBUTE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // mixinExpression SEMICOLON
  //      | templateMixinExpression SEMICOLON
  public static boolean mixinDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mixinDeclaration")) return false;
    if (!nextTokenIs(b, KW_MIXIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mixinDeclaration_0(b, l + 1);
    if (!r) r = mixinDeclaration_1(b, l + 1);
    exit_section_(b, m, MIXIN_DECLARATION, r);
    return r;
  }

  // mixinExpression SEMICOLON
  private static boolean mixinDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mixinDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mixinExpression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // templateMixinExpression SEMICOLON
  private static boolean mixinDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mixinDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = templateMixinExpression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_MIXIN OPEN_PARENS assignExpression CLOSE_PARENS
  public static boolean mixinExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mixinExpression")) return false;
    if (!nextTokenIs(b, KW_MIXIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_MIXIN, OPEN_PARENS);
    r = r && assignExpression(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, MIXIN_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // KW_MIXIN templateDeclaration
  public static boolean mixinTemplateDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mixinTemplateDeclaration")) return false;
    if (!nextTokenIs(b, KW_MIXIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_MIXIN);
    r = r && templateDeclaration(b, l + 1);
    exit_section_(b, m, MIXIN_TEMPLATE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // symbol
  //      | typeofExpression DOT identifierOrTemplateChain
  public static boolean mixinTemplateName(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mixinTemplateName")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<mixin template name>");
    r = symbol(b, l + 1);
    if (!r) r = mixinTemplateName_1(b, l + 1);
    exit_section_(b, l, m, MIXIN_TEMPLATE_NAME, r, false, null);
    return r;
  }

  // typeofExpression DOT identifierOrTemplateChain
  private static boolean mixinTemplateName_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mixinTemplateName_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeofExpression(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && identifierOrTemplateChain(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // moduleDeclaration? declaration*
  static boolean module(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = module_0(b, l + 1);
    r = r && module_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // moduleDeclaration?
  private static boolean module_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_0")) return false;
    moduleDeclaration(b, l + 1);
    return true;
  }

  // declaration*
  private static boolean module_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "module_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "module_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // KW_MODULE identifierChain SEMICOLON
  public static boolean moduleDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "moduleDeclaration")) return false;
    if (!nextTokenIs(b, KW_MODULE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_MODULE);
    r = r && identifierChain(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, MODULE_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // powExpression
  //      | mulExpression (STAR | DIV | MOD) powExpression
  public static boolean mulExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mulExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<mul expression>");
    r = powExpression(b, l + 1);
    if (!r) r = mulExpression_1(b, l + 1);
    exit_section_(b, l, m, MUL_EXPRESSION, r, false, null);
    return r;
  }

  // mulExpression (STAR | DIV | MOD) powExpression
  private static boolean mulExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mulExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = mulExpression(b, l + 1);
    r = r && mulExpression_1_1(b, l + 1);
    r = r && powExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STAR | DIV | MOD
  private static boolean mulExpression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "mulExpression_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STAR);
    if (!r) r = consumeToken(b, DIV);
    if (!r) r = consumeToken(b, MOD);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_NEW arguments? KW_CLASS arguments? baseClassList? structBody
  public static boolean newAnonClassExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "newAnonClassExpression")) return false;
    if (!nextTokenIs(b, KW_NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_NEW);
    r = r && newAnonClassExpression_1(b, l + 1);
    r = r && consumeToken(b, KW_CLASS);
    r = r && newAnonClassExpression_3(b, l + 1);
    r = r && newAnonClassExpression_4(b, l + 1);
    r = r && structBody(b, l + 1);
    exit_section_(b, m, NEW_ANON_CLASS_EXPRESSION, r);
    return r;
  }

  // arguments?
  private static boolean newAnonClassExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "newAnonClassExpression_1")) return false;
    arguments(b, l + 1);
    return true;
  }

  // arguments?
  private static boolean newAnonClassExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "newAnonClassExpression_3")) return false;
    arguments(b, l + 1);
    return true;
  }

  // baseClassList?
  private static boolean newAnonClassExpression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "newAnonClassExpression_4")) return false;
    baseClassList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_NEW type (OPEN_BRACKET assignExpression CLOSE_BRACKET | arguments)?
  //      | newAnonClassExpression
  public static boolean newExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "newExpression")) return false;
    if (!nextTokenIs(b, KW_NEW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = newExpression_0(b, l + 1);
    if (!r) r = newAnonClassExpression(b, l + 1);
    exit_section_(b, m, NEW_EXPRESSION, r);
    return r;
  }

  // KW_NEW type (OPEN_BRACKET assignExpression CLOSE_BRACKET | arguments)?
  private static boolean newExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "newExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_NEW);
    r = r && type(b, l + 1);
    r = r && newExpression_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (OPEN_BRACKET assignExpression CLOSE_BRACKET | arguments)?
  private static boolean newExpression_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "newExpression_0_2")) return false;
    newExpression_0_2_0(b, l + 1);
    return true;
  }

  // OPEN_BRACKET assignExpression CLOSE_BRACKET | arguments
  private static boolean newExpression_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "newExpression_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = newExpression_0_2_0_0(b, l + 1);
    if (!r) r = arguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPEN_BRACKET assignExpression CLOSE_BRACKET
  private static boolean newExpression_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "newExpression_0_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACKET);
    r = r && assignExpression(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // assignExpression
  //      | arrayInitializer
  //      | structInitializer
  //      | functionBody
  public static boolean nonVoidInitializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonVoidInitializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<non void initializer>");
    r = assignExpression(b, l + 1);
    if (!r) r = arrayInitializer(b, l + 1);
    if (!r) r = structInitializer(b, l + 1);
    if (!r) r = functionBody(b, l + 1);
    exit_section_(b, l, m, NON_VOID_INITIALIZER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // asmExp+
  public static boolean operands(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operands")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<operands>");
    r = asmExp(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!asmExp(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "operands", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, OPERANDS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // xorExpression
  //      | orExpression OR xorExpression
  public static boolean orExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<or expression>");
    r = xorExpression(b, l + 1);
    if (!r) r = orExpression_1(b, l + 1);
    exit_section_(b, l, m, OR_EXPRESSION, r, false, null);
    return r;
  }

  // orExpression OR xorExpression
  private static boolean orExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = orExpression(b, l + 1);
    r = r && consumeToken(b, OR);
    r = r && xorExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // andAndExpression
  //      | orOrExpression LOGICAL_OR andAndExpression
  public static boolean orOrExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orOrExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<or or expression>");
    r = andAndExpression(b, l + 1);
    if (!r) r = orOrExpression_1(b, l + 1);
    exit_section_(b, l, m, OR_OR_EXPRESSION, r, false, null);
    return r;
  }

  // orOrExpression LOGICAL_OR andAndExpression
  private static boolean orOrExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "orOrExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = orOrExpression(b, l + 1);
    r = r && consumeToken(b, LOGICAL_OR);
    r = r && andAndExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_OUT (OPEN_PARENS IDENTIFIER CLOSE_PARENS)? blockStatement
  public static boolean outStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "outStatement")) return false;
    if (!nextTokenIs(b, KW_OUT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_OUT);
    r = r && outStatement_1(b, l + 1);
    r = r && blockStatement(b, l + 1);
    exit_section_(b, m, OUT_STATEMENT, r);
    return r;
  }

  // (OPEN_PARENS IDENTIFIER CLOSE_PARENS)?
  private static boolean outStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "outStatement_1")) return false;
    outStatement_1_0(b, l + 1);
    return true;
  }

  // OPEN_PARENS IDENTIFIER CLOSE_PARENS
  private static boolean outStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "outStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OPEN_PARENS, IDENTIFIER, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // parameterAttribute* type (IDENTIFIER? TRIPLE_DOT | (IDENTIFIER? (ASSIGN assignExpression)?))?
  public static boolean parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<parameter>");
    r = parameter_0(b, l + 1);
    r = r && type(b, l + 1);
    r = r && parameter_2(b, l + 1);
    exit_section_(b, l, m, PARAMETER, r, false, null);
    return r;
  }

  // parameterAttribute*
  private static boolean parameter_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_0")) return false;
    int c = current_position_(b);
    while (true) {
      if (!parameterAttribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameter_0", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // (IDENTIFIER? TRIPLE_DOT | (IDENTIFIER? (ASSIGN assignExpression)?))?
  private static boolean parameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_2")) return false;
    parameter_2_0(b, l + 1);
    return true;
  }

  // IDENTIFIER? TRIPLE_DOT | (IDENTIFIER? (ASSIGN assignExpression)?)
  private static boolean parameter_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter_2_0_0(b, l + 1);
    if (!r) r = parameter_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER? TRIPLE_DOT
  private static boolean parameter_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter_2_0_0_0(b, l + 1);
    r = r && consumeToken(b, TRIPLE_DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER?
  private static boolean parameter_2_0_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_2_0_0_0")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  // IDENTIFIER? (ASSIGN assignExpression)?
  private static boolean parameter_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_2_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter_2_0_1_0(b, l + 1);
    r = r && parameter_2_0_1_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // IDENTIFIER?
  private static boolean parameter_2_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_2_0_1_0")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  // (ASSIGN assignExpression)?
  private static boolean parameter_2_0_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_2_0_1_1")) return false;
    parameter_2_0_1_1_0(b, l + 1);
    return true;
  }

  // ASSIGN assignExpression
  private static boolean parameter_2_0_1_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter_2_0_1_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && assignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // typeConstructor
  //      | KW_FINAL
  //      | KW_IN
  //      | KW_LAZY
  //      | KW_OUT
  //      | KW_REF
  //      | KW_SCOPE
  //      | KW_AUTO
  public static boolean parameterAttribute(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameterAttribute")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<parameter attribute>");
    r = typeConstructor(b, l + 1);
    if (!r) r = consumeToken(b, KW_FINAL);
    if (!r) r = consumeToken(b, KW_IN);
    if (!r) r = consumeToken(b, KW_LAZY);
    if (!r) r = consumeToken(b, KW_OUT);
    if (!r) r = consumeToken(b, KW_REF);
    if (!r) r = consumeToken(b, KW_SCOPE);
    if (!r) r = consumeToken(b, KW_AUTO);
    exit_section_(b, l, m, PARAMETER_ATTRIBUTE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OPEN_PARENS parameter (COMMA parameter)* (COMMA TRIPLE_DOT)? CLOSE_PARENS
  //      | OPEN_PARENS TRIPLE_DOT CLOSE_PARENS
  //      | OPEN_PARENS CLOSE_PARENS
  public static boolean parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameters_0(b, l + 1);
    if (!r) r = parseTokens(b, 0, OPEN_PARENS, TRIPLE_DOT, CLOSE_PARENS);
    if (!r) r = parseTokens(b, 0, OPEN_PARENS, CLOSE_PARENS);
    exit_section_(b, m, PARAMETERS, r);
    return r;
  }

  // OPEN_PARENS parameter (COMMA parameter)* (COMMA TRIPLE_DOT)? CLOSE_PARENS
  private static boolean parameters_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && parameter(b, l + 1);
    r = r && parameters_0_2(b, l + 1);
    r = r && parameters_0_3(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA parameter)*
  private static boolean parameters_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!parameters_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameters_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA parameter
  private static boolean parameters_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA TRIPLE_DOT)?
  private static boolean parameters_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_0_3")) return false;
    parameters_0_3_0(b, l + 1);
    return true;
  }

  // COMMA TRIPLE_DOT
  private static boolean parameters_0_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_0_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, COMMA, TRIPLE_DOT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // unaryExpression (INCREMENT | DECREMENT)
  public static boolean postIncDecExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postIncDecExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<post inc dec expression>");
    r = unaryExpression(b, l + 1);
    r = r && postIncDecExpression_1(b, l + 1);
    exit_section_(b, l, m, POST_INC_DEC_EXPRESSION, r, false, null);
    return r;
  }

  // INCREMENT | DECREMENT
  private static boolean postIncDecExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postIncDecExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INCREMENT);
    if (!r) r = consumeToken(b, DECREMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_THIS OPEN_PARENS KW_THIS CLOSE_PARENS memberFunctionAttribute* (functionBody | SEMICOLON)
  public static boolean postblit(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postblit")) return false;
    if (!nextTokenIs(b, KW_THIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_THIS, OPEN_PARENS, KW_THIS, CLOSE_PARENS);
    r = r && postblit_4(b, l + 1);
    r = r && postblit_5(b, l + 1);
    exit_section_(b, m, POSTBLIT, r);
    return r;
  }

  // memberFunctionAttribute*
  private static boolean postblit_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postblit_4")) return false;
    int c = current_position_(b);
    while (true) {
      if (!memberFunctionAttribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "postblit_4", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // functionBody | SEMICOLON
  private static boolean postblit_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "postblit_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = functionBody(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // unaryExpression
  //      | powExpression POW unaryExpression
  public static boolean powExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "powExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<pow expression>");
    r = unaryExpression(b, l + 1);
    if (!r) r = powExpression_1(b, l + 1);
    exit_section_(b, l, m, POW_EXPRESSION, r, false, null);
    return r;
  }

  // powExpression POW unaryExpression
  private static boolean powExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "powExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = powExpression(b, l + 1);
    r = r && consumeToken(b, POW);
    r = r && unaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // pragmaExpression SEMICOLON
  public static boolean pragmaDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragmaDeclaration")) return false;
    if (!nextTokenIs(b, KW_PRAGMA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = pragmaExpression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, PRAGMA_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // KW_PRAGMA OPEN_PARENS IDENTIFIER (COMMA argumentList)? CLOSE_PARENS
  public static boolean pragmaExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragmaExpression")) return false;
    if (!nextTokenIs(b, KW_PRAGMA)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_PRAGMA, OPEN_PARENS, IDENTIFIER);
    r = r && pragmaExpression_3(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, PRAGMA_EXPRESSION, r);
    return r;
  }

  // (COMMA argumentList)?
  private static boolean pragmaExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragmaExpression_3")) return false;
    pragmaExpression_3_0(b, l + 1);
    return true;
  }

  // COMMA argumentList
  private static boolean pragmaExpression_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "pragmaExpression_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && argumentList(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (INCREMENT | DECREMENT) unaryExpression
  public static boolean preIncDecExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "preIncDecExpression")) return false;
    if (!nextTokenIs(b, "<pre inc dec expression>", DECREMENT, INCREMENT)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<pre inc dec expression>");
    r = preIncDecExpression_0(b, l + 1);
    r = r && unaryExpression(b, l + 1);
    exit_section_(b, l, m, PRE_INC_DEC_EXPRESSION, r, false, null);
    return r;
  }

  // INCREMENT | DECREMENT
  private static boolean preIncDecExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "preIncDecExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INCREMENT);
    if (!r) r = consumeToken(b, DECREMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // identifierOrTemplateInstance
  //      | DOT identifierOrTemplateInstance
  //      | builtinType DOT IDENTIFIER
  //      | typeofExpression
  //      | typeidExpression
  //      | vector
  //      | arrayLiteral
  //      | assocArrayLiteral
  //      | OPEN_PARENS expression CLOSE_PARENS
  //      | isExpression
  //      | lambdaExpression
  //      | functionLiteralExpression
  //      | traitsExpression
  //      | mixinExpression
  //      | importExpression
  //      | DOLLAR
  //      | KW_THIS
  //      | KW_SUPER
  //      | KW_NULL
  //      | KW_TRUE
  //      | KW_FALSE
  //      | KW___DATE__
  //      | KW___TIME__
  //      | KW___TIMESTAMP__
  //      | KW___VENDOR__
  //      | KW___VERSION__
  //      | KW___FILE__
  //      | KW___LINE__
  //      | KW___MODULE__
  //      | KW___FUNCTION__
  //      | KW___PRETTY_FUNCTION__
  //      | GROUP_INTEGER
  //      | GROUP_FLOAT
  //      | GROUP_STRING+
  //      | CHARACTER
  public static boolean primaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<primary expression>");
    r = identifierOrTemplateInstance(b, l + 1);
    if (!r) r = primaryExpression_1(b, l + 1);
    if (!r) r = primaryExpression_2(b, l + 1);
    if (!r) r = typeofExpression(b, l + 1);
    if (!r) r = typeidExpression(b, l + 1);
    if (!r) r = vector(b, l + 1);
    if (!r) r = arrayLiteral(b, l + 1);
    if (!r) r = assocArrayLiteral(b, l + 1);
    if (!r) r = primaryExpression_8(b, l + 1);
    if (!r) r = isExpression(b, l + 1);
    if (!r) r = lambdaExpression(b, l + 1);
    if (!r) r = functionLiteralExpression(b, l + 1);
    if (!r) r = traitsExpression(b, l + 1);
    if (!r) r = mixinExpression(b, l + 1);
    if (!r) r = importExpression(b, l + 1);
    if (!r) r = consumeToken(b, DOLLAR);
    if (!r) r = consumeToken(b, KW_THIS);
    if (!r) r = consumeToken(b, KW_SUPER);
    if (!r) r = consumeToken(b, KW_NULL);
    if (!r) r = consumeToken(b, KW_TRUE);
    if (!r) r = consumeToken(b, KW_FALSE);
    if (!r) r = consumeToken(b, KW___DATE__);
    if (!r) r = consumeToken(b, KW___TIME__);
    if (!r) r = consumeToken(b, KW___TIMESTAMP__);
    if (!r) r = consumeToken(b, KW___VENDOR__);
    if (!r) r = consumeToken(b, KW___VERSION__);
    if (!r) r = consumeToken(b, KW___FILE__);
    if (!r) r = consumeToken(b, KW___LINE__);
    if (!r) r = consumeToken(b, KW___MODULE__);
    if (!r) r = consumeToken(b, KW___FUNCTION__);
    if (!r) r = consumeToken(b, KW___PRETTY_FUNCTION__);
    if (!r) r = consumeToken(b, GROUP_INTEGER);
    if (!r) r = consumeToken(b, GROUP_FLOAT);
    if (!r) r = primaryExpression_33(b, l + 1);
    if (!r) r = consumeToken(b, CHARACTER);
    exit_section_(b, l, m, PRIMARY_EXPRESSION, r, false, null);
    return r;
  }

  // DOT identifierOrTemplateInstance
  private static boolean primaryExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primaryExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && identifierOrTemplateInstance(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // builtinType DOT IDENTIFIER
  private static boolean primaryExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primaryExpression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = builtinType(b, l + 1);
    r = r && consumeTokens(b, 0, DOT, IDENTIFIER);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPEN_PARENS expression CLOSE_PARENS
  private static boolean primaryExpression_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primaryExpression_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  // GROUP_STRING+
  private static boolean primaryExpression_33(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primaryExpression_33")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GROUP_STRING);
    int c = current_position_(b);
    while (r) {
      if (!consumeToken(b, GROUP_STRING)) break;
      if (!empty_element_parsed_guard_(b, "primaryExpression_33", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER
  //      | IDENTIFIER OPEN_PARENS GROUP_INTEGER CLOSE_PARENS
  public static boolean register(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "register")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = parseTokens(b, 0, IDENTIFIER, OPEN_PARENS, GROUP_INTEGER, CLOSE_PARENS);
    exit_section_(b, m, REGISTER, r);
    return r;
  }

  /* ********************************************************** */
  // shiftExpression
  //      | relExpression relOperator shiftExpression
  public static boolean relExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<rel expression>");
    r = shiftExpression(b, l + 1);
    if (!r) r = relExpression_1(b, l + 1);
    exit_section_(b, l, m, REL_EXPRESSION, r, false, null);
    return r;
  }

  // relExpression relOperator shiftExpression
  private static boolean relExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = relExpression(b, l + 1);
    r = r && relOperator(b, l + 1);
    r = r && shiftExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LESS_THAN
  //      | LESS_EQUAL
  //      | GREATER_THAN
  //      | GREATER_EQUAL
  //      | UNORDERED
  //      | UNORDERED_E
  //      | LESS_GREATER
  //      | LESS_GREATER_EQUAL
  //      | UNORDERED_LE
  //      | UNORDERED_L
  //      | UNORDERED_GE
  //      | UNORDERED_G
  public static boolean relOperator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "relOperator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<rel operator>");
    r = consumeToken(b, LESS_THAN);
    if (!r) r = consumeToken(b, LESS_EQUAL);
    if (!r) r = consumeToken(b, GREATER_THAN);
    if (!r) r = consumeToken(b, GREATER_EQUAL);
    if (!r) r = consumeToken(b, UNORDERED);
    if (!r) r = consumeToken(b, UNORDERED_E);
    if (!r) r = consumeToken(b, LESS_GREATER);
    if (!r) r = consumeToken(b, LESS_GREATER_EQUAL);
    if (!r) r = consumeToken(b, UNORDERED_LE);
    if (!r) r = consumeToken(b, UNORDERED_L);
    if (!r) r = consumeToken(b, UNORDERED_GE);
    if (!r) r = consumeToken(b, UNORDERED_G);
    exit_section_(b, l, m, REL_OPERATOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_RETURN expression? SEMICOLON
  public static boolean returnStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement")) return false;
    if (!nextTokenIs(b, KW_RETURN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_RETURN);
    r = r && returnStatement_1(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, RETURN_STATEMENT, r);
    return r;
  }

  // expression?
  private static boolean returnStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "returnStatement_1")) return false;
    expression(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_SCOPE OPEN_PARENS IDENTIFIER CLOSE_PARENS statementNoCaseNoDefault
  public static boolean scopeGuardStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "scopeGuardStatement")) return false;
    if (!nextTokenIs(b, KW_SCOPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_SCOPE, OPEN_PARENS, IDENTIFIER, CLOSE_PARENS);
    r = r && statementNoCaseNoDefault(b, l + 1);
    exit_section_(b, m, SCOPE_GUARD_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // KW_SHARED KW_STATIC KW_THIS OPEN_PARENS CLOSE_PARENS functionBody
  public static boolean sharedStaticConstructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharedStaticConstructor")) return false;
    if (!nextTokenIs(b, KW_SHARED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_SHARED, KW_STATIC, KW_THIS, OPEN_PARENS, CLOSE_PARENS);
    r = r && functionBody(b, l + 1);
    exit_section_(b, m, SHARED_STATIC_CONSTRUCTOR, r);
    return r;
  }

  /* ********************************************************** */
  // KW_SHARED KW_STATIC CONCAT KW_THIS OPEN_PARENS CLOSE_PARENS functionBody
  public static boolean sharedStaticDestructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sharedStaticDestructor")) return false;
    if (!nextTokenIs(b, KW_SHARED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_SHARED, KW_STATIC, CONCAT, KW_THIS, OPEN_PARENS, CLOSE_PARENS);
    r = r && functionBody(b, l + 1);
    exit_section_(b, m, SHARED_STATIC_DESTRUCTOR, r);
    return r;
  }

  /* ********************************************************** */
  // addExpression
  //      | shiftExpression (LEFT_SHIFT | RIGHT_SHIFT | TRIPLE_RSHIFT) addExpression
  public static boolean shiftExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shiftExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<shift expression>");
    r = addExpression(b, l + 1);
    if (!r) r = shiftExpression_1(b, l + 1);
    exit_section_(b, l, m, SHIFT_EXPRESSION, r, false, null);
    return r;
  }

  // shiftExpression (LEFT_SHIFT | RIGHT_SHIFT | TRIPLE_RSHIFT) addExpression
  private static boolean shiftExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shiftExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = shiftExpression(b, l + 1);
    r = r && shiftExpression_1_1(b, l + 1);
    r = r && addExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // LEFT_SHIFT | RIGHT_SHIFT | TRIPLE_RSHIFT
  private static boolean shiftExpression_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shiftExpression_1_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LEFT_SHIFT);
    if (!r) r = consumeToken(b, RIGHT_SHIFT);
    if (!r) r = consumeToken(b, TRIPLE_RSHIFT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (IDENTIFIER ASSIGN)? identifierChain
  public static boolean singleImport(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "singleImport")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = singleImport_0(b, l + 1);
    r = r && identifierChain(b, l + 1);
    exit_section_(b, m, SINGLE_IMPORT, r);
    return r;
  }

  // (IDENTIFIER ASSIGN)?
  private static boolean singleImport_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "singleImport_0")) return false;
    singleImport_0_0(b, l + 1);
    return true;
  }

  // IDENTIFIER ASSIGN
  private static boolean singleImport_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "singleImport_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, ASSIGN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // unaryExpression OPEN_BRACKET assignExpression DOUBLE_DOT assignExpression CLOSE_BRACKET
  //      | unaryExpression OPEN_BRACKET CLOSE_BRACKET
  public static boolean sliceExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sliceExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<slice expression>");
    r = sliceExpression_0(b, l + 1);
    if (!r) r = sliceExpression_1(b, l + 1);
    exit_section_(b, l, m, SLICE_EXPRESSION, r, false, null);
    return r;
  }

  // unaryExpression OPEN_BRACKET assignExpression DOUBLE_DOT assignExpression CLOSE_BRACKET
  private static boolean sliceExpression_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sliceExpression_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unaryExpression(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACKET);
    r = r && assignExpression(b, l + 1);
    r = r && consumeToken(b, DOUBLE_DOT);
    r = r && assignExpression(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // unaryExpression OPEN_BRACKET CLOSE_BRACKET
  private static boolean sliceExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "sliceExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unaryExpression(b, l + 1);
    r = r && consumeTokens(b, 0, OPEN_BRACKET, CLOSE_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // statementNoCaseNoDefault
  //      | caseStatement
  //      | caseRangeStatement
  //      | defaultStatement
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<statement>");
    r = statementNoCaseNoDefault(b, l + 1);
    if (!r) r = caseStatement(b, l + 1);
    if (!r) r = caseRangeStatement(b, l + 1);
    if (!r) r = defaultStatement(b, l + 1);
    exit_section_(b, l, m, STATEMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // labeledStatement
  //      | blockStatement
  //      | ifStatement
  //      | whileStatement
  //      | doStatement
  //      | forStatement
  //      | foreachStatement
  //      | switchStatement
  //      | finalSwitchStatement
  //      | continueStatement
  //      | breakStatement
  //      | returnStatement
  //      | gotoStatement
  //      | withStatement
  //      | synchronizedStatement
  //      | tryStatement
  //      | throwStatement
  //      | scopeGuardStatement
  //      | asmStatement
  //      | conditionalStatement
  //      | staticAssertStatement
  //      | versionSpecification
  //      | debugSpecification
  //      | expressionStatement
  public static boolean statementNoCaseNoDefault(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statementNoCaseNoDefault")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<statement no case no default>");
    r = labeledStatement(b, l + 1);
    if (!r) r = blockStatement(b, l + 1);
    if (!r) r = ifStatement(b, l + 1);
    if (!r) r = whileStatement(b, l + 1);
    if (!r) r = doStatement(b, l + 1);
    if (!r) r = forStatement(b, l + 1);
    if (!r) r = foreachStatement(b, l + 1);
    if (!r) r = switchStatement(b, l + 1);
    if (!r) r = finalSwitchStatement(b, l + 1);
    if (!r) r = continueStatement(b, l + 1);
    if (!r) r = breakStatement(b, l + 1);
    if (!r) r = returnStatement(b, l + 1);
    if (!r) r = gotoStatement(b, l + 1);
    if (!r) r = withStatement(b, l + 1);
    if (!r) r = synchronizedStatement(b, l + 1);
    if (!r) r = tryStatement(b, l + 1);
    if (!r) r = throwStatement(b, l + 1);
    if (!r) r = scopeGuardStatement(b, l + 1);
    if (!r) r = asmStatement(b, l + 1);
    if (!r) r = conditionalStatement(b, l + 1);
    if (!r) r = staticAssertStatement(b, l + 1);
    if (!r) r = versionSpecification(b, l + 1);
    if (!r) r = debugSpecification(b, l + 1);
    if (!r) r = expressionStatement(b, l + 1);
    exit_section_(b, l, m, STATEMENT_NO_CASE_NO_DEFAULT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // staticAssertStatement
  public static boolean staticAssertDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "staticAssertDeclaration")) return false;
    if (!nextTokenIs(b, KW_STATIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = staticAssertStatement(b, l + 1);
    exit_section_(b, m, STATIC_ASSERT_DECLARATION, r);
    return r;
  }

  /* ********************************************************** */
  // KW_STATIC assertExpression SEMICOLON
  public static boolean staticAssertStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "staticAssertStatement")) return false;
    if (!nextTokenIs(b, KW_STATIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_STATIC);
    r = r && assertExpression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, STATIC_ASSERT_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // KW_STATIC KW_THIS OPEN_PARENS CLOSE_PARENS functionBody
  public static boolean staticConstructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "staticConstructor")) return false;
    if (!nextTokenIs(b, KW_STATIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_STATIC, KW_THIS, OPEN_PARENS, CLOSE_PARENS);
    r = r && functionBody(b, l + 1);
    exit_section_(b, m, STATIC_CONSTRUCTOR, r);
    return r;
  }

  /* ********************************************************** */
  // KW_STATIC CONCAT KW_THIS OPEN_PARENS CLOSE_PARENS functionBody
  public static boolean staticDestructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "staticDestructor")) return false;
    if (!nextTokenIs(b, KW_STATIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_STATIC, CONCAT, KW_THIS, OPEN_PARENS, CLOSE_PARENS);
    r = r && functionBody(b, l + 1);
    exit_section_(b, m, STATIC_DESTRUCTOR, r);
    return r;
  }

  /* ********************************************************** */
  // KW_STATIC KW_IF OPEN_PARENS assignExpression CLOSE_PARENS
  public static boolean staticIfCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "staticIfCondition")) return false;
    if (!nextTokenIs(b, KW_STATIC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_STATIC, KW_IF, OPEN_PARENS);
    r = r && assignExpression(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, STATIC_IF_CONDITION, r);
    return r;
  }

  /* ********************************************************** */
  // atAttribute
  //      | typeConstructor
  //      | deprecated
  //      | KW_ABSTRACT
  //      | KW_AUTO
  //      | KW_ENUM
  //      | KW_EXTERN
  //      | KW_FINAL
  //      | KW_NOTHROW
  //      | KW_OVERRIDE
  //      | KW_PURE
  //      | KW_REF
  //      | KW___GSHARED
  //      | KW_SCOPE
  //      | KW_STATIC
  //      | KW_SYNCHRONIZED
  public static boolean storageClass(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "storageClass")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<storage class>");
    r = atAttribute(b, l + 1);
    if (!r) r = typeConstructor(b, l + 1);
    if (!r) r = deprecated(b, l + 1);
    if (!r) r = consumeToken(b, KW_ABSTRACT);
    if (!r) r = consumeToken(b, KW_AUTO);
    if (!r) r = consumeToken(b, KW_ENUM);
    if (!r) r = consumeToken(b, KW_EXTERN);
    if (!r) r = consumeToken(b, KW_FINAL);
    if (!r) r = consumeToken(b, KW_NOTHROW);
    if (!r) r = consumeToken(b, KW_OVERRIDE);
    if (!r) r = consumeToken(b, KW_PURE);
    if (!r) r = consumeToken(b, KW_REF);
    if (!r) r = consumeToken(b, KW___GSHARED);
    if (!r) r = consumeToken(b, KW_SCOPE);
    if (!r) r = consumeToken(b, KW_STATIC);
    if (!r) r = consumeToken(b, KW_SYNCHRONIZED);
    exit_section_(b, l, m, STORAGE_CLASS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OPEN_BRACE declaration* CLOSE_BRACE
  public static boolean structBody(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structBody")) return false;
    if (!nextTokenIs(b, OPEN_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && structBody_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, STRUCT_BODY, r);
    return r;
  }

  // declaration*
  private static boolean structBody_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structBody_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "structBody_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // KW_STRUCT IDENTIFIER? (templateParameters constraint? structBody | (structBody | SEMICOLON))
  public static boolean structDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration")) return false;
    if (!nextTokenIs(b, KW_STRUCT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_STRUCT);
    r = r && structDeclaration_1(b, l + 1);
    r = r && structDeclaration_2(b, l + 1);
    exit_section_(b, m, STRUCT_DECLARATION, r);
    return r;
  }

  // IDENTIFIER?
  private static boolean structDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration_1")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  // templateParameters constraint? structBody | (structBody | SEMICOLON)
  private static boolean structDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = structDeclaration_2_0(b, l + 1);
    if (!r) r = structDeclaration_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // templateParameters constraint? structBody
  private static boolean structDeclaration_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = templateParameters(b, l + 1);
    r = r && structDeclaration_2_0_1(b, l + 1);
    r = r && structBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // constraint?
  private static boolean structDeclaration_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration_2_0_1")) return false;
    constraint(b, l + 1);
    return true;
  }

  // structBody | SEMICOLON
  private static boolean structDeclaration_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structDeclaration_2_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = structBody(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OPEN_BRACE structMemberInitializers? CLOSE_BRACE
  public static boolean structInitializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structInitializer")) return false;
    if (!nextTokenIs(b, OPEN_BRACE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACE);
    r = r && structInitializer_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, STRUCT_INITIALIZER, r);
    return r;
  }

  // structMemberInitializers?
  private static boolean structInitializer_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structInitializer_1")) return false;
    structMemberInitializers(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (IDENTIFIER COLON)? nonVoidInitializer
  public static boolean structMemberInitializer(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structMemberInitializer")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<struct member initializer>");
    r = structMemberInitializer_0(b, l + 1);
    r = r && nonVoidInitializer(b, l + 1);
    exit_section_(b, l, m, STRUCT_MEMBER_INITIALIZER, r, false, null);
    return r;
  }

  // (IDENTIFIER COLON)?
  private static boolean structMemberInitializer_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structMemberInitializer_0")) return false;
    structMemberInitializer_0_0(b, l + 1);
    return true;
  }

  // IDENTIFIER COLON
  private static boolean structMemberInitializer_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structMemberInitializer_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // structMemberInitializer (COMMA structMemberInitializer?)*
  public static boolean structMemberInitializers(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structMemberInitializers")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<struct member initializers>");
    r = structMemberInitializer(b, l + 1);
    r = r && structMemberInitializers_1(b, l + 1);
    exit_section_(b, l, m, STRUCT_MEMBER_INITIALIZERS, r, false, null);
    return r;
  }

  // (COMMA structMemberInitializer?)*
  private static boolean structMemberInitializers_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structMemberInitializers_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!structMemberInitializers_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "structMemberInitializers_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA structMemberInitializer?
  private static boolean structMemberInitializers_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structMemberInitializers_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && structMemberInitializers_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // structMemberInitializer?
  private static boolean structMemberInitializers_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "structMemberInitializers_1_0_1")) return false;
    structMemberInitializer(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_SWITCH OPEN_PARENS expression CLOSE_PARENS statement
  public static boolean switchStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "switchStatement")) return false;
    if (!nextTokenIs(b, KW_SWITCH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_SWITCH, OPEN_PARENS);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    r = r && statement(b, l + 1);
    exit_section_(b, m, SWITCH_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // DOT? identifierOrTemplateChain
  public static boolean symbol(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol")) return false;
    if (!nextTokenIs(b, "<symbol>", DOT, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<symbol>");
    r = symbol_0(b, l + 1);
    r = r && identifierOrTemplateChain(b, l + 1);
    exit_section_(b, l, m, SYMBOL, r, false, null);
    return r;
  }

  // DOT?
  private static boolean symbol_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbol_0")) return false;
    consumeToken(b, DOT);
    return true;
  }

  /* ********************************************************** */
  // KW_SYNCHRONIZED (OPEN_PARENS expression CLOSE_PARENS)? statementNoCaseNoDefault
  public static boolean synchronizedStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "synchronizedStatement")) return false;
    if (!nextTokenIs(b, KW_SYNCHRONIZED)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_SYNCHRONIZED);
    r = r && synchronizedStatement_1(b, l + 1);
    r = r && statementNoCaseNoDefault(b, l + 1);
    exit_section_(b, m, SYNCHRONIZED_STATEMENT, r);
    return r;
  }

  // (OPEN_PARENS expression CLOSE_PARENS)?
  private static boolean synchronizedStatement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "synchronizedStatement_1")) return false;
    synchronizedStatement_1_0(b, l + 1);
    return true;
  }

  // OPEN_PARENS expression CLOSE_PARENS
  private static boolean synchronizedStatement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "synchronizedStatement_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_ALIAS type? IDENTIFIER (COLON (type | assignExpression))? (ASSIGN (type | assignExpression))?
  public static boolean templateAliasParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateAliasParameter")) return false;
    if (!nextTokenIs(b, KW_ALIAS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_ALIAS);
    r = r && templateAliasParameter_1(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && templateAliasParameter_3(b, l + 1);
    r = r && templateAliasParameter_4(b, l + 1);
    exit_section_(b, m, TEMPLATE_ALIAS_PARAMETER, r);
    return r;
  }

  // type?
  private static boolean templateAliasParameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateAliasParameter_1")) return false;
    type(b, l + 1);
    return true;
  }

  // (COLON (type | assignExpression))?
  private static boolean templateAliasParameter_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateAliasParameter_3")) return false;
    templateAliasParameter_3_0(b, l + 1);
    return true;
  }

  // COLON (type | assignExpression)
  private static boolean templateAliasParameter_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateAliasParameter_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && templateAliasParameter_3_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type | assignExpression
  private static boolean templateAliasParameter_3_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateAliasParameter_3_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    if (!r) r = assignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ASSIGN (type | assignExpression))?
  private static boolean templateAliasParameter_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateAliasParameter_4")) return false;
    templateAliasParameter_4_0(b, l + 1);
    return true;
  }

  // ASSIGN (type | assignExpression)
  private static boolean templateAliasParameter_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateAliasParameter_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && templateAliasParameter_4_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type | assignExpression
  private static boolean templateAliasParameter_4_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateAliasParameter_4_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    if (!r) r = assignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type
  //      | assignExpression
  public static boolean templateArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<template argument>");
    r = type(b, l + 1);
    if (!r) r = assignExpression(b, l + 1);
    exit_section_(b, l, m, TEMPLATE_ARGUMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // templateArgument (COMMA templateArgument?)*
  public static boolean templateArgumentList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateArgumentList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<template argument list>");
    r = templateArgument(b, l + 1);
    r = r && templateArgumentList_1(b, l + 1);
    exit_section_(b, l, m, TEMPLATE_ARGUMENT_LIST, r, false, null);
    return r;
  }

  // (COMMA templateArgument?)*
  private static boolean templateArgumentList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateArgumentList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!templateArgumentList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "templateArgumentList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA templateArgument?
  private static boolean templateArgumentList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateArgumentList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && templateArgumentList_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // templateArgument?
  private static boolean templateArgumentList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateArgumentList_1_0_1")) return false;
    templateArgument(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // NOT (OPEN_PARENS templateArgumentList? CLOSE_PARENS | templateSingleArgument)
  public static boolean templateArguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateArguments")) return false;
    if (!nextTokenIs(b, NOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && templateArguments_1(b, l + 1);
    exit_section_(b, m, TEMPLATE_ARGUMENTS, r);
    return r;
  }

  // OPEN_PARENS templateArgumentList? CLOSE_PARENS | templateSingleArgument
  private static boolean templateArguments_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateArguments_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = templateArguments_1_0(b, l + 1);
    if (!r) r = templateSingleArgument(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPEN_PARENS templateArgumentList? CLOSE_PARENS
  private static boolean templateArguments_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateArguments_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && templateArguments_1_0_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  // templateArgumentList?
  private static boolean templateArguments_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateArguments_1_0_1")) return false;
    templateArgumentList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // KW_TEMPLATE IDENTIFIER templateParameters constraint? OPEN_BRACE declaration* CLOSE_BRACE
  //      | eponymousTemplateDeclaration
  public static boolean templateDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateDeclaration")) return false;
    if (!nextTokenIs(b, "<template declaration>", KW_ENUM, KW_TEMPLATE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<template declaration>");
    r = templateDeclaration_0(b, l + 1);
    if (!r) r = eponymousTemplateDeclaration(b, l + 1);
    exit_section_(b, l, m, TEMPLATE_DECLARATION, r, false, null);
    return r;
  }

  // KW_TEMPLATE IDENTIFIER templateParameters constraint? OPEN_BRACE declaration* CLOSE_BRACE
  private static boolean templateDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_TEMPLATE, IDENTIFIER);
    r = r && templateParameters(b, l + 1);
    r = r && templateDeclaration_0_3(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACE);
    r = r && templateDeclaration_0_5(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACE);
    exit_section_(b, m, null, r);
    return r;
  }

  // constraint?
  private static boolean templateDeclaration_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateDeclaration_0_3")) return false;
    constraint(b, l + 1);
    return true;
  }

  // declaration*
  private static boolean templateDeclaration_0_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateDeclaration_0_5")) return false;
    int c = current_position_(b);
    while (true) {
      if (!declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "templateDeclaration_0_5", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER templateArguments
  public static boolean templateInstance(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateInstance")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && templateArguments(b, l + 1);
    exit_section_(b, m, TEMPLATE_INSTANCE, r);
    return r;
  }

  /* ********************************************************** */
  // KW_MIXIN mixinTemplateName templateArguments? IDENTIFIER?
  public static boolean templateMixinExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateMixinExpression")) return false;
    if (!nextTokenIs(b, KW_MIXIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_MIXIN);
    r = r && mixinTemplateName(b, l + 1);
    r = r && templateMixinExpression_2(b, l + 1);
    r = r && templateMixinExpression_3(b, l + 1);
    exit_section_(b, m, TEMPLATE_MIXIN_EXPRESSION, r);
    return r;
  }

  // templateArguments?
  private static boolean templateMixinExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateMixinExpression_2")) return false;
    templateArguments(b, l + 1);
    return true;
  }

  // IDENTIFIER?
  private static boolean templateMixinExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateMixinExpression_3")) return false;
    consumeToken(b, IDENTIFIER);
    return true;
  }

  /* ********************************************************** */
  // templateTypeParameter
  //      | templateValueParameter
  //      | templateAliasParameter
  //      | templateTupleParameter
  //      | templateThisParameter
  public static boolean templateParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<template parameter>");
    r = templateTypeParameter(b, l + 1);
    if (!r) r = templateValueParameter(b, l + 1);
    if (!r) r = templateAliasParameter(b, l + 1);
    if (!r) r = templateTupleParameter(b, l + 1);
    if (!r) r = templateThisParameter(b, l + 1);
    exit_section_(b, l, m, TEMPLATE_PARAMETER, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // templateParameter (COMMA templateParameter?)*
  public static boolean templateParameterList(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateParameterList")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<template parameter list>");
    r = templateParameter(b, l + 1);
    r = r && templateParameterList_1(b, l + 1);
    exit_section_(b, l, m, TEMPLATE_PARAMETER_LIST, r, false, null);
    return r;
  }

  // (COMMA templateParameter?)*
  private static boolean templateParameterList_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateParameterList_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!templateParameterList_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "templateParameterList_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA templateParameter?
  private static boolean templateParameterList_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateParameterList_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && templateParameterList_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // templateParameter?
  private static boolean templateParameterList_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateParameterList_1_0_1")) return false;
    templateParameter(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // OPEN_PARENS templateParameterList? CLOSE_PARENS
  public static boolean templateParameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateParameters")) return false;
    if (!nextTokenIs(b, OPEN_PARENS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && templateParameters_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, TEMPLATE_PARAMETERS, r);
    return r;
  }

  // templateParameterList?
  private static boolean templateParameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateParameters_1")) return false;
    templateParameterList(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // builtinType
  //      | IDENTIFIER
  //      | CHARACTER
  //      | GROUP_STRING
  //      | GROUP_INTEGER
  //      | GROUP_FLOAT
  //      | KW_TRUE
  //      | KW_FALSE
  //      | KW_NULL
  //      | KW_THIS
  //      | KW___DATE__
  //      | KW___TIME__
  //      | KW___TIMESTAMP__
  //      | KW___VENDOR__
  //      | KW___VERSION__
  //      | KW___FILE__
  //      | KW___LINE__
  //      | KW___MODULE__
  //      | KW___FUNCTION__
  //      | KW___PRETTY_FUNCTION__
  public static boolean templateSingleArgument(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateSingleArgument")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<template single argument>");
    r = builtinType(b, l + 1);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, CHARACTER);
    if (!r) r = consumeToken(b, GROUP_STRING);
    if (!r) r = consumeToken(b, GROUP_INTEGER);
    if (!r) r = consumeToken(b, GROUP_FLOAT);
    if (!r) r = consumeToken(b, KW_TRUE);
    if (!r) r = consumeToken(b, KW_FALSE);
    if (!r) r = consumeToken(b, KW_NULL);
    if (!r) r = consumeToken(b, KW_THIS);
    if (!r) r = consumeToken(b, KW___DATE__);
    if (!r) r = consumeToken(b, KW___TIME__);
    if (!r) r = consumeToken(b, KW___TIMESTAMP__);
    if (!r) r = consumeToken(b, KW___VENDOR__);
    if (!r) r = consumeToken(b, KW___VERSION__);
    if (!r) r = consumeToken(b, KW___FILE__);
    if (!r) r = consumeToken(b, KW___LINE__);
    if (!r) r = consumeToken(b, KW___MODULE__);
    if (!r) r = consumeToken(b, KW___FUNCTION__);
    if (!r) r = consumeToken(b, KW___PRETTY_FUNCTION__);
    exit_section_(b, l, m, TEMPLATE_SINGLE_ARGUMENT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KW_THIS templateTypeParameter
  public static boolean templateThisParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateThisParameter")) return false;
    if (!nextTokenIs(b, KW_THIS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_THIS);
    r = r && templateTypeParameter(b, l + 1);
    exit_section_(b, m, TEMPLATE_THIS_PARAMETER, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER TRIPLE_DOT
  public static boolean templateTupleParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateTupleParameter")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, TRIPLE_DOT);
    exit_section_(b, m, TEMPLATE_TUPLE_PARAMETER, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER (COLON type)? (ASSIGN type)?
  public static boolean templateTypeParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateTypeParameter")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    r = r && templateTypeParameter_1(b, l + 1);
    r = r && templateTypeParameter_2(b, l + 1);
    exit_section_(b, m, TEMPLATE_TYPE_PARAMETER, r);
    return r;
  }

  // (COLON type)?
  private static boolean templateTypeParameter_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateTypeParameter_1")) return false;
    templateTypeParameter_1_0(b, l + 1);
    return true;
  }

  // COLON type
  private static boolean templateTypeParameter_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateTypeParameter_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (ASSIGN type)?
  private static boolean templateTypeParameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateTypeParameter_2")) return false;
    templateTypeParameter_2_0(b, l + 1);
    return true;
  }

  // ASSIGN type
  private static boolean templateTypeParameter_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateTypeParameter_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && type(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // type IDENTIFIER (COLON expression)? templateValueParameterDefault?
  public static boolean templateValueParameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateValueParameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<template value parameter>");
    r = type(b, l + 1);
    r = r && consumeToken(b, IDENTIFIER);
    r = r && templateValueParameter_2(b, l + 1);
    r = r && templateValueParameter_3(b, l + 1);
    exit_section_(b, l, m, TEMPLATE_VALUE_PARAMETER, r, false, null);
    return r;
  }

  // (COLON expression)?
  private static boolean templateValueParameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateValueParameter_2")) return false;
    templateValueParameter_2_0(b, l + 1);
    return true;
  }

  // COLON expression
  private static boolean templateValueParameter_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateValueParameter_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // templateValueParameterDefault?
  private static boolean templateValueParameter_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateValueParameter_3")) return false;
    templateValueParameterDefault(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // ASSIGN (KW___FILE__ | KW___MODULE__ | KW___LINE__ | KW___FUNCTION__ | KW___PRETTY_FUNCTION__ | assignExpression)
  public static boolean templateValueParameterDefault(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateValueParameterDefault")) return false;
    if (!nextTokenIs(b, ASSIGN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ASSIGN);
    r = r && templateValueParameterDefault_1(b, l + 1);
    exit_section_(b, m, TEMPLATE_VALUE_PARAMETER_DEFAULT, r);
    return r;
  }

  // KW___FILE__ | KW___MODULE__ | KW___LINE__ | KW___FUNCTION__ | KW___PRETTY_FUNCTION__ | assignExpression
  private static boolean templateValueParameterDefault_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "templateValueParameterDefault_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW___FILE__);
    if (!r) r = consumeToken(b, KW___MODULE__);
    if (!r) r = consumeToken(b, KW___LINE__);
    if (!r) r = consumeToken(b, KW___FUNCTION__);
    if (!r) r = consumeToken(b, KW___PRETTY_FUNCTION__);
    if (!r) r = assignExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // orOrExpression (QUESTION expression COLON ternaryExpression)?
  public static boolean ternaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ternaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<ternary expression>");
    r = orOrExpression(b, l + 1);
    r = r && ternaryExpression_1(b, l + 1);
    exit_section_(b, l, m, TERNARY_EXPRESSION, r, false, null);
    return r;
  }

  // (QUESTION expression COLON ternaryExpression)?
  private static boolean ternaryExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ternaryExpression_1")) return false;
    ternaryExpression_1_0(b, l + 1);
    return true;
  }

  // QUESTION expression COLON ternaryExpression
  private static boolean ternaryExpression_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ternaryExpression_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, QUESTION);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && ternaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_THROW expression SEMICOLON
  public static boolean throwStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "throwStatement")) return false;
    if (!nextTokenIs(b, KW_THROW)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_THROW);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, THROW_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // KW___TRAITS OPEN_PARENS IDENTIFIER COMMA templateArgumentList CLOSE_PARENS
  public static boolean traitsExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "traitsExpression")) return false;
    if (!nextTokenIs(b, KW___TRAITS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW___TRAITS, OPEN_PARENS, IDENTIFIER, COMMA);
    r = r && templateArgumentList(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, TRAITS_EXPRESSION, r);
    return r;
  }

  /* ********************************************************** */
  // KW_TRY declarationOrStatement ((catches finally_?) | finally_)
  public static boolean tryStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStatement")) return false;
    if (!nextTokenIs(b, KW_TRY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_TRY);
    r = r && declarationOrStatement(b, l + 1);
    r = r && tryStatement_2(b, l + 1);
    exit_section_(b, m, TRY_STATEMENT, r);
    return r;
  }

  // (catches finally_?) | finally_
  private static boolean tryStatement_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStatement_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = tryStatement_2_0(b, l + 1);
    if (!r) r = finally_(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // catches finally_?
  private static boolean tryStatement_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStatement_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = catches(b, l + 1);
    r = r && tryStatement_2_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // finally_?
  private static boolean tryStatement_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tryStatement_2_0_1")) return false;
    finally_(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // attribute? type2 typeSuffix*
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type>");
    r = type_0(b, l + 1);
    r = r && type2(b, l + 1);
    r = r && type_2(b, l + 1);
    exit_section_(b, l, m, TYPE, r, false, null);
    return r;
  }

  // attribute?
  private static boolean type_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_0")) return false;
    attribute(b, l + 1);
    return true;
  }

  // typeSuffix*
  private static boolean type_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!typeSuffix(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "type_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // builtinType
  //      | symbol
  //      | typeofExpression (DOT identifierOrTemplateChain)?
  //      | typeConstructor OPEN_PARENS type CLOSE_PARENS
  public static boolean type2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type2")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type 2>");
    r = builtinType(b, l + 1);
    if (!r) r = symbol(b, l + 1);
    if (!r) r = type2_2(b, l + 1);
    if (!r) r = type2_3(b, l + 1);
    exit_section_(b, l, m, TYPE_2, r, false, null);
    return r;
  }

  // typeofExpression (DOT identifierOrTemplateChain)?
  private static boolean type2_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type2_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeofExpression(b, l + 1);
    r = r && type2_2_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (DOT identifierOrTemplateChain)?
  private static boolean type2_2_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type2_2_1")) return false;
    type2_2_1_0(b, l + 1);
    return true;
  }

  // DOT identifierOrTemplateChain
  private static boolean type2_2_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type2_2_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOT);
    r = r && identifierOrTemplateChain(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // typeConstructor OPEN_PARENS type CLOSE_PARENS
  private static boolean type2_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type2_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeConstructor(b, l + 1);
    r = r && consumeToken(b, OPEN_PARENS);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_CONST
  //      | KW_IMMUTABLE
  //      | KW_INOUT
  //      | KW_SHARED
  //      | KW_SCOPE
  public static boolean typeConstructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeConstructor")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type constructor>");
    r = consumeToken(b, KW_CONST);
    if (!r) r = consumeToken(b, KW_IMMUTABLE);
    if (!r) r = consumeToken(b, KW_INOUT);
    if (!r) r = consumeToken(b, KW_SHARED);
    if (!r) r = consumeToken(b, KW_SCOPE);
    exit_section_(b, l, m, TYPE_CONSTRUCTOR, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // typeConstructor+
  public static boolean typeConstructors(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeConstructors")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type constructors>");
    r = typeConstructor(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!typeConstructor(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeConstructors", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, TYPE_CONSTRUCTORS, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type
  //      | KW_STRUCT
  //      | KW_UNION
  //      | KW_CLASS
  //      | KW_INTERFACE
  //      | KW_ENUM
  //      | KW_FUNCTION
  //      | KW_DELEGATE
  //      | KW_SUPER
  //      | KW_CONST
  //      | KW_IMMUTABLE
  //      | KW_INOUT
  //      | KW_SHARED
  //      | KW_RETURN
  //      | KW_TYPEDEF
  public static boolean typeSpecialization(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeSpecialization")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type specialization>");
    r = type(b, l + 1);
    if (!r) r = consumeToken(b, KW_STRUCT);
    if (!r) r = consumeToken(b, KW_UNION);
    if (!r) r = consumeToken(b, KW_CLASS);
    if (!r) r = consumeToken(b, KW_INTERFACE);
    if (!r) r = consumeToken(b, KW_ENUM);
    if (!r) r = consumeToken(b, KW_FUNCTION);
    if (!r) r = consumeToken(b, KW_DELEGATE);
    if (!r) r = consumeToken(b, KW_SUPER);
    if (!r) r = consumeToken(b, KW_CONST);
    if (!r) r = consumeToken(b, KW_IMMUTABLE);
    if (!r) r = consumeToken(b, KW_INOUT);
    if (!r) r = consumeToken(b, KW_SHARED);
    if (!r) r = consumeToken(b, KW_RETURN);
    if (!r) r = consumeToken(b, KW_TYPEDEF);
    exit_section_(b, l, m, TYPE_SPECIALIZATION, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STAR
  //      | OPEN_BRACKET type? CLOSE_BRACKET
  //      | OPEN_BRACKET assignExpression CLOSE_BRACKET
  //      | OPEN_BRACKET assignExpression DOUBLE_DOT  assignExpression CLOSE_BRACKET
  //      | (KW_DELEGATE | KW_FUNCTION) parameters memberFunctionAttribute*
  public static boolean typeSuffix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeSuffix")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<type suffix>");
    r = consumeToken(b, STAR);
    if (!r) r = typeSuffix_1(b, l + 1);
    if (!r) r = typeSuffix_2(b, l + 1);
    if (!r) r = typeSuffix_3(b, l + 1);
    if (!r) r = typeSuffix_4(b, l + 1);
    exit_section_(b, l, m, TYPE_SUFFIX, r, false, null);
    return r;
  }

  // OPEN_BRACKET type? CLOSE_BRACKET
  private static boolean typeSuffix_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeSuffix_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACKET);
    r = r && typeSuffix_1_1(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // type?
  private static boolean typeSuffix_1_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeSuffix_1_1")) return false;
    type(b, l + 1);
    return true;
  }

  // OPEN_BRACKET assignExpression CLOSE_BRACKET
  private static boolean typeSuffix_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeSuffix_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACKET);
    r = r && assignExpression(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPEN_BRACKET assignExpression DOUBLE_DOT  assignExpression CLOSE_BRACKET
  private static boolean typeSuffix_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeSuffix_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_BRACKET);
    r = r && assignExpression(b, l + 1);
    r = r && consumeToken(b, DOUBLE_DOT);
    r = r && assignExpression(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // (KW_DELEGATE | KW_FUNCTION) parameters memberFunctionAttribute*
  private static boolean typeSuffix_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeSuffix_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = typeSuffix_4_0(b, l + 1);
    r = r && parameters(b, l + 1);
    r = r && typeSuffix_4_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_DELEGATE | KW_FUNCTION
  private static boolean typeSuffix_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeSuffix_4_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_DELEGATE);
    if (!r) r = consumeToken(b, KW_FUNCTION);
    exit_section_(b, m, null, r);
    return r;
  }

  // memberFunctionAttribute*
  private static boolean typeSuffix_4_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeSuffix_4_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!memberFunctionAttribute(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "typeSuffix_4_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // KW_TYPEID OPEN_PARENS (type | expression) CLOSE_PARENS
  public static boolean typeidExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeidExpression")) return false;
    if (!nextTokenIs(b, KW_TYPEID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_TYPEID, OPEN_PARENS);
    r = r && typeidExpression_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, TYPEID_EXPRESSION, r);
    return r;
  }

  // type | expression
  private static boolean typeidExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeidExpression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    if (!r) r = expression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_TYPEOF OPEN_PARENS (expression | KW_RETURN) CLOSE_PARENS
  public static boolean typeofExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeofExpression")) return false;
    if (!nextTokenIs(b, KW_TYPEOF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_TYPEOF, OPEN_PARENS);
    r = r && typeofExpression_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, TYPEOF_EXPRESSION, r);
    return r;
  }

  // expression | KW_RETURN
  private static boolean typeofExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "typeofExpression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = expression(b, l + 1);
    if (!r) r = consumeToken(b, KW_RETURN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // primaryExpression
  //     | AND unaryExpression
  //     | NOT unaryExpression
  //     | STAR unaryExpression
  //     | PLUS unaryExpression
  //     | MINUS unaryExpression
  //     | CONCAT unaryExpression
  //     | INCREMENT unaryExpression
  //     | DECREMENT unaryExpression
  //     | unaryExpression templateArguments? arguments
  //     | unaryExpression OPEN_BRACKET assignExpression DOUBLE_DOT assignExpression CLOSE_BRACKET
  //     | unaryExpression OPEN_BRACKET CLOSE_BRACKET
  //     | unaryExpression OPEN_BRACKET argumentList CLOSE_BRACKET
  //     | newExpression
  //     | deleteExpression
  //     | castExpression
  //     | assertExpression
  //     | OPEN_PARENS type CLOSE_PARENS DOT identifierOrTemplateInstance
  //     | unaryExpression DOT identifierOrTemplateInstance
  //     | unaryExpression DECREMENT
  //     | unaryExpression INCREMENT
  public static boolean unaryExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<unary expression>");
    r = primaryExpression(b, l + 1);
    if (!r) r = unaryExpression_1(b, l + 1);
    if (!r) r = unaryExpression_2(b, l + 1);
    if (!r) r = unaryExpression_3(b, l + 1);
    if (!r) r = unaryExpression_4(b, l + 1);
    if (!r) r = unaryExpression_5(b, l + 1);
    if (!r) r = unaryExpression_6(b, l + 1);
    if (!r) r = unaryExpression_7(b, l + 1);
    if (!r) r = unaryExpression_8(b, l + 1);
    if (!r) r = unaryExpression_9(b, l + 1);
    if (!r) r = unaryExpression_10(b, l + 1);
    if (!r) r = unaryExpression_11(b, l + 1);
    if (!r) r = unaryExpression_12(b, l + 1);
    if (!r) r = newExpression(b, l + 1);
    if (!r) r = deleteExpression(b, l + 1);
    if (!r) r = castExpression(b, l + 1);
    if (!r) r = assertExpression(b, l + 1);
    if (!r) r = unaryExpression_17(b, l + 1);
    if (!r) r = unaryExpression_18(b, l + 1);
    if (!r) r = unaryExpression_19(b, l + 1);
    if (!r) r = unaryExpression_20(b, l + 1);
    exit_section_(b, l, m, UNARY_EXPRESSION, r, false, null);
    return r;
  }

  // AND unaryExpression
  private static boolean unaryExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, AND);
    r = r && unaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NOT unaryExpression
  private static boolean unaryExpression_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpression_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NOT);
    r = r && unaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STAR unaryExpression
  private static boolean unaryExpression_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpression_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STAR);
    r = r && unaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // PLUS unaryExpression
  private static boolean unaryExpression_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpression_4")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, PLUS);
    r = r && unaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // MINUS unaryExpression
  private static boolean unaryExpression_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpression_5")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, MINUS);
    r = r && unaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // CONCAT unaryExpression
  private static boolean unaryExpression_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpression_6")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, CONCAT);
    r = r && unaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // INCREMENT unaryExpression
  private static boolean unaryExpression_7(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpression_7")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, INCREMENT);
    r = r && unaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // DECREMENT unaryExpression
  private static boolean unaryExpression_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpression_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DECREMENT);
    r = r && unaryExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // unaryExpression templateArguments? arguments
  private static boolean unaryExpression_9(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpression_9")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unaryExpression(b, l + 1);
    r = r && unaryExpression_9_1(b, l + 1);
    r = r && arguments(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // templateArguments?
  private static boolean unaryExpression_9_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpression_9_1")) return false;
    templateArguments(b, l + 1);
    return true;
  }

  // unaryExpression OPEN_BRACKET assignExpression DOUBLE_DOT assignExpression CLOSE_BRACKET
  private static boolean unaryExpression_10(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpression_10")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unaryExpression(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACKET);
    r = r && assignExpression(b, l + 1);
    r = r && consumeToken(b, DOUBLE_DOT);
    r = r && assignExpression(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // unaryExpression OPEN_BRACKET CLOSE_BRACKET
  private static boolean unaryExpression_11(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpression_11")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unaryExpression(b, l + 1);
    r = r && consumeTokens(b, 0, OPEN_BRACKET, CLOSE_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // unaryExpression OPEN_BRACKET argumentList CLOSE_BRACKET
  private static boolean unaryExpression_12(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpression_12")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unaryExpression(b, l + 1);
    r = r && consumeToken(b, OPEN_BRACKET);
    r = r && argumentList(b, l + 1);
    r = r && consumeToken(b, CLOSE_BRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPEN_PARENS type CLOSE_PARENS DOT identifierOrTemplateInstance
  private static boolean unaryExpression_17(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpression_17")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, OPEN_PARENS);
    r = r && type(b, l + 1);
    r = r && consumeTokens(b, 0, CLOSE_PARENS, DOT);
    r = r && identifierOrTemplateInstance(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // unaryExpression DOT identifierOrTemplateInstance
  private static boolean unaryExpression_18(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpression_18")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unaryExpression(b, l + 1);
    r = r && consumeToken(b, DOT);
    r = r && identifierOrTemplateInstance(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // unaryExpression DECREMENT
  private static boolean unaryExpression_19(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpression_19")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unaryExpression(b, l + 1);
    r = r && consumeToken(b, DECREMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  // unaryExpression INCREMENT
  private static boolean unaryExpression_20(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unaryExpression_20")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unaryExpression(b, l + 1);
    r = r && consumeToken(b, INCREMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_UNION IDENTIFIER templateParameters constraint? structBody
  //      | KW_UNION IDENTIFIER (structBody | SEMICOLON)
  //      | KW_UNION structBody
  public static boolean unionDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unionDeclaration")) return false;
    if (!nextTokenIs(b, KW_UNION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = unionDeclaration_0(b, l + 1);
    if (!r) r = unionDeclaration_1(b, l + 1);
    if (!r) r = unionDeclaration_2(b, l + 1);
    exit_section_(b, m, UNION_DECLARATION, r);
    return r;
  }

  // KW_UNION IDENTIFIER templateParameters constraint? structBody
  private static boolean unionDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unionDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_UNION, IDENTIFIER);
    r = r && templateParameters(b, l + 1);
    r = r && unionDeclaration_0_3(b, l + 1);
    r = r && structBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // constraint?
  private static boolean unionDeclaration_0_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unionDeclaration_0_3")) return false;
    constraint(b, l + 1);
    return true;
  }

  // KW_UNION IDENTIFIER (structBody | SEMICOLON)
  private static boolean unionDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unionDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_UNION, IDENTIFIER);
    r = r && unionDeclaration_1_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // structBody | SEMICOLON
  private static boolean unionDeclaration_1_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unionDeclaration_1_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = structBody(b, l + 1);
    if (!r) r = consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // KW_UNION structBody
  private static boolean unionDeclaration_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unionDeclaration_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_UNION);
    r = r && structBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_UNITTEST blockStatement
  public static boolean unittest(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unittest")) return false;
    if (!nextTokenIs(b, KW_UNITTEST)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KW_UNITTEST);
    r = r && blockStatement(b, l + 1);
    exit_section_(b, m, UNITTEST, r);
    return r;
  }

  /* ********************************************************** */
  // type declarator (COMMA declarator)* SEMICOLON
  //      | type declarator ASSIGN functionBody
  //      | autoDeclaration
  public static boolean variableDeclaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<variable declaration>");
    r = variableDeclaration_0(b, l + 1);
    if (!r) r = variableDeclaration_1(b, l + 1);
    if (!r) r = autoDeclaration(b, l + 1);
    exit_section_(b, l, m, VARIABLE_DECLARATION, r, false, null);
    return r;
  }

  // type declarator (COMMA declarator)* SEMICOLON
  private static boolean variableDeclaration_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && declarator(b, l + 1);
    r = r && variableDeclaration_0_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, null, r);
    return r;
  }

  // (COMMA declarator)*
  private static boolean variableDeclaration_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!variableDeclaration_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "variableDeclaration_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // COMMA declarator
  private static boolean variableDeclaration_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    r = r && declarator(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // type declarator ASSIGN functionBody
  private static boolean variableDeclaration_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "variableDeclaration_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = type(b, l + 1);
    r = r && declarator(b, l + 1);
    r = r && consumeToken(b, ASSIGN);
    r = r && functionBody(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW___VECTOR OPEN_PARENS type CLOSE_PARENS
  public static boolean vector(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "vector")) return false;
    if (!nextTokenIs(b, KW___VECTOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW___VECTOR, OPEN_PARENS);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, VECTOR, r);
    return r;
  }

  /* ********************************************************** */
  // KW_VERSION OPEN_PARENS (GROUP_INTEGER | IDENTIFIER | KW_UNITTEST | KW_ASSERT) CLOSE_PARENS
  public static boolean versionCondition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "versionCondition")) return false;
    if (!nextTokenIs(b, KW_VERSION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_VERSION, OPEN_PARENS);
    r = r && versionCondition_2(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    exit_section_(b, m, VERSION_CONDITION, r);
    return r;
  }

  // GROUP_INTEGER | IDENTIFIER | KW_UNITTEST | KW_ASSERT
  private static boolean versionCondition_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "versionCondition_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, GROUP_INTEGER);
    if (!r) r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, KW_UNITTEST);
    if (!r) r = consumeToken(b, KW_ASSERT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_VERSION ASSIGN (IDENTIFIER | GROUP_INTEGER) SEMICOLON
  public static boolean versionSpecification(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "versionSpecification")) return false;
    if (!nextTokenIs(b, KW_VERSION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_VERSION, ASSIGN);
    r = r && versionSpecification_2(b, l + 1);
    r = r && consumeToken(b, SEMICOLON);
    exit_section_(b, m, VERSION_SPECIFICATION, r);
    return r;
  }

  // IDENTIFIER | GROUP_INTEGER
  private static boolean versionSpecification_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "versionSpecification_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, GROUP_INTEGER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // KW_WHILE OPEN_PARENS expression CLOSE_PARENS declarationOrStatement
  public static boolean whileStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "whileStatement")) return false;
    if (!nextTokenIs(b, KW_WHILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_WHILE, OPEN_PARENS);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    r = r && declarationOrStatement(b, l + 1);
    exit_section_(b, m, WHILE_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // KW_WITH OPEN_PARENS expression CLOSE_PARENS statementNoCaseNoDefault
  public static boolean withStatement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "withStatement")) return false;
    if (!nextTokenIs(b, KW_WITH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, KW_WITH, OPEN_PARENS);
    r = r && expression(b, l + 1);
    r = r && consumeToken(b, CLOSE_PARENS);
    r = r && statementNoCaseNoDefault(b, l + 1);
    exit_section_(b, m, WITH_STATEMENT, r);
    return r;
  }

  /* ********************************************************** */
  // andExpression
  //      | xorExpression XOR andExpression
  public static boolean xorExpression(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xorExpression")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<xor expression>");
    r = andExpression(b, l + 1);
    if (!r) r = xorExpression_1(b, l + 1);
    exit_section_(b, l, m, XOR_EXPRESSION, r, false, null);
    return r;
  }

  // xorExpression XOR andExpression
  private static boolean xorExpression_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "xorExpression_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = xorExpression(b, l + 1);
    r = r && consumeToken(b, XOR);
    r = r && andExpression(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

}
