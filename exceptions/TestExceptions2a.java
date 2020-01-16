package exceptions;

import exceptions.api.OneMoreException;

public class TestExceptions2a extends TestExceptions2 {
    public static void main(String[] args) throws OneMoreException {
        TestExceptions2a test2 = new TestExceptions2a();
        int indicator2;
        try {
            indicator2 = test2.setParam(11);
            System.out.println("Значение параметра равно: " + indicator2);
        } catch (OneMoreException e) {
            indicator2 = test2.setParam(5);
            System.out.println("Значение параметра равно: " + indicator2);
        }
    }

    @Override
    public int setParam(int param) throws OneMoreException {
        if (param == 11) {
            throw new OneMoreException("Параметр не может равняться 11");
        } else
            return param;
    }
}
