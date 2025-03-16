// Generated from C:/Users/alejandro/Documents/musica/src/grammar/musicologo.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link musicologoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface musicologoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link musicologoParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(musicologoParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cargarFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCargarFuncion(musicologoParser.CargarFuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code recortarFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecortarFuncion(musicologoParser.RecortarFuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exportarFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportarFuncion(musicologoParser.ExportarFuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incrementarVolFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementarVolFuncion(musicologoParser.IncrementarVolFuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionalFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalFuncion(musicologoParser.CondicionalFuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dividirFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDividirFuncion(musicologoParser.DividirFuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code combinarFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinarFuncion(musicologoParser.CombinarFuncionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code silenciarFuncion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSilenciarFuncion(musicologoParser.SilenciarFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link musicologoParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(musicologoParser.BloqueContext ctx);
}