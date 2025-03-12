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
		T__0=1, COMANDO_CARGAR=2, COMANDO_RECORTAR=3, ARCHIVO_MP3=4, RUTA=5, TIEMPO=6, 
		WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "COMANDO_CARGAR", "COMANDO_RECORTAR", "ARCHIVO_MP3", "RUTA", 
			"TIEMPO", "WS"
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
			null, null, "COMANDO_CARGAR", "COMANDO_RECORTAR", "ARCHIVO_MP3", "RUTA", 
			"TIEMPO", "WS"
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
		"\u0004\u0000\u0007i\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001!\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00023\b\u0002"+
		"\u0001\u0003\u0004\u00036\b\u0003\u000b\u0003\f\u00037\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004@\b"+
		"\u0004\u000b\u0004\f\u0004A\u0001\u0004\u0001\u0004\u0004\u0004F\b\u0004"+
		"\u000b\u0004\f\u0004G\u0001\u0004\u0005\u0004K\b\u0004\n\u0004\f\u0004"+
		"N\t\u0004\u0001\u0005\u0004\u0005Q\b\u0005\u000b\u0005\f\u0005R\u0001"+
		"\u0005\u0001\u0005\u0004\u0005W\b\u0005\u000b\u0005\f\u0005X\u0001\u0005"+
		"\u0001\u0005\u0004\u0005]\b\u0005\u000b\u0005\f\u0005^\u0003\u0005a\b"+
		"\u0005\u0001\u0006\u0004\u0006d\b\u0006\u000b\u0006\f\u0006e\u0001\u0006"+
		"\u0001\u0006\u0000\u0000\u0007\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u0001\u0000\u0003\u0003\u000009AZa"+
		"z\u0001\u000009\u0003\u0000\t\n\r\r  w\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0001\u000f"+
		"\u0001\u0000\u0000\u0000\u0003 \u0001\u0000\u0000\u0000\u00052\u0001\u0000"+
		"\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t?\u0001\u0000\u0000\u0000"+
		"\u000bP\u0001\u0000\u0000\u0000\rc\u0001\u0000\u0000\u0000\u000f\u0010"+
		"\u0005 \u0000\u0000\u0010\u0002\u0001\u0000\u0000\u0000\u0011\u0012\u0005"+
		"c\u0000\u0000\u0012\u0013\u0005a\u0000\u0000\u0013\u0014\u0005r\u0000"+
		"\u0000\u0014\u0015\u0005g\u0000\u0000\u0015\u0016\u0005a\u0000\u0000\u0016"+
		"!\u0005r\u0000\u0000\u0017\u0018\u0005l\u0000\u0000\u0018\u0019\u0005"+
		"o\u0000\u0000\u0019\u001a\u0005a\u0000\u0000\u001a!\u0005d\u0000\u0000"+
		"\u001b\u001c\u0005c\u0000\u0000\u001c\u001d\u0005r\u0000\u0000\u001d!"+
		"\u0005g\u0000\u0000\u001e\u001f\u0005l\u0000\u0000\u001f!\u0005d\u0000"+
		"\u0000 \u0011\u0001\u0000\u0000\u0000 \u0017\u0001\u0000\u0000\u0000 "+
		"\u001b\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000!\u0004\u0001"+
		"\u0000\u0000\u0000\"#\u0005r\u0000\u0000#$\u0005e\u0000\u0000$%\u0005"+
		"c\u0000\u0000%&\u0005o\u0000\u0000&\'\u0005r\u0000\u0000\'(\u0005t\u0000"+
		"\u0000()\u0005a\u0000\u0000)3\u0005r\u0000\u0000*+\u0005c\u0000\u0000"+
		"+,\u0005u\u0000\u0000,3\u0005t\u0000\u0000-.\u0005r\u0000\u0000./\u0005"+
		"c\u0000\u0000/3\u0005t\u0000\u000001\u0005c\u0000\u000013\u0005t\u0000"+
		"\u00002\"\u0001\u0000\u0000\u00002*\u0001\u0000\u0000\u00002-\u0001\u0000"+
		"\u0000\u000020\u0001\u0000\u0000\u00003\u0006\u0001\u0000\u0000\u0000"+
		"46\u0007\u0000\u0000\u000054\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u000089\u0001\u0000"+
		"\u0000\u00009:\u0005.\u0000\u0000:;\u0005m\u0000\u0000;<\u0005p\u0000"+
		"\u0000<=\u00053\u0000\u0000=\b\u0001\u0000\u0000\u0000>@\u0007\u0000\u0000"+
		"\u0000?>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CL\u0005"+
		"/\u0000\u0000DF\u0007\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000IK\u0005/\u0000\u0000JE\u0001\u0000\u0000\u0000"+
		"KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000M\n\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OQ\u0007\u0001"+
		"\u0000\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RP\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TV\u0005:\u0000\u0000UW\u0007\u0001\u0000\u0000VU\u0001\u0000\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000Y`\u0001\u0000\u0000\u0000Z\\\u0005:\u0000\u0000[]\u0007\u0001\u0000"+
		"\u0000\\[\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000`Z\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a\f\u0001\u0000\u0000\u0000"+
		"bd\u0007\u0002\u0000\u0000cb\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001\u0000"+
		"\u0000\u0000gh\u0006\u0006\u0000\u0000h\u000e\u0001\u0000\u0000\u0000"+
		"\f\u0000 27AGLRX^`e\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}