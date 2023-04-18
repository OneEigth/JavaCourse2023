package ClassesAndObjects.oop;

public class Employee1 {

    private String name;
    private String surname;
    private double salary;
    private int age;
    private String position;



    public Employee1(String name, String surname, double salary, int age, String position) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }
}
