// Generated from c:/Users/alejandro/Documents/musica/src/grammar/musicologo.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class musicologoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, COMANDO_CARGAR=2, COMANDO_RECORTAR=3, COMANDO_EXPORTAR=4, ARCHIVO_MP3=5, 
		RUTA=6, TIEMPO=7, WS=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "COMANDO_CARGAR", "COMANDO_RECORTAR", "COMANDO_EXPORTAR", "ARCHIVO_MP3", 
			"RUTA", "TIEMPO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "COMANDO_CARGAR", "COMANDO_RECORTAR", "COMANDO_EXPORTAR", 
			"ARCHIVO_MP3", "RUTA", "TIEMPO", "WS"
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


	public musicologoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "musicologo.g4"; }

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
		"\u0004\u0000\b\u0080\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001#\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u00025\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003J\b\u0003\u0001\u0004"+
		"\u0004\u0004M\b\u0004\u000b\u0004\f\u0004N\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u0005W\b\u0005\u000b"+
		"\u0005\f\u0005X\u0001\u0005\u0001\u0005\u0004\u0005]\b\u0005\u000b\u0005"+
		"\f\u0005^\u0001\u0005\u0005\u0005b\b\u0005\n\u0005\f\u0005e\t\u0005\u0001"+
		"\u0006\u0004\u0006h\b\u0006\u000b\u0006\f\u0006i\u0001\u0006\u0001\u0006"+
		"\u0004\u0006n\b\u0006\u000b\u0006\f\u0006o\u0001\u0006\u0001\u0006\u0004"+
		"\u0006t\b\u0006\u000b\u0006\f\u0006u\u0003\u0006x\b\u0006\u0001\u0007"+
		"\u0004\u0007{\b\u0007\u000b\u0007\f\u0007|\u0001\u0007\u0001\u0007\u0000"+
		"\u0000\b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0001\u0000\u0003\u0003\u000009AZaz\u0001\u0000"+
		"09\u0003\u0000\t\n\r\r  \u0091\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0001\u0011\u0001\u0000\u0000\u0000\u0003\"\u0001\u0000"+
		"\u0000\u0000\u00054\u0001\u0000\u0000\u0000\u0007I\u0001\u0000\u0000\u0000"+
		"\tL\u0001\u0000\u0000\u0000\u000bV\u0001\u0000\u0000\u0000\rg\u0001\u0000"+
		"\u0000\u0000\u000fz\u0001\u0000\u0000\u0000\u0011\u0012\u0005 \u0000\u0000"+
		"\u0012\u0002\u0001\u0000\u0000\u0000\u0013\u0014\u0005c\u0000\u0000\u0014"+
		"\u0015\u0005a\u0000\u0000\u0015\u0016\u0005r\u0000\u0000\u0016\u0017\u0005"+
		"g\u0000\u0000\u0017\u0018\u0005a\u0000\u0000\u0018#\u0005r\u0000\u0000"+
		"\u0019\u001a\u0005l\u0000\u0000\u001a\u001b\u0005o\u0000\u0000\u001b\u001c"+
		"\u0005a\u0000\u0000\u001c#\u0005d\u0000\u0000\u001d\u001e\u0005c\u0000"+
		"\u0000\u001e\u001f\u0005r\u0000\u0000\u001f#\u0005g\u0000\u0000 !\u0005"+
		"l\u0000\u0000!#\u0005d\u0000\u0000\"\u0013\u0001\u0000\u0000\u0000\"\u0019"+
		"\u0001\u0000\u0000\u0000\"\u001d\u0001\u0000\u0000\u0000\" \u0001\u0000"+
		"\u0000\u0000#\u0004\u0001\u0000\u0000\u0000$%\u0005r\u0000\u0000%&\u0005"+
		"e\u0000\u0000&\'\u0005c\u0000\u0000\'(\u0005o\u0000\u0000()\u0005r\u0000"+
		"\u0000)*\u0005t\u0000\u0000*+\u0005a\u0000\u0000+5\u0005r\u0000\u0000"+
		",-\u0005c\u0000\u0000-.\u0005u\u0000\u0000.5\u0005t\u0000\u0000/0\u0005"+
		"r\u0000\u000001\u0005c\u0000\u000015\u0005t\u0000\u000023\u0005c\u0000"+
		"\u000035\u0005t\u0000\u00004$\u0001\u0000\u0000\u00004,\u0001\u0000\u0000"+
		"\u00004/\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u00005\u0006\u0001"+
		"\u0000\u0000\u000067\u0005e\u0000\u000078\u0005x\u0000\u000089\u0005p"+
		"\u0000\u00009:\u0005o\u0000\u0000:;\u0005r\u0000\u0000;<\u0005t\u0000"+
		"\u0000<=\u0005a\u0000\u0000=J\u0005r\u0000\u0000>?\u0005e\u0000\u0000"+
		"?@\u0005x\u0000\u0000@A\u0005p\u0000\u0000AB\u0005o\u0000\u0000BC\u0005"+
		"r\u0000\u0000CJ\u0005t\u0000\u0000DE\u0005e\u0000\u0000EF\u0005x\u0000"+
		"\u0000FJ\u0005p\u0000\u0000GH\u0005e\u0000\u0000HJ\u0005x\u0000\u0000"+
		"I6\u0001\u0000\u0000\u0000I>\u0001\u0000\u0000\u0000ID\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000J\b\u0001\u0000\u0000\u0000KM\u0007\u0000"+
		"\u0000\u0000LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PQ\u0005.\u0000\u0000QR\u0005m\u0000\u0000RS\u0005p\u0000\u0000ST\u0005"+
		"3\u0000\u0000T\n\u0001\u0000\u0000\u0000UW\u0007\u0000\u0000\u0000VU\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Zc\u0005/\u0000\u0000"+
		"[]\u0007\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000"+
		"\u0000\u0000`b\u0005/\u0000\u0000a\\\u0001\u0000\u0000\u0000be\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\f\u0001"+
		"\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fh\u0007\u0001\u0000\u0000"+
		"gf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000ij\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0005:\u0000"+
		"\u0000ln\u0007\u0001\u0000\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pw\u0001"+
		"\u0000\u0000\u0000qs\u0005:\u0000\u0000rt\u0007\u0001\u0000\u0000sr\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wq\u0001\u0000\u0000"+
		"\u0000wx\u0001\u0000\u0000\u0000x\u000e\u0001\u0000\u0000\u0000y{\u0007"+
		"\u0002\u0000\u0000zy\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000"+
		"|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~\u007f\u0006\u0007\u0000\u0000\u007f\u0010\u0001\u0000\u0000\u0000"+
		"\r\u0000\"4INX^ciouw|\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}