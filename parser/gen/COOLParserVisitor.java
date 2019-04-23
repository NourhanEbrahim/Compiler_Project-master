// Generated from /home/nourhan/nourhan/projects/src/COOLParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link COOLParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface COOLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link COOLParserParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(COOLParserParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classes}
	 * labeled alternative in {@link COOLParserParser#programBlocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClasses(COOLParserParser.ClassesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eof}
	 * labeled alternative in {@link COOLParserParser#programBlocks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEof(COOLParserParser.EofContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParserParser#classDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDefine(COOLParserParser.ClassDefineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code method}
	 * labeled alternative in {@link COOLParserParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(COOLParserParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code property}
	 * labeled alternative in {@link COOLParserParser#feature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(COOLParserParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link COOLParserParser#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal(COOLParserParser.FormalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letIn}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetIn(COOLParserParser.LetInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(COOLParserParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(COOLParserParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsvoid(COOLParserParser.IsvoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(COOLParserParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code division}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(COOLParserParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative(COOLParserParser.NegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolNot(COOLParserParser.BoolNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(COOLParserParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(COOLParserParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(COOLParserParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(COOLParserParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(COOLParserParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code case}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase(COOLParserParser.CaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ownMethodCall}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwnMethodCall(COOLParserParser.OwnMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(COOLParserParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code new}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew(COOLParserParser.NewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(COOLParserParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(COOLParserParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code false}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(COOLParserParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(COOLParserParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(COOLParserParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code true}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(COOLParserParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessEqual}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqual(COOLParserParser.LessEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(COOLParserParser.MethodCallContext ctx);
}