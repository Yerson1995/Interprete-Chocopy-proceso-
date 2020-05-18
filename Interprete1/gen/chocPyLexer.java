// Generated from E:/ProyectosIntelliJIDEA/Java/Java/Interprete1/Gramatica\chocPy.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class chocPyLexer extends Lexer {
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
		SKIP_=64, IDENTIFIER=65, TK_ENTERO=66, STRING=67, IDSTRING=68, NEWLINE=69;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DEF", "RETURN", "TK_PAR_IZQ", "TK_PAR_DER", "TK_EJECUTA", "TK_DOS_PUNTOS", 
			"CLASS", "INT", "TK_ASIG", "STR", "BOOL", "OBJECT", "PRINT", "TK_SQR_IZQ", 
			"TK_SQR_DER", "TK_COMA", "LEN", "TRUE", "FALSE", "SELF", "IF", "ELSE", 
			"TK_PUNTO", "GLOBAL", "NONLOCAL", "INIT", "NONE", "MINUS_OP", "MULT_OP", 
			"DIV_OP", "MOD_OP", "NOT", "OR", "AND", "NOT_EQUAL", "PLUS_OP", "TK_COR_IZQ", 
			"TK_COR_DER", "PASS", "TK_COM", "CONTINUE", "EXCEPT", "FINALLY", "BREAK", 
			"FOR", "FROM", "IMPORT", "IN", "IS", "LAMBDA", "RAISE", "TRY", "WHILE", 
			"AS", "DEL", "ELIF", "ASSERT", "MINOR_EQUAL", "MAYOR_EQUAL", "EQUAL", 
			"MAYOR", "MINOR", "WITH", "SPACES", "SKIP_", "COMMENT", "IDENTIFIER", 
			"TK_ENTERO", "STRING", "IDSTRING", "ST", "RN", "DIGITO_NO_CERO", "DIGITO", 
			"CERO", "ID_CONTINUE", "ID_MULT_OPT", "NEWLINE"
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
			"IDSTRING", "NEWLINE"
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


	  // A queue where extra tokens are pushed on (see the NEWLINE lexer rule).
	  private java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();
	  // The stack that keeps track of the indentation level.
	  private java.util.Stack<Integer> indents = new java.util.Stack<>();
	  // The amount of opened braces, brackets and parenthesis.
	  private int opened = 0;
	  // The most recently produced token.
	  private Token lastToken = null;
	  @Override
	  public void emit(Token t) {
	    super.setToken(t);
	    tokens.offer(t);
	  }

	  @Override
	  public Token nextToken() {
	    // Check if the end-of-file is ahead and there are still some DEDENTS expected.
	    if (_input.LA(1) == EOF && !this.indents.isEmpty()) {
	      // Remove any trailing EOF tokens from our buffer.
	      for (int i = tokens.size() - 1; i >= 0; i--) {
	        if (tokens.get(i).getType() == EOF) {
	          tokens.remove(i);
	        }
	      }

	      // First emit an extra line break that serves as the end of the statement.
	      this.emit(commonToken(chocPyParser.NEWLINE, "\n"));

	      // Now emit as much DEDENT tokens as needed.
	      while (!indents.isEmpty()) {
	        this.emit(createDedent());
	        indents.pop();
	      }

	      // Put the EOF back on the token stream.
	      this.emit(commonToken(chocPyParser.EOF, "<EOF>"));
	    }

	    Token next = super.nextToken();

	    if (next.getChannel() == Token.DEFAULT_CHANNEL) {
	      // Keep track of the last token on the default channel.
	      this.lastToken = next;
	    }

	    return tokens.isEmpty() ? next : tokens.poll();
	  }

	  private Token createDedent() {
	    CommonToken dedent = commonToken(chocPyParser.DEDENT, "");
	    dedent.setLine(this.lastToken.getLine());
	    return dedent;
	  }

	  private CommonToken commonToken(int type, String text) {
	    int stop = this.getCharIndex() - 1;
	    int start = text.isEmpty() ? stop : stop - text.length() + 1;
	    return new CommonToken(this._tokenFactorySourcePair, type, DEFAULT_TOKEN_CHANNEL, start, stop);
	  }

	  // Calculates the indentation of the provided spaces, taking the
	  // following rules into account:
	  //
	  // "Tabs are replaced (from left to right) by one to eight spaces
	  //  such that the total number of characters up to and including
	  //  the replacement is a multiple of eight [...]"
	  //
	  //  -- https://docs.python.org/3.1/reference/lexical_analysis.html#indentation
	  static int getIndentationCount(String spaces) {
	    int count = 0;
	    for (char ch : spaces.toCharArray()) {
	      switch (ch) {
	        case '\t':
	          count += 8 - (count % 8);
	          break;
	        default:
	          // A normal space char.
	          count++;
	      }
	    }

	    return count;
	  }

	  boolean atStartOfInput() {
	    return super.getCharPositionInLine() == 0 && super.getLine() == 1;
	  }


	public chocPyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "chocPy.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 77:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			     String newLine = getText().replaceAll("[^\r\n\f]+", "");
			     String spaces = getText().replaceAll("[\r\n\f]+", "");

			     // Strip newlines inside open clauses except if we are near EOF. We keep NEWLINEs near EOF to
			     // satisfy the final newline needed by the single_put rule used by the REPL.
			     int next = _input.LA(1);
			     int nextnext = _input.LA(2);
			     if (opened > 0 || (nextnext != -1 && (next == '\r' || next == '\n' || next == '\f' || next == '#'))) {
			       // If we're inside a list or on a blank line, ignore all indents,
			       // dedents and line breaks.
			       skip();
			     }
			     else {
			       emit(commonToken(NEWLINE, newLine));
			       int indent = getIndentationCount(spaces);
			       int previous = indents.isEmpty() ? 0 : indents.peek();
			       if (indent == previous) {
			         // skip indents of the same size as the present indent-size
			         skip();
			       }
			       else if (indent > previous) {
			         indents.push(indent);
			         emit(commonToken(chocPyParser.INDENT, spaces));
			       }
			       else {
			         // Possibly emit more than 1 DEDENT token.
			         while(!indents.isEmpty() && indents.peek() > indent) {
			           this.emit(createDedent());
			           indents.pop();
			         }
			       }
			     }
			   
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 77:
			return NEWLINE_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean NEWLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return atStartOfInput();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2G\u0206\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37"+
		"\3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3"+
		"+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\38\3"+
		"9\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3"+
		"?\3?\3@\3@\3@\3@\3@\3A\6A\u01ad\nA\rA\16A\u01ae\3B\3B\5B\u01b3\nB\3B\3"+
		"B\3C\3C\7C\u01b9\nC\fC\16C\u01bc\13C\3D\3D\7D\u01c0\nD\fD\16D\u01c3\13"+
		"D\3E\3E\7E\u01c7\nE\fE\16E\u01ca\13E\3E\5E\u01cd\nE\3F\3F\7F\u01d1\nF"+
		"\fF\16F\u01d4\13F\3F\3F\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\5H\u01e3\nH\3"+
		"I\5I\u01e6\nI\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\5M\u01f2\nM\3N\5N\u01f5\n"+
		"N\3O\3O\3O\5O\u01fa\nO\3O\3O\5O\u01fe\nO\3O\5O\u0201\nO\5O\u0203\nO\3"+
		"O\3O\2\2P\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081\2\u0083B\u0085\2\u0087C\u0089D\u008b"+
		"E\u008dF\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d"+
		"G\3\2\t\4\2\13\13\"\"\4\2\f\f\16\17\3\2^^\3\2$$\3\2\63;\3\2\62;\5\2C\\"+
		"aac|\2\u020d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3"+
		"\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2"+
		"\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3"+
		"\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2"+
		"\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2"+
		"y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0083\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u009d\3\2\2"+
		"\2\3\u009f\3\2\2\2\5\u00a3\3\2\2\2\7\u00aa\3\2\2\2\t\u00ac\3\2\2\2\13"+
		"\u00ae\3\2\2\2\r\u00b1\3\2\2\2\17\u00b3\3\2\2\2\21\u00b9\3\2\2\2\23\u00bd"+
		"\3\2\2\2\25\u00bf\3\2\2\2\27\u00c3\3\2\2\2\31\u00c8\3\2\2\2\33\u00cf\3"+
		"\2\2\2\35\u00d5\3\2\2\2\37\u00d7\3\2\2\2!\u00d9\3\2\2\2#\u00db\3\2\2\2"+
		"%\u00df\3\2\2\2\'\u00e4\3\2\2\2)\u00ea\3\2\2\2+\u00ef\3\2\2\2-\u00f2\3"+
		"\2\2\2/\u00f7\3\2\2\2\61\u00f9\3\2\2\2\63\u0100\3\2\2\2\65\u0109\3\2\2"+
		"\2\67\u0112\3\2\2\29\u0117\3\2\2\2;\u0119\3\2\2\2=\u011b\3\2\2\2?\u011e"+
		"\3\2\2\2A\u0120\3\2\2\2C\u0124\3\2\2\2E\u0127\3\2\2\2G\u012b\3\2\2\2I"+
		"\u012e\3\2\2\2K\u0130\3\2\2\2M\u0132\3\2\2\2O\u0134\3\2\2\2Q\u0139\3\2"+
		"\2\2S\u013b\3\2\2\2U\u0144\3\2\2\2W\u014b\3\2\2\2Y\u0153\3\2\2\2[\u0159"+
		"\3\2\2\2]\u015d\3\2\2\2_\u0162\3\2\2\2a\u0169\3\2\2\2c\u016c\3\2\2\2e"+
		"\u016f\3\2\2\2g\u0176\3\2\2\2i\u017c\3\2\2\2k\u0180\3\2\2\2m\u0186\3\2"+
		"\2\2o\u0189\3\2\2\2q\u018d\3\2\2\2s\u0192\3\2\2\2u\u0199\3\2\2\2w\u019c"+
		"\3\2\2\2y\u019f\3\2\2\2{\u01a2\3\2\2\2}\u01a4\3\2\2\2\177\u01a6\3\2\2"+
		"\2\u0081\u01ac\3\2\2\2\u0083\u01b2\3\2\2\2\u0085\u01b6\3\2\2\2\u0087\u01bd"+
		"\3\2\2\2\u0089\u01cc\3\2\2\2\u008b\u01ce\3\2\2\2\u008d\u01d7\3\2\2\2\u008f"+
		"\u01e2\3\2\2\2\u0091\u01e5\3\2\2\2\u0093\u01e9\3\2\2\2\u0095\u01eb\3\2"+
		"\2\2\u0097\u01ed\3\2\2\2\u0099\u01f1\3\2\2\2\u009b\u01f4\3\2\2\2\u009d"+
		"\u0202\3\2\2\2\u009f\u00a0\7f\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7h\2"+
		"\2\u00a2\4\3\2\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7"+
		"v\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7p\2\2\u00a9\6"+
		"\3\2\2\2\u00aa\u00ab\7*\2\2\u00ab\b\3\2\2\2\u00ac\u00ad\7+\2\2\u00ad\n"+
		"\3\2\2\2\u00ae\u00af\7/\2\2\u00af\u00b0\7@\2\2\u00b0\f\3\2\2\2\u00b1\u00b2"+
		"\7<\2\2\u00b2\16\3\2\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6"+
		"\7c\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7u\2\2\u00b8\20\3\2\2\2\u00b9\u00ba"+
		"\7k\2\2\u00ba\u00bb\7p\2\2\u00bb\u00bc\7v\2\2\u00bc\22\3\2\2\2\u00bd\u00be"+
		"\7?\2\2\u00be\24\3\2\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2"+
		"\7t\2\2\u00c2\26\3\2\2\2\u00c3\u00c4\7d\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6"+
		"\7q\2\2\u00c6\u00c7\7n\2\2\u00c7\30\3\2\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca"+
		"\7d\2\2\u00ca\u00cb\7l\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7e\2\2\u00cd"+
		"\u00ce\7v\2\2\u00ce\32\3\2\2\2\u00cf\u00d0\7r\2\2\u00d0\u00d1\7t\2\2\u00d1"+
		"\u00d2\7k\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7v\2\2\u00d4\34\3\2\2\2\u00d5"+
		"\u00d6\7]\2\2\u00d6\36\3\2\2\2\u00d7\u00d8\7_\2\2\u00d8 \3\2\2\2\u00d9"+
		"\u00da\7.\2\2\u00da\"\3\2\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7g\2\2\u00dd"+
		"\u00de\7p\2\2\u00de$\3\2\2\2\u00df\u00e0\7V\2\2\u00e0\u00e1\7t\2\2\u00e1"+
		"\u00e2\7w\2\2\u00e2\u00e3\7g\2\2\u00e3&\3\2\2\2\u00e4\u00e5\7H\2\2\u00e5"+
		"\u00e6\7c\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7g\2\2"+
		"\u00e9(\3\2\2\2\u00ea\u00eb\7u\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed\7n\2"+
		"\2\u00ed\u00ee\7h\2\2\u00ee*\3\2\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7"+
		"h\2\2\u00f1,\3\2\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5"+
		"\7u\2\2\u00f5\u00f6\7g\2\2\u00f6.\3\2\2\2\u00f7\u00f8\7\60\2\2\u00f8\60"+
		"\3\2\2\2\u00f9\u00fa\7i\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc\7q\2\2\u00fc"+
		"\u00fd\7d\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7n\2\2\u00ff\62\3\2\2\2\u0100"+
		"\u0101\7p\2\2\u0101\u0102\7q\2\2\u0102\u0103\7p\2\2\u0103\u0104\7n\2\2"+
		"\u0104\u0105\7q\2\2\u0105\u0106\7e\2\2\u0106\u0107\7c\2\2\u0107\u0108"+
		"\7n\2\2\u0108\64\3\2\2\2\u0109\u010a\7a\2\2\u010a\u010b\7a\2\2\u010b\u010c"+
		"\7k\2\2\u010c\u010d\7p\2\2\u010d\u010e\7k\2\2\u010e\u010f\7v\2\2\u010f"+
		"\u0110\7a\2\2\u0110\u0111\7a\2\2\u0111\66\3\2\2\2\u0112\u0113\7P\2\2\u0113"+
		"\u0114\7q\2\2\u0114\u0115\7p\2\2\u0115\u0116\7g\2\2\u01168\3\2\2\2\u0117"+
		"\u0118\7/\2\2\u0118:\3\2\2\2\u0119\u011a\7,\2\2\u011a<\3\2\2\2\u011b\u011c"+
		"\7\61\2\2\u011c\u011d\7\61\2\2\u011d>\3\2\2\2\u011e\u011f\7\'\2\2\u011f"+
		"@\3\2\2\2\u0120\u0121\7p\2\2\u0121\u0122\7q\2\2\u0122\u0123\7v\2\2\u0123"+
		"B\3\2\2\2\u0124\u0125\7q\2\2\u0125\u0126\7t\2\2\u0126D\3\2\2\2\u0127\u0128"+
		"\7c\2\2\u0128\u0129\7p\2\2\u0129\u012a\7f\2\2\u012aF\3\2\2\2\u012b\u012c"+
		"\7#\2\2\u012c\u012d\7?\2\2\u012dH\3\2\2\2\u012e\u012f\7-\2\2\u012fJ\3"+
		"\2\2\2\u0130\u0131\7}\2\2\u0131L\3\2\2\2\u0132\u0133\7\177\2\2\u0133N"+
		"\3\2\2\2\u0134\u0135\7r\2\2\u0135\u0136\7c\2\2\u0136\u0137\7u\2\2\u0137"+
		"\u0138\7u\2\2\u0138P\3\2\2\2\u0139\u013a\7%\2\2\u013aR\3\2\2\2\u013b\u013c"+
		"\7e\2\2\u013c\u013d\7q\2\2\u013d\u013e\7p\2\2\u013e\u013f\7v\2\2\u013f"+
		"\u0140\7k\2\2\u0140\u0141\7p\2\2\u0141\u0142\7w\2\2\u0142\u0143\7g\2\2"+
		"\u0143T\3\2\2\2\u0144\u0145\7g\2\2\u0145\u0146\7z\2\2\u0146\u0147\7e\2"+
		"\2\u0147\u0148\7g\2\2\u0148\u0149\7r\2\2\u0149\u014a\7v\2\2\u014aV\3\2"+
		"\2\2\u014b\u014c\7h\2\2\u014c\u014d\7k\2\2\u014d\u014e\7p\2\2\u014e\u014f"+
		"\7c\2\2\u014f\u0150\7n\2\2\u0150\u0151\7n\2\2\u0151\u0152\7{\2\2\u0152"+
		"X\3\2\2\2\u0153\u0154\7d\2\2\u0154\u0155\7t\2\2\u0155\u0156\7g\2\2\u0156"+
		"\u0157\7c\2\2\u0157\u0158\7m\2\2\u0158Z\3\2\2\2\u0159\u015a\7h\2\2\u015a"+
		"\u015b\7q\2\2\u015b\u015c\7t\2\2\u015c\\\3\2\2\2\u015d\u015e\7h\2\2\u015e"+
		"\u015f\7t\2\2\u015f\u0160\7q\2\2\u0160\u0161\7o\2\2\u0161^\3\2\2\2\u0162"+
		"\u0163\7k\2\2\u0163\u0164\7o\2\2\u0164\u0165\7r\2\2\u0165\u0166\7q\2\2"+
		"\u0166\u0167\7t\2\2\u0167\u0168\7v\2\2\u0168`\3\2\2\2\u0169\u016a\7k\2"+
		"\2\u016a\u016b\7p\2\2\u016bb\3\2\2\2\u016c\u016d\7k\2\2\u016d\u016e\7"+
		"u\2\2\u016ed\3\2\2\2\u016f\u0170\7n\2\2\u0170\u0171\7c\2\2\u0171\u0172"+
		"\7o\2\2\u0172\u0173\7d\2\2\u0173\u0174\7f\2\2\u0174\u0175\7c\2\2\u0175"+
		"f\3\2\2\2\u0176\u0177\7t\2\2\u0177\u0178\7c\2\2\u0178\u0179\7k\2\2\u0179"+
		"\u017a\7u\2\2\u017a\u017b\7g\2\2\u017bh\3\2\2\2\u017c\u017d\7v\2\2\u017d"+
		"\u017e\7t\2\2\u017e\u017f\7{\2\2\u017fj\3\2\2\2\u0180\u0181\7y\2\2\u0181"+
		"\u0182\7j\2\2\u0182\u0183\7k\2\2\u0183\u0184\7n\2\2\u0184\u0185\7g\2\2"+
		"\u0185l\3\2\2\2\u0186\u0187\7c\2\2\u0187\u0188\7u\2\2\u0188n\3\2\2\2\u0189"+
		"\u018a\7f\2\2\u018a\u018b\7g\2\2\u018b\u018c\7n\2\2\u018cp\3\2\2\2\u018d"+
		"\u018e\7g\2\2\u018e\u018f\7n\2\2\u018f\u0190\7k\2\2\u0190\u0191\7h\2\2"+
		"\u0191r\3\2\2\2\u0192\u0193\7c\2\2\u0193\u0194\7u\2\2\u0194\u0195\7u\2"+
		"\2\u0195\u0196\7g\2\2\u0196\u0197\7t\2\2\u0197\u0198\7v\2\2\u0198t\3\2"+
		"\2\2\u0199\u019a\7>\2\2\u019a\u019b\7?\2\2\u019bv\3\2\2\2\u019c\u019d"+
		"\7@\2\2\u019d\u019e\7?\2\2\u019ex\3\2\2\2\u019f\u01a0\7?\2\2\u01a0\u01a1"+
		"\7?\2\2\u01a1z\3\2\2\2\u01a2\u01a3\7@\2\2\u01a3|\3\2\2\2\u01a4\u01a5\7"+
		">\2\2\u01a5~\3\2\2\2\u01a6\u01a7\7y\2\2\u01a7\u01a8\7k\2\2\u01a8\u01a9"+
		"\7v\2\2\u01a9\u01aa\7j\2\2\u01aa\u0080\3\2\2\2\u01ab\u01ad\t\2\2\2\u01ac"+
		"\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2"+
		"\2\2\u01af\u0082\3\2\2\2\u01b0\u01b3\5\u0081A\2\u01b1\u01b3\5\u0085C\2"+
		"\u01b2\u01b0\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5"+
		"\bB\2\2\u01b5\u0084\3\2\2\2\u01b6\u01ba\7%\2\2\u01b7\u01b9\n\3\2\2\u01b8"+
		"\u01b7\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2"+
		"\2\2\u01bb\u0086\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01c1\5\u009bN\2\u01be"+
		"\u01c0\5\u0099M\2\u01bf\u01be\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf"+
		"\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u0088\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4"+
		"\u01c8\5\u0093J\2\u01c5\u01c7\5\u0095K\2\u01c6\u01c5\3\2\2\2\u01c7\u01ca"+
		"\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cd\3\2\2\2\u01ca"+
		"\u01c8\3\2\2\2\u01cb\u01cd\7\62\2\2\u01cc\u01c4\3\2\2\2\u01cc\u01cb\3"+
		"\2\2\2\u01cd\u008a\3\2\2\2\u01ce\u01d2\7$\2\2\u01cf\u01d1\5\u008fH\2\u01d0"+
		"\u01cf\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2"+
		"\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d6\7$\2\2\u01d6"+
		"\u008c\3\2\2\2\u01d7\u01d8\5\u008bF\2\u01d8\u008e\3\2\2\2\u01d9\u01da"+
		"\t\4\2\2\u01da\u01e3\t\5\2\2\u01db\u01dc\t\4\2\2\u01dc\u01e3\t\4\2\2\u01dd"+
		"\u01de\t\4\2\2\u01de\u01e3\7p\2\2\u01df\u01e0\t\4\2\2\u01e0\u01e3\7v\2"+
		"\2\u01e1\u01e3\n\5\2\2\u01e2\u01d9\3\2\2\2\u01e2\u01db\3\2\2\2\u01e2\u01dd"+
		"\3\2\2\2\u01e2\u01df\3\2\2\2\u01e2\u01e1\3\2\2\2\u01e3\u0090\3\2\2\2\u01e4"+
		"\u01e6\7\17\2\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\3"+
		"\2\2\2\u01e7\u01e8\7\f\2\2\u01e8\u0092\3\2\2\2\u01e9\u01ea\t\6\2\2\u01ea"+
		"\u0094\3\2\2\2\u01eb\u01ec\t\7\2\2\u01ec\u0096\3\2\2\2\u01ed\u01ee\7\62"+
		"\2\2\u01ee\u0098\3\2\2\2\u01ef\u01f2\5\u009bN\2\u01f0\u01f2\t\7\2\2\u01f1"+
		"\u01ef\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2\u009a\3\2\2\2\u01f3\u01f5\t\b"+
		"\2\2\u01f4\u01f3\3\2\2\2\u01f5\u009c\3\2\2\2\u01f6\u01f7\6O\2\2\u01f7"+
		"\u0203\5\u0081A\2\u01f8\u01fa\7\17\2\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa"+
		"\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fe\7\f\2\2\u01fc\u01fe\4\16\17\2"+
		"\u01fd\u01f9\3\2\2\2\u01fd\u01fc\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u0201"+
		"\5\u0081A\2\u0200\u01ff\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2"+
		"\2\u0202\u01f6\3\2\2\2\u0202\u01fd\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205"+
		"\bO\3\2\u0205\u009e\3\2\2\2\22\2\u01ae\u01b2\u01ba\u01c1\u01c8\u01cc\u01d2"+
		"\u01e2\u01e5\u01f1\u01f4\u01f9\u01fd\u0200\u0202\4\b\2\2\3O\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}