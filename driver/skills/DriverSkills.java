package driver.skills;

import driver.skills.api.IDriverSkills;
import garage.parts.DriverLicence;
import garage.parts.Keys;

public class DriverSkills implements IDriverSkills {
    Keys keys = new Keys();
    String key = keys.getKey("SimSalabim12345");

    @Override
    public String getKey() {
        return key;
    }

    DriverLicence driverLicence = new DriverLicence();
    String category = driverLicence.getCategory("B");

    @Override
    public String getCategory() {
        return category;
    }
}
