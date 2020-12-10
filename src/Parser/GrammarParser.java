// Generated from Grammar.g4 by ANTLR 4.8
package Parser;

	import DataStructures.*;
	import Exeptions.*;
	import Parser.*;
	import java.util.ArrayList;
	import Commands.*;
	import java.util.Stack;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, OPREL=11, AP=12, FP=13, AC=14, FC=15, VIR=16, SC=17, OP=18, ATTR=19, 
		ID=20, NUMBER=21, TEXT=22, ASP=23, WS=24;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_declaravar = 2, RULE_tipo = 3, RULE_bloco = 4, 
		RULE_cmd = 5, RULE_cmdleitura = 6, RULE_cmdescrita = 7, RULE_cmdattrib = 8, 
		RULE_cmdif = 9, RULE_cmdloop = 10, RULE_expr = 11, RULE_termo = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "declaravar", "tipo", "bloco", "cmd", "cmdleitura", "cmdescrita", 
			"cmdattrib", "cmdif", "cmdloop", "expr", "termo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog;'", "'numero'", "'texto'", "'leia'", "'escreva'", 
			"'se'", "'senao'", "'enquanto'", "'faca'", null, "'('", "')'", "'{'", 
			"'}'", "','", "';'", null, "'='", null, null, null, "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "OPREL", 
			"AP", "FP", "AC", "FC", "VIR", "SC", "OP", "ATTR", "ID", "NUMBER", "TEXT", 
			"ASP", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private int _tipo;
		private String _varName;
		private String _varValue;
		private IsiSymbolTable symbolTable = new IsiSymbolTable();
		private IsiSymbol symbol;
		private IsiProgram program = new IsiProgram();
		private ArrayList<AbstractCommands> curThread;
		private Stack<ArrayList<AbstractCommands>> stack = new Stack<ArrayList<AbstractCommands>>();
		private String _readID;
		private String _writeID;
		private String _exprID;
		private String _exprContent;
		private String _exprDecision;
		private String _exprWhile;
		private ArrayList<AbstractCommands> listaTrue;
		private ArrayList<AbstractCommands> listaFalse;
		private ArrayList<AbstractCommands> listaLoop;
		public void verificaID(String id){
			if (!symbolTable.exists(id)){
				throw new IsiExceptions("Symbol "+id+" not declared");
			}
			if (!((IsiVariable)(symbolTable.get(id))).getAtrib()){
				throw new IsiExceptions("Symbol "+id+" not assigned");
			}	
		}
		public void exibeComandos(){
			for (AbstractCommands c: program.getComandos()){
				System.out.println(c);
			}
		}
		
		public void generateCode(){
			program.generateTarget();
		}

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(27);
			decl();
			setState(28);
			bloco();
			setState(29);
			match(T__1);
			  
							program.setVarTable(symbolTable);
			           	  	program.setComandos(stack.pop());
			           	 	
							ArrayList<IsiSymbol> lista = symbolTable.getAll();			
							for(int i=0;i<lista.size();i++)
			                {
			                    boolean t;
			                    boolean j;
			                    t=((IsiVariable)(lista.get(i))).getAtrib();
			                   if(t)
			                    {
			                        j=((IsiVariable)(lista.get(i))).getUso();
			                        if(j)
			                        {

			                        }
			                        else
			                        {
			                			System.out.println("Variavel "+ lista.get(i).getName()+" Foi atribhida mas não foi usada");
			                        }
			                    }
			                else
			                    {
			                        System.out.println("Variavel "+ lista.get(i).getName()+" Foi declarada mas não foi Atribuida");

			                    }
			               }			
			           
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public List<DeclaravarContext> declaravar() {
			return getRuleContexts(DeclaravarContext.class);
		}
		public DeclaravarContext declaravar(int i) {
			return getRuleContext(DeclaravarContext.class,i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				declaravar();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==T__3 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaravarContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode SC() { return getToken(GrammarParser.SC, 0); }
		public List<TerminalNode> VIR() { return getTokens(GrammarParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(GrammarParser.VIR, i);
		}
		public DeclaravarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaravar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDeclaravar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDeclaravar(this);
		}
	}

	public final DeclaravarContext declaravar() throws RecognitionException {
		DeclaravarContext _localctx = new DeclaravarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaravar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			tipo();
			setState(38);
			match(ID);

				                  _varName = _input.LT(-1).getText();
				                  _varValue = null;
				                  symbol = new IsiVariable(_varName, _tipo, _varValue);
				                  if (!symbolTable.exists(_varName)){
				                     symbolTable.add(symbol);	
				                  }
				                  else{
				                  	 throw new IsiExceptions("Symbol "+_varName+" already declared");
				                  }
			                    
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(40);
				match(VIR);
				setState(41);
				match(ID);

					                  _varName = _input.LT(-1).getText();
					                  _varValue = null;
					                  symbol = new IsiVariable(_varName, _tipo, _varValue);
					                  if (!symbolTable.exists(_varName)){
					                     symbolTable.add(symbol);	
					                  }
					                  else{
					                  	 throw new IsiExceptions("Symbol "+_varName+" already declared");
					                  }
				                    
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(T__2);
				 _tipo = IsiVariable.NUMBER;
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(T__3);
				 _tipo = IsiVariable.TEXT;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 curThread = new ArrayList<AbstractCommands>(); 
				        stack.push(curThread);  
			          	
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(57);
				cmd();
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public CmdleituraContext cmdleitura() {
			return getRuleContext(CmdleituraContext.class,0);
		}
		public CmdescritaContext cmdescrita() {
			return getRuleContext(CmdescritaContext.class,0);
		}
		public CmdattribContext cmdattrib() {
			return getRuleContext(CmdattribContext.class,0);
		}
		public CmdifContext cmdif() {
			return getRuleContext(CmdifContext.class,0);
		}
		public CmdloopContext cmdloop() {
			return getRuleContext(CmdloopContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				cmdleitura();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				cmdescrita();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				cmdattrib();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				cmdif();
				}
				break;
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				cmdloop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdleituraContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(GrammarParser.AP, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode FP() { return getToken(GrammarParser.FP, 0); }
		public TerminalNode SC() { return getToken(GrammarParser.SC, 0); }
		public CmdleituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdleitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCmdleitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCmdleitura(this);
		}
	}

	public final CmdleituraContext cmdleitura() throws RecognitionException {
		CmdleituraContext _localctx = new CmdleituraContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdleitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__4);
			setState(70);
			match(AP);
			setState(71);
			match(ID);
			 	if (symbolTable.exists(_input.LT(-1).getText())){
			                     		((IsiVariable)(symbolTable.get(_input.LT(-1).getText()))).setAtrib(true);	
			                     	}
			                     	verificaID(_input.LT(-1).getText());
			                     	_readID = _input.LT(-1).getText();
			                     
			setState(73);
			match(FP);
			setState(74);
			match(SC);

			              			IsiVariable var = (IsiVariable)symbolTable.get(_readID);
			              			CommandLeitura cmd = new CommandLeitura(_readID, var);
			              			stack.peek().add(cmd);
			              		 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdescritaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(GrammarParser.AP, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode FP() { return getToken(GrammarParser.FP, 0); }
		public TerminalNode SC() { return getToken(GrammarParser.SC, 0); }
		public CmdescritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdescrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCmdescrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCmdescrita(this);
		}
	}

	public final CmdescritaContext cmdescrita() throws RecognitionException {
		CmdescritaContext _localctx = new CmdescritaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdescrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__5);
			setState(78);
			match(AP);
			setState(79);
			match(ID);
			 	verificaID(_input.LT(-1).getText());
										((IsiVariable)(symbolTable.get(_input.LT(-1).getText()))).setUso(true);
				                  		_writeID = _input.LT(-1).getText();
			                     	
			setState(81);
			match(FP);
			setState(82);
			match(SC);

			               	  			CommandEscrita cmd = new CommandEscrita(_writeID);
			               	  			stack.peek().add(cmd);
			               			
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdattribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(GrammarParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SC() { return getToken(GrammarParser.SC, 0); }
		public CmdattribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdattrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCmdattrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCmdattrib(this);
		}
	}

	public final CmdattribContext cmdattrib() throws RecognitionException {
		CmdattribContext _localctx = new CmdattribContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdattrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(ID);
			 	if (symbolTable.exists(_input.LT(-1).getText())){
			                     	((IsiVariable)(symbolTable.get(_input.LT(-1).getText()))).setAtrib(true);	
			                    }
								verificaID(_input.LT(-1).getText());
			                    _exprID = _input.LT(-1).getText();
			                
			setState(87);
			match(ATTR);
			 _exprContent = ""; 
			setState(89);
			expr();
			setState(90);
			match(SC);


			               	 	CommandAtribuicao cmd = new CommandAtribuicao(_exprID, _exprContent);
			               	 	stack.peek().add(cmd);
			               	
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdifContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(GrammarParser.AP, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode OPREL() { return getToken(GrammarParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(GrammarParser.FP, 0); }
		public List<TerminalNode> AC() { return getTokens(GrammarParser.AC); }
		public TerminalNode AC(int i) {
			return getToken(GrammarParser.AC, i);
		}
		public List<TerminalNode> FC() { return getTokens(GrammarParser.FC); }
		public TerminalNode FC(int i) {
			return getToken(GrammarParser.FC, i);
		}
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCmdif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCmdif(this);
		}
	}

	public final CmdifContext cmdif() throws RecognitionException {
		CmdifContext _localctx = new CmdifContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__6);
			setState(94);
			match(AP);
			setState(95);
			match(ID);

								verificaID(_input.LT(-1).getText());
								((IsiVariable)(symbolTable.get(_input.LT(-1).getText()))).setUso(true);
								_exprDecision = _input.LT(-1).getText();
							
			setState(97);
			match(OPREL);
			 _exprDecision += _input.LT(-1).getText(); 
			setState(99);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			_exprDecision += _input.LT(-1).getText(); 
			setState(101);
			match(FP);
			setState(102);
			match(AC);
			 	curThread = new ArrayList<AbstractCommands>(); 
			                    stack.push(curThread);
			                
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104);
				cmd();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
			setState(109);
			match(FC);

			                  	listaTrue = stack.pop();	
			                
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(111);
				match(T__7);
				setState(112);
				match(AC);

				                   	 	curThread = new ArrayList<AbstractCommands>();
				                   	 	stack.push(curThread);
				                   	
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(114);
					cmd();
					}
					}
					setState(117); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
				setState(119);
				match(FC);

				                   		listaFalse = stack.pop();
				                   		CommandDecisao cmd = new CommandDecisao(_exprDecision, listaTrue, listaFalse);
				                   		stack.peek().add(cmd);
				                   	
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdloopContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(GrammarParser.AP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(GrammarParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(GrammarParser.FP, 0); }
		public TerminalNode AC() { return getToken(GrammarParser.AC, 0); }
		public TerminalNode FC() { return getToken(GrammarParser.FC, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdloop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCmdloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCmdloop(this);
		}
	}

	public final CmdloopContext cmdloop() throws RecognitionException {
		CmdloopContext _localctx = new CmdloopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdloop);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__8);
				setState(125);
				match(AP);
				setState(126);
				expr();
				_exprWhile = _input.LT(-1).getText();
				setState(128);
				match(OPREL);
				_exprWhile += _input.LT(-1).getText();
				setState(130);
				expr();
				_exprWhile += _input.LT(-1).getText();
				setState(132);
				match(FP);
				setState(133);
				match(AC);
				     curThread = new ArrayList<AbstractCommands>(); 
				                    stack.push(curThread);
				                
				setState(136); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(135);
					cmd();
					}
					}
					setState(138); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
				setState(140);
				match(FC);

				                      listaLoop = stack.pop();
				                      CommandEnquanto cmd = new CommandEnquanto(_exprWhile, listaLoop);
				                      stack.peek().add(cmd);
				                
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(T__9);
				setState(144);
				match(AC);
				     curThread = new ArrayList<AbstractCommands>(); 
				                    stack.push(curThread);
				                
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(146);
					cmd();
					}
					}
					setState(149); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
				setState(151);
				match(FC);
				setState(152);
				match(T__8);
				setState(153);
				match(AP);
				setState(154);
				expr();
				_exprWhile = _input.LT(-1).getText();
				setState(156);
				match(OPREL);
				_exprWhile += _input.LT(-1).getText();
				setState(158);
				expr();
				_exprWhile += _input.LT(-1).getText();
				setState(160);
				match(FP);
				   listaLoop = stack.pop();
				                      CommandFacaEnquanto cmd = new CommandFacaEnquanto(_exprWhile, listaLoop);
				                      stack.peek().add(cmd);
				                
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> OP() { return getTokens(GrammarParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(GrammarParser.OP, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			termo();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(166);
				match(OP);
				 _exprContent += _input.LT(-1).getText();
				setState(168);
				termo();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_termo);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(ID);
				 verificaID(_input.LT(-1).getText());
								   ((IsiVariable)(symbolTable.get(_input.LT(-1).getText()))).setUso(true);
					               _exprContent += _input.LT(-1).getText();
				                 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(NUMBER);

				              		_exprContent += _input.LT(-1).getText();
				              	
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u00b7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3$\n\3\r"+
		"\3\16\3%\3\4\3\4\3\4\3\4\3\4\3\4\7\4.\n\4\f\4\16\4\61\13\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\5\59\n\5\3\6\3\6\6\6=\n\6\r\6\16\6>\3\7\3\7\3\7\3\7\3\7\5"+
		"\7F\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\6\13l\n\13\r\13\16\13m\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\6\13v\n\13\r\13\16\13w\3\13\3\13\3\13\5\13}\n\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u008b\n\f\r\f\16\f\u008c\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u0096\n\f\r\f\16\f\u0097\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a6\n\f\3\r\3\r\3\r\3\r\7\r\u00ac"+
		"\n\r\f\r\16\r\u00af\13\r\3\16\3\16\3\16\3\16\5\16\u00b5\n\16\3\16\2\2"+
		"\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\3\2\26\27\2\u00b9\2\34\3\2\2"+
		"\2\4#\3\2\2\2\6\'\3\2\2\2\b8\3\2\2\2\n:\3\2\2\2\fE\3\2\2\2\16G\3\2\2\2"+
		"\20O\3\2\2\2\22W\3\2\2\2\24_\3\2\2\2\26\u00a5\3\2\2\2\30\u00a7\3\2\2\2"+
		"\32\u00b4\3\2\2\2\34\35\7\3\2\2\35\36\5\4\3\2\36\37\5\n\6\2\37 \7\4\2"+
		"\2 !\b\2\1\2!\3\3\2\2\2\"$\5\6\4\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3"+
		"\2\2\2&\5\3\2\2\2\'(\5\b\5\2()\7\26\2\2)/\b\4\1\2*+\7\22\2\2+,\7\26\2"+
		"\2,.\b\4\1\2-*\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2"+
		"\61/\3\2\2\2\62\63\7\23\2\2\63\7\3\2\2\2\64\65\7\5\2\2\659\b\5\1\2\66"+
		"\67\7\6\2\2\679\b\5\1\28\64\3\2\2\28\66\3\2\2\29\t\3\2\2\2:<\b\6\1\2;"+
		"=\5\f\7\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\13\3\2\2\2@F\5\16\b"+
		"\2AF\5\20\t\2BF\5\22\n\2CF\5\24\13\2DF\5\26\f\2E@\3\2\2\2EA\3\2\2\2EB"+
		"\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\r\3\2\2\2GH\7\7\2\2HI\7\16\2\2IJ\7\26\2"+
		"\2JK\b\b\1\2KL\7\17\2\2LM\7\23\2\2MN\b\b\1\2N\17\3\2\2\2OP\7\b\2\2PQ\7"+
		"\16\2\2QR\7\26\2\2RS\b\t\1\2ST\7\17\2\2TU\7\23\2\2UV\b\t\1\2V\21\3\2\2"+
		"\2WX\7\26\2\2XY\b\n\1\2YZ\7\25\2\2Z[\b\n\1\2[\\\5\30\r\2\\]\7\23\2\2]"+
		"^\b\n\1\2^\23\3\2\2\2_`\7\t\2\2`a\7\16\2\2ab\7\26\2\2bc\b\13\1\2cd\7\r"+
		"\2\2de\b\13\1\2ef\t\2\2\2fg\b\13\1\2gh\7\17\2\2hi\7\20\2\2ik\b\13\1\2"+
		"jl\5\f\7\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7\21\2"+
		"\2p|\b\13\1\2qr\7\n\2\2rs\7\20\2\2su\b\13\1\2tv\5\f\7\2ut\3\2\2\2vw\3"+
		"\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\21\2\2z{\b\13\1\2{}\3\2\2\2|"+
		"q\3\2\2\2|}\3\2\2\2}\25\3\2\2\2~\177\7\13\2\2\177\u0080\7\16\2\2\u0080"+
		"\u0081\5\30\r\2\u0081\u0082\b\f\1\2\u0082\u0083\7\r\2\2\u0083\u0084\b"+
		"\f\1\2\u0084\u0085\5\30\r\2\u0085\u0086\b\f\1\2\u0086\u0087\7\17\2\2\u0087"+
		"\u0088\7\20\2\2\u0088\u008a\b\f\1\2\u0089\u008b\5\f\7\2\u008a\u0089\3"+
		"\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\7\21\2\2\u008f\u0090\b\f\1\2\u0090\u00a6\3"+
		"\2\2\2\u0091\u0092\7\f\2\2\u0092\u0093\7\20\2\2\u0093\u0095\b\f\1\2\u0094"+
		"\u0096\5\f\7\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\21\2\2\u009a"+
		"\u009b\7\13\2\2\u009b\u009c\7\16\2\2\u009c\u009d\5\30\r\2\u009d\u009e"+
		"\b\f\1\2\u009e\u009f\7\r\2\2\u009f\u00a0\b\f\1\2\u00a0\u00a1\5\30\r\2"+
		"\u00a1\u00a2\b\f\1\2\u00a2\u00a3\7\17\2\2\u00a3\u00a4\b\f\1\2\u00a4\u00a6"+
		"\3\2\2\2\u00a5~\3\2\2\2\u00a5\u0091\3\2\2\2\u00a6\27\3\2\2\2\u00a7\u00ad"+
		"\5\32\16\2\u00a8\u00a9\7\24\2\2\u00a9\u00aa\b\r\1\2\u00aa\u00ac\5\32\16"+
		"\2\u00ab\u00a8\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\31\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\26\2\2\u00b1"+
		"\u00b5\b\16\1\2\u00b2\u00b3\7\27\2\2\u00b3\u00b5\b\16\1\2\u00b4\u00b0"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\33\3\2\2\2\17%/8>Emw|\u008c\u0097\u00a5"+
		"\u00ad\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}