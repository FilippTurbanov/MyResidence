package garage.parts.api;

public interface ILock {
    String getCarLock();
    boolean keyCheck();
    void keyCheckFailed();
    void keyCheckSuccessful();
}
