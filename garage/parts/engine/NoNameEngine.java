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



    public double fuelConsuming() {
        System.out.println("Увеличенный расход топлива.");
        Random rnd = new Random();
        return ((rnd.nextDouble()) % 1 + (rnd.nextInt(9) + 4.5));
    }
}
