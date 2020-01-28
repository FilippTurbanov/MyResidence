package previous;

public class Homework1_extra1 {
    public static void main(String[] args) {
        int rub = 2000000;
        if ((rub % 10 == 1) && (rub % 100 != 11))
            System.out.println("Текущий остаток: "+rub+" рубль.");
        else if ((rub % 10 >=2) && (rub % 10 <=4) && (!((rub % 100 >=12) && (rub % 100 <=14))))
            System.out.println("Текущий остаток: "+rub+" рубля.");
        else
            System.out.println("Текущий остаток: "+rub+" рублей.");
    }
}
