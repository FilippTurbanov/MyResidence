package garage.parts.api;

public interface IKeys {
    boolean keyCheck();
    void keyCheckFailed();
    void keyCheckSuccessful();
    void openCar();
    void startCar();
    void closeCar();
}
