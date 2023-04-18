package ClassesAndObjects.oop;

import java.util.Arrays;
import java.util.Scanner;

public class Service {
    private Employee1[] company;

    public Service() {
        company = employees();
    }

    public static Employee1[] employees() {

        Employee1 employee1 = new Employee1("Jeff", "Bezos", 1000000, 59, "Director");
        Employee1 employee12 = new Employee1("Elon", "Musk", 800000, 52, "Vice");
        Employee1 employee3 = new Employee1("Bernard", "Arnault", 500000, 74, "accountant");
        Employee1 employee4 = new Employee1("Bill", "Gates", 300000, 66, "manager");
        Employee1 employee5 = new Employee1("Mark", "Zuckerberg", 300000, 38, "manager");
        Employee1 employee6 = new Employee1("Warren", "Buffett", 100000, 92, "trainee");
        Employee1 employee7 = new Employee1("Larry", "Ellison", 100000, 78, "trainee");

        Employee1[] company = new Employee1[]{employee1, employee12, employee3, employee4, employee5, employee6, employee7};
        return company;
    }

    public void staffing(Employee1[] company) {
        double totalSalary = 0;
        int q = 0;
        for (int i = 0; i < company.length; i++) {
            totalSalary = totalSalary + company[i].getSalary();
            q++;
            System.out.println(q + "." + " " + company[i].getName() + " " + company[i].getSurname() + " Должность: " + company[i].getPosition());
        }
        System.out.println("Кол-во сотрудников:   " + q);
        System.out.println("ФОТ: " + totalSalary);
    }



    public Employee1[] deleteEmployee(Employee1[] employees) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Необходимо имя сотрудника для удаления");
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        for (int i = 0; i < employees.length; i++) {
            Employee1[] newEmployees = new Employee1[employees.length - 1];
            if (employees[i].getName().equals(name)) {
                System.arraycopy(employees, 0, newEmployees, 0, i);
                System.arraycopy(employees, i + 1, newEmployees, i, employees.length - i - 1);
                System.out.println("===============================");
                System.out.println("Сотрудник " + employees[i].getName() + " " + employees[i].getSurname() + " удален");
                System.out.println("===============================");

                staffing(newEmployees);
                return company = newEmployees;
            }
        }
        System.out.println("Сотрудника с таким именем нет");
        return employees;
    }

    public Employee1[] addEmployee(Employee1[] employees) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные нового сотрудника");
        System.out.print("Введите Имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите Фамилию: ");
        String surname = scanner.nextLine();

        System.out.print("Введите Возраст: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введите Зарплату: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Введите Должность: ");
        String position = scanner.nextLine();

        //новый обьект Employee
        Employee1 newEmployee = new Employee1(name, surname, salary, age, position);


        Employee1[] newEmployees = Arrays.copyOf(employees, employees.length + 1);
        newEmployees[employees.length] = newEmployee;
        staffing(newEmployees);
        return company = newEmployees;
    }

    public Employee1[] editEmployee(Employee1[] employees) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Необходимо имя сотрудника для редактирования");
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().equals(name)) {
                System.out.println("Введите новые данные сотрудника");
                System.out.print("Введите Имя: ");
                String newName = scanner.nextLine();

                System.out.print("Введите Фамилию: ");
                String newSurname = scanner.nextLine();

                System.out.print("Введите Возраст: ");
                int newAge = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Введите Зарплату: ");
                double newSalary = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Введите Должность: ");
                String newPosition = scanner.nextLine();

                employees[i].setName(newName);
                employees[i].setSurname(newSurname);
                employees[i].setAge(newAge);
                employees[i].setSalary(newSalary);
                employees[i].setPosition(newPosition);
                System.out.println("===============================");
                System.out.println("Сотрудник " + employees[i].getName() + " " + employees[i].getSurname() + " отредактирован");
                System.out.println("===============================");
                staffing(employees);

                return company= employees;
            }
        }
        System.out.println("Сотрудника с таким именем нет");
        return employees;
    }

    public Employee1[] getEmployees() {
        return company;
    }

    public void setEmployees(Employee1[] employees) {
        this.company = employees;
    }
}





