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
	 * Visit a parse tree produced by {@link chocPyParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(chocPyParser.Class_bodyContext ctx);
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
	 * Visit a parse tree produced by {@link chocPyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(chocPyParser.TypeContext ctx);
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
	 * Visit a parse tree produced by {@link chocPyParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(chocPyParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocPyParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(chocPyParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocPyParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(chocPyParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocPyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(chocPyParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocPyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(chocPyParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCexpr(chocPyParser.CexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_op(chocPyParser.Bin_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link chocPyParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(chocPyParser.TargetContext ctx);
}