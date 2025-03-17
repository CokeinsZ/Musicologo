// Generated from c://Users//usuario//Pictures//PROYECTOPOO//Musicologo//src//grammar//musicologo.g4 by ANTLR 4.13.1
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
		COMANDO_COMBINAR=11, COMANDO_SILENCIAR=12, COMANDO_REPETIR=13, COMANDO_CONCATENAR=14, 
		CONDICIONAL=15, HACER=16, ELSE=17, OPERADOR=18, CARACTERISTICA=19, VOLUMEN=20, 
		ARCHIVO_MP3=21, ID=22, RUTA=23, TIEMPO=24, NUMERO=25, WS=26;
	public static final int
		RULE_inicio = 0, RULE_expresion = 1, RULE_bloque = 2, RULE_condicion = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "expresion", "bloque", "condicion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'{'", "' && '", "'}'", null, null, null, "'subirVol'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "COMANDO_CARGAR", "COMANDO_RECORTAR", "COMANDO_EXPORTAR", 
			"COMANDO_INCREMENTAR_VOL", "COMANDO_ASIGNAR", "COMANDO_DIVIDIR", "COMANDO_COMBINAR", 
			"COMANDO_SILENCIAR", "COMANDO_REPETIR", "COMANDO_CONCATENAR", "CONDICIONAL", 
			"HACER", "ELSE", "OPERADOR", "CARACTERISTICA", "VOLUMEN", "ARCHIVO_MP3", 
			"ID", "RUTA", "TIEMPO", "NUMERO", "WS"
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
			setState(11);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 64992L) != 0)) {
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
	public static class ConcatenarFuncionContext extends ExpresionContext {
		public TerminalNode COMANDO_CONCATENAR() { return getToken(musicologoParser.COMANDO_CONCATENAR, 0); }
		public List<TerminalNode> ID() { return getTokens(musicologoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(musicologoParser.ID, i);
		}
		public TerminalNode NUMERO() { return getToken(musicologoParser.NUMERO, 0); }
		public TerminalNode COMANDO_ASIGNAR() { return getToken(musicologoParser.COMANDO_ASIGNAR, 0); }
		public ConcatenarFuncionContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RepetirFuncionContext extends ExpresionContext {
		public TerminalNode COMANDO_REPETIR() { return getToken(musicologoParser.COMANDO_REPETIR, 0); }
		public TerminalNode NUMERO() { return getToken(musicologoParser.NUMERO, 0); }
		public TerminalNode HACER() { return getToken(musicologoParser.HACER, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public RepetirFuncionContext(ExpresionContext ctx) { copyFrom(ctx); }
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
		public List<TerminalNode> ID() { return getTokens(musicologoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(musicologoParser.ID, i);
		}
		public TerminalNode VOLUMEN() { return getToken(musicologoParser.VOLUMEN, 0); }
		public List<TerminalNode> TIEMPO() { return getTokens(musicologoParser.TIEMPO); }
		public TerminalNode TIEMPO(int i) {
			return getToken(musicologoParser.TIEMPO, i);
		}
		public TerminalNode COMANDO_ASIGNAR() { return getToken(musicologoParser.COMANDO_ASIGNAR, 0); }
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
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
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
			setState(111);
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
				match(VOLUMEN);
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
				setState(55);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(51);
					match(T__0);
					setState(52);
					match(COMANDO_ASIGNAR);
					setState(53);
					match(T__0);
					setState(54);
					match(ID);
					}
					break;
				}
				}
				break;
			case CONDICIONAL:
				_localctx = new CondicionalFuncionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				match(CONDICIONAL);
				setState(58);
				match(T__0);
				setState(59);
				condicion();
				setState(60);
				match(T__0);
				setState(61);
				match(HACER);
				setState(62);
				match(T__0);
				setState(63);
				bloque();
				setState(68);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(64);
					match(T__0);
					setState(65);
					match(ELSE);
					setState(66);
					match(T__0);
					setState(67);
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
				setState(70);
				match(COMANDO_DIVIDIR);
				setState(71);
				match(T__0);
				setState(72);
				match(TIEMPO);
				setState(73);
				match(T__0);
				setState(74);
				match(ID);
				setState(75);
				match(T__0);
				setState(76);
				match(COMANDO_ASIGNAR);
				setState(77);
				match(T__0);
				setState(78);
				match(ID);
				}
				break;
			case COMANDO_COMBINAR:
				_localctx = new CombinarFuncionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				match(COMANDO_COMBINAR);
				setState(80);
				match(T__0);
				setState(81);
				match(ID);
				setState(82);
				match(T__0);
				setState(83);
				match(ID);
				setState(84);
				match(T__0);
				setState(85);
				match(COMANDO_ASIGNAR);
				setState(86);
				match(T__0);
				setState(87);
				match(ID);
				}
				break;
			case COMANDO_SILENCIAR:
				_localctx = new SilenciarFuncionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(88);
				match(COMANDO_SILENCIAR);
				setState(89);
				match(T__0);
				setState(90);
				match(TIEMPO);
				setState(91);
				match(T__0);
				setState(92);
				match(TIEMPO);
				setState(93);
				match(T__0);
				setState(94);
				match(ID);
				}
				break;
			case COMANDO_CONCATENAR:
				_localctx = new ConcatenarFuncionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(95);
				match(COMANDO_CONCATENAR);
				setState(96);
				match(T__0);
				setState(97);
				match(ID);
				setState(98);
				match(T__0);
				setState(99);
				match(NUMERO);
				setState(100);
				match(T__0);
				setState(101);
				match(COMANDO_ASIGNAR);
				setState(102);
				match(T__0);
				setState(103);
				match(ID);
				}
				break;
			case COMANDO_REPETIR:
				_localctx = new RepetirFuncionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(104);
				match(COMANDO_REPETIR);
				setState(105);
				match(T__0);
				setState(106);
				match(NUMERO);
				setState(107);
				match(T__0);
				setState(108);
				match(HACER);
				setState(109);
				match(T__0);
				setState(110);
				bloque();
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
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(T__1);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(114);
					match(T__0);
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(120);
				expresion();
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(121);
					match(T__2);
					setState(122);
					expresion();
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(128);
					match(T__0);
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(134);
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
			case COMANDO_REPETIR:
			case COMANDO_CONCATENAR:
			case CONDICIONAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode CARACTERISTICA() { return getToken(musicologoParser.CARACTERISTICA, 0); }
		public TerminalNode ID() { return getToken(musicologoParser.ID, 0); }
		public TerminalNode OPERADOR() { return getToken(musicologoParser.OPERADOR, 0); }
		public TerminalNode TIEMPO() { return getToken(musicologoParser.TIEMPO, 0); }
		public TerminalNode VOLUMEN() { return getToken(musicologoParser.VOLUMEN, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(CARACTERISTICA);
			setState(140);
			match(T__0);
			setState(141);
			match(ID);
			setState(142);
			match(T__0);
			setState(143);
			match(OPERADOR);
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(144);
				match(T__0);
				setState(145);
				match(TIEMPO);
				}
				break;
			case 2:
				{
				setState(146);
				match(T__0);
				setState(147);
				match(VOLUMEN);
				}
				break;
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

	public static final String _serializedATN =
		"\u0004\u0001\u001a\u0097\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0005\u0000"+
		"\n\b\u0000\n\u0000\f\u0000\r\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u0014\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u00012\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u00018\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001E\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001p\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0005\u0002t\b\u0002\n\u0002\f\u0002w\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002|\b\u0002\n\u0002\f\u0002"+
		"\u007f\t\u0002\u0001\u0002\u0005\u0002\u0082\b\u0002\n\u0002\f\u0002\u0085"+
		"\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u008a\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u0095\b\u0003\u0001\u0003"+
		"\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u0000\u00a5\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0002o\u0001\u0000\u0000\u0000\u0004\u0089\u0001"+
		"\u0000\u0000\u0000\u0006\u008b\u0001\u0000\u0000\u0000\b\n\u0003\u0002"+
		"\u0001\u0000\t\b\u0001\u0000\u0000\u0000\n\r\u0001\u0000\u0000\u0000\u000b"+
		"\t\u0001\u0000\u0000\u0000\u000b\f\u0001\u0000\u0000\u0000\f\u000e\u0001"+
		"\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\u000e\u000f\u0005\u0000"+
		"\u0000\u0001\u000f\u0001\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0005"+
		"\u0000\u0000\u0011\u0013\u0005\u0001\u0000\u0000\u0012\u0014\u0005\u0017"+
		"\u0000\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000"+
		"\u0000\u0000\u0014\u0015\u0001\u0000\u0000\u0000\u0015\u0016\u0005\u0015"+
		"\u0000\u0000\u0016\u0017\u0005\u0001\u0000\u0000\u0017\u0018\u0005\t\u0000"+
		"\u0000\u0018\u0019\u0005\u0001\u0000\u0000\u0019p\u0005\u0016\u0000\u0000"+
		"\u001a\u001b\u0005\u0006\u0000\u0000\u001b\u001c\u0005\u0001\u0000\u0000"+
		"\u001c\u001d\u0005\u0018\u0000\u0000\u001d\u001e\u0005\u0001\u0000\u0000"+
		"\u001e\u001f\u0005\u0018\u0000\u0000\u001f \u0005\u0001\u0000\u0000 !"+
		"\u0005\u0016\u0000\u0000!\"\u0005\u0001\u0000\u0000\"#\u0005\t\u0000\u0000"+
		"#$\u0005\u0001\u0000\u0000$p\u0005\u0016\u0000\u0000%&\u0005\u0007\u0000"+
		"\u0000&\'\u0005\u0001\u0000\u0000\'p\u0005\u0016\u0000\u0000()\u0005\b"+
		"\u0000\u0000)*\u0005\u0001\u0000\u0000*+\u0005\u0016\u0000\u0000+,\u0005"+
		"\u0001\u0000\u0000,1\u0005\u0014\u0000\u0000-.\u0005\u0001\u0000\u0000"+
		"./\u0005\u0018\u0000\u0000/0\u0005\u0001\u0000\u000002\u0005\u0018\u0000"+
		"\u00001-\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000027\u0001\u0000"+
		"\u0000\u000034\u0005\u0001\u0000\u000045\u0005\t\u0000\u000056\u0005\u0001"+
		"\u0000\u000068\u0005\u0016\u0000\u000073\u0001\u0000\u0000\u000078\u0001"+
		"\u0000\u0000\u00008p\u0001\u0000\u0000\u00009:\u0005\u000f\u0000\u0000"+
		":;\u0005\u0001\u0000\u0000;<\u0003\u0006\u0003\u0000<=\u0005\u0001\u0000"+
		"\u0000=>\u0005\u0010\u0000\u0000>?\u0005\u0001\u0000\u0000?D\u0003\u0004"+
		"\u0002\u0000@A\u0005\u0001\u0000\u0000AB\u0005\u0011\u0000\u0000BC\u0005"+
		"\u0001\u0000\u0000CE\u0003\u0004\u0002\u0000D@\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000Ep\u0001\u0000\u0000\u0000FG\u0005\n\u0000\u0000"+
		"GH\u0005\u0001\u0000\u0000HI\u0005\u0018\u0000\u0000IJ\u0005\u0001\u0000"+
		"\u0000JK\u0005\u0016\u0000\u0000KL\u0005\u0001\u0000\u0000LM\u0005\t\u0000"+
		"\u0000MN\u0005\u0001\u0000\u0000Np\u0005\u0016\u0000\u0000OP\u0005\u000b"+
		"\u0000\u0000PQ\u0005\u0001\u0000\u0000QR\u0005\u0016\u0000\u0000RS\u0005"+
		"\u0001\u0000\u0000ST\u0005\u0016\u0000\u0000TU\u0005\u0001\u0000\u0000"+
		"UV\u0005\t\u0000\u0000VW\u0005\u0001\u0000\u0000Wp\u0005\u0016\u0000\u0000"+
		"XY\u0005\f\u0000\u0000YZ\u0005\u0001\u0000\u0000Z[\u0005\u0018\u0000\u0000"+
		"[\\\u0005\u0001\u0000\u0000\\]\u0005\u0018\u0000\u0000]^\u0005\u0001\u0000"+
		"\u0000^p\u0005\u0016\u0000\u0000_`\u0005\u000e\u0000\u0000`a\u0005\u0001"+
		"\u0000\u0000ab\u0005\u0016\u0000\u0000bc\u0005\u0001\u0000\u0000cd\u0005"+
		"\u0019\u0000\u0000de\u0005\u0001\u0000\u0000ef\u0005\t\u0000\u0000fg\u0005"+
		"\u0001\u0000\u0000gp\u0005\u0016\u0000\u0000hi\u0005\r\u0000\u0000ij\u0005"+
		"\u0001\u0000\u0000jk\u0005\u0019\u0000\u0000kl\u0005\u0001\u0000\u0000"+
		"lm\u0005\u0010\u0000\u0000mn\u0005\u0001\u0000\u0000np\u0003\u0004\u0002"+
		"\u0000o\u0010\u0001\u0000\u0000\u0000o\u001a\u0001\u0000\u0000\u0000o"+
		"%\u0001\u0000\u0000\u0000o(\u0001\u0000\u0000\u0000o9\u0001\u0000\u0000"+
		"\u0000oF\u0001\u0000\u0000\u0000oO\u0001\u0000\u0000\u0000oX\u0001\u0000"+
		"\u0000\u0000o_\u0001\u0000\u0000\u0000oh\u0001\u0000\u0000\u0000p\u0003"+
		"\u0001\u0000\u0000\u0000qu\u0005\u0002\u0000\u0000rt\u0005\u0001\u0000"+
		"\u0000sr\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wu\u0001"+
		"\u0000\u0000\u0000x}\u0003\u0002\u0001\u0000yz\u0005\u0003\u0000\u0000"+
		"z|\u0003\u0002\u0001\u0000{y\u0001\u0000\u0000\u0000|\u007f\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0083"+
		"\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0082\u0005"+
		"\u0001\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0085\u0001"+
		"\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0005\u0004\u0000\u0000\u0087\u008a\u0001"+
		"\u0000\u0000\u0000\u0088\u008a\u0003\u0002\u0001\u0000\u0089q\u0001\u0000"+
		"\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u0005\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0005\u0013\u0000\u0000\u008c\u008d\u0005\u0001"+
		"\u0000\u0000\u008d\u008e\u0005\u0016\u0000\u0000\u008e\u008f\u0005\u0001"+
		"\u0000\u0000\u008f\u0094\u0005\u0012\u0000\u0000\u0090\u0091\u0005\u0001"+
		"\u0000\u0000\u0091\u0095\u0005\u0018\u0000\u0000\u0092\u0093\u0005\u0001"+
		"\u0000\u0000\u0093\u0095\u0005\u0014\u0000\u0000\u0094\u0090\u0001\u0000"+
		"\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0007\u0001\u0000"+
		"\u0000\u0000\u000b\u000b\u001317Dou}\u0083\u0089\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}