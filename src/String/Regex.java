package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        //Найти все email-адреса в тексте, удовлетворяющие стандартным правилам валидации адресов,
        // включая проверку на наличие символов "@" и "." и отсутствие пробелов.
        String regex1 = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";

       // Найти все телефонные номера в тексте, соответствующие определенному формату,
        // например: (XXX) XXX-XXXX, где X - цифра от 0 до 9.
        String regex2 = "\\(\\d{3}\\)\\s\\d{3}-\\d{4}";

        //Найти все ссылки на веб-страницы в тексте, включая различные протоколы (http, https, ftp)
        // и домены верхнего уровня (com, org, ru и т. д.).
        String regex3 = "\\b(?:http|https|ftp)://[\\w\\d\\-_]+(?:\\.[\\w\\d\\-_]+)+[\\w\\d\\-.,@?^=%&:/~+#]*\\b";

        //Найти и извлечь все HTML-теги и их содержимое из HTML-документа.
        String regex4 = "<[^>]*>(.*?)</[^>]*>";

        //Найти и заменить все слова в тексте, начинающиеся с буквы "a" и заканчивающиеся на "ing",
        // но не содержащие в себе других гласных букв.

        String regex5 = "\\b[aA][^aeiouAEIOU]*[aA][^aeiouAEIOU]*[iI][nN][gG]\\b";
        //Найти и извлечь все IPv4-адреса (например, 192.168.0.1) из текста.

        String regex6 = "\\b(?:\\d{1,3}\\.){3}\\d{1,3}\\b";
        //Найти и извлечь все даты в формате dd/MM/yyyy из текста.
        String regex7 = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        //Найти и извлечь все слова, содержащие только заглавные буквы, из текста.
        String regex8 = "\\b[A-Z]+\\b";
        /*
        //Найти и заменить все двухбуквенные слова в тексте на их перевернутые аналоги.
        String text = "Hello, World! I AM a Java developer.";
        String regex9 = "\\b\\p{Lu}{2}\\b";
        Pattern patternR9 = Pattern.compile(regex9);
        Matcher matcherR9 = patternR9.matcher(text);
        while (matcherR9.find()) {
            String originalWord = matcherR9.group();
            String reversedWord = new StringBuilder(originalWord).reverse().toString();
            text = text.replace(originalWord, reversedWord);
        }
        System.out.println(text);
        */

        /*
        //Найти и извлечь все слова, содержащие цифры, из текста.
        String text = "Hel231lo, Wor2ld! I AM a Java developer.";
        String regex = "\\b\\w*\\d+\\w*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String wordWithDigits = matcher.group();
            System.out.println(wordWithDigits);
        }
        */


        //В данном примере регулярное выражение \\b\\w*\\d+\\w*\\b будет искать все слова
        // (\\b обозначает границу слова), содержащие хотя бы одну цифру (\\d+ обозначает одну
        // или более цифр), и извлекать их (matcher.group()) из текста. Метод matcher.find() будет
        // искать все совпадения в тексте, и цикл while позволит обработать все найденные слова.


        //Найти и заменить все числа, окруженные знаками доллара ($), на их квадратные корни в тексте.
        String text1 = "Hello, World! I AM a Java developer. I have $100$ and $200$";
        String regex10 = "\\$\\d+(\\.\\d+)?\\$";
        Pattern pattern2 = Pattern.compile(regex10);
        Matcher matcher2 = pattern2.matcher(text1);
        StringBuilder result = new StringBuilder();
        int previousEnd = 0;
        while (matcher2.find()) {
            String matchedNumber = matcher2.group();
            double number = Double.parseDouble(matchedNumber.substring(1, matchedNumber.length() - 1));
            double squareRoot = Math.sqrt(number);
            result.append(text1, previousEnd, matcher2.start()).append(squareRoot);
            previousEnd = matcher2.end();
        }
        result.append(text1.substring(previousEnd));
        String replacedText = result.toString();
        System.out.println(replacedText);

        //Найти и заменить все множественные пробелы в тексте на одиночные пробелы.
        //String text = "Hello,  World! I AM   a Java   developer.";
        //String regex = "\\s+";
        //Pattern pattern = Pattern.compile(regex);
        //Matcher matcher = pattern.matcher(text);
        //String replacedText = matcher.replaceAll(" ");


        //Найти и извлечь все слова, оканчивающиеся на "ing" или "ed" из текс
       // все слова, оканчивающиеся на "ing" или "ed" из текста.
        //String text = "killing is eding, but eding is not killing. hacked is hacking, but hacking is not hacked";
        //String regex = "\\b\\w+(ing|ed)\\b";
        //Pattern pattern = Pattern.compile(regex);
        //Matcher matcher = pattern.matcher(text);
        //while (matcher.find()) {
        //    String word = matcher.group();
        //    System.out.println(word);
        // }

        //Найти и извлечь все слова, содержащие только гласные буквы из текста.
        //String text = "слова гласные буквы";
        //String regex = "\\b[aeiouAEIOU]+\\b";
        //Pattern pattern = Pattern.compile(regex);
        //Matcher matcher = pattern.matcher(text);
        //while (matcher.find()) {
        //    String word = matcher.group();
        //    System.out.println(word);
        //}


    }
}
