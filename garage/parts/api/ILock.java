package garage.parts.api;

public interface ILock {
    boolean keyCheck(String key, String lock);
    void keyCheckFailed();
    void keyCheckSuccessful();
}
