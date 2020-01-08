package garage.parts;

import garage.parts.api.ILock;

public class Lock implements ILock {
    String key;
    String lock;

    @Override
    public boolean keyCheck(String key, String lock) {
        this.key = key;
        this.lock = lock;
        return (key.equals(lock));
    }

    @Override
    public void keyCheckFailed() {
        System.out.println("У меня нет ключей от этой машины.");
    }

    @Override
    public void keyCheckSuccessful() {
        System.out.println("Достал ключи от этой машины.");
    }
}
