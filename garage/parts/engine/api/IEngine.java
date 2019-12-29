package garage.parts.engine.api;

public interface IEngine {
    int getCapacity();
    String getId();
    FuelType getFuelType();
    boolean start();
    boolean stop();
    double running();
}
