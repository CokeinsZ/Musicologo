// Generated from c:/Users/alejandro/Documents/musica/src/grammar/musicologo.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class musicologoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, COMANDO_CARGAR=2, COMANDO_RECORTAR=3, ARCHIVO_MP3=4, RUTA=5, TIEMPO=6, 
		WS=7;
	public static final int
		RULE_inicio = 0, RULE_expresion = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "expresion"
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

	@Override
	public String getGrammarFileName() { return "musicologo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public musicologoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(musicologoParser.EOF, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMANDO_CARGAR || _la==COMANDO_RECORTAR) {
				{
				{
				setState(4);
				expresion();
				}
				}
				setState(9);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(10);
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
	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RecortarFuncionContext extends ExpresionContext {
		public TerminalNode COMANDO_RECORTAR() { return getToken(musicologoParser.COMANDO_RECORTAR, 0); }
		public List<TerminalNode> TIEMPO() { return getTokens(musicologoParser.TIEMPO); }
		public TerminalNode TIEMPO(int i) {
			return getToken(musicologoParser.TIEMPO, i);
		}
		public TerminalNode ARCHIVO_MP3() { return getToken(musicologoParser.ARCHIVO_MP3, 0); }
		public RecortarFuncionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CargarFuncionContext extends ExpresionContext {
		public TerminalNode COMANDO_CARGAR() { return getToken(musicologoParser.COMANDO_CARGAR, 0); }
		public TerminalNode ARCHIVO_MP3() { return getToken(musicologoParser.ARCHIVO_MP3, 0); }
		public TerminalNode RUTA() { return getToken(musicologoParser.RUTA, 0); }
		public CargarFuncionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expresion);
		int _la;
		try {
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMANDO_CARGAR:
				_localctx = new CargarFuncionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				match(COMANDO_CARGAR);
				setState(13);
				match(T__0);
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RUTA) {
					{
					setState(14);
					match(RUTA);
					}
				}

				setState(17);
				match(ARCHIVO_MP3);
				}
				break;
			case COMANDO_RECORTAR:
				_localctx = new RecortarFuncionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				match(COMANDO_RECORTAR);
				setState(19);
				match(T__0);
				setState(20);
				match(TIEMPO);
				setState(21);
				match(TIEMPO);
				setState(22);
				match(ARCHIVO_MP3);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0007\u001a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0005\u0000\u0006\b\u0000\n\u0000\f\u0000\t\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0010"+
		"\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u0018\b\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002"+
		"\u0000\u0000\u001a\u0000\u0007\u0001\u0000\u0000\u0000\u0002\u0017\u0001"+
		"\u0000\u0000\u0000\u0004\u0006\u0003\u0002\u0001\u0000\u0005\u0004\u0001"+
		"\u0000\u0000\u0000\u0006\t\u0001\u0000\u0000\u0000\u0007\u0005\u0001\u0000"+
		"\u0000\u0000\u0007\b\u0001\u0000\u0000\u0000\b\n\u0001\u0000\u0000\u0000"+
		"\t\u0007\u0001\u0000\u0000\u0000\n\u000b\u0005\u0000\u0000\u0001\u000b"+
		"\u0001\u0001\u0000\u0000\u0000\f\r\u0005\u0002\u0000\u0000\r\u000f\u0005"+
		"\u0001\u0000\u0000\u000e\u0010\u0005\u0005\u0000\u0000\u000f\u000e\u0001"+
		"\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0011\u0001"+
		"\u0000\u0000\u0000\u0011\u0018\u0005\u0004\u0000\u0000\u0012\u0013\u0005"+
		"\u0003\u0000\u0000\u0013\u0014\u0005\u0001\u0000\u0000\u0014\u0015\u0005"+
		"\u0006\u0000\u0000\u0015\u0016\u0005\u0006\u0000\u0000\u0016\u0018\u0005"+
		"\u0004\u0000\u0000\u0017\f\u0001\u0000\u0000\u0000\u0017\u0012\u0001\u0000"+
		"\u0000\u0000\u0018\u0003\u0001\u0000\u0000\u0000\u0003\u0007\u000f\u0017";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}