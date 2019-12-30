package garage.cars;

import garage.cars.api.ACars;
import garage.parts.DriverLicence;
import garage.parts.Seats;
import garage.parts.engine.api.IEngine;
import garage.parts.wheel.WheelInfo;

public class Mercedes extends ACars {
    private String model;
    private IEngine engine;

    public Mercedes(String model, IEngine engine){
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return "Mercedes";
    }

    @Override
    public void carInfo() {
        System.out.println("Модель: " + getModel());
        System.out.println("Мотор: " + engine.getEngineName());
        System.out.println("Серийный номер мотора: " + engine.getId());
        System.out.println("Расход топлива: " + engine.fuelConsuming());
        System.out.println("Емкость бака: " + engine.getCapacity());
        System.out.print("Тип топлива: ");
        switch (engine.getFuelType()) {
            case DIESEL:
                System.out.println("дизельное");
                break;
            case PETROL:
                System.out.println("бензин");
                break;
        }
        Seats seats = new Seats();
        System.out.println("Количество мест для пассажиров: " + seats.seatsNumber());
        WheelInfo wheels = new WheelInfo();
        wheels.getWheelInfo();
        DriverLicence licence = new DriverLicence();
        System.out.println("Требуемая категория прав для управления ТС: " + licence.categoryRequirements());
    }
}
