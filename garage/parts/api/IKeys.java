package garage.parts.api;

public interface IKeys {
    void checkKeys();
    void startEngine();
}
class Keys implements IKeys {

    @Override
    public void checkKeys() {
        System.out.println("Подбираю ключ.");
    }

    @Override
    public void startEngine() {
        System.out.println("Завожу машину.");
    }
}
