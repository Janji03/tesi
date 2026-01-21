// Generated from c:/Users/gianl/Documents/GitHub/tesi/toy-choreo/grammar/ToyChoreo.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ToyChoreoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, SEND=2, IF=3, ELSE=4, RACE=5, OR=6, ARROW=7, ASSIGN=8, COLON=9, 
		SEMI=10, LPAREN=11, RPAREN=12, LBRACE=13, RBRACE=14, ID=15, WS=16;
	public static final int
		RULE_program = 0, RULE_stmt = 1, RULE_letStmt = 2, RULE_sendStmt = 3, 
		RULE_ifStmt = 4, RULE_raceStmt = 5, RULE_block = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmt", "letStmt", "sendStmt", "ifStmt", "raceStmt", "block"
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

	@Override
	public String getGrammarFileName() { return "ToyChoreo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ToyChoreoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ToyChoreoParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 46L) != 0)) {
				{
				{
				setState(14);
				stmt();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public LetStmtContext letStmt() {
			return getRuleContext(LetStmtContext.class,0);
		}
		public SendStmtContext sendStmt() {
			return getRuleContext(SendStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public RaceStmtContext raceStmt() {
			return getRuleContext(RaceStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(26);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				letStmt();
				}
				break;
			case SEND:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				sendStmt();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(24);
				ifStmt();
				}
				break;
			case RACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(25);
				raceStmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LetStmtContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(ToyChoreoParser.LET, 0); }
		public List<TerminalNode> ID() { return getTokens(ToyChoreoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ToyChoreoParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(ToyChoreoParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(ToyChoreoParser.SEMI, 0); }
		public LetStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letStmt; }
	}

	public final LetStmtContext letStmt() throws RecognitionException {
		LetStmtContext _localctx = new LetStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_letStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(LET);
			setState(29);
			match(ID);
			setState(30);
			match(ASSIGN);
			setState(31);
			match(ID);
			setState(32);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SendStmtContext extends ParserRuleContext {
		public TerminalNode SEND() { return getToken(ToyChoreoParser.SEND, 0); }
		public List<TerminalNode> ID() { return getTokens(ToyChoreoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ToyChoreoParser.ID, i);
		}
		public TerminalNode ARROW() { return getToken(ToyChoreoParser.ARROW, 0); }
		public TerminalNode COLON() { return getToken(ToyChoreoParser.COLON, 0); }
		public TerminalNode SEMI() { return getToken(ToyChoreoParser.SEMI, 0); }
		public SendStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sendStmt; }
	}

	public final SendStmtContext sendStmt() throws RecognitionException {
		SendStmtContext _localctx = new SendStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sendStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(SEND);
			setState(35);
			match(ID);
			setState(36);
			match(ARROW);
			setState(37);
			match(ID);
			setState(38);
			match(COLON);
			setState(39);
			match(ID);
			setState(40);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ToyChoreoParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(ToyChoreoParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(ToyChoreoParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(ToyChoreoParser.RPAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ToyChoreoParser.ELSE, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(IF);
			setState(43);
			match(LPAREN);
			setState(44);
			match(ID);
			setState(45);
			match(RPAREN);
			setState(46);
			block();
			setState(47);
			match(ELSE);
			setState(48);
			block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RaceStmtContext extends ParserRuleContext {
		public TerminalNode RACE() { return getToken(ToyChoreoParser.RACE, 0); }
		public TerminalNode ID() { return getToken(ToyChoreoParser.ID, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode OR() { return getToken(ToyChoreoParser.OR, 0); }
		public TerminalNode SEMI() { return getToken(ToyChoreoParser.SEMI, 0); }
		public RaceStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raceStmt; }
	}

	public final RaceStmtContext raceStmt() throws RecognitionException {
		RaceStmtContext _localctx = new RaceStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_raceStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(RACE);
			setState(51);
			match(ID);
			setState(52);
			block();
			setState(53);
			match(OR);
			setState(54);
			block();
			setState(55);
			match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ToyChoreoParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ToyChoreoParser.RBRACE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(LBRACE);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 46L) != 0)) {
				{
				{
				setState(58);
				stmt();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(RBRACE);
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
		"\u0004\u0001\u0010C\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0005\u0000\u0010"+
		"\b\u0000\n\u0000\f\u0000\u0013\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001b\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0005\u0006<\b\u0006\n\u0006\f\u0006?\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0000\u0000\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0000"+
		"@\u0000\u0011\u0001\u0000\u0000\u0000\u0002\u001a\u0001\u0000\u0000\u0000"+
		"\u0004\u001c\u0001\u0000\u0000\u0000\u0006\"\u0001\u0000\u0000\u0000\b"+
		"*\u0001\u0000\u0000\u0000\n2\u0001\u0000\u0000\u0000\f9\u0001\u0000\u0000"+
		"\u0000\u000e\u0010\u0003\u0002\u0001\u0000\u000f\u000e\u0001\u0000\u0000"+
		"\u0000\u0010\u0013\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000"+
		"\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0014\u0001\u0000\u0000"+
		"\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0000\u0000"+
		"\u0001\u0015\u0001\u0001\u0000\u0000\u0000\u0016\u001b\u0003\u0004\u0002"+
		"\u0000\u0017\u001b\u0003\u0006\u0003\u0000\u0018\u001b\u0003\b\u0004\u0000"+
		"\u0019\u001b\u0003\n\u0005\u0000\u001a\u0016\u0001\u0000\u0000\u0000\u001a"+
		"\u0017\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a"+
		"\u0019\u0001\u0000\u0000\u0000\u001b\u0003\u0001\u0000\u0000\u0000\u001c"+
		"\u001d\u0005\u0001\u0000\u0000\u001d\u001e\u0005\u000f\u0000\u0000\u001e"+
		"\u001f\u0005\b\u0000\u0000\u001f \u0005\u000f\u0000\u0000 !\u0005\n\u0000"+
		"\u0000!\u0005\u0001\u0000\u0000\u0000\"#\u0005\u0002\u0000\u0000#$\u0005"+
		"\u000f\u0000\u0000$%\u0005\u0007\u0000\u0000%&\u0005\u000f\u0000\u0000"+
		"&\'\u0005\t\u0000\u0000\'(\u0005\u000f\u0000\u0000()\u0005\n\u0000\u0000"+
		")\u0007\u0001\u0000\u0000\u0000*+\u0005\u0003\u0000\u0000+,\u0005\u000b"+
		"\u0000\u0000,-\u0005\u000f\u0000\u0000-.\u0005\f\u0000\u0000./\u0003\f"+
		"\u0006\u0000/0\u0005\u0004\u0000\u000001\u0003\f\u0006\u00001\t\u0001"+
		"\u0000\u0000\u000023\u0005\u0005\u0000\u000034\u0005\u000f\u0000\u0000"+
		"45\u0003\f\u0006\u000056\u0005\u0006\u0000\u000067\u0003\f\u0006\u0000"+
		"78\u0005\n\u0000\u00008\u000b\u0001\u0000\u0000\u00009=\u0005\r\u0000"+
		"\u0000:<\u0003\u0002\u0001\u0000;:\u0001\u0000\u0000\u0000<?\u0001\u0000"+
		"\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>@\u0001"+
		"\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@A\u0005\u000e\u0000\u0000"+
		"A\r\u0001\u0000\u0000\u0000\u0003\u0011\u001a=";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}