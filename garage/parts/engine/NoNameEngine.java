package garage.parts.engine;

import garage.parts.engine.api.FuelType;
import garage.parts.engine.api.IEngine;

import java.util.Random;

public class NoNameEngine implements IEngine{
    private final String id;
    private final int capacity;
    private FuelType fuelType;
    private boolean running = false;

    public NoNameEngine(int capacity, FuelType fuelType, String id) {
        this.capacity = capacity;
        this.fuelType = fuelType;
        this.id = id;
    }

    @Override
    public String getEngineName() {
        return "No name";
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

    public boolean start() {
        System.out.println("Мотор заведен, но издает странные звуки.");
        if (!running)
            running = true;
        else
            throw new IllegalArgumentException("Нельзя завести заведенный мотор.");
        return true;
    }

    public boolean stop() {
        System.out.println("Мотор заглушен.");
        if (running)
            running = false;
        else
            throw new IllegalArgumentException("Нельзя остановить выключенный мотор.");
        return false;
    }

    public double fuelConsuming() {
        System.out.println("Увеличенный расход топлива.");
        Random rnd = new Random();
        return ((rnd.nextDouble()) % 1 + (rnd.nextInt(9) + 4.5));
    }
}
