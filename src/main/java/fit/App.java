package fit;

import fit.basics.FlowControl;
import fit.basics.Operators;
import fit.basics.Types;
import fit.basics.Variables;
import fit.utils.collections.Collections;
import fit.utils.dynamics.Dynamics;
import fit.utils.functions.Functions;
import fit.utils.streams.Streams;

import java.util.function.Function;

/**
 * Aqui temos nosso tradicional "Hello world"!
 * Este é um comentário com múltiplas linhas
 * IMPORTANTE: O nome da classe deve coincidir com o nome do arquivo ...
 * e dentro de cada arquivo devemos ter apenas uma classe pública
 */
public class App {
    // Aqui podemos também fazer comentários de uma linha só
    // a JVM sempre vai iniciar a execução a
    // partir da classe estática main, enviando os parâmetros para args[]
    public static void main(String[] args) {

        System.out.println("Hello World!");
        Variables.experiment();
        Types.experiment();
        Operators.experiment();
        FlowControl.experiment(10);
        Collections.experiment();
        Functions.experiment();
        Dynamics.experiment();
        Streams.experiment();
    }
}
