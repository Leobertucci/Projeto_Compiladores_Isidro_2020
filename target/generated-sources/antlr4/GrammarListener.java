// Generated from Grammar.g4 by ANTLR 4.4

	import DataStructures.*;
	import Exeptions.*;
	import Parser.*;
	import java.util.ArrayList;
	import Commands.*;
	import java.util.Stack;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdattrib(@NotNull GrammarParser.CmdattribContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdattrib(@NotNull GrammarParser.CmdattribContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull GrammarParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull GrammarParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cmdloop}.
	 * @param ctx the parse tree
	 */
	void enterCmdloop(@NotNull GrammarParser.CmdloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cmdloop}.
	 * @param ctx the parse tree
	 */
	void exitCmdloop(@NotNull GrammarParser.CmdloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(@NotNull GrammarParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(@NotNull GrammarParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdescrita(@NotNull GrammarParser.CmdescritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdescrita(@NotNull GrammarParser.CmdescritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(@NotNull GrammarParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(@NotNull GrammarParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull GrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull GrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cmdif}.
	 * @param ctx the parse tree
	 */
	void enterCmdif(@NotNull GrammarParser.CmdifContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cmdif}.
	 * @param ctx the parse tree
	 */
	void exitCmdif(@NotNull GrammarParser.CmdifContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(@NotNull GrammarParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(@NotNull GrammarParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull GrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull GrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(@NotNull GrammarParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(@NotNull GrammarParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaravar(@NotNull GrammarParser.DeclaravarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaravar(@NotNull GrammarParser.DeclaravarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdleitura(@NotNull GrammarParser.CmdleituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdleitura(@NotNull GrammarParser.CmdleituraContext ctx);
}