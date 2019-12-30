package garage.parts.engine;

import garage.parts.engine.api.FuelType;
import garage.parts.engine.api.IChangeableFuelType;

import java.util.Random;

public class AudiEngine implements IChangeableFuelType {
    private final String id;
    private final int capacity;
    private FuelType fuelType;
    private boolean running = false;

    public AudiEngine(int capacity, FuelType fuelType, String id) {
        this.capacity = capacity;
        this.fuelType = fuelType;
        this.id = id;
    }

    @Override
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String getEngineName() {
        return "Audi V10 Spyder";
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public FuelType getFuelType() {
        return fuelType;
    }

    @Override
    public boolean start() {
        if (!running)
            running = true;
        else
            throw new IllegalArgumentException("Нельзя завести заведенный мотор.");
        return true;
    }

    @Override
    public boolean stop() {
        if (running)
            running = false;
        else
            throw new IllegalArgumentException("Нельзя остановить выключенный мотор.");
        return false;
    }

    @Override
    public double fuelConsuming() {
        Random rnd = new Random();
        return ((rnd.nextDouble()) % 1 + (rnd.nextInt(9) + 2));
    }
}
