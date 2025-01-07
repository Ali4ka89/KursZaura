package zaur.lesson7;

public class Employee {
    private double salary;

    public String surname;

    int id;

    public void pokazZP(){
        System.out.println("Zarplata = "+ salary);

    }
    public void pokazSurname(){
        System.out.println("Familiya "+ surname);
    }
    public void pokazID(){
        System.out.println("ID "+id);
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    Employee(String surname) {
        this.surname = surname;
    }

    private Employee(int id) {
        this.id = id;
    }
}
