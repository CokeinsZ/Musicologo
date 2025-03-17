// Generated from c://Users//usuario//Pictures//PROYECTOPOO//Musicologo//src//grammar//musicologo.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link musicologoParser}.
 */
public interface musicologoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link musicologoParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(musicologoParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link musicologoParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(musicologoParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cargarFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterCargarFuncion(musicologoParser.CargarFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cargarFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitCargarFuncion(musicologoParser.CargarFuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recortarFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterRecortarFuncion(musicologoParser.RecortarFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recortarFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitRecortarFuncion(musicologoParser.RecortarFuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exportarFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExportarFuncion(musicologoParser.ExportarFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exportarFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExportarFuncion(musicologoParser.ExportarFuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incrementarVolFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterIncrementarVolFuncion(musicologoParser.IncrementarVolFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incrementarVolFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitIncrementarVolFuncion(musicologoParser.IncrementarVolFuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condicionalFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterCondicionalFuncion(musicologoParser.CondicionalFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condicionalFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitCondicionalFuncion(musicologoParser.CondicionalFuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dividirFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterDividirFuncion(musicologoParser.DividirFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dividirFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitDividirFuncion(musicologoParser.DividirFuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code combinarFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterCombinarFuncion(musicologoParser.CombinarFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code combinarFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitCombinarFuncion(musicologoParser.CombinarFuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code silenciarFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterSilenciarFuncion(musicologoParser.SilenciarFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code silenciarFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitSilenciarFuncion(musicologoParser.SilenciarFuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concatenarFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterConcatenarFuncion(musicologoParser.ConcatenarFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatenarFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitConcatenarFuncion(musicologoParser.ConcatenarFuncionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repetirFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterRepetirFuncion(musicologoParser.RepetirFuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repetirFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitRepetirFuncion(musicologoParser.RepetirFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link musicologoParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(musicologoParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link musicologoParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(musicologoParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link musicologoParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(musicologoParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link musicologoParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(musicologoParser.CondicionContext ctx);
}