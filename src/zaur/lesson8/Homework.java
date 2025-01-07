package zaur.lesson8;

public class Homework {


    static int umnojenie(int a, int b, int c) {
//        return a * b * c;
        int result = a * b * c;
        return result;
    }

    static void delenie(int celoe, int castnoe) {
        int ostatok =celoe / castnoe;
        System.out.println("Целое = "+ celoe + ", Частное = " + castnoe + " Остаток = " + ostatok);
    }
}
