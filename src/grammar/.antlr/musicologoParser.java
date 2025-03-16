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
		T__0=1, T__1=2, T__2=3, T__3=4, COMANDO_CARGAR=5, COMANDO_RECORTAR=6, 
		COMANDO_EXPORTAR=7, COMANDO_INCREMENTAR_VOL=8, COMANDO_ASIGNAR=9, COMANDO_DIVIDIR=10, 
		COMANDO_COMBINAR=11, COMANDO_SILENCIAR=12, CONDICIONAL=13, CONDICION=14, 
		HACER=15, ELSE=16, OPERADOR=17, CARACTERISTICA=18, ARCHIVO_MP3=19, ID=20, 
		RUTA=21, TIEMPO=22, VALOR=23, WS=24;
	public static final int
		RULE_inicio = 0, RULE_expresion = 1, RULE_bloque = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "expresion", "bloque"
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
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15840L) != 0)) {
				{
				{
				setState(6);
				expresion();
				}
				}
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(12);
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
		public List<TerminalNode> ID() { return getTokens(musicologoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(musicologoParser.ID, i);
		}
		public TerminalNode COMANDO_ASIGNAR() { return getToken(musicologoParser.COMANDO_ASIGNAR, 0); }
		public RecortarFuncionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DividirFuncionContext extends ExpresionContext {
		public TerminalNode COMANDO_DIVIDIR() { return getToken(musicologoParser.COMANDO_DIVIDIR, 0); }
		public TerminalNode TIEMPO() { return getToken(musicologoParser.TIEMPO, 0); }
		public List<TerminalNode> ID() { return getTokens(musicologoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(musicologoParser.ID, i);
		}
		public TerminalNode COMANDO_ASIGNAR() { return getToken(musicologoParser.COMANDO_ASIGNAR, 0); }
		public DividirFuncionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportarFuncionContext extends ExpresionContext {
		public TerminalNode COMANDO_EXPORTAR() { return getToken(musicologoParser.COMANDO_EXPORTAR, 0); }
		public TerminalNode ID() { return getToken(musicologoParser.ID, 0); }
		public ExportarFuncionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncrementarVolFuncionContext extends ExpresionContext {
		public TerminalNode COMANDO_INCREMENTAR_VOL() { return getToken(musicologoParser.COMANDO_INCREMENTAR_VOL, 0); }
		public TerminalNode ID() { return getToken(musicologoParser.ID, 0); }
		public TerminalNode VALOR() { return getToken(musicologoParser.VALOR, 0); }
		public List<TerminalNode> TIEMPO() { return getTokens(musicologoParser.TIEMPO); }
		public TerminalNode TIEMPO(int i) {
			return getToken(musicologoParser.TIEMPO, i);
		}
		public IncrementarVolFuncionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SilenciarFuncionContext extends ExpresionContext {
		public TerminalNode COMANDO_SILENCIAR() { return getToken(musicologoParser.COMANDO_SILENCIAR, 0); }
		public List<TerminalNode> TIEMPO() { return getTokens(musicologoParser.TIEMPO); }
		public TerminalNode TIEMPO(int i) {
			return getToken(musicologoParser.TIEMPO, i);
		}
		public TerminalNode ID() { return getToken(musicologoParser.ID, 0); }
		public SilenciarFuncionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CombinarFuncionContext extends ExpresionContext {
		public TerminalNode COMANDO_COMBINAR() { return getToken(musicologoParser.COMANDO_COMBINAR, 0); }
		public List<TerminalNode> ID() { return getTokens(musicologoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(musicologoParser.ID, i);
		}
		public TerminalNode COMANDO_ASIGNAR() { return getToken(musicologoParser.COMANDO_ASIGNAR, 0); }
		public CombinarFuncionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CargarFuncionContext extends ExpresionContext {
		public TerminalNode COMANDO_CARGAR() { return getToken(musicologoParser.COMANDO_CARGAR, 0); }
		public TerminalNode ARCHIVO_MP3() { return getToken(musicologoParser.ARCHIVO_MP3, 0); }
		public TerminalNode COMANDO_ASIGNAR() { return getToken(musicologoParser.COMANDO_ASIGNAR, 0); }
		public TerminalNode ID() { return getToken(musicologoParser.ID, 0); }
		public TerminalNode RUTA() { return getToken(musicologoParser.RUTA, 0); }
		public CargarFuncionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalFuncionContext extends ExpresionContext {
		public TerminalNode CONDICIONAL() { return getToken(musicologoParser.CONDICIONAL, 0); }
		public TerminalNode CONDICION() { return getToken(musicologoParser.CONDICION, 0); }
		public TerminalNode HACER() { return getToken(musicologoParser.HACER, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(musicologoParser.ELSE, 0); }
		public CondicionalFuncionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expresion);
		int _la;
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMANDO_CARGAR:
				_localctx = new CargarFuncionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				match(COMANDO_CARGAR);
				setState(15);
				match(T__0);
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RUTA) {
					{
					setState(16);
					match(RUTA);
					}
				}

				setState(19);
				match(ARCHIVO_MP3);
				setState(20);
				match(T__0);
				setState(21);
				match(COMANDO_ASIGNAR);
				setState(22);
				match(T__0);
				setState(23);
				match(ID);
				}
				break;
			case COMANDO_RECORTAR:
				_localctx = new RecortarFuncionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				match(COMANDO_RECORTAR);
				setState(25);
				match(T__0);
				setState(26);
				match(TIEMPO);
				setState(27);
				match(T__0);
				setState(28);
				match(TIEMPO);
				setState(29);
				match(T__0);
				setState(30);
				match(ID);
				setState(31);
				match(T__0);
				setState(32);
				match(COMANDO_ASIGNAR);
				setState(33);
				match(T__0);
				setState(34);
				match(ID);
				}
				break;
			case COMANDO_EXPORTAR:
				_localctx = new ExportarFuncionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				match(COMANDO_EXPORTAR);
				setState(36);
				match(T__0);
				setState(37);
				match(ID);
				}
				break;
			case COMANDO_INCREMENTAR_VOL:
				_localctx = new IncrementarVolFuncionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				match(COMANDO_INCREMENTAR_VOL);
				setState(39);
				match(T__0);
				setState(40);
				match(ID);
				setState(41);
				match(T__0);
				setState(42);
				match(VALOR);
				setState(47);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(43);
					match(T__0);
					setState(44);
					match(TIEMPO);
					setState(45);
					match(T__0);
					setState(46);
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
				setState(49);
				match(CONDICIONAL);
				setState(50);
				match(T__0);
				setState(51);
				match(CONDICION);
				setState(52);
				match(T__0);
				setState(53);
				match(HACER);
				setState(54);
				match(T__0);
				setState(55);
				bloque();
				setState(60);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(56);
					match(T__0);
					setState(57);
					match(ELSE);
					setState(58);
					match(T__0);
					setState(59);
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
				setState(62);
				match(COMANDO_DIVIDIR);
				setState(63);
				match(T__0);
				setState(64);
				match(TIEMPO);
				setState(65);
				match(T__0);
				setState(66);
				match(ID);
				setState(67);
				match(T__0);
				setState(68);
				match(COMANDO_ASIGNAR);
				setState(69);
				match(T__0);
				setState(70);
				match(ID);
				}
				break;
			case COMANDO_COMBINAR:
				_localctx = new CombinarFuncionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(71);
				match(COMANDO_COMBINAR);
				setState(72);
				match(T__0);
				setState(73);
				match(ID);
				setState(74);
				match(T__0);
				setState(75);
				match(ID);
				setState(76);
				match(T__0);
				setState(77);
				match(COMANDO_ASIGNAR);
				setState(78);
				match(T__0);
				setState(79);
				match(ID);
				}
				break;
			case COMANDO_SILENCIAR:
				_localctx = new SilenciarFuncionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(80);
				match(COMANDO_SILENCIAR);
				setState(81);
				match(T__0);
				setState(82);
				match(TIEMPO);
				setState(83);
				match(T__0);
				setState(84);
				match(TIEMPO);
				setState(85);
				match(T__0);
				setState(86);
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
		enterRule(_localctx, 4, RULE_bloque);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(T__1);
				setState(90);
				expresion();
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(91);
					match(T__2);
					setState(92);
					expresion();
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(98);
				match(T__3);
				}
				break;
			case COMANDO_CARGAR:
			case COMANDO_RECORTAR:
			case COMANDO_EXPORTAR:
			case COMANDO_INCREMENTAR_VOL:
			case COMANDO_DIVIDIR:
			case COMANDO_COMBINAR:
			case COMANDO_SILENCIAR:
			case CONDICIONAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
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
		"\u0004\u0001\u0018h\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0005\u0000\b\b\u0000\n\u0000\f\u0000\u000b"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u0012\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u00010\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001=\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001X\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002^\b\u0002\n\u0002"+
		"\f\u0002a\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002f\b\u0002"+
		"\u0001\u0002\u0000\u0000\u0003\u0000\u0002\u0004\u0000\u0000q\u0000\t"+
		"\u0001\u0000\u0000\u0000\u0002W\u0001\u0000\u0000\u0000\u0004e\u0001\u0000"+
		"\u0000\u0000\u0006\b\u0003\u0002\u0001\u0000\u0007\u0006\u0001\u0000\u0000"+
		"\u0000\b\u000b\u0001\u0000\u0000\u0000\t\u0007\u0001\u0000\u0000\u0000"+
		"\t\n\u0001\u0000\u0000\u0000\n\f\u0001\u0000\u0000\u0000\u000b\t\u0001"+
		"\u0000\u0000\u0000\f\r\u0005\u0000\u0000\u0001\r\u0001\u0001\u0000\u0000"+
		"\u0000\u000e\u000f\u0005\u0005\u0000\u0000\u000f\u0011\u0005\u0001\u0000"+
		"\u0000\u0010\u0012\u0005\u0015\u0000\u0000\u0011\u0010\u0001\u0000\u0000"+
		"\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000"+
		"\u0000\u0013\u0014\u0005\u0013\u0000\u0000\u0014\u0015\u0005\u0001\u0000"+
		"\u0000\u0015\u0016\u0005\t\u0000\u0000\u0016\u0017\u0005\u0001\u0000\u0000"+
		"\u0017X\u0005\u0014\u0000\u0000\u0018\u0019\u0005\u0006\u0000\u0000\u0019"+
		"\u001a\u0005\u0001\u0000\u0000\u001a\u001b\u0005\u0016\u0000\u0000\u001b"+
		"\u001c\u0005\u0001\u0000\u0000\u001c\u001d\u0005\u0016\u0000\u0000\u001d"+
		"\u001e\u0005\u0001\u0000\u0000\u001e\u001f\u0005\u0014\u0000\u0000\u001f"+
		" \u0005\u0001\u0000\u0000 !\u0005\t\u0000\u0000!\"\u0005\u0001\u0000\u0000"+
		"\"X\u0005\u0014\u0000\u0000#$\u0005\u0007\u0000\u0000$%\u0005\u0001\u0000"+
		"\u0000%X\u0005\u0014\u0000\u0000&\'\u0005\b\u0000\u0000\'(\u0005\u0001"+
		"\u0000\u0000()\u0005\u0014\u0000\u0000)*\u0005\u0001\u0000\u0000*/\u0005"+
		"\u0017\u0000\u0000+,\u0005\u0001\u0000\u0000,-\u0005\u0016\u0000\u0000"+
		"-.\u0005\u0001\u0000\u0000.0\u0005\u0016\u0000\u0000/+\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u00000X\u0001\u0000\u0000\u000012\u0005\r\u0000"+
		"\u000023\u0005\u0001\u0000\u000034\u0005\u000e\u0000\u000045\u0005\u0001"+
		"\u0000\u000056\u0005\u000f\u0000\u000067\u0005\u0001\u0000\u00007<\u0003"+
		"\u0004\u0002\u000089\u0005\u0001\u0000\u00009:\u0005\u0010\u0000\u0000"+
		":;\u0005\u0001\u0000\u0000;=\u0003\u0004\u0002\u0000<8\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=X\u0001\u0000\u0000\u0000>?\u0005\n\u0000"+
		"\u0000?@\u0005\u0001\u0000\u0000@A\u0005\u0016\u0000\u0000AB\u0005\u0001"+
		"\u0000\u0000BC\u0005\u0014\u0000\u0000CD\u0005\u0001\u0000\u0000DE\u0005"+
		"\t\u0000\u0000EF\u0005\u0001\u0000\u0000FX\u0005\u0014\u0000\u0000GH\u0005"+
		"\u000b\u0000\u0000HI\u0005\u0001\u0000\u0000IJ\u0005\u0014\u0000\u0000"+
		"JK\u0005\u0001\u0000\u0000KL\u0005\u0014\u0000\u0000LM\u0005\u0001\u0000"+
		"\u0000MN\u0005\t\u0000\u0000NO\u0005\u0001\u0000\u0000OX\u0005\u0014\u0000"+
		"\u0000PQ\u0005\f\u0000\u0000QR\u0005\u0001\u0000\u0000RS\u0005\u0016\u0000"+
		"\u0000ST\u0005\u0001\u0000\u0000TU\u0005\u0016\u0000\u0000UV\u0005\u0001"+
		"\u0000\u0000VX\u0005\u0014\u0000\u0000W\u000e\u0001\u0000\u0000\u0000"+
		"W\u0018\u0001\u0000\u0000\u0000W#\u0001\u0000\u0000\u0000W&\u0001\u0000"+
		"\u0000\u0000W1\u0001\u0000\u0000\u0000W>\u0001\u0000\u0000\u0000WG\u0001"+
		"\u0000\u0000\u0000WP\u0001\u0000\u0000\u0000X\u0003\u0001\u0000\u0000"+
		"\u0000YZ\u0005\u0002\u0000\u0000Z_\u0003\u0002\u0001\u0000[\\\u0005\u0003"+
		"\u0000\u0000\\^\u0003\u0002\u0001\u0000][\u0001\u0000\u0000\u0000^a\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u0005\u0004\u0000"+
		"\u0000cf\u0001\u0000\u0000\u0000df\u0003\u0002\u0001\u0000eY\u0001\u0000"+
		"\u0000\u0000ed\u0001\u0000\u0000\u0000f\u0005\u0001\u0000\u0000\u0000"+
		"\u0007\t\u0011/<W_e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}