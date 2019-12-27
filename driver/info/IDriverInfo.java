package driver.info;

public interface IDriverInfo {
    void drivingExperience();
    void licenceCategories();
    void typesOfKeys();
}

class DriverInfo implements IDriverInfo {

    @Override
    public void drivingExperience() {
        System.out.println("Стаж вождения составляет 5 лет.");
    }

    @Override
    public void licenceCategories() {
        System.out.println("Имеются права категорий B, C, D");
    }

    @Override
    public void typesOfKeys() {
        System.out.println("Имеются ключи от Audi, Lada, Почтового ящика:)");
    }
}
