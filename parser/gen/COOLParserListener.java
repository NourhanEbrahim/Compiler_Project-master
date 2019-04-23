// Generated from /home/nourhan/nourhan/projects/src/COOLParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link COOLParserParser}.
 */
public interface COOLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link COOLParserParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(COOLParserParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParserParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(COOLParserParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classes}
	 * labeled alternative in {@link COOLParserParser#programBlocks}.
	 * @param ctx the parse tree
	 */
	void enterClasses(COOLParserParser.ClassesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classes}
	 * labeled alternative in {@link COOLParserParser#programBlocks}.
	 * @param ctx the parse tree
	 */
	void exitClasses(COOLParserParser.ClassesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eof}
	 * labeled alternative in {@link COOLParserParser#programBlocks}.
	 * @param ctx the parse tree
	 */
	void enterEof(COOLParserParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eof}
	 * labeled alternative in {@link COOLParserParser#programBlocks}.
	 * @param ctx the parse tree
	 */
	void exitEof(COOLParserParser.EofContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParserParser#classDefine}.
	 * @param ctx the parse tree
	 */
	void enterClassDefine(COOLParserParser.ClassDefineContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParserParser#classDefine}.
	 * @param ctx the parse tree
	 */
	void exitClassDefine(COOLParserParser.ClassDefineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method}
	 * labeled alternative in {@link COOLParserParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterMethod(COOLParserParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method}
	 * labeled alternative in {@link COOLParserParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitMethod(COOLParserParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code property}
	 * labeled alternative in {@link COOLParserParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterProperty(COOLParserParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code property}
	 * labeled alternative in {@link COOLParserParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitProperty(COOLParserParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link COOLParserParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(COOLParserParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link COOLParserParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(COOLParserParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letIn}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLetIn(COOLParserParser.LetInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letIn}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLetIn(COOLParserParser.LetInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minus}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinus(COOLParserParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinus(COOLParserParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterString(COOLParserParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitString(COOLParserParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsvoid(COOLParserParser.IsvoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isvoid}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsvoid(COOLParserParser.IsvoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterWhile(COOLParserParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitWhile(COOLParserParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code division}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivision(COOLParserParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code division}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivision(COOLParserParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negative}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegative(COOLParserParser.NegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegative(COOLParserParser.NegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolNot(COOLParserParser.BoolNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolNot}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolNot(COOLParserParser.BoolNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(COOLParserParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(COOLParserParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBlock(COOLParserParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBlock(COOLParserParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterId(COOLParserParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitId(COOLParserParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(COOLParserParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiply}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(COOLParserParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIf(COOLParserParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIf(COOLParserParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code case}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCase(COOLParserParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code case}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCase(COOLParserParser.CaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ownMethodCall}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOwnMethodCall(COOLParserParser.OwnMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ownMethodCall}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOwnMethodCall(COOLParserParser.OwnMethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(COOLParserParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(COOLParserParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code new}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNew(COOLParserParser.NewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code new}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNew(COOLParserParser.NewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(COOLParserParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(COOLParserParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(COOLParserParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(COOLParserParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code false}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFalse(COOLParserParser.FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code false}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFalse(COOLParserParser.FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInt(COOLParserParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInt(COOLParserParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equal}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqual(COOLParserParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqual(COOLParserParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code true}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTrue(COOLParserParser.TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code true}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTrue(COOLParserParser.TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessEqual}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessEqual(COOLParserParser.LessEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessEqual}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessEqual(COOLParserParser.LessEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(COOLParserParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link COOLParserParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(COOLParserParser.MethodCallContext ctx);
}