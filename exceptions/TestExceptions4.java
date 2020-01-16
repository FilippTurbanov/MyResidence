package exceptions;

import java.util.Random;

public class TestExceptions4 {
    public static void main(String[] args) {
        new TestExceptions4().task1();
        new TestExceptions4().task2();
    }

    public void task1() {
        try {
            new TestExceptions4().forException();
        } catch (IllegalAccessException checked) {
            System.out.println("Несколько блоков catch: Поймали и обработали checked exception!");
        } catch (IllegalArgumentException unchecked) {
            System.out.println("Несколько блоков catch: Поймали и обработали unchecked exception!");
        }
    }

    public void task2() {
        try {
            new TestExceptions4().forException();
        } catch (IllegalArgumentException | IllegalAccessException e) {
            System.out.println("Один блок catch: Поймали и обработали checked или unchecked exception!");
        }
    }

    public void forException() throws IllegalArgumentException, IllegalAccessException {
        Random rnd = new Random();
        boolean fatality = rnd.nextBoolean();
        if (fatality) {
            throw new IllegalArgumentException();
        } else
            throw new IllegalAccessException();
    }
}
