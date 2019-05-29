package gen;// Generated from E:/study/year4/term2/compiler/ppppp/src\COOL.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class COOLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, CLASS=9, 
		SELF=10, ELSE=11, FALSE=12, FI=13, IF=14, IN=15, INHERITS=16, ISVOID=17, 
		LET=18, LOOP=19, POOL=20, THEN=21, WHILE=22, CASE=23, ESAC=24, NEW=25, 
		OF=26, NOT=27, TRUE=28, STRING=29, INT=30, TYPEID=31, OBJECTID=32, ASSIGNMENT=33, 
		CASE_ARROW=34, ADD=35, MINUS=36, MULTIPLY=37, DIVISION=38, LESS_THAN=39, 
		LESS_EQUAL=40, EQUAL=41, INTEGER_NEGATIVE=42, ESC=43, UNICODE=44, HEX=45, 
		OPEN_COMMENT=46, CLOSE_COMMENT=47, COMMENT=48, ONE_LINE_COMMENT=49, WHITESPACE=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "CLASS", 
			"SELF", "ELSE", "FALSE", "FI", "IF", "IN", "INHERITS", "ISVOID", "LET", 
			"LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "NEW", "OF", "NOT", 
			"TRUE", "STRING", "INT", "TYPEID", "OBJECTID", "ASSIGNMENT", "CASE_ARROW", 
			"ADD", "MINUS", "MULTIPLY", "DIVISION", "LESS_THAN", "LESS_EQUAL", "EQUAL", 
			"INTEGER_NEGATIVE", "ESC", "UNICODE", "HEX", "OPEN_COMMENT", "CLOSE_COMMENT", 
			"COMMENT", "ONE_LINE_COMMENT", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'{'", "'}'", "'('", "')'", "':'", "','", "'.'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'<-'", "'=>'", 
			"'+'", "'-'", "'*'", "'/'", "'<'", "'<='", "'='", "'~'", null, null, 
			null, "'(*'", "'*)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "CLASS", "SELF", 
			"ELSE", "FALSE", "FI", "IF", "IN", "INHERITS", "ISVOID", "LET", "LOOP", 
			"POOL", "THEN", "WHILE", "CASE", "ESAC", "NEW", "OF", "NOT", "TRUE", 
			"STRING", "INT", "TYPEID", "OBJECTID", "ASSIGNMENT", "CASE_ARROW", "ADD", 
			"MINUS", "MULTIPLY", "DIVISION", "LESS_THAN", "LESS_EQUAL", "EQUAL", 
			"INTEGER_NEGATIVE", "ESC", "UNICODE", "HEX", "OPEN_COMMENT", "CLOSE_COMMENT", 
			"COMMENT", "ONE_LINE_COMMENT", "WHITESPACE"
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


	public COOLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "COOL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0141\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\7\36\u00dd"+
		"\n\36\f\36\16\36\u00e0\13\36\3\36\3\36\3\37\6\37\u00e5\n\37\r\37\16\37"+
		"\u00e6\3 \3 \7 \u00eb\n \f \16 \u00ee\13 \3!\3!\7!\u00f2\n!\f!\16!\u00f5"+
		"\13!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3*"+
		"\3*\3+\3+\3,\3,\3,\5,\u0111\n,\3-\3-\3-\3-\3-\3-\3.\3.\3/\3/\3/\3\60\3"+
		"\60\3\60\3\61\3\61\3\61\7\61\u0124\n\61\f\61\16\61\u0127\13\61\3\61\3"+
		"\61\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u0131\n\62\f\62\16\62\u0134\13"+
		"\62\3\62\5\62\u0137\n\62\3\62\3\62\3\63\6\63\u013c\n\63\r\63\16\63\u013d"+
		"\3\63\3\63\3\u0125\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64\3\2\13\6\2\f\f\17\17$$^^\3\2\62;\3\2C\\\6\2\62;C\\aac|\4\2aa"+
		"c|\n\2$$\61\61^^ddhhppttvv\5\2\62;CHch\3\2\f\f\5\2\13\f\16\17\"\"\2\u014b"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5i\3\2\2\2\7k\3\2\2\2\tm\3\2\2"+
		"\2\13o\3\2\2\2\rq\3\2\2\2\17s\3\2\2\2\21u\3\2\2\2\23w\3\2\2\2\25}\3\2"+
		"\2\2\27\u0082\3\2\2\2\31\u0087\3\2\2\2\33\u008d\3\2\2\2\35\u0090\3\2\2"+
		"\2\37\u0093\3\2\2\2!\u0096\3\2\2\2#\u009f\3\2\2\2%\u00a6\3\2\2\2\'\u00aa"+
		"\3\2\2\2)\u00af\3\2\2\2+\u00b4\3\2\2\2-\u00b9\3\2\2\2/\u00bf\3\2\2\2\61"+
		"\u00c4\3\2\2\2\63\u00c9\3\2\2\2\65\u00cd\3\2\2\2\67\u00d0\3\2\2\29\u00d4"+
		"\3\2\2\2;\u00d9\3\2\2\2=\u00e4\3\2\2\2?\u00e8\3\2\2\2A\u00ef\3\2\2\2C"+
		"\u00f6\3\2\2\2E\u00f9\3\2\2\2G\u00fc\3\2\2\2I\u00fe\3\2\2\2K\u0100\3\2"+
		"\2\2M\u0102\3\2\2\2O\u0104\3\2\2\2Q\u0106\3\2\2\2S\u0109\3\2\2\2U\u010b"+
		"\3\2\2\2W\u010d\3\2\2\2Y\u0112\3\2\2\2[\u0118\3\2\2\2]\u011a\3\2\2\2_"+
		"\u011d\3\2\2\2a\u0120\3\2\2\2c\u012c\3\2\2\2e\u013b\3\2\2\2gh\7=\2\2h"+
		"\4\3\2\2\2ij\7}\2\2j\6\3\2\2\2kl\7\177\2\2l\b\3\2\2\2mn\7*\2\2n\n\3\2"+
		"\2\2op\7+\2\2p\f\3\2\2\2qr\7<\2\2r\16\3\2\2\2st\7.\2\2t\20\3\2\2\2uv\7"+
		"\60\2\2v\22\3\2\2\2wx\7e\2\2xy\7n\2\2yz\7c\2\2z{\7u\2\2{|\7u\2\2|\24\3"+
		"\2\2\2}~\7u\2\2~\177\7g\2\2\177\u0080\7n\2\2\u0080\u0081\7h\2\2\u0081"+
		"\26\3\2\2\2\u0082\u0083\7g\2\2\u0083\u0084\7n\2\2\u0084\u0085\7u\2\2\u0085"+
		"\u0086\7g\2\2\u0086\30\3\2\2\2\u0087\u0088\7h\2\2\u0088\u0089\7c\2\2\u0089"+
		"\u008a\7n\2\2\u008a\u008b\7u\2\2\u008b\u008c\7g\2\2\u008c\32\3\2\2\2\u008d"+
		"\u008e\7h\2\2\u008e\u008f\7k\2\2\u008f\34\3\2\2\2\u0090\u0091\7k\2\2\u0091"+
		"\u0092\7h\2\2\u0092\36\3\2\2\2\u0093\u0094\7k\2\2\u0094\u0095\7p\2\2\u0095"+
		" \3\2\2\2\u0096\u0097\7k\2\2\u0097\u0098\7p\2\2\u0098\u0099\7j\2\2\u0099"+
		"\u009a\7g\2\2\u009a\u009b\7t\2\2\u009b\u009c\7k\2\2\u009c\u009d\7v\2\2"+
		"\u009d\u009e\7u\2\2\u009e\"\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7u"+
		"\2\2\u00a1\u00a2\7x\2\2\u00a2\u00a3\7q\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5"+
		"\7f\2\2\u00a5$\3\2\2\2\u00a6\u00a7\7n\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9"+
		"\7v\2\2\u00a9&\3\2\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad"+
		"\7q\2\2\u00ad\u00ae\7r\2\2\u00ae(\3\2\2\2\u00af\u00b0\7r\2\2\u00b0\u00b1"+
		"\7q\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7n\2\2\u00b3*\3\2\2\2\u00b4\u00b5"+
		"\7v\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7p\2\2\u00b8"+
		",\3\2\2\2\u00b9\u00ba\7y\2\2\u00ba\u00bb\7j\2\2\u00bb\u00bc\7k\2\2\u00bc"+
		"\u00bd\7n\2\2\u00bd\u00be\7g\2\2\u00be.\3\2\2\2\u00bf\u00c0\7e\2\2\u00c0"+
		"\u00c1\7c\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7g\2\2\u00c3\60\3\2\2\2\u00c4"+
		"\u00c5\7g\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7e\2\2"+
		"\u00c8\62\3\2\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7"+
		"y\2\2\u00cc\64\3\2\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf\7h\2\2\u00cf\66"+
		"\3\2\2\2\u00d0\u00d1\7P\2\2\u00d1\u00d2\7Q\2\2\u00d2\u00d3\7V\2\2\u00d3"+
		"8\3\2\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7w\2\2\u00d7"+
		"\u00d8\7g\2\2\u00d8:\3\2\2\2\u00d9\u00de\7$\2\2\u00da\u00dd\5W,\2\u00db"+
		"\u00dd\n\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00e2\7$\2\2\u00e2<\3\2\2\2\u00e3\u00e5\t\3\2\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7>\3\2\2\2\u00e8\u00ec\t\4\2\2\u00e9\u00eb\t\5\2\2\u00ea\u00e9"+
		"\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"@\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f3\t\6\2\2\u00f0\u00f2\t\5\2\2"+
		"\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4B\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7>\2\2\u00f7\u00f8"+
		"\7/\2\2\u00f8D\3\2\2\2\u00f9\u00fa\7?\2\2\u00fa\u00fb\7@\2\2\u00fbF\3"+
		"\2\2\2\u00fc\u00fd\7-\2\2\u00fdH\3\2\2\2\u00fe\u00ff\7/\2\2\u00ffJ\3\2"+
		"\2\2\u0100\u0101\7,\2\2\u0101L\3\2\2\2\u0102\u0103\7\61\2\2\u0103N\3\2"+
		"\2\2\u0104\u0105\7>\2\2\u0105P\3\2\2\2\u0106\u0107\7>\2\2\u0107\u0108"+
		"\7?\2\2\u0108R\3\2\2\2\u0109\u010a\7?\2\2\u010aT\3\2\2\2\u010b\u010c\7"+
		"\u0080\2\2\u010cV\3\2\2\2\u010d\u0110\7^\2\2\u010e\u0111\t\7\2\2\u010f"+
		"\u0111\5Y-\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111X\3\2\2\2\u0112"+
		"\u0113\7w\2\2\u0113\u0114\5[.\2\u0114\u0115\5[.\2\u0115\u0116\5[.\2\u0116"+
		"\u0117\5[.\2\u0117Z\3\2\2\2\u0118\u0119\t\b\2\2\u0119\\\3\2\2\2\u011a"+
		"\u011b\7*\2\2\u011b\u011c\7,\2\2\u011c^\3\2\2\2\u011d\u011e\7,\2\2\u011e"+
		"\u011f\7+\2\2\u011f`\3\2\2\2\u0120\u0125\5]/\2\u0121\u0124\5a\61\2\u0122"+
		"\u0124\13\2\2\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3"+
		"\2\2\2\u0125\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0128\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0128\u0129\5_\60\2\u0129\u012a\3\2\2\2\u012a\u012b\b\61"+
		"\2\2\u012bb\3\2\2\2\u012c\u012d\7/\2\2\u012d\u012e\7/\2\2\u012e\u0132"+
		"\3\2\2\2\u012f\u0131\n\t\2\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2"+
		"\2\2\u0135\u0137\7\f\2\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0139\b\62\2\2\u0139d\3\2\2\2\u013a\u013c\t\n\2\2"+
		"\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\b\63\2\2\u0140f\3\2\2\2\16\2"+
		"\u00dc\u00de\u00e6\u00ec\u00f3\u0110\u0123\u0125\u0132\u0136\u013d\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}