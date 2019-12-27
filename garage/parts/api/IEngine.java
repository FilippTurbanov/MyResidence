package garage.parts.api;

public interface IEngine {
    void volumeInfo();
    void fuelInfo();
    void engineModelInfo();
}

class Engine implements IEngine {

    @Override
    public void volumeInfo() {
        System.out.println("Уровень топлива критический!");
    }

    @Override
    public void fuelInfo() {

    }

    @Override
    public void engineModelInfo() {

    }
}
