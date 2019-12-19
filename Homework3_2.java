public class Homework3_2 {
    public static void main(String[] args) {
        String a = "Мама мыла раму";
        String b = "Мама" + " мыла " + "раму";
        System.out.println(a == b); // будет true, т.к. и в первом, и во втором случаях мы задаем строку через литерал.
    }
}
