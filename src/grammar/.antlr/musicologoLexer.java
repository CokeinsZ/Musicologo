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
		T__0=1, T__1=2, T__2=3, T__3=4, COMANDO_CARGAR=5, COMANDO_RECORTAR=6, 
		COMANDO_EXPORTAR=7, COMANDO_INCREMENTAR_VOL=8, COMANDO_ASIGNAR=9, COMANDO_DIVIDIR=10, 
		COMANDO_COMBINAR=11, COMANDO_SILENCIAR=12, CONDICIONAL=13, CONDICION=14, 
		HACER=15, ELSE=16, OPERADOR=17, CARACTERISTICA=18, ARCHIVO_MP3=19, ID=20, 
		RUTA=21, TIEMPO=22, VALOR=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "COMANDO_CARGAR", "COMANDO_RECORTAR", 
			"COMANDO_EXPORTAR", "COMANDO_INCREMENTAR_VOL", "COMANDO_ASIGNAR", "COMANDO_DIVIDIR", 
			"COMANDO_COMBINAR", "COMANDO_SILENCIAR", "CONDICIONAL", "CONDICION", 
			"HACER", "ELSE", "OPERADOR", "CARACTERISTICA", "ARCHIVO_MP3", "ID", "RUTA", 
			"TIEMPO", "VALOR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'{'", "' && '", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "COMANDO_CARGAR", "COMANDO_RECORTAR", "COMANDO_EXPORTAR", 
			"COMANDO_INCREMENTAR_VOL", "COMANDO_ASIGNAR", "COMANDO_DIVIDIR", "COMANDO_COMBINAR", 
			"COMANDO_SILENCIAR", "CONDICIONAL", "CONDICION", "HACER", "ELSE", "OPERADOR", 
			"CARACTERISTICA", "ARCHIVO_MP3", "ID", "RUTA", "TIEMPO", "VALOR", "WS"
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
		"\u0004\u0000\u0018\u0154\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004L\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005^\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"s\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0083\b\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u008b\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00a6\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b7\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c9\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0003\f\u00cf\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00d7\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00e5\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00ef\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00fa\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u011b\b\u0011\u0001\u0012\u0004"+
		"\u0012\u011e\b\u0012\u000b\u0012\f\u0012\u011f\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013\u0128\b\u0013"+
		"\u000b\u0013\f\u0013\u0129\u0001\u0014\u0004\u0014\u012d\b\u0014\u000b"+
		"\u0014\f\u0014\u012e\u0001\u0014\u0004\u0014\u0132\b\u0014\u000b\u0014"+
		"\f\u0014\u0133\u0001\u0015\u0004\u0015\u0137\b\u0015\u000b\u0015\f\u0015"+
		"\u0138\u0001\u0015\u0001\u0015\u0004\u0015\u013d\b\u0015\u000b\u0015\f"+
		"\u0015\u013e\u0001\u0015\u0001\u0015\u0004\u0015\u0143\b\u0015\u000b\u0015"+
		"\f\u0015\u0144\u0003\u0015\u0147\b\u0015\u0001\u0016\u0004\u0016\u014a"+
		"\b\u0016\u000b\u0016\f\u0016\u014b\u0001\u0017\u0004\u0017\u014f\b\u0017"+
		"\u000b\u0017\f\u0017\u0150\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u0018\u0001\u0000\u0004\u0002\u0000<<>>\u0003\u000009AZaz\u0001\u0000"+
		"09\u0003\u0000\t\n\r\r  \u017f\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00011\u0001\u0000"+
		"\u0000\u0000\u00033\u0001\u0000\u0000\u0000\u00055\u0001\u0000\u0000\u0000"+
		"\u0007:\u0001\u0000\u0000\u0000\tK\u0001\u0000\u0000\u0000\u000b]\u0001"+
		"\u0000\u0000\u0000\rr\u0001\u0000\u0000\u0000\u000f\u0082\u0001\u0000"+
		"\u0000\u0000\u0011\u008a\u0001\u0000\u0000\u0000\u0013\u00a5\u0001\u0000"+
		"\u0000\u0000\u0015\u00b6\u0001\u0000\u0000\u0000\u0017\u00c8\u0001\u0000"+
		"\u0000\u0000\u0019\u00ce\u0001\u0000\u0000\u0000\u001b\u00d0\u0001\u0000"+
		"\u0000\u0000\u001d\u00e4\u0001\u0000\u0000\u0000\u001f\u00ee\u0001\u0000"+
		"\u0000\u0000!\u00f9\u0001\u0000\u0000\u0000#\u011a\u0001\u0000\u0000\u0000"+
		"%\u011d\u0001\u0000\u0000\u0000\'\u0127\u0001\u0000\u0000\u0000)\u0131"+
		"\u0001\u0000\u0000\u0000+\u0136\u0001\u0000\u0000\u0000-\u0149\u0001\u0000"+
		"\u0000\u0000/\u014e\u0001\u0000\u0000\u000012\u0005 \u0000\u00002\u0002"+
		"\u0001\u0000\u0000\u000034\u0005{\u0000\u00004\u0004\u0001\u0000\u0000"+
		"\u000056\u0005 \u0000\u000067\u0005&\u0000\u000078\u0005&\u0000\u0000"+
		"89\u0005 \u0000\u00009\u0006\u0001\u0000\u0000\u0000:;\u0005}\u0000\u0000"+
		";\b\u0001\u0000\u0000\u0000<=\u0005c\u0000\u0000=>\u0005a\u0000\u0000"+
		">?\u0005r\u0000\u0000?@\u0005g\u0000\u0000@A\u0005a\u0000\u0000AL\u0005"+
		"r\u0000\u0000BC\u0005l\u0000\u0000CD\u0005o\u0000\u0000DE\u0005a\u0000"+
		"\u0000EL\u0005d\u0000\u0000FG\u0005c\u0000\u0000GH\u0005r\u0000\u0000"+
		"HL\u0005g\u0000\u0000IJ\u0005l\u0000\u0000JL\u0005d\u0000\u0000K<\u0001"+
		"\u0000\u0000\u0000KB\u0001\u0000\u0000\u0000KF\u0001\u0000\u0000\u0000"+
		"KI\u0001\u0000\u0000\u0000L\n\u0001\u0000\u0000\u0000MN\u0005r\u0000\u0000"+
		"NO\u0005e\u0000\u0000OP\u0005c\u0000\u0000PQ\u0005o\u0000\u0000QR\u0005"+
		"r\u0000\u0000RS\u0005t\u0000\u0000ST\u0005a\u0000\u0000T^\u0005r\u0000"+
		"\u0000UV\u0005c\u0000\u0000VW\u0005u\u0000\u0000W^\u0005t\u0000\u0000"+
		"XY\u0005r\u0000\u0000YZ\u0005c\u0000\u0000Z^\u0005t\u0000\u0000[\\\u0005"+
		"c\u0000\u0000\\^\u0005t\u0000\u0000]M\u0001\u0000\u0000\u0000]U\u0001"+
		"\u0000\u0000\u0000]X\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"^\f\u0001\u0000\u0000\u0000_`\u0005e\u0000\u0000`a\u0005x\u0000\u0000"+
		"ab\u0005p\u0000\u0000bc\u0005o\u0000\u0000cd\u0005r\u0000\u0000de\u0005"+
		"t\u0000\u0000ef\u0005a\u0000\u0000fs\u0005r\u0000\u0000gh\u0005e\u0000"+
		"\u0000hi\u0005x\u0000\u0000ij\u0005p\u0000\u0000jk\u0005o\u0000\u0000"+
		"kl\u0005r\u0000\u0000ls\u0005t\u0000\u0000mn\u0005e\u0000\u0000no\u0005"+
		"x\u0000\u0000os\u0005p\u0000\u0000pq\u0005e\u0000\u0000qs\u0005x\u0000"+
		"\u0000r_\u0001\u0000\u0000\u0000rg\u0001\u0000\u0000\u0000rm\u0001\u0000"+
		"\u0000\u0000rp\u0001\u0000\u0000\u0000s\u000e\u0001\u0000\u0000\u0000"+
		"tu\u0005s\u0000\u0000uv\u0005u\u0000\u0000vw\u0005b\u0000\u0000wx\u0005"+
		"i\u0000\u0000xy\u0005r\u0000\u0000yz\u0005V\u0000\u0000z{\u0005o\u0000"+
		"\u0000{\u0083\u0005l\u0000\u0000|}\u0005u\u0000\u0000}\u0083\u0005p\u0000"+
		"\u0000~\u007f\u0005s\u0000\u0000\u007f\u0083\u0005b\u0000\u0000\u0080"+
		"\u0081\u0005s\u0000\u0000\u0081\u0083\u0005p\u0000\u0000\u0082t\u0001"+
		"\u0000\u0000\u0000\u0082|\u0001\u0000\u0000\u0000\u0082~\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0010\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005c\u0000\u0000\u0085\u0086\u0005o\u0000\u0000\u0086"+
		"\u0087\u0005m\u0000\u0000\u0087\u008b\u0005o\u0000\u0000\u0088\u0089\u0005"+
		"a\u0000\u0000\u0089\u008b\u0005s\u0000\u0000\u008a\u0084\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u0012\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0005d\u0000\u0000\u008d\u008e\u0005i\u0000\u0000\u008e"+
		"\u008f\u0005v\u0000\u0000\u008f\u0090\u0005i\u0000\u0000\u0090\u0091\u0005"+
		"d\u0000\u0000\u0091\u0092\u0005i\u0000\u0000\u0092\u0093\u0005r\u0000"+
		"\u0000\u0093\u0094\u0005_\u0000\u0000\u0094\u0095\u0005e\u0000\u0000\u0095"+
		"\u0096\u0005n\u0000\u0000\u0096\u0097\u0005_\u0000\u0000\u0097\u0098\u0005"+
		"t\u0000\u0000\u0098\u0099\u0005r\u0000\u0000\u0099\u009a\u0005o\u0000"+
		"\u0000\u009a\u009b\u0005z\u0000\u0000\u009b\u009c\u0005o\u0000\u0000\u009c"+
		"\u00a6\u0005s\u0000\u0000\u009d\u009e\u0005s\u0000\u0000\u009e\u009f\u0005"+
		"p\u0000\u0000\u009f\u00a0\u0005l\u0000\u0000\u00a0\u00a1\u0005i\u0000"+
		"\u0000\u00a1\u00a6\u0005t\u0000\u0000\u00a2\u00a3\u0005d\u0000\u0000\u00a3"+
		"\u00a4\u0005i\u0000\u0000\u00a4\u00a6\u0005v\u0000\u0000\u00a5\u008c\u0001"+
		"\u0000\u0000\u0000\u00a5\u009d\u0001\u0000\u0000\u0000\u00a5\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a6\u0014\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005"+
		"c\u0000\u0000\u00a8\u00a9\u0005o\u0000\u0000\u00a9\u00aa\u0005m\u0000"+
		"\u0000\u00aa\u00ab\u0005b\u0000\u0000\u00ab\u00ac\u0005i\u0000\u0000\u00ac"+
		"\u00ad\u0005n\u0000\u0000\u00ad\u00ae\u0005a\u0000\u0000\u00ae\u00b7\u0005"+
		"r\u0000\u0000\u00af\u00b0\u0005m\u0000\u0000\u00b0\u00b1\u0005i\u0000"+
		"\u0000\u00b1\u00b7\u0005x\u0000\u0000\u00b2\u00b3\u0005c\u0000\u0000\u00b3"+
		"\u00b4\u0005o\u0000\u0000\u00b4\u00b5\u0005m\u0000\u0000\u00b5\u00b7\u0005"+
		"b\u0000\u0000\u00b6\u00a7\u0001\u0000\u0000\u0000\u00b6\u00af\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b2\u0001\u0000\u0000\u0000\u00b7\u0016\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0005s\u0000\u0000\u00b9\u00ba\u0005i\u0000\u0000"+
		"\u00ba\u00bb\u0005l\u0000\u0000\u00bb\u00bc\u0005e\u0000\u0000\u00bc\u00bd"+
		"\u0005n\u0000\u0000\u00bd\u00be\u0005c\u0000\u0000\u00be\u00bf\u0005i"+
		"\u0000\u0000\u00bf\u00c0\u0005a\u0000\u0000\u00c0\u00c9\u0005r\u0000\u0000"+
		"\u00c1\u00c2\u0005m\u0000\u0000\u00c2\u00c3\u0005u\u0000\u0000\u00c3\u00c4"+
		"\u0005t\u0000\u0000\u00c4\u00c9\u0005e\u0000\u0000\u00c5\u00c6\u0005s"+
		"\u0000\u0000\u00c6\u00c7\u0005i\u0000\u0000\u00c7\u00c9\u0005l\u0000\u0000"+
		"\u00c8\u00b8\u0001\u0000\u0000\u0000\u00c8\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c9\u0018\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0005s\u0000\u0000\u00cb\u00cf\u0005i\u0000\u0000\u00cc\u00cd"+
		"\u0005i\u0000\u0000\u00cd\u00cf\u0005f\u0000\u0000\u00ce\u00ca\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u001a\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u0003#\u0011\u0000\u00d1\u00d2\u0003\'\u0013"+
		"\u0000\u00d2\u00d6\u0003!\u0010\u0000\u00d3\u00d7\u0003+\u0015\u0000\u00d4"+
		"\u00d7\u0003-\u0016\u0000\u00d5\u00d7\u0003\'\u0013\u0000\u00d6\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d7\u001c\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0005e\u0000\u0000\u00d9\u00da\u0005n\u0000\u0000\u00da\u00db\u0005t"+
		"\u0000\u0000\u00db\u00dc\u0005o\u0000\u0000\u00dc\u00dd\u0005n\u0000\u0000"+
		"\u00dd\u00de\u0005c\u0000\u0000\u00de\u00df\u0005e\u0000\u0000\u00df\u00e5"+
		"\u0005s\u0000\u0000\u00e0\u00e1\u0005t\u0000\u0000\u00e1\u00e2\u0005h"+
		"\u0000\u0000\u00e2\u00e3\u0005e\u0000\u0000\u00e3\u00e5\u0005n\u0000\u0000"+
		"\u00e4\u00d8\u0001\u0000\u0000\u0000\u00e4\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e5\u001e\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005s\u0000\u0000\u00e7"+
		"\u00e8\u0005i\u0000\u0000\u00e8\u00e9\u0005n\u0000\u0000\u00e9\u00ef\u0005"+
		"o\u0000\u0000\u00ea\u00eb\u0005e\u0000\u0000\u00eb\u00ec\u0005l\u0000"+
		"\u0000\u00ec\u00ed\u0005s\u0000\u0000\u00ed\u00ef\u0005e\u0000\u0000\u00ee"+
		"\u00e6\u0001\u0000\u0000\u0000\u00ee\u00ea\u0001\u0000\u0000\u0000\u00ef"+
		" \u0001\u0000\u0000\u0000\u00f0\u00fa\u0007\u0000\u0000\u0000\u00f1\u00f2"+
		"\u0005>\u0000\u0000\u00f2\u00fa\u0005=\u0000\u0000\u00f3\u00f4\u0005<"+
		"\u0000\u0000\u00f4\u00fa\u0005=\u0000\u0000\u00f5\u00f6\u0005=\u0000\u0000"+
		"\u00f6\u00fa\u0005=\u0000\u0000\u00f7\u00f8\u0005!\u0000\u0000\u00f8\u00fa"+
		"\u0005=\u0000\u0000\u00f9\u00f0\u0001\u0000\u0000\u0000\u00f9\u00f1\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f3\u0001\u0000\u0000\u0000\u00f9\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\"\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0005d\u0000\u0000\u00fc\u00fd\u0005u\u0000\u0000"+
		"\u00fd\u00fe\u0005r\u0000\u0000\u00fe\u00ff\u0005a\u0000\u0000\u00ff\u0100"+
		"\u0005c\u0000\u0000\u0100\u0101\u0005i\u0000\u0000\u0101\u0102\u0005\u00f3"+
		"\u0000\u0000\u0102\u011b\u0005n\u0000\u0000\u0103\u0104\u0005d\u0000\u0000"+
		"\u0104\u0105\u0005u\u0000\u0000\u0105\u0106\u0005r\u0000\u0000\u0106\u0107"+
		"\u0005a\u0000\u0000\u0107\u0108\u0005c\u0000\u0000\u0108\u0109\u0005i"+
		"\u0000\u0000\u0109\u010a\u0005o\u0000\u0000\u010a\u011b\u0005n\u0000\u0000"+
		"\u010b\u010c\u0005d\u0000\u0000\u010c\u010d\u0005u\u0000\u0000\u010d\u011b"+
		"\u0005r\u0000\u0000\u010e\u011b\u0005d\u0000\u0000\u010f\u0110\u0005v"+
		"\u0000\u0000\u0110\u0111\u0005o\u0000\u0000\u0111\u0112\u0005l\u0000\u0000"+
		"\u0112\u0113\u0005u\u0000\u0000\u0113\u0114\u0005m\u0000\u0000\u0114\u0115"+
		"\u0005e\u0000\u0000\u0115\u011b\u0005n\u0000\u0000\u0116\u0117\u0005v"+
		"\u0000\u0000\u0117\u0118\u0005o\u0000\u0000\u0118\u011b\u0005l\u0000\u0000"+
		"\u0119\u011b\u0005v\u0000\u0000\u011a\u00fb\u0001\u0000\u0000\u0000\u011a"+
		"\u0103\u0001\u0000\u0000\u0000\u011a\u010b\u0001\u0000\u0000\u0000\u011a"+
		"\u010e\u0001\u0000\u0000\u0000\u011a\u010f\u0001\u0000\u0000\u0000\u011a"+
		"\u0116\u0001\u0000\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b"+
		"$\u0001\u0000\u0000\u0000\u011c\u011e\u0007\u0001\u0000\u0000\u011d\u011c"+
		"\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f\u011d"+
		"\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0001\u0000\u0000\u0000\u0121\u0122\u0005.\u0000\u0000\u0122\u0123\u0005"+
		"m\u0000\u0000\u0123\u0124\u0005p\u0000\u0000\u0124\u0125\u00053\u0000"+
		"\u0000\u0125&\u0001\u0000\u0000\u0000\u0126\u0128\u0007\u0001\u0000\u0000"+
		"\u0127\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000"+
		"\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000"+
		"\u012a(\u0001\u0000\u0000\u0000\u012b\u012d\u0007\u0001\u0000\u0000\u012c"+
		"\u012b\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e"+
		"\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f"+
		"\u0130\u0001\u0000\u0000\u0000\u0130\u0132\u0005/\u0000\u0000\u0131\u012c"+
		"\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0131"+
		"\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134*\u0001"+
		"\u0000\u0000\u0000\u0135\u0137\u0007\u0002\u0000\u0000\u0136\u0135\u0001"+
		"\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0136\u0001"+
		"\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013a\u0001"+
		"\u0000\u0000\u0000\u013a\u013c\u0005:\u0000\u0000\u013b\u013d\u0007\u0002"+
		"\u0000\u0000\u013c\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000"+
		"\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000"+
		"\u0000\u0000\u013f\u0146\u0001\u0000\u0000\u0000\u0140\u0142\u0005:\u0000"+
		"\u0000\u0141\u0143\u0007\u0002\u0000\u0000\u0142\u0141\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0147\u0001\u0000\u0000"+
		"\u0000\u0146\u0140\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000"+
		"\u0000\u0147,\u0001\u0000\u0000\u0000\u0148\u014a\u0007\u0002\u0000\u0000"+
		"\u0149\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000"+
		"\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000"+
		"\u014c.\u0001\u0000\u0000\u0000\u014d\u014f\u0007\u0003\u0000\u0000\u014e"+
		"\u014d\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150"+
		"\u014e\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151"+
		"\u0152\u0001\u0000\u0000\u0000\u0152\u0153\u0006\u0017\u0000\u0000\u0153"+
		"0\u0001\u0000\u0000\u0000\u0019\u0000K]r\u0082\u008a\u00a5\u00b6\u00c8"+
		"\u00ce\u00d6\u00e4\u00ee\u00f9\u011a\u011f\u0129\u012e\u0133\u0138\u013e"+
		"\u0144\u0146\u014b\u0150\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}