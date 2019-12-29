package garage.cars.api;

public abstract class ACars implements ICar {
    @Override
    public void drive() {
        System.out.println("Поехал.");
    }

    @Override
    public void open() {
        System.out.println("Открываю двери машины.");
    }

    @Override
    public void close() {
        System.out.println("Закрываю двери.");
    }

    @Override
    public void start() {
        System.out.println("Завожу мотор.");
    }

    @Override
    public void stop() {
        System.out.println("Останавливаюсь.");
    }

    @Override
    public void fuel() {
        System.out.println("Проверяю уровень топлива...");
    }

    @Override
    public void changeWheel() {
        System.out.println("Меняю колесо...");
    }

    @Override
    public void driverSeat() {
        System.out.println("Сажусь за водительское сиденье.");
    }

    @Override
    public void passengerSeat() {
        System.out.println("Пассажир сел в машину.");
    }
}
