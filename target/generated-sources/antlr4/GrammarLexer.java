// Generated from Grammar.g4 by ANTLR 4.4

	import DataStructures.*;
	import Exeptions.*;
	import Parser.*;
	import java.util.ArrayList;
	import Commands.*;
	import java.util.Stack;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__9=1, T__8=2, T__7=3, T__6=4, T__5=5, T__4=6, T__3=7, T__2=8, T__1=9, 
		T__0=10, OPREL=11, AP=12, FP=13, AC=14, FC=15, VIR=16, SC=17, OP=18, ATTR=19, 
		ID=20, NUMBER=21, TEXT=22, ASP=23, WS=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'"
	};
	public static final String[] ruleNames = {
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "OPREL", "AP", "FP", "AC", "FC", "VIR", "SC", "OP", "ATTR", "ID", 
		"NUMBER", "TEXT", "ASP", "WS"
	};


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
		private ArrayList<AbstractCommands> listaTrue;
		private ArrayList<AbstractCommands> listaFalse;
		public void verificaID(String id){
			if (!symbolTable.exists(id)){
				throw new IsiExceptions("Symbol "+id+" not declared");
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00bc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0080\n\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\7"+
		"\25\u0094\n\25\f\25\16\25\u0097\13\25\3\25\3\25\7\25\u009b\n\25\f\25\16"+
		"\25\u009e\13\25\5\25\u00a0\n\25\3\26\6\26\u00a3\n\26\r\26\16\26\u00a4"+
		"\3\26\3\26\6\26\u00a9\n\26\r\26\16\26\u00aa\5\26\u00ad\n\26\3\27\3\27"+
		"\6\27\u00b1\n\27\r\27\16\27\u00b2\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\2\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\t\4\2>>@@\5"+
		"\2,-//\61\61\3\2c|\5\2\62;C\\c|\3\2C\\\3\2\62;\5\2\13\f\17\17\"\"\u00c6"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\3\63\3\2\2\2\5\66\3\2\2\2\7>\3\2\2\2\tG\3\2\2\2\13P\3"+
		"\2\2\2\rV\3\2\2\2\17]\3\2\2\2\21f\3\2\2\2\23k\3\2\2\2\25p\3\2\2\2\27\177"+
		"\3\2\2\2\31\u0081\3\2\2\2\33\u0083\3\2\2\2\35\u0085\3\2\2\2\37\u0087\3"+
		"\2\2\2!\u0089\3\2\2\2#\u008b\3\2\2\2%\u008d\3\2\2\2\'\u008f\3\2\2\2)\u009f"+
		"\3\2\2\2+\u00a2\3\2\2\2-\u00ae\3\2\2\2/\u00b6\3\2\2\2\61\u00b8\3\2\2\2"+
		"\63\64\7u\2\2\64\65\7g\2\2\65\4\3\2\2\2\66\67\7g\2\2\678\7u\2\289\7e\2"+
		"\29:\7t\2\2:;\7g\2\2;<\7x\2\2<=\7c\2\2=\6\3\2\2\2>?\7h\2\2?@\7k\2\2@A"+
		"\7o\2\2AB\7r\2\2BC\7t\2\2CD\7q\2\2DE\7i\2\2EF\7=\2\2F\b\3\2\2\2GH\7g\2"+
		"\2HI\7p\2\2IJ\7s\2\2JK\7w\2\2KL\7c\2\2LM\7p\2\2MN\7v\2\2NO\7q\2\2O\n\3"+
		"\2\2\2PQ\7u\2\2QR\7g\2\2RS\7p\2\2ST\7c\2\2TU\7q\2\2U\f\3\2\2\2VW\7p\2"+
		"\2WX\7w\2\2XY\7o\2\2YZ\7g\2\2Z[\7t\2\2[\\\7q\2\2\\\16\3\2\2\2]^\7r\2\2"+
		"^_\7t\2\2_`\7q\2\2`a\7i\2\2ab\7t\2\2bc\7c\2\2cd\7o\2\2de\7c\2\2e\20\3"+
		"\2\2\2fg\7n\2\2gh\7g\2\2hi\7k\2\2ij\7c\2\2j\22\3\2\2\2kl\7h\2\2lm\7c\2"+
		"\2mn\7e\2\2no\7c\2\2o\24\3\2\2\2pq\7v\2\2qr\7g\2\2rs\7z\2\2st\7v\2\2t"+
		"u\7q\2\2u\26\3\2\2\2v\u0080\t\2\2\2wx\7>\2\2x\u0080\7?\2\2yz\7@\2\2z\u0080"+
		"\7?\2\2{|\7#\2\2|\u0080\7?\2\2}~\7?\2\2~\u0080\7?\2\2\177v\3\2\2\2\177"+
		"w\3\2\2\2\177y\3\2\2\2\177{\3\2\2\2\177}\3\2\2\2\u0080\30\3\2\2\2\u0081"+
		"\u0082\7*\2\2\u0082\32\3\2\2\2\u0083\u0084\7+\2\2\u0084\34\3\2\2\2\u0085"+
		"\u0086\7}\2\2\u0086\36\3\2\2\2\u0087\u0088\7\177\2\2\u0088 \3\2\2\2\u0089"+
		"\u008a\7.\2\2\u008a\"\3\2\2\2\u008b\u008c\7=\2\2\u008c$\3\2\2\2\u008d"+
		"\u008e\t\3\2\2\u008e&\3\2\2\2\u008f\u0090\7?\2\2\u0090(\3\2\2\2\u0091"+
		"\u0095\t\4\2\2\u0092\u0094\t\5\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u00a0\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0098\u009c\t\6\2\2\u0099\u009b\t\5\2\2\u009a\u0099\3\2"+
		"\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u0091\3\2\2\2\u009f\u0098\3\2"+
		"\2\2\u00a0*\3\2\2\2\u00a1\u00a3\t\7\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00ac\3\2\2\2\u00a6"+
		"\u00a8\7\60\2\2\u00a7\u00a9\t\7\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3"+
		"\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00a6\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad,\3\2\2\2\u00ae\u00b0\5/\30\2"+
		"\u00af\u00b1\t\5\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\5/\30\2\u00b5"+
		".\3\2\2\2\u00b6\u00b7\7$\2\2\u00b7\60\3\2\2\2\u00b8\u00b9\t\b\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bb\b\31\2\2\u00bb\62\3\2\2\2\16\2\177\u0093\u0095"+
		"\u009a\u009c\u009f\u00a4\u00aa\u00ac\u00b0\u00b2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}