package zaur.lesson6;

public class MethotOverloading {
    String name;
    int id;


    public int summ() {
        int result = 0;
        System.out.println("summa vsex 4isel " + result);
        return 0;
    }

    public int summ(int a) {
        int result= a;
        System.out.println("summa vsex 4isel" + result);
        return result;
    }

    public int summ(int a, int b) {
        int result = a + b;
        System.out.println("summa vsex 4isel" + result);
        return result;
    }
    public int summ(int a, int b, int c) {
        int result = a + b+c;
        System.out.println("summa vsex 4isel" + result);
        return result;
    }
    public int summ(int a, int b, int c, int d ) {
        int result = a + b+c+d;
        System.out.println("summa vsex 4isel" + result);
        return result;
    }

     }
