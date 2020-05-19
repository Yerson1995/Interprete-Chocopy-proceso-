// Generated from E:/ProyectosIntelliJIDEA/Java/Java/Interprete1/Gramatica\chocPy.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link chocPyParser}.
 */
public interface chocPyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link chocPyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(chocPyParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocPyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(chocPyParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocPyParser#class_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_def(chocPyParser.Class_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocPyParser#class_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_def(chocPyParser.Class_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_bodypass}
	 * labeled alternative in {@link chocPyParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_bodypass(chocPyParser.Class_bodypassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_bodypass}
	 * labeled alternative in {@link chocPyParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_bodypass(chocPyParser.Class_bodypassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_bodydefinicion}
	 * labeled alternative in {@link chocPyParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_bodydefinicion(chocPyParser.Class_bodydefinicionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_bodydefinicion}
	 * labeled alternative in {@link chocPyParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_bodydefinicion(chocPyParser.Class_bodydefinicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocPyParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(chocPyParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocPyParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(chocPyParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocPyParser#metd_def}.
	 * @param ctx the parse tree
	 */
	void enterMetd_def(chocPyParser.Metd_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocPyParser#metd_def}.
	 * @param ctx the parse tree
	 */
	void exitMetd_def(chocPyParser.Metd_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocPyParser#func_body}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body(chocPyParser.Func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocPyParser#func_body}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body(chocPyParser.Func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocPyParser#typed_var}.
	 * @param ctx the parse tree
	 */
	void enterTyped_var(chocPyParser.Typed_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocPyParser#typed_var}.
	 * @param ctx the parse tree
	 */
	void exitTyped_var(chocPyParser.Typed_varContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeid}
	 * labeled alternative in {@link chocPyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeid(chocPyParser.TypeidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeid}
	 * labeled alternative in {@link chocPyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeid(chocPyParser.TypeidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeidstring}
	 * labeled alternative in {@link chocPyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeidstring(chocPyParser.TypeidstringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeidstring}
	 * labeled alternative in {@link chocPyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeidstring(chocPyParser.TypeidstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tipeInt}
	 * labeled alternative in {@link chocPyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTipeInt(chocPyParser.TipeIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipeInt}
	 * labeled alternative in {@link chocPyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTipeInt(chocPyParser.TipeIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeStr}
	 * labeled alternative in {@link chocPyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeStr(chocPyParser.TypeStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeStr}
	 * labeled alternative in {@link chocPyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeStr(chocPyParser.TypeStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeBool}
	 * labeled alternative in {@link chocPyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeBool(chocPyParser.TypeBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeBool}
	 * labeled alternative in {@link chocPyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeBool(chocPyParser.TypeBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeObject}
	 * labeled alternative in {@link chocPyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeObject(chocPyParser.TypeObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeObject}
	 * labeled alternative in {@link chocPyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeObject(chocPyParser.TypeObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeAnidado}
	 * labeled alternative in {@link chocPyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTypeAnidado(chocPyParser.TypeAnidadoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeAnidado}
	 * labeled alternative in {@link chocPyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTypeAnidado(chocPyParser.TypeAnidadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocPyParser#global_decl}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_decl(chocPyParser.Global_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocPyParser#global_decl}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_decl(chocPyParser.Global_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocPyParser#nonlocal_decl}.
	 * @param ctx the parse tree
	 */
	void enterNonlocal_decl(chocPyParser.Nonlocal_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocPyParser#nonlocal_decl}.
	 * @param ctx the parse tree
	 */
	void exitNonlocal_decl(chocPyParser.Nonlocal_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocPyParser#var_def}.
	 * @param ctx the parse tree
	 */
	void enterVar_def(chocPyParser.Var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocPyParser#var_def}.
	 * @param ctx the parse tree
	 */
	void exitVar_def(chocPyParser.Var_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtsimple}
	 * labeled alternative in {@link chocPyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtsimple(chocPyParser.StmtsimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtsimple}
	 * labeled alternative in {@link chocPyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtsimple(chocPyParser.StmtsimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtif}
	 * labeled alternative in {@link chocPyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtif(chocPyParser.StmtifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtif}
	 * labeled alternative in {@link chocPyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtif(chocPyParser.StmtifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtwhile}
	 * labeled alternative in {@link chocPyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtwhile(chocPyParser.StmtwhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtwhile}
	 * labeled alternative in {@link chocPyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtwhile(chocPyParser.StmtwhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmtfor}
	 * labeled alternative in {@link chocPyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtfor(chocPyParser.StmtforContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmtfor}
	 * labeled alternative in {@link chocPyParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtfor(chocPyParser.StmtforContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simplestmtpass}
	 * labeled alternative in {@link chocPyParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimplestmtpass(chocPyParser.SimplestmtpassContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simplestmtpass}
	 * labeled alternative in {@link chocPyParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimplestmtpass(chocPyParser.SimplestmtpassContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simplestmtexpr}
	 * labeled alternative in {@link chocPyParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimplestmtexpr(chocPyParser.SimplestmtexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simplestmtexpr}
	 * labeled alternative in {@link chocPyParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimplestmtexpr(chocPyParser.SimplestmtexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simplestmtreturn}
	 * labeled alternative in {@link chocPyParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimplestmtreturn(chocPyParser.SimplestmtreturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simplestmtreturn}
	 * labeled alternative in {@link chocPyParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimplestmtreturn(chocPyParser.SimplestmtreturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simplestmtasignacion}
	 * labeled alternative in {@link chocPyParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimplestmtasignacion(chocPyParser.SimplestmtasignacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simplestmtasignacion}
	 * labeled alternative in {@link chocPyParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimplestmtasignacion(chocPyParser.SimplestmtasignacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simplestmtprint}
	 * labeled alternative in {@link chocPyParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimplestmtprint(chocPyParser.SimplestmtprintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simplestmtprint}
	 * labeled alternative in {@link chocPyParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimplestmtprint(chocPyParser.SimplestmtprintContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocPyParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(chocPyParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocPyParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(chocPyParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalnone}
	 * labeled alternative in {@link chocPyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralnone(chocPyParser.LiteralnoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalnone}
	 * labeled alternative in {@link chocPyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralnone(chocPyParser.LiteralnoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literaltrue}
	 * labeled alternative in {@link chocPyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteraltrue(chocPyParser.LiteraltrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literaltrue}
	 * labeled alternative in {@link chocPyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteraltrue(chocPyParser.LiteraltrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalfalse}
	 * labeled alternative in {@link chocPyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralfalse(chocPyParser.LiteralfalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalfalse}
	 * labeled alternative in {@link chocPyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralfalse(chocPyParser.LiteralfalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literaltk_entero}
	 * labeled alternative in {@link chocPyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteraltk_entero(chocPyParser.Literaltk_enteroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literaltk_entero}
	 * labeled alternative in {@link chocPyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteraltk_entero(chocPyParser.Literaltk_enteroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalidstring}
	 * labeled alternative in {@link chocPyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralidstring(chocPyParser.LiteralidstringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalidstring}
	 * labeled alternative in {@link chocPyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralidstring(chocPyParser.LiteralidstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalstring}
	 * labeled alternative in {@link chocPyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteralstring(chocPyParser.LiteralstringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalstring}
	 * labeled alternative in {@link chocPyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteralstring(chocPyParser.LiteralstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprcexpr}
	 * labeled alternative in {@link chocPyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprcexpr(chocPyParser.ExprcexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprcexpr}
	 * labeled alternative in {@link chocPyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprcexpr(chocPyParser.ExprcexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprnot}
	 * labeled alternative in {@link chocPyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprnot(chocPyParser.ExprnotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprnot}
	 * labeled alternative in {@link chocPyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprnot(chocPyParser.ExprnotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprexprcond}
	 * labeled alternative in {@link chocPyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprexprcond(chocPyParser.ExprexprcondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprexprcond}
	 * labeled alternative in {@link chocPyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprexprcond(chocPyParser.ExprexprcondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprandor}
	 * labeled alternative in {@link chocPyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprandor(chocPyParser.ExprandorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprandor}
	 * labeled alternative in {@link chocPyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprandor(chocPyParser.ExprandorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cexprid}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void enterCexprid(chocPyParser.CexpridContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cexprid}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void exitCexprid(chocPyParser.CexpridContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cexprnegando}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void enterCexprnegando(chocPyParser.CexprnegandoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cexprnegando}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void exitCexprnegando(chocPyParser.CexprnegandoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cexproperacion}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void enterCexproperacion(chocPyParser.CexproperacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cexproperacion}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void exitCexproperacion(chocPyParser.CexproperacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cexprlen}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void enterCexprlen(chocPyParser.CexprlenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cexprlen}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void exitCexprlen(chocPyParser.CexprlenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cexprpuntoarg}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void enterCexprpuntoarg(chocPyParser.CexprpuntoargContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cexprpuntoarg}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void exitCexprpuntoarg(chocPyParser.CexprpuntoargContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cexprmismo}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void enterCexprmismo(chocPyParser.CexprmismoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cexprmismo}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void exitCexprmismo(chocPyParser.CexprmismoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cexprobjeto}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void enterCexprobjeto(chocPyParser.CexprobjetoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cexprobjeto}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void exitCexprobjeto(chocPyParser.CexprobjetoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cexprfuncion}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void enterCexprfuncion(chocPyParser.CexprfuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cexprfuncion}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void exitCexprfuncion(chocPyParser.CexprfuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cexprvalor}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void enterCexprvalor(chocPyParser.CexprvalorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cexprvalor}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void exitCexprvalor(chocPyParser.CexprvalorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cexprlistaexpr}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void enterCexprlistaexpr(chocPyParser.CexprlistaexprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cexprlistaexpr}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void exitCexprlistaexpr(chocPyParser.CexprlistaexprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cexpranidar}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void enterCexpranidar(chocPyParser.CexpranidarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cexpranidar}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void exitCexpranidar(chocPyParser.CexpranidarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cexprlistado}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void enterCexprlistado(chocPyParser.CexprlistadoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cexprlistado}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void exitCexprlistado(chocPyParser.CexprlistadoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bin_opMas}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_opMas(chocPyParser.Bin_opMasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bin_opMas}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_opMas(chocPyParser.Bin_opMasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bin_opMenos}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_opMenos(chocPyParser.Bin_opMenosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bin_opMenos}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_opMenos(chocPyParser.Bin_opMenosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bin_opMultiplicacion}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_opMultiplicacion(chocPyParser.Bin_opMultiplicacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bin_opMultiplicacion}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_opMultiplicacion(chocPyParser.Bin_opMultiplicacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bin_opDivision}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_opDivision(chocPyParser.Bin_opDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bin_opDivision}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_opDivision(chocPyParser.Bin_opDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bin_opModulo}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_opModulo(chocPyParser.Bin_opModuloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bin_opModulo}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_opModulo(chocPyParser.Bin_opModuloContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bin_opIgual}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_opIgual(chocPyParser.Bin_opIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bin_opIgual}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_opIgual(chocPyParser.Bin_opIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bin_opDistinto}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_opDistinto(chocPyParser.Bin_opDistintoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bin_opDistinto}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_opDistinto(chocPyParser.Bin_opDistintoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bin_opMenor}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_opMenor(chocPyParser.Bin_opMenorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bin_opMenor}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_opMenor(chocPyParser.Bin_opMenorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bin_opMayorigual}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_opMayorigual(chocPyParser.Bin_opMayorigualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bin_opMayorigual}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_opMayorigual(chocPyParser.Bin_opMayorigualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bin_opMayor}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_opMayor(chocPyParser.Bin_opMayorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bin_opMayor}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_opMayor(chocPyParser.Bin_opMayorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bin_opIs}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_opIs(chocPyParser.Bin_opIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bin_opIs}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_opIs(chocPyParser.Bin_opIsContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocPyParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(chocPyParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocPyParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(chocPyParser.TargetContext ctx);
}