package olya;

/*
Создать класс Модель. У модели следующие атрибуты: имя, вес, возраст, цвет глаз, зарплата. Создать конструктор с параметром
имя и дефолтный конструктор. Создать метод poxudenie ничего не возвращающий, принимающий число. Метод выводит имя модели и вес, на который она похудела.
Пример вывода "Ура Оля похудела на 5 кг :)". Второй метод potolstela - по аналогии выводит "Ужас! Хаяля потолстела на 20 кг:((".
Создать 2 объекта (один с помощью дефолтного конструктора, второй с помощью конструктора с параметром) и вызвать у них них по 1 из методов.
САМИМ ПРИДУМАТЬ ЕЩЁ 1 МЕТОД (например,  с зар платой или с возрастом) и так же вызвать его у объектов.
 */
public class Model {
    String name;
    double ves;
    int age;
    String eyescolor;
    double zarplata;

    public Model(String name) {
        this.name = name;
    }

    public Model() {
    }

    void poxudenie(int kq) {
        System.out.println("Ura " + name + " poxudela na  " + kq + "kq");
        System.out.println(name + "stala vesit " + (ves - kq));
    }

    void potolstela(int kq) {
        System.out.println("Ujas " + name + " potolstela na " + kq + " kq:((");
        System.out.println(name + " stala vesit " + (ves + kq) + " kg");
    }
    int poxodPoMaqazinam(int nacalnayaSumma){
        System.out.println(name + " powla v maqazin kupila utku za 200 rubley");
        System.out.println("potom kupila samsu za 50 rubley");
        System.out.println("vspomnila 4to nado kupit tomatnuyu pastu i potratila na nee 56 rubley");
        System.out.println("zatem ona v marwrutke otdala 42 rublya");

        int result=nacalnayaSumma-200-50-56-42;
        return result;
    }

    public static void main(String[] args) {
        Model m1 = new Model("Olya");
        Model m2 = new Model();

        m1.ves = 200;
        m2.ves = 50;
        m2.name = "Xeyale";

//        m1.poxudenie(5);
//        m2.potolstela(20);
        int ostavwaSumma= m1.poxodPoMaqazinam(1000);
        System.out.println("u " + m1.name + " octalas " + ostavwaSumma + " rubley");

    }


}

