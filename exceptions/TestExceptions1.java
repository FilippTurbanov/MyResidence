package exceptions;

public class TestExceptions1 {
    int a = 25000;
    int b = 0;
    double c = 25000.0;
    double d = 0.0;

    public static void main(String[] args) {
        TestExceptions1 test = new TestExceptions1();
        test.test1(); // в try возникает арифметическая ошибка, catch ловит её и выводит в консоль сообщение,
                      // выполнение программы продолжается (код 0)
        /*test.test2();*/     // в try ошибка, печатается текст из finally, затем вылетает:
                              // Exception in thread "main" java.lang.ArithmeticException: / by zero   (код 1)
        test.test3();  // в try возникает арифметическая ошибка, catch ловит её и выводит в консоль сообщение,
                       // затем срабатывает finally, выполнение продолжается (код 0)
    }

    // деление на дробный ноль даёт бесконечность, на целый ноль - ошибку.
    public int fatality(int a, int b) {
        return a / b;
    }

    public double fatality(double c, double d) {
        return c / d;
    }

    public void test1() {
        System.out.println("Test1");
        try {
            System.out.println(fatality(c, d));
            System.out.println(fatality(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Не стоит делить на ноль.");
        }
        System.out.println();
    }

    public void test2() {
        System.out.println("Test2");
        try {
            System.out.println(fatality(c, d));
            System.out.println(fatality(a, b));
        } finally {
            System.out.println("Было бы неплохо увидеть это сообщение.");
        }
        System.out.println();
    }

    public void test3() {
        System.out.println("Test3");
        try {
            System.out.println(fatality(c, d));
            System.out.println(fatality(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Не стоит делить на ноль.");
        } finally {
            System.out.println("Здесь может быть ваша реклама.");
        }
        System.out.println();
    }
}
