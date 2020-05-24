// Generated from C:/Users/Home/IdeaProjects/p1/grammar\chocPy.g4 by ANTLR 4.8
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
	 * Enter a parse tree produced by {@link chocPyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(chocPyParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocPyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(chocPyParser.TypeContext ctx);
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
	 * Enter a parse tree produced by {@link chocPyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(chocPyParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocPyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(chocPyParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocPyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(chocPyParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocPyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(chocPyParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void enterCexpr(chocPyParser.CexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocPyParser#cexpr}.
	 * @param ctx the parse tree
	 */
	void exitCexpr(chocPyParser.CexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocPyParser#logop}.
	 * @param ctx the parse tree
	 */
	void enterLogop(chocPyParser.LogopContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocPyParser#logop}.
	 * @param ctx the parse tree
	 */
	void exitLogop(chocPyParser.LogopContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocPyParser#multdiv}.
	 * @param ctx the parse tree
	 */
	void enterMultdiv(chocPyParser.MultdivContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocPyParser#multdiv}.
	 * @param ctx the parse tree
	 */
	void exitMultdiv(chocPyParser.MultdivContext ctx);
	/**
	 * Enter a parse tree produced by {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_op(chocPyParser.Bin_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link chocPyParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_op(chocPyParser.Bin_opContext ctx);
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