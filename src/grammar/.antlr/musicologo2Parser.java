// Generated from c:/Users/alejandro/Documents/musica/src/grammar/musicologo2.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class musicologo2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, COMANDO_CARGAR=5, COMANDO_RECORTAR=6, 
		COMANDO_EXPORTAR=7, COMANDO_INCREMENTAR_VOL=8, COMANDO_ASIGNAR=9, CONDICIONAL=10, 
		HACER=11, ELSE=12, CARACTERISTICA=13, COMANDO_DIVIDIR=14, COMANDO_COMBINAR=15, 
		COMANDO_SILENCIAR=16, OPERADOR=17, ARCHIVO_MP3=18, ID=19, RUTA=20, TIEMPO=21, 
		VALOR=22, WS=23;
	public static final int
		RULE_inicio = 0, RULE_expresion = 1, RULE_condicion = 2, RULE_bloque = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "expresion", "condicion", "bloque"
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
			"COMANDO_INCREMENTAR_VOL", "COMANDO_ASIGNAR", "CONDICIONAL", "HACER", 
			"ELSE", "CARACTERISTICA", "COMANDO_DIVIDIR", "COMANDO_COMBINAR", "COMANDO_SILENCIAR", 
			"OPERADOR", "ARCHIVO_MP3", "ID", "RUTA", "TIEMPO", "VALOR", "WS"
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
	public String getGrammarFileName() { return "musicologo2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public musicologo2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(musicologo2Parser.EOF, 0); }
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
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 116192L) != 0)) {
				{
				{
				setState(8);
				expresion();
				}
				}
				setState(13);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(14);
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
		public TerminalNode COMANDO_RECORTAR() { return getToken(musicologo2Parser.COMANDO_RECORTAR, 0); }
		public List<TerminalNode> TIEMPO() { return getTokens(musicologo2Parser.TIEMPO); }
		public TerminalNode TIEMPO(int i) {
			return getToken(musicologo2Parser.TIEMPO, i);
		}
		public List<TerminalNode> ID() { return getTokens(musicologo2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(musicologo2Parser.ID, i);
		}
		public TerminalNode COMANDO_ASIGNAR() { return getToken(musicologo2Parser.COMANDO_ASIGNAR, 0); }
		public RecortarFuncionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DividirFuncionContext extends ExpresionContext {
		public TerminalNode COMANDO_DIVIDIR() { return getToken(musicologo2Parser.COMANDO_DIVIDIR, 0); }
		public TerminalNode TIEMPO() { return getToken(musicologo2Parser.TIEMPO, 0); }
		public List<TerminalNode> ID() { return getTokens(musicologo2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(musicologo2Parser.ID, i);
		}
		public TerminalNode COMANDO_ASIGNAR() { return getToken(musicologo2Parser.COMANDO_ASIGNAR, 0); }
		public DividirFuncionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportarFuncionContext extends ExpresionContext {
		public TerminalNode COMANDO_EXPORTAR() { return getToken(musicologo2Parser.COMANDO_EXPORTAR, 0); }
		public TerminalNode ID() { return getToken(musicologo2Parser.ID, 0); }
		public ExportarFuncionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncrementarVolFuncionContext extends ExpresionContext {
		public TerminalNode COMANDO_INCREMENTAR_VOL() { return getToken(musicologo2Parser.COMANDO_INCREMENTAR_VOL, 0); }
		public TerminalNode ID() { return getToken(musicologo2Parser.ID, 0); }
		public TerminalNode VALOR() { return getToken(musicologo2Parser.VALOR, 0); }
		public List<TerminalNode> TIEMPO() { return getTokens(musicologo2Parser.TIEMPO); }
		public TerminalNode TIEMPO(int i) {
			return getToken(musicologo2Parser.TIEMPO, i);
		}
		public IncrementarVolFuncionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SilenciarFuncionContext extends ExpresionContext {
		public TerminalNode COMANDO_SILENCIAR() { return getToken(musicologo2Parser.COMANDO_SILENCIAR, 0); }
		public List<TerminalNode> TIEMPO() { return getTokens(musicologo2Parser.TIEMPO); }
		public TerminalNode TIEMPO(int i) {
			return getToken(musicologo2Parser.TIEMPO, i);
		}
		public TerminalNode ID() { return getToken(musicologo2Parser.ID, 0); }
		public SilenciarFuncionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CombinarFuncionContext extends ExpresionContext {
		public TerminalNode COMANDO_COMBINAR() { return getToken(musicologo2Parser.COMANDO_COMBINAR, 0); }
		public List<TerminalNode> ID() { return getTokens(musicologo2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(musicologo2Parser.ID, i);
		}
		public TerminalNode COMANDO_ASIGNAR() { return getToken(musicologo2Parser.COMANDO_ASIGNAR, 0); }
		public CombinarFuncionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CargarFuncionContext extends ExpresionContext {
		public TerminalNode COMANDO_CARGAR() { return getToken(musicologo2Parser.COMANDO_CARGAR, 0); }
		public TerminalNode ARCHIVO_MP3() { return getToken(musicologo2Parser.ARCHIVO_MP3, 0); }
		public TerminalNode COMANDO_ASIGNAR() { return getToken(musicologo2Parser.COMANDO_ASIGNAR, 0); }
		public TerminalNode ID() { return getToken(musicologo2Parser.ID, 0); }
		public TerminalNode RUTA() { return getToken(musicologo2Parser.RUTA, 0); }
		public CargarFuncionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalFuncionContext extends ExpresionContext {
		public TerminalNode CONDICIONAL() { return getToken(musicologo2Parser.CONDICIONAL, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode HACER() { return getToken(musicologo2Parser.HACER, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(musicologo2Parser.ELSE, 0); }
		public CondicionalFuncionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expresion);
		int _la;
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMANDO_CARGAR:
				_localctx = new CargarFuncionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(COMANDO_CARGAR);
				setState(17);
				match(T__0);
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RUTA) {
					{
					setState(18);
					match(RUTA);
					}
				}

				setState(21);
				match(ARCHIVO_MP3);
				setState(22);
				match(T__0);
				setState(23);
				match(COMANDO_ASIGNAR);
				setState(24);
				match(T__0);
				setState(25);
				match(ID);
				}
				break;
			case COMANDO_RECORTAR:
				_localctx = new RecortarFuncionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				match(COMANDO_RECORTAR);
				setState(27);
				match(T__0);
				setState(28);
				match(TIEMPO);
				setState(29);
				match(T__0);
				setState(30);
				match(TIEMPO);
				setState(31);
				match(T__0);
				setState(32);
				match(ID);
				setState(33);
				match(T__0);
				setState(34);
				match(COMANDO_ASIGNAR);
				setState(35);
				match(T__0);
				setState(36);
				match(ID);
				}
				break;
			case COMANDO_EXPORTAR:
				_localctx = new ExportarFuncionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				match(COMANDO_EXPORTAR);
				setState(38);
				match(T__0);
				setState(39);
				match(ID);
				}
				break;
			case COMANDO_INCREMENTAR_VOL:
				_localctx = new IncrementarVolFuncionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				match(COMANDO_INCREMENTAR_VOL);
				setState(41);
				match(T__0);
				setState(42);
				match(ID);
				setState(43);
				match(T__0);
				setState(44);
				match(VALOR);
				setState(49);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(45);
					match(T__0);
					setState(46);
					match(TIEMPO);
					setState(47);
					match(T__0);
					setState(48);
					match(TIEMPO);
					}
					break;
				}
				}
				break;
			case CONDICIONAL:
				_localctx = new CondicionalFuncionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				match(CONDICIONAL);
				setState(52);
				match(T__0);
				setState(53);
				condicion();
				setState(54);
				match(T__0);
				setState(55);
				match(HACER);
				setState(56);
				match(T__0);
				setState(57);
				bloque();
				setState(62);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(58);
					match(T__0);
					setState(59);
					match(ELSE);
					setState(60);
					match(T__0);
					setState(61);
					bloque();
					}
					break;
				}
				}
				break;
			case COMANDO_DIVIDIR:
				_localctx = new DividirFuncionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				match(COMANDO_DIVIDIR);
				setState(65);
				match(T__0);
				setState(66);
				match(TIEMPO);
				setState(67);
				match(T__0);
				setState(68);
				match(ID);
				setState(69);
				match(T__0);
				setState(70);
				match(COMANDO_ASIGNAR);
				setState(71);
				match(T__0);
				setState(72);
				match(ID);
				}
				break;
			case COMANDO_COMBINAR:
				_localctx = new CombinarFuncionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(73);
				match(COMANDO_COMBINAR);
				setState(74);
				match(T__0);
				setState(75);
				match(ID);
				setState(76);
				match(T__0);
				setState(77);
				match(ID);
				setState(78);
				match(T__0);
				setState(79);
				match(COMANDO_ASIGNAR);
				setState(80);
				match(T__0);
				setState(81);
				match(ID);
				}
				break;
			case COMANDO_SILENCIAR:
				_localctx = new SilenciarFuncionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(82);
				match(COMANDO_SILENCIAR);
				setState(83);
				match(T__0);
				setState(84);
				match(TIEMPO);
				setState(85);
				match(T__0);
				setState(86);
				match(TIEMPO);
				setState(87);
				match(T__0);
				setState(88);
				match(ID);
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
	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode CARACTERISTICA() { return getToken(musicologo2Parser.CARACTERISTICA, 0); }
		public List<TerminalNode> ID() { return getTokens(musicologo2Parser.ID); }
		public TerminalNode ID(int i) {
			return getToken(musicologo2Parser.ID, i);
		}
		public TerminalNode OPERADOR() { return getToken(musicologo2Parser.OPERADOR, 0); }
		public TerminalNode TIEMPO() { return getToken(musicologo2Parser.TIEMPO, 0); }
		public TerminalNode VALOR() { return getToken(musicologo2Parser.VALOR, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(CARACTERISTICA);
			setState(92);
			match(ID);
			setState(93);
			match(OPERADOR);
			setState(94);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6815744L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloque);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(T__1);
				setState(97);
				expresion();
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(98);
					match(T__2);
					setState(99);
					expresion();
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(105);
				match(T__3);
				}
				break;
			case COMANDO_CARGAR:
			case COMANDO_RECORTAR:
			case COMANDO_EXPORTAR:
			case COMANDO_INCREMENTAR_VOL:
			case CONDICIONAL:
			case COMANDO_DIVIDIR:
			case COMANDO_COMBINAR:
			case COMANDO_SILENCIAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				expresion();
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
		"\u0004\u0001\u0017o\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0005\u0000\n\b"+
		"\u0000\n\u0000\f\u0000\r\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u0014\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u00012\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001?\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001Z\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003e\b"+
		"\u0003\n\u0003\f\u0003h\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003m\b\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006"+
		"\u0000\u0001\u0002\u0000\u0013\u0013\u0015\u0016w\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0002Y\u0001\u0000\u0000\u0000\u0004[\u0001\u0000\u0000\u0000"+
		"\u0006l\u0001\u0000\u0000\u0000\b\n\u0003\u0002\u0001\u0000\t\b\u0001"+
		"\u0000\u0000\u0000\n\r\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000"+
		"\u0000\u000b\f\u0001\u0000\u0000\u0000\f\u000e\u0001\u0000\u0000\u0000"+
		"\r\u000b\u0001\u0000\u0000\u0000\u000e\u000f\u0005\u0000\u0000\u0001\u000f"+
		"\u0001\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0005\u0000\u0000\u0011"+
		"\u0013\u0005\u0001\u0000\u0000\u0012\u0014\u0005\u0014\u0000\u0000\u0013"+
		"\u0012\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014"+
		"\u0015\u0001\u0000\u0000\u0000\u0015\u0016\u0005\u0012\u0000\u0000\u0016"+
		"\u0017\u0005\u0001\u0000\u0000\u0017\u0018\u0005\t\u0000\u0000\u0018\u0019"+
		"\u0005\u0001\u0000\u0000\u0019Z\u0005\u0013\u0000\u0000\u001a\u001b\u0005"+
		"\u0006\u0000\u0000\u001b\u001c\u0005\u0001\u0000\u0000\u001c\u001d\u0005"+
		"\u0015\u0000\u0000\u001d\u001e\u0005\u0001\u0000\u0000\u001e\u001f\u0005"+
		"\u0015\u0000\u0000\u001f \u0005\u0001\u0000\u0000 !\u0005\u0013\u0000"+
		"\u0000!\"\u0005\u0001\u0000\u0000\"#\u0005\t\u0000\u0000#$\u0005\u0001"+
		"\u0000\u0000$Z\u0005\u0013\u0000\u0000%&\u0005\u0007\u0000\u0000&\'\u0005"+
		"\u0001\u0000\u0000\'Z\u0005\u0013\u0000\u0000()\u0005\b\u0000\u0000)*"+
		"\u0005\u0001\u0000\u0000*+\u0005\u0013\u0000\u0000+,\u0005\u0001\u0000"+
		"\u0000,1\u0005\u0016\u0000\u0000-.\u0005\u0001\u0000\u0000./\u0005\u0015"+
		"\u0000\u0000/0\u0005\u0001\u0000\u000002\u0005\u0015\u0000\u00001-\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u00002Z\u0001\u0000\u0000\u0000"+
		"34\u0005\n\u0000\u000045\u0005\u0001\u0000\u000056\u0003\u0004\u0002\u0000"+
		"67\u0005\u0001\u0000\u000078\u0005\u000b\u0000\u000089\u0005\u0001\u0000"+
		"\u00009>\u0003\u0006\u0003\u0000:;\u0005\u0001\u0000\u0000;<\u0005\f\u0000"+
		"\u0000<=\u0005\u0001\u0000\u0000=?\u0003\u0006\u0003\u0000>:\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000?Z\u0001\u0000\u0000\u0000@A\u0005"+
		"\u000e\u0000\u0000AB\u0005\u0001\u0000\u0000BC\u0005\u0015\u0000\u0000"+
		"CD\u0005\u0001\u0000\u0000DE\u0005\u0013\u0000\u0000EF\u0005\u0001\u0000"+
		"\u0000FG\u0005\t\u0000\u0000GH\u0005\u0001\u0000\u0000HZ\u0005\u0013\u0000"+
		"\u0000IJ\u0005\u000f\u0000\u0000JK\u0005\u0001\u0000\u0000KL\u0005\u0013"+
		"\u0000\u0000LM\u0005\u0001\u0000\u0000MN\u0005\u0013\u0000\u0000NO\u0005"+
		"\u0001\u0000\u0000OP\u0005\t\u0000\u0000PQ\u0005\u0001\u0000\u0000QZ\u0005"+
		"\u0013\u0000\u0000RS\u0005\u0010\u0000\u0000ST\u0005\u0001\u0000\u0000"+
		"TU\u0005\u0015\u0000\u0000UV\u0005\u0001\u0000\u0000VW\u0005\u0015\u0000"+
		"\u0000WX\u0005\u0001\u0000\u0000XZ\u0005\u0013\u0000\u0000Y\u0010\u0001"+
		"\u0000\u0000\u0000Y\u001a\u0001\u0000\u0000\u0000Y%\u0001\u0000\u0000"+
		"\u0000Y(\u0001\u0000\u0000\u0000Y3\u0001\u0000\u0000\u0000Y@\u0001\u0000"+
		"\u0000\u0000YI\u0001\u0000\u0000\u0000YR\u0001\u0000\u0000\u0000Z\u0003"+
		"\u0001\u0000\u0000\u0000[\\\u0005\r\u0000\u0000\\]\u0005\u0013\u0000\u0000"+
		"]^\u0005\u0011\u0000\u0000^_\u0007\u0000\u0000\u0000_\u0005\u0001\u0000"+
		"\u0000\u0000`a\u0005\u0002\u0000\u0000af\u0003\u0002\u0001\u0000bc\u0005"+
		"\u0003\u0000\u0000ce\u0003\u0002\u0001\u0000db\u0001\u0000\u0000\u0000"+
		"eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000gi\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0005\u0004"+
		"\u0000\u0000jm\u0001\u0000\u0000\u0000km\u0003\u0002\u0001\u0000l`\u0001"+
		"\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000m\u0007\u0001\u0000\u0000"+
		"\u0000\u0007\u000b\u00131>Yfl";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}