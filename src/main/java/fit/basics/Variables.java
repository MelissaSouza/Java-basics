package fit.basics;

public class Variables {
    public static void experiment() {
        /*
        * Variáveis podem comecar com letras, underline ou cifrão ($)
         */
        String nome = "Bom nome";
        String _nome = "Funciona, mas fora do padrão";
        String $nome = "Funciona, mas nao recomendado";

        String name = "Emilio Murta Resende";
        int age = 32;
        double height = 1.77;
        double weight = 88;
        Integer ageOrNull = null;

        System.out.printf("%s %d %.2f %.2f %d%n", name, age, height, weight, ageOrNull);
    }
}
