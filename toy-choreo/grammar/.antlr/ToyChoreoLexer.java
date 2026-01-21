// Generated from c:/Users/gianl/Documents/GitHub/tesi/toy-choreo/grammar/ToyChoreo.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ToyChoreoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, SEND=2, IF=3, ELSE=4, RACE=5, OR=6, ARROW=7, ASSIGN=8, COLON=9, 
		SEMI=10, LPAREN=11, RPAREN=12, LBRACE=13, RBRACE=14, ID=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LET", "SEND", "IF", "ELSE", "RACE", "OR", "ARROW", "ASSIGN", "COLON", 
			"SEMI", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'send'", "'if'", "'else'", "'race'", "'or'", "'->'", 
			"'='", "':'", "';'", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "SEND", "IF", "ELSE", "RACE", "OR", "ARROW", "ASSIGN", "COLON", 
			"SEMI", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "ID", "WS"
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


	public ToyChoreoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ToyChoreo.g4"; }

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
		"\u0004\u0000\u0010Y\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0005\u000eN\b\u000e\n\u000e\f\u000eQ\t\u000e\u0001\u000f\u0004\u000f"+
		"T\b\u000f\u000b\u000f\f\u000fU\u0001\u000f\u0001\u000f\u0000\u0000\u0010"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010\u0001\u0000\u0003\u0003\u0000AZ__az\u0004\u0000"+
		"09AZ__az\u0003\u0000\t\n\r\r  Z\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003%\u0001\u0000\u0000"+
		"\u0000\u0005*\u0001\u0000\u0000\u0000\u0007-\u0001\u0000\u0000\u0000\t"+
		"2\u0001\u0000\u0000\u0000\u000b7\u0001\u0000\u0000\u0000\r:\u0001\u0000"+
		"\u0000\u0000\u000f=\u0001\u0000\u0000\u0000\u0011?\u0001\u0000\u0000\u0000"+
		"\u0013A\u0001\u0000\u0000\u0000\u0015C\u0001\u0000\u0000\u0000\u0017E"+
		"\u0001\u0000\u0000\u0000\u0019G\u0001\u0000\u0000\u0000\u001bI\u0001\u0000"+
		"\u0000\u0000\u001dK\u0001\u0000\u0000\u0000\u001fS\u0001\u0000\u0000\u0000"+
		"!\"\u0005l\u0000\u0000\"#\u0005e\u0000\u0000#$\u0005t\u0000\u0000$\u0002"+
		"\u0001\u0000\u0000\u0000%&\u0005s\u0000\u0000&\'\u0005e\u0000\u0000\'"+
		"(\u0005n\u0000\u0000()\u0005d\u0000\u0000)\u0004\u0001\u0000\u0000\u0000"+
		"*+\u0005i\u0000\u0000+,\u0005f\u0000\u0000,\u0006\u0001\u0000\u0000\u0000"+
		"-.\u0005e\u0000\u0000./\u0005l\u0000\u0000/0\u0005s\u0000\u000001\u0005"+
		"e\u0000\u00001\b\u0001\u0000\u0000\u000023\u0005r\u0000\u000034\u0005"+
		"a\u0000\u000045\u0005c\u0000\u000056\u0005e\u0000\u00006\n\u0001\u0000"+
		"\u0000\u000078\u0005o\u0000\u000089\u0005r\u0000\u00009\f\u0001\u0000"+
		"\u0000\u0000:;\u0005-\u0000\u0000;<\u0005>\u0000\u0000<\u000e\u0001\u0000"+
		"\u0000\u0000=>\u0005=\u0000\u0000>\u0010\u0001\u0000\u0000\u0000?@\u0005"+
		":\u0000\u0000@\u0012\u0001\u0000\u0000\u0000AB\u0005;\u0000\u0000B\u0014"+
		"\u0001\u0000\u0000\u0000CD\u0005(\u0000\u0000D\u0016\u0001\u0000\u0000"+
		"\u0000EF\u0005)\u0000\u0000F\u0018\u0001\u0000\u0000\u0000GH\u0005{\u0000"+
		"\u0000H\u001a\u0001\u0000\u0000\u0000IJ\u0005}\u0000\u0000J\u001c\u0001"+
		"\u0000\u0000\u0000KO\u0007\u0000\u0000\u0000LN\u0007\u0001\u0000\u0000"+
		"ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000P\u001e\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000RT\u0007\u0002\u0000\u0000SR\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000VW\u0001\u0000\u0000\u0000WX\u0006\u000f\u0000\u0000X \u0001\u0000"+
		"\u0000\u0000\u0003\u0000OU\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}