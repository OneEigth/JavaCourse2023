package ClassesAndObjects.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();
        service.setEmployees(service.getEmployees());
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите номер задания");
            System.out.println("1. Вывод сотрудников компании");
            System.out.println("2. Добавление сотрудника");
            System.out.println("3. Удаление сотрудника");
            System.out.println("4. Редактирование сотрудника");
            System.out.println("5. Выход");
            String number = scanner.nextLine();
            switch (number) {
                case "1":
                    service.staffing(service.getEmployees());
                    break;
                case "2":
                    service.addEmployee(service.getEmployees());
                    break;
                case "3":
                    service.deleteEmployee(service.getEmployees());
                    break;
                case "4":
                    service.editEmployee(service.getEmployees());
                    break;
                case "5":
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Неверный ввод");
                    break;
            }


        }
    }
}

