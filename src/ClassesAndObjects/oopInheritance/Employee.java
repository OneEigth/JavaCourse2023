package ClassesAndObjects.oopInheritance;

public class Employee extends Person {
    private double salary;

    public Employee(String name, String surname, int age, String sex, double salary) {
        super(name, surname, age, sex);
        this.salary = salary;
    }



    public Employee oldestEmployee(Employee[] employees){
        Employee employee =employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getAge()>employee.getAge()){
               employee=employees[i];
            }
        }
        return employee;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }
}
