package fit.basics;

public class Types {
    public static void experiment() {
        // primitivos
        int inteiro = 10;
        float pontoFlutuante = 10f;
        double duplaPrecisao = 10d;
        char caractere = 'a';
        boolean sim = true;

        System.out.printf("%d %f %f %s %s", inteiro, pontoFlutuante, duplaPrecisao, caractere, sim);

        // auto-boxing/unboxing
        Integer inteiroObj = 11;
        inteiro = inteiroObj;

        System.out.println();
        System.out.printf("%d %d", inteiroObj, inteiro);
    }
}
