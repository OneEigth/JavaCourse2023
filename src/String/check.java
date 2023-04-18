package String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class check {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя(лат.): ");
        String name = "";
        String regexName = "[A-Z][a-z]+";
        do {
            name = scanner.nextLine();
            Pattern patternName = Pattern.compile(regexName);
            Matcher matcherName = patternName.matcher(name);
            if (!matcherName.matches()) {
                System.out.println("Неверный формат ввода. Попробуйте еще раз: ");
            }
        } while (!name.matches(regexName));

        System.out.println("Введите фамилию(лат.): ");
        String surname = "";
        String regexSurname = "[A-Z][a-z]+";
        do {
            surname = scanner.nextLine();
            Pattern patternSurname = Pattern.compile(regexName);
            Matcher matcherSurname = patternSurname.matcher(surname);
            if (!matcherSurname.matches()) {
                System.out.println("Неверный формат ввода. Попробуйте еще раз: ");
            }
        } while (!surname.matches(regexSurname));

        System.out.println("Введите дату рождения (формат хх.хх.хххх): ");
        String age = "";
        String regexAge = "[0-9]{2}.[0-9]{2}.[0-9]{4}";
        do {
            age = scanner.nextLine();
            Pattern patternAge = Pattern.compile(regexAge);
            Matcher matcherAge = patternAge.matcher(age);
            if (!matcherAge.matches()) {
                System.out.println("Неверный формат ввода. Попробуйте еще раз: ");
            }
        } while (!age.matches(regexAge));

        System.out.println("Введите Ваш номер телефона (формат +7-XXX-XXX-XX-XX): ");
        String phoneNumber = "";
        String regexPhoneNumber = "\\+7-[0-9]{3}-[0-9]{3}-[0-9]{2}-[0-9]{2}";
        do {
            phoneNumber = scanner.nextLine();
            Pattern patternPhoneNumber = Pattern.compile(regexPhoneNumber);
            Matcher matcherPhoneNumber = patternPhoneNumber.matcher(phoneNumber);
            if (!matcherPhoneNumber.matches()) {
                System.out.println("Неверный формат ввода. Попробуйте еще раз: ");
            }
        } while (!phoneNumber.matches(regexPhoneNumber));


        System.out.println("Введите Вашу почту: ");
        String email = "";
        String regexEmail = "[a-z0-9]+@[a-z]+\\.[a-z]+";
        do {
            email = scanner.nextLine();
            Pattern patternEmail = Pattern.compile(regexEmail);
            Matcher matcherEmail = patternEmail.matcher(email);
            if (!matcherEmail.matches()) {
                System.out.println("Неверный формат ввода. Попробуйте еще раз: ");
            }
        } while (!email.matches(regexEmail));

    }
}
