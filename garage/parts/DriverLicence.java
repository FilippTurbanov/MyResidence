package garage.parts;

import garage.parts.api.IDriverLicence;

import static garage.DetermineCar.car;
import static driver.info.DriverInfo.*;

public class DriverLicence implements IDriverLicence {

    @Override
    public char categoryRequirements() { // менять
        if (car.equals("BMW"))
            return 'C';
        else
            return 'B';
    }

    @Override
    public boolean categoryCheck() { // менять
        if (category == 'C')
            return true;
        else
            return (category == categoryRequirements());
    }

    @Override
    public void categoryCheckFailed() {
        System.out.println("Не могу поехать на " + car + ", т.к. у меня права категории " + category + ", а нужны " +
                "категории " + categoryRequirements() + ".");
    }

    @Override
    public void categoryCheckSuccess() {
        System.out.println("И права с собой.");
    }
}
