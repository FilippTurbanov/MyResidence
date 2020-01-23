package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {
    public static void main(String[] args) {
        String str = "Я люблю JAVA";
        Pattern pattern1 = Pattern.compile("h*");
        Matcher matcher1 = pattern1.matcher(str);
        Pattern pattern2 = Pattern.compile("h+");
        Matcher matcher2 = pattern2.matcher(str);
        Pattern pattern3 = Pattern.compile("h?");
        Matcher matcher3 = pattern3.matcher(str);
        System.out.println("метод find()");
        // true, false, true, т.к. с регулярным выражением сравниваются подстроки
        System.out.println(matcher1.find());
        System.out.println(matcher2.find());
        System.out.println(matcher3.find());
        System.out.println("метод matches()");
        // false, false, false, т.к. с регулярным выражением сравнивается вся строка
        System.out.println(str.matches("h*"));
        System.out.println(str.matches("h+"));
        System.out.println(str.matches("h?"));
    }
}
