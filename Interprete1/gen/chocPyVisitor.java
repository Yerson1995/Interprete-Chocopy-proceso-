// Generated from E:/ProyectosIntelliJIDEA/Java/Java/Interprete1/Gramatica\chocPy.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link chocPyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface chocPyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link chocPyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(chocPyParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocPyParser#class_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_def(chocPyParser.Class_defContext ctx);
	/**
	 * Visit a parse tree produced by the {@code class_bodypass}
	 * labeled alternative in {@link chocPyParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_bodypass(chocPyParser.Class_bodypassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code class_bodydefinicion}
	 * labeled alternative in {@link chocPyParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_bodydefinicion(chocPyParser.Class_bodydefinicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocPyParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(chocPyParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocPyParser#metd_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetd_def(chocPyParser.Metd_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocPyParser#func_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body(chocPyParser.Func_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocPyParser#typed_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyped_var(chocPyParser.Typed_varContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeid}
	 * labeled alternative in {@link chocPyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeid(chocPyParser.TypeidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeidstring}
	 * labeled alternative in {@link chocPyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeidstring(chocPyParser.TypeidstringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tipeInt}
	 * labeled alternative in {@link chocPyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipeInt(chocPyParser.TipeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeStr}
	 * labeled alternative in {@link chocPyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeStr(chocPyParser.TypeStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeBool}
	 * labeled alternative in {@link chocPyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBool(chocPyParser.TypeBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeObject}
	 * labeled alternative in {@link chocPyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeObject(chocPyParser.TypeObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeAnidado}
	 * labeled alternative in {@link chocPyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAnidado(chocPyParser.TypeAnidadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocPyParser#global_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_decl(chocPyParser.Global_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocPyParser#nonlocal_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonlocal_decl(chocPyParser.Nonlocal_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocPyParser#var_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_def(chocPyParser.Var_defContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtsimple}
	 * labeled alternative in {@link chocPyParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtsimple(chocPyParser.StmtsimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtif}
	 * labeled alternative in {@link chocPyParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtif(chocPyParser.StmtifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtwhile}
	 * labeled alternative in {@link chocPyParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtwhile(chocPyParser.StmtwhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stmtfor}
	 * labeled alternative in {@link chocPyParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtfor(chocPyParser.StmtforContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simplestmtpass}
	 * labeled alternative in {@link chocPyParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplestmtpass(chocPyParser.SimplestmtpassContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simplestmtexpr}
	 * labeled alternative in {@link chocPyParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplestmtexpr(chocPyParser.SimplestmtexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simplestmtreturn}
	 * labeled alternative in {@link chocPyParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplestmtreturn(chocPyParser.SimplestmtreturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simplestmtasignacion}
	 * labeled alternative in {@link chocPyParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplestmtasignacion(chocPyParser.SimplestmtasignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simplestmtprint}
	 * labeled alternative in {@link chocPyParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplestmtprint(chocPyParser.SimplestmtprintContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocPyParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(chocPyParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalnone}
	 * labeled alternative in {@link chocPyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralnone(chocPyParser.LiteralnoneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literaltrue}
	 * labeled alternative in {@link chocPyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteraltrue(chocPyParser.LiteraltrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalfalse}
	 * labeled alternative in {@link chocPyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralfalse(chocPyParser.LiteralfalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literaltk_entero}
	 * labeled alternative in {@link chocPyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteraltk_entero(chocPyParser.Literaltk_enteroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalidstring}
	 * labeled alternative in {@link chocPyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralidstring(chocPyParser.LiteralidstringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalstring}
	 * labeled alternative in {@link chocPyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralstring(chocPyParser.LiteralstringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprcexpr}
	 * labeled alternative in {@link chocPyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprcexpr(chocPyParser.ExprcexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprnot}
	 * labeled alternative in {@link chocPyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprnot(chocPyParser.ExprnotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprexprcond}
	 * labeled alternative in {@link chocPyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprexprcond(chocPyParser.ExprexprcondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprandor}
	 * labeled alternative in {@link chocPyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprandor(chocPyParser.ExprandorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cexprid}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCexprid(chocPyParser.CexpridContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cexprnegando}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCexprnegando(chocPyParser.CexprnegandoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cexproperacion}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCexproperacion(chocPyParser.CexproperacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cexprlen}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCexprlen(chocPyParser.CexprlenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cexprpuntoarg}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCexprpuntoarg(chocPyParser.CexprpuntoargContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cexprmismo}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCexprmismo(chocPyParser.CexprmismoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cexprobjeto}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCexprobjeto(chocPyParser.CexprobjetoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cexprfuncion}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCexprfuncion(chocPyParser.CexprfuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cexprvalor}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCexprvalor(chocPyParser.CexprvalorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cexprlistaexpr}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCexprlistaexpr(chocPyParser.CexprlistaexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cexpranidar}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCexpranidar(chocPyParser.CexpranidarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cexprlistado}
	 * labeled alternative in {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCexprlistado(chocPyParser.CexprlistadoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bin_opMas}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_opMas(chocPyParser.Bin_opMasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bin_opMenos}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_opMenos(chocPyParser.Bin_opMenosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bin_opMultiplicacion}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_opMultiplicacion(chocPyParser.Bin_opMultiplicacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bin_opDivision}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_opDivision(chocPyParser.Bin_opDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bin_opModulo}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_opModulo(chocPyParser.Bin_opModuloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bin_opIgual}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_opIgual(chocPyParser.Bin_opIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bin_opDistinto}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_opDistinto(chocPyParser.Bin_opDistintoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bin_opMenor}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_opMenor(chocPyParser.Bin_opMenorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bin_opMayorigual}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_opMayorigual(chocPyParser.Bin_opMayorigualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bin_opMayor}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_opMayor(chocPyParser.Bin_opMayorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bin_opIs}
	 * labeled alternative in {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_opIs(chocPyParser.Bin_opIsContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocPyParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(chocPyParser.TargetContext ctx);
}