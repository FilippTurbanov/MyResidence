package garage.parts;

import garage.parts.api.IKeys;

public class Keys implements IKeys {
    String key;

    @Override
    public String getKey(String key) {
        this.key = key;
        return key;
    }
}
