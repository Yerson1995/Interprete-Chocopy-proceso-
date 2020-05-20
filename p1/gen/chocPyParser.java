// Generated from C:/Users/Home/IdeaProjects/p1/grammar\chocPy.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class chocPyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, RETURN=2, TK_PAR_IZQ=3, TK_PAR_DER=4, TK_EJECUTA=5, TK_DOS_PUNTOS=6, 
		CLASS=7, INT=8, TK_ASIG=9, STR=10, BOOL=11, OBJECT=12, PRINT=13, TK_SQR_IZQ=14, 
		TK_SQR_DER=15, TK_COMA=16, LEN=17, TRUE=18, FALSE=19, SELF=20, IF=21, 
		ELSE=22, TK_PUNTO=23, GLOBAL=24, NONLOCAL=25, INIT=26, NONE=27, MINUS_OP=28, 
		MULT_OP=29, DIV_OP=30, MOD_OP=31, NOT=32, OR=33, AND=34, NOT_EQUAL=35, 
		PLUS_OP=36, TK_COR_IZQ=37, TK_COR_DER=38, PASS=39, TK_COM=40, CONTINUE=41, 
		EXCEPT=42, FINALLY=43, BREAK=44, FOR=45, FROM=46, IMPORT=47, IN=48, IS=49, 
		LAMBDA=50, RAISE=51, TRY=52, WHILE=53, AS=54, DEL=55, ELIF=56, ASSERT=57, 
		MINOR_EQUAL=58, MAYOR_EQUAL=59, EQUAL=60, MAYOR=61, MINOR=62, WITH=63, 
		SKIP_=64, IDENTIFIER=65, TK_ENTERO=66, STRING=67, IDSTRING=68, NEWLINE=69, 
		INDENT=70, DEDENT=71;
	public static final int
		RULE_program = 0, RULE_class_def = 1, RULE_class_body = 2, RULE_func_def = 3, 
		RULE_metd_def = 4, RULE_func_body = 5, RULE_typed_var = 6, RULE_type = 7, 
		RULE_global_decl = 8, RULE_nonlocal_decl = 9, RULE_var_def = 10, RULE_stmt = 11, 
		RULE_simple_stmt = 12, RULE_block = 13, RULE_literal = 14, RULE_expr = 15, 
		RULE_cexpr = 16, RULE_multdiv = 17, RULE_logop = 18, RULE_bin_op = 19, 
		RULE_target = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class_def", "class_body", "func_def", "metd_def", "func_body", 
			"typed_var", "type", "global_decl", "nonlocal_decl", "var_def", "stmt", 
			"simple_stmt", "block", "literal", "expr", "cexpr", "multdiv", "logop", 
			"bin_op", "target"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'return'", "'('", "')'", "'->'", "':'", "'class'", "'int'", 
			"'='", "'str'", "'bool'", "'object'", "'print'", "'['", "']'", "','", 
			"'len'", "'True'", "'False'", "'self'", "'if'", "'else'", "'.'", "'global'", 
			"'nonlocal'", "'__init__'", "'None'", "'-'", "'*'", "'//'", "'%'", "'not'", 
			"'or'", "'and'", "'!='", "'+'", "'{'", "'}'", "'pass'", "'#'", "'continue'", 
			"'except'", "'finally'", "'break'", "'for'", "'from'", "'import'", "'in'", 
			"'is'", "'lambda'", "'raise'", "'try'", "'while'", "'as'", "'del'", "'elif'", 
			"'assert'", "'<='", "'>='", "'=='", "'>'", "'<'", "'with'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "RETURN", "TK_PAR_IZQ", "TK_PAR_DER", "TK_EJECUTA", "TK_DOS_PUNTOS", 
			"CLASS", "INT", "TK_ASIG", "STR", "BOOL", "OBJECT", "PRINT", "TK_SQR_IZQ", 
			"TK_SQR_DER", "TK_COMA", "LEN", "TRUE", "FALSE", "SELF", "IF", "ELSE", 
			"TK_PUNTO", "GLOBAL", "NONLOCAL", "INIT", "NONE", "MINUS_OP", "MULT_OP", 
			"DIV_OP", "MOD_OP", "NOT", "OR", "AND", "NOT_EQUAL", "PLUS_OP", "TK_COR_IZQ", 
			"TK_COR_DER", "PASS", "TK_COM", "CONTINUE", "EXCEPT", "FINALLY", "BREAK", 
			"FOR", "FROM", "IMPORT", "IN", "IS", "LAMBDA", "RAISE", "TRY", "WHILE", 
			"AS", "DEL", "ELIF", "ASSERT", "MINOR_EQUAL", "MAYOR_EQUAL", "EQUAL", 
			"MAYOR", "MINOR", "WITH", "SKIP_", "IDENTIFIER", "TK_ENTERO", "STRING", 
			"IDSTRING", "NEWLINE", "INDENT", "DEDENT"
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
	public String getGrammarFileName() { return "chocPy.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public chocPyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(chocPyParser.EOF, 0); }
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<Func_defContext> func_def() {
			return getRuleContexts(Func_defContext.class);
		}
		public Func_defContext func_def(int i) {
			return getRuleContext(Func_defContext.class,i);
		}
		public List<Class_defContext> class_def() {
			return getRuleContexts(Class_defContext.class);
		}
		public Class_defContext class_def(int i) {
			return getRuleContext(Class_defContext.class,i);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(45);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(42);
						var_def();
						}
						break;
					case DEF:
						{
						setState(43);
						func_def();
						}
						break;
					case CLASS:
						{
						setState(44);
						class_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << TK_PAR_IZQ) | (1L << PRINT) | (1L << TK_SQR_IZQ) | (1L << LEN) | (1L << TRUE) | (1L << FALSE) | (1L << SELF) | (1L << IF) | (1L << NONE) | (1L << MINUS_OP) | (1L << NOT) | (1L << PASS) | (1L << FOR) | (1L << WHILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IDENTIFIER - 65)) | (1L << (TK_ENTERO - 65)) | (1L << (STRING - 65)) | (1L << (IDSTRING - 65)))) != 0)) {
				{
				{
				setState(50);
				stmt();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
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

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(chocPyParser.CLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(chocPyParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(chocPyParser.IDENTIFIER, i);
		}
		public TerminalNode TK_PAR_IZQ() { return getToken(chocPyParser.TK_PAR_IZQ, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(chocPyParser.TK_PAR_DER, 0); }
		public TerminalNode TK_DOS_PUNTOS() { return getToken(chocPyParser.TK_DOS_PUNTOS, 0); }
		public TerminalNode NEWLINE() { return getToken(chocPyParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(chocPyParser.INDENT, 0); }
		public Class_bodyContext class_body() {
			return getRuleContext(Class_bodyContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(chocPyParser.DEDENT, 0); }
		public TerminalNode OBJECT() { return getToken(chocPyParser.OBJECT, 0); }
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitClass_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitClass_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(CLASS);
			setState(59);
			match(IDENTIFIER);
			setState(60);
			match(TK_PAR_IZQ);
			setState(61);
			_la = _input.LA(1);
			if ( !(_la==OBJECT || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(62);
			match(TK_PAR_DER);
			setState(63);
			match(TK_DOS_PUNTOS);
			setState(64);
			match(NEWLINE);
			setState(65);
			match(INDENT);
			setState(66);
			class_body();
			setState(67);
			match(DEDENT);
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

	public static class Class_bodyContext extends ParserRuleContext {
		public Class_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_body; }
	 
		public Class_bodyContext() { }
		public void copyFrom(Class_bodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Class_bodydefinicionContext extends Class_bodyContext {
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<Metd_defContext> metd_def() {
			return getRuleContexts(Metd_defContext.class);
		}
		public Metd_defContext metd_def(int i) {
			return getRuleContext(Metd_defContext.class,i);
		}
		public Class_bodydefinicionContext(Class_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterClass_bodydefinicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitClass_bodydefinicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitClass_bodydefinicion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Class_bodypassContext extends Class_bodyContext {
		public TerminalNode PASS() { return getToken(chocPyParser.PASS, 0); }
		public TerminalNode NEWLINE() { return getToken(chocPyParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(chocPyParser.EOF, 0); }
		public Class_bodypassContext(Class_bodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterClass_bodypass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitClass_bodypass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitClass_bodypass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_bodyContext class_body() throws RecognitionException {
		Class_bodyContext _localctx = new Class_bodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_class_body);
		int _la;
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PASS:
				_localctx = new Class_bodypassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(PASS);
				setState(70);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DEF:
			case IDENTIFIER:
				_localctx = new Class_bodydefinicionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(73);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case IDENTIFIER:
						{
						setState(71);
						var_def();
						}
						break;
					case DEF:
						{
						setState(72);
						metd_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(75); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DEF || _la==IDENTIFIER );
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

	public static class Func_defContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(chocPyParser.DEF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(chocPyParser.IDENTIFIER, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(chocPyParser.TK_PAR_IZQ, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(chocPyParser.TK_PAR_DER, 0); }
		public TerminalNode TK_DOS_PUNTOS() { return getToken(chocPyParser.TK_DOS_PUNTOS, 0); }
		public TerminalNode NEWLINE() { return getToken(chocPyParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(chocPyParser.INDENT, 0); }
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(chocPyParser.DEDENT, 0); }
		public List<Typed_varContext> typed_var() {
			return getRuleContexts(Typed_varContext.class);
		}
		public Typed_varContext typed_var(int i) {
			return getRuleContext(Typed_varContext.class,i);
		}
		public TerminalNode TK_EJECUTA() { return getToken(chocPyParser.TK_EJECUTA, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(chocPyParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(chocPyParser.TK_COMA, i);
		}
		public Func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitFunc_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitFunc_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defContext func_def() throws RecognitionException {
		Func_defContext _localctx = new Func_defContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(DEF);
			setState(80);
			match(IDENTIFIER);
			setState(81);
			match(TK_PAR_IZQ);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(82);
				typed_var();
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TK_COMA) {
					{
					{
					setState(83);
					match(TK_COMA);
					setState(84);
					typed_var();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(92);
			match(TK_PAR_DER);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EJECUTA) {
				{
				setState(93);
				match(TK_EJECUTA);
				setState(94);
				type();
				}
			}

			setState(97);
			match(TK_DOS_PUNTOS);
			setState(98);
			match(NEWLINE);
			setState(99);
			match(INDENT);
			setState(100);
			func_body();
			setState(101);
			match(DEDENT);
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

	public static class Metd_defContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(chocPyParser.DEF, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(chocPyParser.TK_PAR_IZQ, 0); }
		public TerminalNode SELF() { return getToken(chocPyParser.SELF, 0); }
		public List<TerminalNode> TK_DOS_PUNTOS() { return getTokens(chocPyParser.TK_DOS_PUNTOS); }
		public TerminalNode TK_DOS_PUNTOS(int i) {
			return getToken(chocPyParser.TK_DOS_PUNTOS, i);
		}
		public TerminalNode STRING() { return getToken(chocPyParser.STRING, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(chocPyParser.TK_PAR_DER, 0); }
		public TerminalNode NEWLINE() { return getToken(chocPyParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(chocPyParser.INDENT, 0); }
		public Func_bodyContext func_body() {
			return getRuleContext(Func_bodyContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(chocPyParser.DEDENT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(chocPyParser.IDENTIFIER, 0); }
		public TerminalNode INIT() { return getToken(chocPyParser.INIT, 0); }
		public List<TerminalNode> TK_COMA() { return getTokens(chocPyParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(chocPyParser.TK_COMA, i);
		}
		public List<Typed_varContext> typed_var() {
			return getRuleContexts(Typed_varContext.class);
		}
		public Typed_varContext typed_var(int i) {
			return getRuleContext(Typed_varContext.class,i);
		}
		public TerminalNode TK_EJECUTA() { return getToken(chocPyParser.TK_EJECUTA, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Metd_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metd_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterMetd_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitMetd_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitMetd_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Metd_defContext metd_def() throws RecognitionException {
		Metd_defContext _localctx = new Metd_defContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_metd_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(DEF);
			setState(104);
			_la = _input.LA(1);
			if ( !(_la==INIT || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(105);
			match(TK_PAR_IZQ);
			setState(106);
			match(SELF);
			setState(107);
			match(TK_DOS_PUNTOS);
			setState(108);
			match(STRING);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(109);
				match(TK_COMA);
				setState(110);
				typed_var();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116);
			match(TK_PAR_DER);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TK_EJECUTA) {
				{
				setState(117);
				match(TK_EJECUTA);
				setState(118);
				type();
				}
			}

			setState(121);
			match(TK_DOS_PUNTOS);
			setState(122);
			match(NEWLINE);
			setState(123);
			match(INDENT);
			setState(124);
			func_body();
			setState(125);
			match(DEDENT);
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

	public static class Func_bodyContext extends ParserRuleContext {
		public List<Global_declContext> global_decl() {
			return getRuleContexts(Global_declContext.class);
		}
		public Global_declContext global_decl(int i) {
			return getRuleContext(Global_declContext.class,i);
		}
		public List<Nonlocal_declContext> nonlocal_decl() {
			return getRuleContexts(Nonlocal_declContext.class);
		}
		public Nonlocal_declContext nonlocal_decl(int i) {
			return getRuleContext(Nonlocal_declContext.class,i);
		}
		public List<Var_defContext> var_def() {
			return getRuleContexts(Var_defContext.class);
		}
		public Var_defContext var_def(int i) {
			return getRuleContext(Var_defContext.class,i);
		}
		public List<Func_defContext> func_def() {
			return getRuleContexts(Func_defContext.class);
		}
		public Func_defContext func_def(int i) {
			return getRuleContext(Func_defContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterFunc_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitFunc_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitFunc_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_bodyContext func_body() throws RecognitionException {
		Func_bodyContext _localctx = new Func_bodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(131);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case GLOBAL:
						{
						setState(127);
						global_decl();
						}
						break;
					case NONLOCAL:
						{
						setState(128);
						nonlocal_decl();
						}
						break;
					case IDENTIFIER:
						{
						setState(129);
						var_def();
						}
						break;
					case DEF:
						{
						setState(130);
						func_def();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136);
				stmt();
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << TK_PAR_IZQ) | (1L << PRINT) | (1L << TK_SQR_IZQ) | (1L << LEN) | (1L << TRUE) | (1L << FALSE) | (1L << SELF) | (1L << IF) | (1L << NONE) | (1L << MINUS_OP) | (1L << NOT) | (1L << PASS) | (1L << FOR) | (1L << WHILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IDENTIFIER - 65)) | (1L << (TK_ENTERO - 65)) | (1L << (STRING - 65)) | (1L << (IDSTRING - 65)))) != 0) );
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

	public static class Typed_varContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(chocPyParser.IDENTIFIER, 0); }
		public TerminalNode TK_DOS_PUNTOS() { return getToken(chocPyParser.TK_DOS_PUNTOS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Typed_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typed_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterTyped_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitTyped_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitTyped_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Typed_varContext typed_var() throws RecognitionException {
		Typed_varContext _localctx = new Typed_varContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typed_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(IDENTIFIER);
			setState(142);
			match(TK_DOS_PUNTOS);
			setState(143);
			type();
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeStrContext extends TypeContext {
		public TerminalNode STR() { return getToken(chocPyParser.STR, 0); }
		public TypeStrContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterTypeStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitTypeStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitTypeStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeAnidadoContext extends TypeContext {
		public TerminalNode TK_SQR_IZQ() { return getToken(chocPyParser.TK_SQR_IZQ, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TK_SQR_DER() { return getToken(chocPyParser.TK_SQR_DER, 0); }
		public TypeAnidadoContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterTypeAnidado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitTypeAnidado(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitTypeAnidado(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeObjectContext extends TypeContext {
		public TerminalNode OBJECT() { return getToken(chocPyParser.OBJECT, 0); }
		public TypeObjectContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterTypeObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitTypeObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitTypeObject(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeidContext extends TypeContext {
		public TerminalNode IDENTIFIER() { return getToken(chocPyParser.IDENTIFIER, 0); }
		public TypeidContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterTypeid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitTypeid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitTypeid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipeIntContext extends TypeContext {
		public TerminalNode INT() { return getToken(chocPyParser.INT, 0); }
		public TipeIntContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterTipeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitTipeInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitTipeInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeBoolContext extends TypeContext {
		public TerminalNode BOOL() { return getToken(chocPyParser.BOOL, 0); }
		public TypeBoolContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterTypeBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitTypeBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitTypeBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeidstringContext extends TypeContext {
		public TerminalNode IDSTRING() { return getToken(chocPyParser.IDSTRING, 0); }
		public TypeidstringContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterTypeidstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitTypeidstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitTypeidstring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new TypeidContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(IDENTIFIER);
				}
				break;
			case IDSTRING:
				_localctx = new TypeidstringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(IDSTRING);
				}
				break;
			case INT:
				_localctx = new TipeIntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(INT);
				}
				break;
			case STR:
				_localctx = new TypeStrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				match(STR);
				}
				break;
			case BOOL:
				_localctx = new TypeBoolContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				match(BOOL);
				}
				break;
			case OBJECT:
				_localctx = new TypeObjectContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(150);
				match(OBJECT);
				}
				break;
			case TK_SQR_IZQ:
				_localctx = new TypeAnidadoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(151);
				match(TK_SQR_IZQ);
				setState(152);
				type();
				setState(153);
				match(TK_SQR_DER);
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

	public static class Global_declContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(chocPyParser.GLOBAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(chocPyParser.IDENTIFIER, 0); }
		public TerminalNode NEWLINE() { return getToken(chocPyParser.NEWLINE, 0); }
		public Global_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterGlobal_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitGlobal_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitGlobal_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_declContext global_decl() throws RecognitionException {
		Global_declContext _localctx = new Global_declContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_global_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(GLOBAL);
			setState(158);
			match(IDENTIFIER);
			setState(159);
			match(NEWLINE);
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

	public static class Nonlocal_declContext extends ParserRuleContext {
		public TerminalNode NONLOCAL() { return getToken(chocPyParser.NONLOCAL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(chocPyParser.IDENTIFIER, 0); }
		public TerminalNode NEWLINE() { return getToken(chocPyParser.NEWLINE, 0); }
		public Nonlocal_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonlocal_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterNonlocal_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitNonlocal_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitNonlocal_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nonlocal_declContext nonlocal_decl() throws RecognitionException {
		Nonlocal_declContext _localctx = new Nonlocal_declContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nonlocal_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(NONLOCAL);
			setState(162);
			match(IDENTIFIER);
			setState(163);
			match(NEWLINE);
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

	public static class Var_defContext extends ParserRuleContext {
		public Typed_varContext typed_var() {
			return getRuleContext(Typed_varContext.class,0);
		}
		public TerminalNode TK_ASIG() { return getToken(chocPyParser.TK_ASIG, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(chocPyParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(chocPyParser.EOF, 0); }
		public Var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterVar_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitVar_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitVar_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_defContext var_def() throws RecognitionException {
		Var_defContext _localctx = new Var_defContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			typed_var();
			setState(166);
			match(TK_ASIG);
			setState(167);
			literal();
			setState(168);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NEWLINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtsimpleContext extends StmtContext {
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(chocPyParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(chocPyParser.EOF, 0); }
		public StmtsimpleContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterStmtsimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitStmtsimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitStmtsimple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtwhileContext extends StmtContext {
		public TerminalNode WHILE() { return getToken(chocPyParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_DOS_PUNTOS() { return getToken(chocPyParser.TK_DOS_PUNTOS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StmtwhileContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterStmtwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitStmtwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitStmtwhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtforContext extends StmtContext {
		public TerminalNode FOR() { return getToken(chocPyParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(chocPyParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(chocPyParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_DOS_PUNTOS() { return getToken(chocPyParser.TK_DOS_PUNTOS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StmtforContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterStmtfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitStmtfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitStmtfor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtifContext extends StmtContext {
		public TerminalNode IF() { return getToken(chocPyParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TK_DOS_PUNTOS() { return getTokens(chocPyParser.TK_DOS_PUNTOS); }
		public TerminalNode TK_DOS_PUNTOS(int i) {
			return getToken(chocPyParser.TK_DOS_PUNTOS, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(chocPyParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(chocPyParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(chocPyParser.ELSE, 0); }
		public StmtifContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterStmtif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitStmtif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitStmtif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stmt);
		int _la;
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case TK_PAR_IZQ:
			case PRINT:
			case TK_SQR_IZQ:
			case LEN:
			case TRUE:
			case FALSE:
			case SELF:
			case NONE:
			case MINUS_OP:
			case NOT:
			case PASS:
			case IDENTIFIER:
			case TK_ENTERO:
			case STRING:
			case IDSTRING:
				_localctx = new StmtsimpleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				simple_stmt();
				setState(171);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case IF:
				_localctx = new StmtifContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(IF);
				setState(174);
				expr(0);
				setState(175);
				match(TK_DOS_PUNTOS);
				setState(176);
				block();
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELIF) {
					{
					{
					setState(177);
					match(ELIF);
					setState(178);
					expr(0);
					setState(179);
					match(TK_DOS_PUNTOS);
					setState(180);
					block();
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(187);
					match(ELSE);
					setState(188);
					match(TK_DOS_PUNTOS);
					setState(189);
					block();
					}
				}

				}
				break;
			case WHILE:
				_localctx = new StmtwhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				match(WHILE);
				setState(193);
				expr(0);
				setState(194);
				match(TK_DOS_PUNTOS);
				setState(195);
				block();
				}
				break;
			case FOR:
				_localctx = new StmtforContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(197);
				match(FOR);
				setState(198);
				match(IDENTIFIER);
				setState(199);
				match(IN);
				setState(200);
				expr(0);
				setState(201);
				match(TK_DOS_PUNTOS);
				setState(202);
				block();
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

	public static class Simple_stmtContext extends ParserRuleContext {
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
	 
		public Simple_stmtContext() { }
		public void copyFrom(Simple_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimplestmtpassContext extends Simple_stmtContext {
		public TerminalNode PASS() { return getToken(chocPyParser.PASS, 0); }
		public SimplestmtpassContext(Simple_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterSimplestmtpass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitSimplestmtpass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitSimplestmtpass(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimplestmtexprContext extends Simple_stmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SimplestmtexprContext(Simple_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterSimplestmtexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitSimplestmtexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitSimplestmtexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimplestmtprintContext extends Simple_stmtContext {
		public TerminalNode PRINT() { return getToken(chocPyParser.PRINT, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(chocPyParser.TK_PAR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(chocPyParser.TK_PAR_DER, 0); }
		public SimplestmtprintContext(Simple_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterSimplestmtprint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitSimplestmtprint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitSimplestmtprint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimplestmtreturnContext extends Simple_stmtContext {
		public TerminalNode RETURN() { return getToken(chocPyParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SimplestmtreturnContext(Simple_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterSimplestmtreturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitSimplestmtreturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitSimplestmtreturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimplestmtasignacionContext extends Simple_stmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TargetContext> target() {
			return getRuleContexts(TargetContext.class);
		}
		public TargetContext target(int i) {
			return getRuleContext(TargetContext.class,i);
		}
		public List<TerminalNode> TK_ASIG() { return getTokens(chocPyParser.TK_ASIG); }
		public TerminalNode TK_ASIG(int i) {
			return getToken(chocPyParser.TK_ASIG, i);
		}
		public SimplestmtasignacionContext(Simple_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterSimplestmtasignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitSimplestmtasignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitSimplestmtasignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simple_stmt);
		int _la;
		try {
			int _alt;
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new SimplestmtpassContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(PASS);
				}
				break;
			case 2:
				_localctx = new SimplestmtexprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				expr(0);
				}
				break;
			case 3:
				_localctx = new SimplestmtreturnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(208);
				match(RETURN);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PAR_IZQ) | (1L << TK_SQR_IZQ) | (1L << LEN) | (1L << TRUE) | (1L << FALSE) | (1L << SELF) | (1L << NONE) | (1L << MINUS_OP) | (1L << NOT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IDENTIFIER - 65)) | (1L << (TK_ENTERO - 65)) | (1L << (STRING - 65)) | (1L << (IDSTRING - 65)))) != 0)) {
					{
					setState(209);
					expr(0);
					}
				}

				}
				break;
			case 4:
				_localctx = new SimplestmtasignacionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(215); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(212);
						target();
						setState(213);
						match(TK_ASIG);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(217); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(219);
				expr(0);
				}
				break;
			case 5:
				_localctx = new SimplestmtprintContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
				match(PRINT);
				setState(222);
				match(TK_PAR_IZQ);
				setState(223);
				expr(0);
				setState(224);
				match(TK_PAR_DER);
				}
				break;
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(chocPyParser.NEWLINE, 0); }
		public TerminalNode INDENT() { return getToken(chocPyParser.INDENT, 0); }
		public TerminalNode DEDENT() { return getToken(chocPyParser.DEDENT, 0); }
		public TerminalNode EOF() { return getToken(chocPyParser.EOF, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(NEWLINE);
			setState(229);
			match(INDENT);
			setState(231); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(230);
				stmt();
				}
				}
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << TK_PAR_IZQ) | (1L << PRINT) | (1L << TK_SQR_IZQ) | (1L << LEN) | (1L << TRUE) | (1L << FALSE) | (1L << SELF) | (1L << IF) | (1L << NONE) | (1L << MINUS_OP) | (1L << NOT) | (1L << PASS) | (1L << FOR) | (1L << WHILE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IDENTIFIER - 65)) | (1L << (TK_ENTERO - 65)) | (1L << (STRING - 65)) | (1L << (IDSTRING - 65)))) != 0) );
			setState(235);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==DEDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LiteralstringContext extends LiteralContext {
		public TerminalNode STRING() { return getToken(chocPyParser.STRING, 0); }
		public LiteralstringContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterLiteralstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitLiteralstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitLiteralstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralnoneContext extends LiteralContext {
		public TerminalNode NONE() { return getToken(chocPyParser.NONE, 0); }
		public LiteralnoneContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterLiteralnone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitLiteralnone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitLiteralnone(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteraltrueContext extends LiteralContext {
		public TerminalNode TRUE() { return getToken(chocPyParser.TRUE, 0); }
		public LiteraltrueContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterLiteraltrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitLiteraltrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitLiteraltrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Literaltk_enteroContext extends LiteralContext {
		public TerminalNode TK_ENTERO() { return getToken(chocPyParser.TK_ENTERO, 0); }
		public Literaltk_enteroContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterLiteraltk_entero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitLiteraltk_entero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitLiteraltk_entero(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralfalseContext extends LiteralContext {
		public TerminalNode FALSE() { return getToken(chocPyParser.FALSE, 0); }
		public LiteralfalseContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterLiteralfalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitLiteralfalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitLiteralfalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralidstringContext extends LiteralContext {
		public TerminalNode IDSTRING() { return getToken(chocPyParser.IDSTRING, 0); }
		public LiteralidstringContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterLiteralidstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitLiteralidstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitLiteralidstring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_literal);
		try {
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONE:
				_localctx = new LiteralnoneContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(NONE);
				}
				break;
			case TRUE:
				_localctx = new LiteraltrueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new LiteralfalseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				match(FALSE);
				}
				break;
			case TK_ENTERO:
				_localctx = new Literaltk_enteroContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				match(TK_ENTERO);
				}
				break;
			case IDSTRING:
				_localctx = new LiteralidstringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(241);
				match(IDSTRING);
				}
				break;
			case STRING:
				_localctx = new LiteralstringContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(242);
				match(STRING);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprcexprContext extends ExprContext {
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
		}
		public ExprcexprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterExprcexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitExprcexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitExprcexpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprnotContext extends ExprContext {
		public TerminalNode NOT() { return getToken(chocPyParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprnotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterExprnot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitExprnot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitExprnot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprexprcondContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IF() { return getToken(chocPyParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(chocPyParser.ELSE, 0); }
		public ExprexprcondContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterExprexprcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitExprexprcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitExprexprcond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprandorContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(chocPyParser.AND, 0); }
		public TerminalNode OR() { return getToken(chocPyParser.OR, 0); }
		public ExprandorContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterExprandor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitExprandor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitExprandor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_PAR_IZQ:
			case TK_SQR_IZQ:
			case LEN:
			case TRUE:
			case FALSE:
			case SELF:
			case NONE:
			case MINUS_OP:
			case IDENTIFIER:
			case TK_ENTERO:
			case STRING:
			case IDSTRING:
				{
				_localctx = new ExprcexprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(246);
				cexpr(0);
				}
				break;
			case NOT:
				{
				_localctx = new ExprnotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(247);
				match(NOT);
				setState(248);
				expr(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(260);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExprandorContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(251);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(252);
						_la = _input.LA(1);
						if ( !(_la==OR || _la==AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(253);
						expr(3);
						}
						break;
					case 2:
						{
						_localctx = new ExprexprcondContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(254);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(255);
						match(IF);
						setState(256);
						expr(0);
						setState(257);
						match(ELSE);
						setState(258);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CexprContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(chocPyParser.IDENTIFIER, 0); }
		public TerminalNode SELF() { return getToken(chocPyParser.SELF, 0); }
		public TerminalNode TK_PUNTO() { return getToken(chocPyParser.TK_PUNTO, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode TK_SQR_IZQ() { return getToken(chocPyParser.TK_SQR_IZQ, 0); }
		public TerminalNode TK_SQR_DER() { return getToken(chocPyParser.TK_SQR_DER, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(chocPyParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(chocPyParser.TK_COMA, i);
		}
		public TerminalNode TK_PAR_IZQ() { return getToken(chocPyParser.TK_PAR_IZQ, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(chocPyParser.TK_PAR_DER, 0); }
		public TerminalNode MINUS_OP() { return getToken(chocPyParser.MINUS_OP, 0); }
		public List<CexprContext> cexpr() {
			return getRuleContexts(CexprContext.class);
		}
		public CexprContext cexpr(int i) {
			return getRuleContext(CexprContext.class,i);
		}
		public TerminalNode LEN() { return getToken(chocPyParser.LEN, 0); }
		public TerminalNode STRING() { return getToken(chocPyParser.STRING, 0); }
		public TerminalNode IDSTRING() { return getToken(chocPyParser.IDSTRING, 0); }
		public LogopContext logop() {
			return getRuleContext(LogopContext.class,0);
		}
		public MultdivContext multdiv() {
			return getRuleContext(MultdivContext.class,0);
		}
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public CexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterCexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitCexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitCexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CexprContext cexpr() throws RecognitionException {
		return cexpr(0);
	}

	private CexprContext cexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CexprContext _localctx = new CexprContext(_ctx, _parentState);
		CexprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_cexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(266);
				match(IDENTIFIER);
				}
				break;
			case 2:
				{
				setState(267);
				match(SELF);
				setState(268);
				match(TK_PUNTO);
				setState(269);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(270);
				literal();
				}
				break;
			case 4:
				{
				setState(271);
				match(TK_SQR_IZQ);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PAR_IZQ) | (1L << TK_SQR_IZQ) | (1L << LEN) | (1L << TRUE) | (1L << FALSE) | (1L << SELF) | (1L << NONE) | (1L << MINUS_OP) | (1L << NOT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IDENTIFIER - 65)) | (1L << (TK_ENTERO - 65)) | (1L << (STRING - 65)) | (1L << (IDSTRING - 65)))) != 0)) {
					{
					setState(272);
					expr(0);
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TK_COMA) {
						{
						{
						setState(273);
						match(TK_COMA);
						setState(274);
						expr(0);
						}
						}
						setState(279);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(282);
				match(TK_SQR_DER);
				}
				break;
			case 5:
				{
				setState(283);
				match(TK_PAR_IZQ);
				setState(284);
				expr(0);
				setState(285);
				match(TK_PAR_DER);
				}
				break;
			case 6:
				{
				setState(287);
				match(IDENTIFIER);
				setState(288);
				match(TK_PAR_IZQ);
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PAR_IZQ) | (1L << TK_SQR_IZQ) | (1L << LEN) | (1L << TRUE) | (1L << FALSE) | (1L << SELF) | (1L << NONE) | (1L << MINUS_OP) | (1L << NOT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IDENTIFIER - 65)) | (1L << (TK_ENTERO - 65)) | (1L << (STRING - 65)) | (1L << (IDSTRING - 65)))) != 0)) {
					{
					setState(289);
					expr(0);
					setState(294);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TK_COMA) {
						{
						{
						setState(290);
						match(TK_COMA);
						setState(291);
						expr(0);
						}
						}
						setState(296);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(299);
				match(TK_PAR_DER);
				}
				break;
			case 7:
				{
				setState(300);
				match(MINUS_OP);
				setState(301);
				cexpr(2);
				}
				break;
			case 8:
				{
				setState(302);
				match(LEN);
				setState(303);
				match(TK_PAR_IZQ);
				setState(319);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(304);
					match(IDENTIFIER);
					}
					break;
				case STRING:
					{
					setState(305);
					match(STRING);
					}
					break;
				case IDSTRING:
					{
					setState(306);
					match(IDSTRING);
					}
					break;
				case TK_SQR_IZQ:
					{
					setState(307);
					match(TK_SQR_IZQ);
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PAR_IZQ) | (1L << TK_SQR_IZQ) | (1L << LEN) | (1L << TRUE) | (1L << FALSE) | (1L << SELF) | (1L << NONE) | (1L << MINUS_OP) | (1L << NOT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IDENTIFIER - 65)) | (1L << (TK_ENTERO - 65)) | (1L << (STRING - 65)) | (1L << (IDSTRING - 65)))) != 0)) {
						{
						setState(308);
						expr(0);
						setState(313);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==TK_COMA) {
							{
							{
							setState(309);
							match(TK_COMA);
							setState(310);
							expr(0);
							}
							}
							setState(315);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(318);
					match(TK_SQR_DER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(321);
				match(TK_PAR_DER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(359);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(324);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(325);
						logop();
						setState(326);
						cexpr(6);
						}
						break;
					case 2:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(328);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(329);
						multdiv();
						setState(330);
						cexpr(5);
						}
						break;
					case 3:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(332);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(333);
						bin_op();
						setState(334);
						cexpr(4);
						}
						break;
					case 4:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(336);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(337);
						match(TK_PUNTO);
						setState(338);
						match(IDENTIFIER);
						}
						break;
					case 5:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(339);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(340);
						match(TK_SQR_IZQ);
						setState(341);
						expr(0);
						setState(342);
						match(TK_SQR_DER);
						}
						break;
					case 6:
						{
						_localctx = new CexprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_cexpr);
						setState(344);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(345);
						match(TK_PUNTO);
						setState(346);
						match(IDENTIFIER);
						setState(347);
						match(TK_PAR_IZQ);
						setState(356);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_PAR_IZQ) | (1L << TK_SQR_IZQ) | (1L << LEN) | (1L << TRUE) | (1L << FALSE) | (1L << SELF) | (1L << NONE) | (1L << MINUS_OP) | (1L << NOT))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (IDENTIFIER - 65)) | (1L << (TK_ENTERO - 65)) | (1L << (STRING - 65)) | (1L << (IDSTRING - 65)))) != 0)) {
							{
							setState(348);
							expr(0);
							setState(353);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==TK_COMA) {
								{
								{
								setState(349);
								match(TK_COMA);
								setState(350);
								expr(0);
								}
								}
								setState(355);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(358);
						match(TK_PAR_DER);
						}
						break;
					}
					} 
				}
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultdivContext extends ParserRuleContext {
		public TerminalNode MULT_OP() { return getToken(chocPyParser.MULT_OP, 0); }
		public TerminalNode DIV_OP() { return getToken(chocPyParser.DIV_OP, 0); }
		public TerminalNode MOD_OP() { return getToken(chocPyParser.MOD_OP, 0); }
		public MultdivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multdiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterMultdiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitMultdiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitMultdiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultdivContext multdiv() throws RecognitionException {
		MultdivContext _localctx = new MultdivContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_multdiv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT_OP) | (1L << DIV_OP) | (1L << MOD_OP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class LogopContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(chocPyParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(chocPyParser.NOT_EQUAL, 0); }
		public TerminalNode MINOR_EQUAL() { return getToken(chocPyParser.MINOR_EQUAL, 0); }
		public TerminalNode MAYOR_EQUAL() { return getToken(chocPyParser.MAYOR_EQUAL, 0); }
		public TerminalNode MINOR() { return getToken(chocPyParser.MINOR, 0); }
		public TerminalNode MAYOR() { return getToken(chocPyParser.MAYOR, 0); }
		public TerminalNode IS() { return getToken(chocPyParser.IS, 0); }
		public LogopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterLogop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitLogop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitLogop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogopContext logop() throws RecognitionException {
		LogopContext _localctx = new LogopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT_EQUAL) | (1L << IS) | (1L << MINOR_EQUAL) | (1L << MAYOR_EQUAL) | (1L << EQUAL) | (1L << MAYOR) | (1L << MINOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Bin_opContext extends ParserRuleContext {
		public TerminalNode PLUS_OP() { return getToken(chocPyParser.PLUS_OP, 0); }
		public TerminalNode MINUS_OP() { return getToken(chocPyParser.MINUS_OP, 0); }
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterBin_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitBin_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitBin_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bin_op);
		try {
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				match(PLUS_OP);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				match(MINUS_OP);
				}
				break;
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

	public static class TargetContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(chocPyParser.IDENTIFIER, 0); }
		public CexprContext cexpr() {
			return getRuleContext(CexprContext.class,0);
		}
		public TerminalNode TK_PUNTO() { return getToken(chocPyParser.TK_PUNTO, 0); }
		public TerminalNode TK_SQR_IZQ() { return getToken(chocPyParser.TK_SQR_IZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TK_SQR_DER() { return getToken(chocPyParser.TK_SQR_DER, 0); }
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chocPyListener ) ((chocPyListener)listener).exitTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof chocPyVisitor ) return ((chocPyVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_target);
		try {
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				cexpr(0);
				setState(375);
				match(TK_PUNTO);
				setState(376);
				match(IDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				cexpr(0);
				setState(379);
				match(TK_SQR_IZQ);
				setState(380);
				expr(0);
				setState(381);
				match(TK_SQR_DER);
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 16:
			return cexpr_sempred((CexprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean cexpr_sempred(CexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3I\u0184\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\7\2\60\n\2\f\2\16"+
		"\2\63\13\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\6\4L\n\4\r\4\16\4M\5\4P\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\7\5X\n\5\f\5\16\5[\13\5\5\5]\n\5\3\5\3\5\3\5\5\5"+
		"b\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6r\n\6"+
		"\f\6\16\6u\13\6\3\6\3\6\3\6\5\6z\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\7\7\u0086\n\7\f\7\16\7\u0089\13\7\3\7\6\7\u008c\n\7\r\7\16\7\u008d"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009e\n\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00b9\n\r\f\r\16\r\u00bc\13\r\3"+
		"\r\3\r\3\r\5\r\u00c1\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00cf\n\r\3\16\3\16\3\16\3\16\5\16\u00d5\n\16\3\16\3\16\3\16\6"+
		"\16\u00da\n\16\r\16\16\16\u00db\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00e5\n\16\3\17\3\17\3\17\6\17\u00ea\n\17\r\17\16\17\u00eb\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00f6\n\20\3\21\3\21\3\21\3\21\5\21"+
		"\u00fc\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0107\n"+
		"\21\f\21\16\21\u010a\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\7\22\u0116\n\22\f\22\16\22\u0119\13\22\5\22\u011b\n\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0127\n\22\f\22\16\22\u012a"+
		"\13\22\5\22\u012c\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\7\22\u013a\n\22\f\22\16\22\u013d\13\22\5\22\u013f\n\22\3"+
		"\22\5\22\u0142\n\22\3\22\5\22\u0145\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u0162\n\22\f\22\16\22\u0165\13"+
		"\22\5\22\u0167\n\22\3\22\7\22\u016a\n\22\f\22\16\22\u016d\13\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3\25\5\25\u0176\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0182\n\26\3\26\2\4 \"\27\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*\2\t\4\2\16\16CC\3\3GG\4\2\34\34CC\3\3"+
		"II\3\2#$\3\2\37!\5\2%%\63\63<@\2\u01b5\2\61\3\2\2\2\4<\3\2\2\2\6O\3\2"+
		"\2\2\bQ\3\2\2\2\ni\3\2\2\2\f\u0087\3\2\2\2\16\u008f\3\2\2\2\20\u009d\3"+
		"\2\2\2\22\u009f\3\2\2\2\24\u00a3\3\2\2\2\26\u00a7\3\2\2\2\30\u00ce\3\2"+
		"\2\2\32\u00e4\3\2\2\2\34\u00e6\3\2\2\2\36\u00f5\3\2\2\2 \u00fb\3\2\2\2"+
		"\"\u0144\3\2\2\2$\u016e\3\2\2\2&\u0170\3\2\2\2(\u0175\3\2\2\2*\u0181\3"+
		"\2\2\2,\60\5\26\f\2-\60\5\b\5\2.\60\5\4\3\2/,\3\2\2\2/-\3\2\2\2/.\3\2"+
		"\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\67\3\2\2\2\63\61\3\2\2"+
		"\2\64\66\5\30\r\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\2"+
		"8:\3\2\2\29\67\3\2\2\2:;\7\2\2\3;\3\3\2\2\2<=\7\t\2\2=>\7C\2\2>?\7\5\2"+
		"\2?@\t\2\2\2@A\7\6\2\2AB\7\b\2\2BC\7G\2\2CD\7H\2\2DE\5\6\4\2EF\7I\2\2"+
		"F\5\3\2\2\2GH\7)\2\2HP\t\3\2\2IL\5\26\f\2JL\5\n\6\2KI\3\2\2\2KJ\3\2\2"+
		"\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OG\3\2\2\2OK\3\2\2\2P\7\3\2"+
		"\2\2QR\7\3\2\2RS\7C\2\2S\\\7\5\2\2TY\5\16\b\2UV\7\22\2\2VX\5\16\b\2WU"+
		"\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2\\T\3\2\2\2"+
		"\\]\3\2\2\2]^\3\2\2\2^a\7\6\2\2_`\7\7\2\2`b\5\20\t\2a_\3\2\2\2ab\3\2\2"+
		"\2bc\3\2\2\2cd\7\b\2\2de\7G\2\2ef\7H\2\2fg\5\f\7\2gh\7I\2\2h\t\3\2\2\2"+
		"ij\7\3\2\2jk\t\4\2\2kl\7\5\2\2lm\7\26\2\2mn\7\b\2\2ns\7E\2\2op\7\22\2"+
		"\2pr\5\16\b\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2"+
		"\2\2vy\7\6\2\2wx\7\7\2\2xz\5\20\t\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7"+
		"\b\2\2|}\7G\2\2}~\7H\2\2~\177\5\f\7\2\177\u0080\7I\2\2\u0080\13\3\2\2"+
		"\2\u0081\u0086\5\22\n\2\u0082\u0086\5\24\13\2\u0083\u0086\5\26\f\2\u0084"+
		"\u0086\5\b\5\2\u0085\u0081\3\2\2\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\5\30"+
		"\r\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\r\3\2\2\2\u008f\u0090\7C\2\2\u0090\u0091\7\b\2\2"+
		"\u0091\u0092\5\20\t\2\u0092\17\3\2\2\2\u0093\u009e\7C\2\2\u0094\u009e"+
		"\7F\2\2\u0095\u009e\7\n\2\2\u0096\u009e\7\f\2\2\u0097\u009e\7\r\2\2\u0098"+
		"\u009e\7\16\2\2\u0099\u009a\7\20\2\2\u009a\u009b\5\20\t\2\u009b\u009c"+
		"\7\21\2\2\u009c\u009e\3\2\2\2\u009d\u0093\3\2\2\2\u009d\u0094\3\2\2\2"+
		"\u009d\u0095\3\2\2\2\u009d\u0096\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u0098"+
		"\3\2\2\2\u009d\u0099\3\2\2\2\u009e\21\3\2\2\2\u009f\u00a0\7\32\2\2\u00a0"+
		"\u00a1\7C\2\2\u00a1\u00a2\7G\2\2\u00a2\23\3\2\2\2\u00a3\u00a4\7\33\2\2"+
		"\u00a4\u00a5\7C\2\2\u00a5\u00a6\7G\2\2\u00a6\25\3\2\2\2\u00a7\u00a8\5"+
		"\16\b\2\u00a8\u00a9\7\13\2\2\u00a9\u00aa\5\36\20\2\u00aa\u00ab\t\3\2\2"+
		"\u00ab\27\3\2\2\2\u00ac\u00ad\5\32\16\2\u00ad\u00ae\t\3\2\2\u00ae\u00cf"+
		"\3\2\2\2\u00af\u00b0\7\27\2\2\u00b0\u00b1\5 \21\2\u00b1\u00b2\7\b\2\2"+
		"\u00b2\u00ba\5\34\17\2\u00b3\u00b4\7:\2\2\u00b4\u00b5\5 \21\2\u00b5\u00b6"+
		"\7\b\2\2\u00b6\u00b7\5\34\17\2\u00b7\u00b9\3\2\2\2\u00b8\u00b3\3\2\2\2"+
		"\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c0"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7\30\2\2\u00be\u00bf\7\b\2\2"+
		"\u00bf\u00c1\5\34\17\2\u00c0\u00bd\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00cf"+
		"\3\2\2\2\u00c2\u00c3\7\67\2\2\u00c3\u00c4\5 \21\2\u00c4\u00c5\7\b\2\2"+
		"\u00c5\u00c6\5\34\17\2\u00c6\u00cf\3\2\2\2\u00c7\u00c8\7/\2\2\u00c8\u00c9"+
		"\7C\2\2\u00c9\u00ca\7\62\2\2\u00ca\u00cb\5 \21\2\u00cb\u00cc\7\b\2\2\u00cc"+
		"\u00cd\5\34\17\2\u00cd\u00cf\3\2\2\2\u00ce\u00ac\3\2\2\2\u00ce\u00af\3"+
		"\2\2\2\u00ce\u00c2\3\2\2\2\u00ce\u00c7\3\2\2\2\u00cf\31\3\2\2\2\u00d0"+
		"\u00e5\7)\2\2\u00d1\u00e5\5 \21\2\u00d2\u00d4\7\4\2\2\u00d3\u00d5\5 \21"+
		"\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00e5\3\2\2\2\u00d6\u00d7"+
		"\5*\26\2\u00d7\u00d8\7\13\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d6\3\2\2\2"+
		"\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00de\5 \21\2\u00de\u00e5\3\2\2\2\u00df\u00e0\7\17\2\2"+
		"\u00e0\u00e1\7\5\2\2\u00e1\u00e2\5 \21\2\u00e2\u00e3\7\6\2\2\u00e3\u00e5"+
		"\3\2\2\2\u00e4\u00d0\3\2\2\2\u00e4\u00d1\3\2\2\2\u00e4\u00d2\3\2\2\2\u00e4"+
		"\u00d9\3\2\2\2\u00e4\u00df\3\2\2\2\u00e5\33\3\2\2\2\u00e6\u00e7\7G\2\2"+
		"\u00e7\u00e9\7H\2\2\u00e8\u00ea\5\30\r\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00ee\t\5\2\2\u00ee\35\3\2\2\2\u00ef\u00f6\7\35\2\2\u00f0\u00f6\7\24"+
		"\2\2\u00f1\u00f6\7\25\2\2\u00f2\u00f6\7D\2\2\u00f3\u00f6\7F\2\2\u00f4"+
		"\u00f6\7E\2\2\u00f5\u00ef\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f5\u00f1\3\2"+
		"\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\37\3\2\2\2\u00f7\u00f8\b\21\1\2\u00f8\u00fc\5\"\22\2\u00f9\u00fa\7\""+
		"\2\2\u00fa\u00fc\5 \21\5\u00fb\u00f7\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u0108\3\2\2\2\u00fd\u00fe\f\4\2\2\u00fe\u00ff\t\6\2\2\u00ff\u0107\5 "+
		"\21\5\u0100\u0101\f\3\2\2\u0101\u0102\7\27\2\2\u0102\u0103\5 \21\2\u0103"+
		"\u0104\7\30\2\2\u0104\u0105\5 \21\4\u0105\u0107\3\2\2\2\u0106\u00fd\3"+
		"\2\2\2\u0106\u0100\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109!\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\b\22\1\2"+
		"\u010c\u0145\7C\2\2\u010d\u010e\7\26\2\2\u010e\u010f\7\31\2\2\u010f\u0145"+
		"\7C\2\2\u0110\u0145\5\36\20\2\u0111\u011a\7\20\2\2\u0112\u0117\5 \21\2"+
		"\u0113\u0114\7\22\2\2\u0114\u0116\5 \21\2\u0115\u0113\3\2\2\2\u0116\u0119"+
		"\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011b\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u011a\u0112\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u0145\7\21\2\2\u011d\u011e\7\5\2\2\u011e\u011f\5 \21\2\u011f"+
		"\u0120\7\6\2\2\u0120\u0145\3\2\2\2\u0121\u0122\7C\2\2\u0122\u012b\7\5"+
		"\2\2\u0123\u0128\5 \21\2\u0124\u0125\7\22\2\2\u0125\u0127\5 \21\2\u0126"+
		"\u0124\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u0123\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0145\7\6\2\2\u012e\u012f\7\36"+
		"\2\2\u012f\u0145\5\"\22\4\u0130\u0131\7\23\2\2\u0131\u0141\7\5\2\2\u0132"+
		"\u0142\7C\2\2\u0133\u0142\7E\2\2\u0134\u0142\7F\2\2\u0135\u013e\7\20\2"+
		"\2\u0136\u013b\5 \21\2\u0137\u0138\7\22\2\2\u0138\u013a\5 \21\2\u0139"+
		"\u0137\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0136\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\7\21\2\2\u0141\u0132\3"+
		"\2\2\2\u0141\u0133\3\2\2\2\u0141\u0134\3\2\2\2\u0141\u0135\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0145\7\6\2\2\u0144\u010b\3\2\2\2\u0144\u010d\3\2"+
		"\2\2\u0144\u0110\3\2\2\2\u0144\u0111\3\2\2\2\u0144\u011d\3\2\2\2\u0144"+
		"\u0121\3\2\2\2\u0144\u012e\3\2\2\2\u0144\u0130\3\2\2\2\u0145\u016b\3\2"+
		"\2\2\u0146\u0147\f\7\2\2\u0147\u0148\5&\24\2\u0148\u0149\5\"\22\b\u0149"+
		"\u016a\3\2\2\2\u014a\u014b\f\6\2\2\u014b\u014c\5$\23\2\u014c\u014d\5\""+
		"\22\7\u014d\u016a\3\2\2\2\u014e\u014f\f\5\2\2\u014f\u0150\5(\25\2\u0150"+
		"\u0151\5\"\22\6\u0151\u016a\3\2\2\2\u0152\u0153\f\13\2\2\u0153\u0154\7"+
		"\31\2\2\u0154\u016a\7C\2\2\u0155\u0156\f\n\2\2\u0156\u0157\7\20\2\2\u0157"+
		"\u0158\5 \21\2\u0158\u0159\7\21\2\2\u0159\u016a\3\2\2\2\u015a\u015b\f"+
		"\b\2\2\u015b\u015c\7\31\2\2\u015c\u015d\7C\2\2\u015d\u0166\7\5\2\2\u015e"+
		"\u0163\5 \21\2\u015f\u0160\7\22\2\2\u0160\u0162\5 \21\2\u0161\u015f\3"+
		"\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u015e\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u0167\u0168\3\2\2\2\u0168\u016a\7\6\2\2\u0169\u0146\3\2\2\2\u0169"+
		"\u014a\3\2\2\2\u0169\u014e\3\2\2\2\u0169\u0152\3\2\2\2\u0169\u0155\3\2"+
		"\2\2\u0169\u015a\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c#\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\t\7\2\2"+
		"\u016f%\3\2\2\2\u0170\u0171\t\b\2\2\u0171\'\3\2\2\2\u0172\u0176\3\2\2"+
		"\2\u0173\u0176\7&\2\2\u0174\u0176\7\36\2\2\u0175\u0172\3\2\2\2\u0175\u0173"+
		"\3\2\2\2\u0175\u0174\3\2\2\2\u0176)\3\2\2\2\u0177\u0182\7C\2\2\u0178\u0179"+
		"\5\"\22\2\u0179\u017a\7\31\2\2\u017a\u017b\7C\2\2\u017b\u0182\3\2\2\2"+
		"\u017c\u017d\5\"\22\2\u017d\u017e\7\20\2\2\u017e\u017f\5 \21\2\u017f\u0180"+
		"\7\21\2\2\u0180\u0182\3\2\2\2\u0181\u0177\3\2\2\2\u0181\u0178\3\2\2\2"+
		"\u0181\u017c\3\2\2\2\u0182+\3\2\2\2*/\61\67KMOY\\asy\u0085\u0087\u008d"+
		"\u009d\u00ba\u00c0\u00ce\u00d4\u00db\u00e4\u00eb\u00f5\u00fb\u0106\u0108"+
		"\u0117\u011a\u0128\u012b\u013b\u013e\u0141\u0144\u0163\u0166\u0169\u016b"+
		"\u0175\u0181";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}