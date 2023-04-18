import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое значение: ");
        double a = 0;
        a = scanner.nextDouble();
        System.out.println("Введите второе значение: ");
        double b = 0;
        b = scanner.nextDouble();

        System.out.println("Выберите действие:");
        System.out.println("1: +");
        System.out.println("2: -");
        System.out.println("3: /");
        System.out.println("4: *");
        int action = 0;
        action = scanner.nextInt();

        if (action == 1) {
            double sum = a + b;
            System.out.println("Сумма двух чисел равна " + sum);
        } else if (action == 2) {
            double sum = a - b;
            System.out.println("Разница двух чисел равна " + sum);
        } else if (action == 3) {
            if (a != 0 || b != 0) {
                double sum = a / b;
                System.out.println("Деление двух чисел равна " + sum);
            } else {
                System.out.println("На ноль делить нельзя");
            }
        } else if (action == 4) {
            if (a != 0 && b != 0) {
                double sum = a * b;
                System.out.println("Умножение двух чисел равна " + sum);
            } else {
                System.out.println("На ноль умножать нельзя, значение будет 0");
            }
        } else {
            System.out.println("Нет дакого действия");
        }
    }
}


