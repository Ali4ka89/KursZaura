package zaur.lesson8;

public class PIClass {
    static final double PI = 3.14;

    double plowad(double radius) {
        return PI * radius * radius;
    }

    static double perimetr(double radius) {
        return 2 * PI * radius;
    }
    void  informasiya (double r){
        System.out.println("Радиус окружности = "+ r+"Площадь округлости = "+ plowad(r)+" длина окружности "+(2*PI*r));
    }
}
