package fit.basics;

public class Operators {
    public static void experiment() {
//        Arithmetic Operators
        int result = 1 + 2 - 3 * 4 / 5 % 6;
//        Assignment Operators
        int resultAssignment = result + result;
//        Relational Operators
        boolean less = 2 < 1;
        boolean yes = true;
        boolean no = false;

        boolean tAndT = yes && yes;
        boolean tAndF = yes && no;

        boolean tOrT = yes || yes;
        boolean tOrF = yes || no;

//        Logical Operators
//        Unary Operators
        System.out.println();
        System.out.printf("%d %d %s", result, resultAssignment, less);

        System.out.println();
        System.out.printf("true and true : %s", tAndT);
        System.out.println();
        System.out.printf("true and false : %s", tAndF);
        System.out.println();
        System.out.printf("true or true : %s", tOrT);
        System.out.println();
        System.out.printf("true or false : %s", tOrF);
    }
}
