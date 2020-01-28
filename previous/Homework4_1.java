package previous;

public class Homework4_1 {
    public static void main(String[] args) {
        Country country = Country.BELARUS;
        String test1 = String.valueOf(country); // valueOf() работает с enum при правильном указании элемента
        System.out.println(test1); // BELARUS

        // test1 = String.valueOf(BELARUS); - valueOf() выдает ошибку, если в параметр вводить название элемента
        // без указания ссылки на enum-класс

        // System.out.println(country == test1); - выдает ошибку: нельзя сравнивать типы enum (в данном случае Country)
        // и String.

        // String test2 = String.valueOf(Country.BELARUSSIA); - выдает ошибку, т.к. не может найти переменную с именем
        // BELARUSSIA (несуществующем) в классе Country

        Integer square1 = Country.GERMANY.getSquare(); // тип Integer, а не int, т.к. используется для compareTo()
        int square2 = Country.NORWAY.getSquare();
        System.out.println(square1); // 600
        System.out.println(square2); // 1000
        System.out.println(square1.compareTo(square2)); // -1 (означает, что первое значение меньше второго)

        System.out.println(Country.GERMANY.squaresComparing(square2)); // -1 (см.выше)
        System.out.println(Country.GERMANY.squaresComparing(Country.NORWAY.getSquare())); // -1 (см.выше)
    }
}
interface ICountry { //интерфейс enum
    int getSquare();
    int getPopulation();
}
enum Country implements ICountry{ //реализация интерфейса enum
    BELARUS (100, 100000), //элементы и их свойства
    RUSSIA (200, 110000),
    GREAT_BRITAIN (300, 111000),
    FRANCE (400, 111100),
    POLAND (500, 123456),
    GERMANY (600, 654321),
    UKRAINE (700, 153578),
    LITHUANIA (800, 887700),
    LATVIA (900, 94949),
    NORWAY (1000, 147258);

    int square;
    int population;

    Country(int square, int population) { //инициализация свойств элементов enum
        this.square = square;
        this.population = population;
    }

    @Override //реализация методов интерфейса enum
    public int getSquare() {
        return square;
    }

    @Override
    public int getPopulation() {
        return population;
    }

    public int squaresComparing(int squareToComparing) { //метод сравнения площадей стран
        return Integer.compare(square, squareToComparing);
    }
}
