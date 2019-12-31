package garage.parts.engine.api;

public interface IEngine {
    String getEngineName();
    int getCapacity();
    String getId();
    FuelType getFuelType();
    double fuelConsuming();
}
