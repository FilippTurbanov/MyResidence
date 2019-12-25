package garage.cars;

import garage.cars.api.ICar;

public class Audi implements ICar {
    @Override
    public void drive() {
        System.out.println("Поехали!");
    }

    @Override
    public void open() {
        System.out.println("Открываем двери...");
    }

    @Override
    public void close() {
        System.out.println("Закрываем двери...");
    }

    @Override
    public void start() {
        System.out.println("Трогаемся с места...");
    }

    @Override
    public void stop() {
        System.out.println("Останавливаемся.");
    }

    @Override
    public void fuel() {
        System.out.println("Проверяем уровень топлива...");
    }

    @Override
    public void changeWheel() {
        System.out.println("Меняем колесо...");
    }

    @Override
    public void driverSeat() {
        System.out.println("Садимся на водительское сиденье...");
    }

    @Override
    public void passengerSeat() {
        System.out.println("ОСадимся на пассажирское сиденье...");
    }
}
