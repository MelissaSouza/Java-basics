package fit.basics;

public class FlowControl {
    public static void experiment(int numero) {
        boolean isEven = ((numero % 2) == 0);
        System.out.println();
        System.out.printf("numero %d eh par: %s", numero, isEven);

        if (isEven) {
            System.out.println();
            switch(numero) {
                case(2):
                    System.out.println("eh dois");
                    break;
                case(10):
                    System.out.println("eh dez");
                    break;
                case(100):
                    System.out.println("eh dez");
                    break;
                default:
                    System.out.println("hmmm ... não sei qual eh");
            }
        }

        String numeroTexto = "" + numero;
        System.out.println("Imprimindo todos os dígitos do número");
        for(int i = 0; i < numeroTexto.length(); i++) {
            System.out.printf("dígito %d : %s", i, numeroTexto.charAt(i));
            System.out.println();
        }

        for(char letra : numeroTexto.toCharArray()) {
            System.out.printf("dígito : %s", letra);
            System.out.println();
        }
    }
}
