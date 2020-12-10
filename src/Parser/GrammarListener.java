// Generated from Grammar.g4 by ANTLR 4.8
package Parser;

	import DataStructures.*;
	import Exeptions.*;
	import Parser.*;
	import java.util.ArrayList;
	import Commands.*;
	import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(GrammarParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(GrammarParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void enterDeclaravar(GrammarParser.DeclaravarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#declaravar}.
	 * @param ctx the parse tree
	 */
	void exitDeclaravar(GrammarParser.DeclaravarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(GrammarParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(GrammarParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(GrammarParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(GrammarParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(GrammarParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(GrammarParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void enterCmdleitura(GrammarParser.CmdleituraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cmdleitura}.
	 * @param ctx the parse tree
	 */
	void exitCmdleitura(GrammarParser.CmdleituraContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void enterCmdescrita(GrammarParser.CmdescritaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cmdescrita}.
	 * @param ctx the parse tree
	 */
	void exitCmdescrita(GrammarParser.CmdescritaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void enterCmdattrib(GrammarParser.CmdattribContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cmdattrib}.
	 * @param ctx the parse tree
	 */
	void exitCmdattrib(GrammarParser.CmdattribContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cmdif}.
	 * @param ctx the parse tree
	 */
	void enterCmdif(GrammarParser.CmdifContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cmdif}.
	 * @param ctx the parse tree
	 */
	void exitCmdif(GrammarParser.CmdifContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cmdloop}.
	 * @param ctx the parse tree
	 */
	void enterCmdloop(GrammarParser.CmdloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cmdloop}.
	 * @param ctx the parse tree
	 */
	void exitCmdloop(GrammarParser.CmdloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(GrammarParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(GrammarParser.TermoContext ctx);
}