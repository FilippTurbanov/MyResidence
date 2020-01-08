package garage.cars.api;

public interface ICar {
    void driveCar();
    void openCar(String key);
    void closeCar(String key);
    void startCar();
    void stopCar();
    void fuel();
    void changeWheel();
    void driverSeat();
    void passengerSeat();
    void carInfo();
    void takePassenger();
}
