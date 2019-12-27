package garage.parts.api;

public interface ILock {
    void openLock();
}

class Lock implements ILock {

    @Override
    public void openLock() {
        System.out.println("Открываю дверь.");
    }
}
