package zaur.lesson11;

public class CarTest {

    public void zamenaDverey(int newDoorCount, Car c1) {
        c1.doorCount = newDoorCount;

    }

    public static void zamenaCvetob(Car c1, Car c2) {
        String c1Collor = c1.collor;
        c1.collor = c2.collor;
        c2.collor = c1Collor;
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.doorCount = 2;
        c1.collor = "red";
        c1.engine = "v4";
        CarTest BMW = new CarTest();
        BMW.zamenaDverey(4, c1);
        System.out.println("kolichestvo dverey; " + c1.doorCount);
        System.out.println("Cvet mawini;" + c1.collor);
        System.out.println("Motor;" + c1.engine);
        Car c2 = new Car();
        c2.collor = "green";
        CarTest.zamenaCvetob(c1, c2);
        System.out.println(" Cvet mawini:" + c1.collor);
        System.out.println("Cvet mawini :"+ c2.collor);
    }
}
