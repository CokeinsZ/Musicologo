// Generated from C:/Users/alejandro/Documents/musica/src/grammar/musicologo.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class musicologoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, COMANDO_CARGAR=5, COMANDO_RECORTAR=6, 
		COMANDO_EXPORTAR=7, COMANDO_INCREMENTAR_VOL=8, COMANDO_ASIGNAR=9, COMANDO_DIVIDIR=10, 
		COMANDO_COMBINAR=11, COMANDO_SILENCIAR=12, CONDICIONAL=13, HACER=14, ELSE=15, 
		OPERADOR=16, CARACTERISTICA=17, VOLUMEN=18, ARCHIVO_MP3=19, ID=20, RUTA=21, 
		TIEMPO=22, WS=23;
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
			"COMANDO_SILENCIAR", "CONDICIONAL", "HACER", "ELSE", "OPERADOR", "CARACTERISTICA", 
			"VOLUMEN", "ARCHIVO_MP3", "ID", "RUTA", "TIEMPO", "WS"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof musicologoListener ) ((musicologoListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof musicologoListener ) ((musicologoListener)listener).exitInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof musicologoVisitor ) return ((musicologoVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15840L) != 0)) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof musicologoListener ) ((musicologoListener)listener).enterRecortarFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof musicologoListener ) ((musicologoListener)listener).exitRecortarFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof musicologoVisitor ) return ((musicologoVisitor<? extends T>)visitor).visitRecortarFuncion(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof musicologoListener ) ((musicologoListener)listener).enterDividirFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof musicologoListener ) ((musicologoListener)listener).exitDividirFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof musicologoVisitor ) return ((musicologoVisitor<? extends T>)visitor).visitDividirFuncion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportarFuncionContext extends ExpresionContext {
		public TerminalNode COMANDO_EXPORTAR() { return getToken(musicologoParser.COMANDO_EXPORTAR, 0); }
		public TerminalNode ID() { return getToken(musicologoParser.ID, 0); }
		public ExportarFuncionContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof musicologoListener ) ((musicologoListener)listener).enterExportarFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof musicologoListener ) ((musicologoListener)listener).exitExportarFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof musicologoVisitor ) return ((musicologoVisitor<? extends T>)visitor).visitExportarFuncion(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof musicologoListener ) ((musicologoListener)listener).enterIncrementarVolFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof musicologoListener ) ((musicologoListener)listener).exitIncrementarVolFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof musicologoVisitor ) return ((musicologoVisitor<? extends T>)visitor).visitIncrementarVolFuncion(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof musicologoListener ) ((musicologoListener)listener).enterSilenciarFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof musicologoListener ) ((musicologoListener)listener).exitSilenciarFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof musicologoVisitor ) return ((musicologoVisitor<? extends T>)visitor).visitSilenciarFuncion(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof musicologoListener ) ((musicologoListener)listener).enterCombinarFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof musicologoListener ) ((musicologoListener)listener).exitCombinarFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof musicologoVisitor ) return ((musicologoVisitor<? extends T>)visitor).visitCombinarFuncion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CargarFuncionContext extends ExpresionContext {
		public TerminalNode COMANDO_CARGAR() { return getToken(musicologoParser.COMANDO_CARGAR, 0); }
		public TerminalNode ARCHIVO_MP3() { return getToken(musicologoParser.ARCHIVO_MP3, 0); }
		public TerminalNode COMANDO_ASIGNAR() { return getToken(musicologoParser.COMANDO_ASIGNAR, 0); }
		public TerminalNode ID() { return getToken(musicologoParser.ID, 0); }
		public TerminalNode RUTA() { return getToken(musicologoParser.RUTA, 0); }
		public CargarFuncionContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof musicologoListener ) ((musicologoListener)listener).enterCargarFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof musicologoListener ) ((musicologoListener)listener).exitCargarFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof musicologoVisitor ) return ((musicologoVisitor<? extends T>)visitor).visitCargarFuncion(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof musicologoListener ) ((musicologoListener)listener).enterCondicionalFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof musicologoListener ) ((musicologoListener)listener).exitCondicionalFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof musicologoVisitor ) return ((musicologoVisitor<? extends T>)visitor).visitCondicionalFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expresion);
		int _la;
		try {
			setState(95);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof musicologoListener ) ((musicologoListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof musicologoListener ) ((musicologoListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof musicologoVisitor ) return ((musicologoVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloque);
		int _la;
		try {
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(T__1);
				setState(98);
				expresion();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(99);
					match(T__2);
					setState(100);
					expresion();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
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
				setState(108);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof musicologoListener ) ((musicologoListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof musicologoListener ) ((musicologoListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof musicologoVisitor ) return ((musicologoVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(CARACTERISTICA);
			setState(112);
			match(ID);
			setState(113);
			match(OPERADOR);
			setState(114);
			_la = _input.LA(1);
			if ( !(_la==VOLUMEN || _la==TIEMPO) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\u0017u\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0005\u0000\n\b"+
		"\u0000\n\u0000\f\u0000\r\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u0014\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u00012\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u00018\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001E\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001`\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002f\b\u0002\n\u0002\f\u0002i\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002n\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006"+
		"\u0000\u0001\u0002\u0000\u0012\u0012\u0016\u0016~\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0002_\u0001\u0000\u0000\u0000\u0004m\u0001\u0000\u0000\u0000"+
		"\u0006o\u0001\u0000\u0000\u0000\b\n\u0003\u0002\u0001\u0000\t\b\u0001"+
		"\u0000\u0000\u0000\n\r\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000"+
		"\u0000\u000b\f\u0001\u0000\u0000\u0000\f\u000e\u0001\u0000\u0000\u0000"+
		"\r\u000b\u0001\u0000\u0000\u0000\u000e\u000f\u0005\u0000\u0000\u0001\u000f"+
		"\u0001\u0001\u0000\u0000\u0000\u0010\u0011\u0005\u0005\u0000\u0000\u0011"+
		"\u0013\u0005\u0001\u0000\u0000\u0012\u0014\u0005\u0015\u0000\u0000\u0013"+
		"\u0012\u0001\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014"+
		"\u0015\u0001\u0000\u0000\u0000\u0015\u0016\u0005\u0013\u0000\u0000\u0016"+
		"\u0017\u0005\u0001\u0000\u0000\u0017\u0018\u0005\t\u0000\u0000\u0018\u0019"+
		"\u0005\u0001\u0000\u0000\u0019`\u0005\u0014\u0000\u0000\u001a\u001b\u0005"+
		"\u0006\u0000\u0000\u001b\u001c\u0005\u0001\u0000\u0000\u001c\u001d\u0005"+
		"\u0016\u0000\u0000\u001d\u001e\u0005\u0001\u0000\u0000\u001e\u001f\u0005"+
		"\u0016\u0000\u0000\u001f \u0005\u0001\u0000\u0000 !\u0005\u0014\u0000"+
		"\u0000!\"\u0005\u0001\u0000\u0000\"#\u0005\t\u0000\u0000#$\u0005\u0001"+
		"\u0000\u0000$`\u0005\u0014\u0000\u0000%&\u0005\u0007\u0000\u0000&\'\u0005"+
		"\u0001\u0000\u0000\'`\u0005\u0014\u0000\u0000()\u0005\b\u0000\u0000)*"+
		"\u0005\u0001\u0000\u0000*+\u0005\u0014\u0000\u0000+,\u0005\u0001\u0000"+
		"\u0000,1\u0005\u0012\u0000\u0000-.\u0005\u0001\u0000\u0000./\u0005\u0016"+
		"\u0000\u0000/0\u0005\u0001\u0000\u000002\u0005\u0016\u0000\u00001-\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u000027\u0001\u0000\u0000\u0000"+
		"34\u0005\u0001\u0000\u000045\u0005\t\u0000\u000056\u0005\u0001\u0000\u0000"+
		"68\u0005\u0014\u0000\u000073\u0001\u0000\u0000\u000078\u0001\u0000\u0000"+
		"\u00008`\u0001\u0000\u0000\u00009:\u0005\r\u0000\u0000:;\u0005\u0001\u0000"+
		"\u0000;<\u0003\u0006\u0003\u0000<=\u0005\u0001\u0000\u0000=>\u0005\u000e"+
		"\u0000\u0000>?\u0005\u0001\u0000\u0000?D\u0003\u0004\u0002\u0000@A\u0005"+
		"\u0001\u0000\u0000AB\u0005\u000f\u0000\u0000BC\u0005\u0001\u0000\u0000"+
		"CE\u0003\u0004\u0002\u0000D@\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000E`\u0001\u0000\u0000\u0000FG\u0005\n\u0000\u0000GH\u0005\u0001\u0000"+
		"\u0000HI\u0005\u0016\u0000\u0000IJ\u0005\u0001\u0000\u0000JK\u0005\u0014"+
		"\u0000\u0000KL\u0005\u0001\u0000\u0000LM\u0005\t\u0000\u0000MN\u0005\u0001"+
		"\u0000\u0000N`\u0005\u0014\u0000\u0000OP\u0005\u000b\u0000\u0000PQ\u0005"+
		"\u0001\u0000\u0000QR\u0005\u0014\u0000\u0000RS\u0005\u0001\u0000\u0000"+
		"ST\u0005\u0014\u0000\u0000TU\u0005\u0001\u0000\u0000UV\u0005\t\u0000\u0000"+
		"VW\u0005\u0001\u0000\u0000W`\u0005\u0014\u0000\u0000XY\u0005\f\u0000\u0000"+
		"YZ\u0005\u0001\u0000\u0000Z[\u0005\u0016\u0000\u0000[\\\u0005\u0001\u0000"+
		"\u0000\\]\u0005\u0016\u0000\u0000]^\u0005\u0001\u0000\u0000^`\u0005\u0014"+
		"\u0000\u0000_\u0010\u0001\u0000\u0000\u0000_\u001a\u0001\u0000\u0000\u0000"+
		"_%\u0001\u0000\u0000\u0000_(\u0001\u0000\u0000\u0000_9\u0001\u0000\u0000"+
		"\u0000_F\u0001\u0000\u0000\u0000_O\u0001\u0000\u0000\u0000_X\u0001\u0000"+
		"\u0000\u0000`\u0003\u0001\u0000\u0000\u0000ab\u0005\u0002\u0000\u0000"+
		"bg\u0003\u0002\u0001\u0000cd\u0005\u0003\u0000\u0000df\u0003\u0002\u0001"+
		"\u0000ec\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000jk\u0005\u0004\u0000\u0000kn\u0001\u0000\u0000\u0000"+
		"ln\u0003\u0002\u0001\u0000ma\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000"+
		"\u0000n\u0005\u0001\u0000\u0000\u0000op\u0005\u0011\u0000\u0000pq\u0005"+
		"\u0014\u0000\u0000qr\u0005\u0010\u0000\u0000rs\u0007\u0000\u0000\u0000"+
		"s\u0007\u0001\u0000\u0000\u0000\b\u000b\u001317D_gm";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}