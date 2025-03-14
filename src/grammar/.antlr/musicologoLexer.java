// Generated from c://Users//usuario//Pictures//PROYECTOPOO//Musicologo//src//grammar//musicologo.g4 by ANTLR 4.13.1
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
		T__0=1, COMANDO_CARGAR=2, COMANDO_RECORTAR=3, COMANDO_EXPORTAR=4, COMANDO_ASIGNAR=5, 
		ARCHIVO_MP3=6, ID=7, RUTA=8, TIEMPO=9, WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "COMANDO_CARGAR", "COMANDO_RECORTAR", "COMANDO_EXPORTAR", "COMANDO_ASIGNAR", 
			"ARCHIVO_MP3", "ID", "RUTA", "TIEMPO", "WS"
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
			"COMANDO_ASIGNAR", "ARCHIVO_MP3", "ID", "RUTA", "TIEMPO", "WS"
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
		"\u0004\u0000\n\u0091\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\'\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u00029\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003N\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004V\b\u0004\u0001\u0005\u0004\u0005Y\b\u0005"+
		"\u000b\u0005\f\u0005Z\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0004\u0006c\b\u0006\u000b\u0006\f\u0006d\u0001"+
		"\u0007\u0004\u0007h\b\u0007\u000b\u0007\f\u0007i\u0001\u0007\u0001\u0007"+
		"\u0004\u0007n\b\u0007\u000b\u0007\f\u0007o\u0001\u0007\u0005\u0007s\b"+
		"\u0007\n\u0007\f\u0007v\t\u0007\u0001\b\u0004\by\b\b\u000b\b\f\bz\u0001"+
		"\b\u0001\b\u0004\b\u007f\b\b\u000b\b\f\b\u0080\u0001\b\u0001\b\u0004\b"+
		"\u0085\b\b\u000b\b\f\b\u0086\u0003\b\u0089\b\b\u0001\t\u0004\t\u008c\b"+
		"\t\u000b\t\f\t\u008d\u0001\t\u0001\t\u0000\u0000\n\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0001\u0000\u0003\u0003\u000009AZaz\u0001\u000009\u0003\u0000\t\n\r"+
		"\r  \u00a4\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0001\u0015\u0001\u0000\u0000\u0000\u0003&\u0001\u0000\u0000\u0000\u0005"+
		"8\u0001\u0000\u0000\u0000\u0007M\u0001\u0000\u0000\u0000\tU\u0001\u0000"+
		"\u0000\u0000\u000bX\u0001\u0000\u0000\u0000\rb\u0001\u0000\u0000\u0000"+
		"\u000fg\u0001\u0000\u0000\u0000\u0011x\u0001\u0000\u0000\u0000\u0013\u008b"+
		"\u0001\u0000\u0000\u0000\u0015\u0016\u0005 \u0000\u0000\u0016\u0002\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0005c\u0000\u0000\u0018\u0019\u0005a\u0000"+
		"\u0000\u0019\u001a\u0005r\u0000\u0000\u001a\u001b\u0005g\u0000\u0000\u001b"+
		"\u001c\u0005a\u0000\u0000\u001c\'\u0005r\u0000\u0000\u001d\u001e\u0005"+
		"l\u0000\u0000\u001e\u001f\u0005o\u0000\u0000\u001f \u0005a\u0000\u0000"+
		" \'\u0005d\u0000\u0000!\"\u0005c\u0000\u0000\"#\u0005r\u0000\u0000#\'"+
		"\u0005g\u0000\u0000$%\u0005l\u0000\u0000%\'\u0005d\u0000\u0000&\u0017"+
		"\u0001\u0000\u0000\u0000&\u001d\u0001\u0000\u0000\u0000&!\u0001\u0000"+
		"\u0000\u0000&$\u0001\u0000\u0000\u0000\'\u0004\u0001\u0000\u0000\u0000"+
		"()\u0005r\u0000\u0000)*\u0005e\u0000\u0000*+\u0005c\u0000\u0000+,\u0005"+
		"o\u0000\u0000,-\u0005r\u0000\u0000-.\u0005t\u0000\u0000./\u0005a\u0000"+
		"\u0000/9\u0005r\u0000\u000001\u0005c\u0000\u000012\u0005u\u0000\u0000"+
		"29\u0005t\u0000\u000034\u0005r\u0000\u000045\u0005c\u0000\u000059\u0005"+
		"t\u0000\u000067\u0005c\u0000\u000079\u0005t\u0000\u00008(\u0001\u0000"+
		"\u0000\u000080\u0001\u0000\u0000\u000083\u0001\u0000\u0000\u000086\u0001"+
		"\u0000\u0000\u00009\u0006\u0001\u0000\u0000\u0000:;\u0005e\u0000\u0000"+
		";<\u0005x\u0000\u0000<=\u0005p\u0000\u0000=>\u0005o\u0000\u0000>?\u0005"+
		"r\u0000\u0000?@\u0005t\u0000\u0000@A\u0005a\u0000\u0000AN\u0005r\u0000"+
		"\u0000BC\u0005e\u0000\u0000CD\u0005x\u0000\u0000DE\u0005p\u0000\u0000"+
		"EF\u0005o\u0000\u0000FG\u0005r\u0000\u0000GN\u0005t\u0000\u0000HI\u0005"+
		"e\u0000\u0000IJ\u0005x\u0000\u0000JN\u0005p\u0000\u0000KL\u0005e\u0000"+
		"\u0000LN\u0005x\u0000\u0000M:\u0001\u0000\u0000\u0000MB\u0001\u0000\u0000"+
		"\u0000MH\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000N\b\u0001\u0000"+
		"\u0000\u0000OP\u0005c\u0000\u0000PQ\u0005o\u0000\u0000QR\u0005m\u0000"+
		"\u0000RV\u0005o\u0000\u0000ST\u0005a\u0000\u0000TV\u0005s\u0000\u0000"+
		"UO\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000V\n\u0001\u0000\u0000"+
		"\u0000WY\u0007\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001"+
		"\u0000\u0000\u0000\\]\u0005.\u0000\u0000]^\u0005m\u0000\u0000^_\u0005"+
		"p\u0000\u0000_`\u00053\u0000\u0000`\f\u0001\u0000\u0000\u0000ac\u0007"+
		"\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000e\u000e\u0001\u0000"+
		"\u0000\u0000fh\u0007\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000hi\u0001"+
		"\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000kt\u0005/\u0000\u0000ln\u0007\u0000\u0000\u0000"+
		"ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0005/\u0000"+
		"\u0000rm\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000u\u0010\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000wy\u0007\u0001\u0000\u0000xw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0005:\u0000\u0000}\u007f\u0007"+
		"\u0001\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081\u0088\u0001\u0000\u0000\u0000\u0082\u0084\u0005:\u0000\u0000\u0083"+
		"\u0085\u0007\u0001\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088"+
		"\u0082\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089"+
		"\u0012\u0001\u0000\u0000\u0000\u008a\u008c\u0007\u0002\u0000\u0000\u008b"+
		"\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d"+
		"\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0006\t\u0000\u0000\u0090\u0014"+
		"\u0001\u0000\u0000\u0000\u000f\u0000&8MUZdiotz\u0080\u0086\u0088\u008d"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}