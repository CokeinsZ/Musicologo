// Generated from c:/Users/alejandro/Documents/musica/src/grammar/musicologo.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by the {@code funcion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(musicologoParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcion}
	 * labeled alternative in {@link musicologoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(musicologoParser.FuncionContext ctx);
}