package garage.parts.wheel;

import garage.parts.wheel.api.IWheel;

public class WheelInfo implements IWheel {
    @Override
    public void getWheelInfo() {
        System.out.print("Марка шин: ");
        switch (WheelBrand.getWheelBrand()) {
            case BRIDGESTONE:
                System.out.println("Bridgestone");
                break;
            case CONTINENTAL:
                System.out.println("Continental");
                break;
            case NOKIAN:
                System.out.println("Nokian");
                break;
        }
        System.out.print("Сезонность шин: ");
        switch (WheelSeasonType.getWheelSeasonType()) {
            case SUMMER:
                System.out.println("летние");
                break;
            case WINTER:
                System.out.println("зимние");
                break;
            case UNIVERSAL:
                System.out.println("всесезонные");
                break;
        }
        System.out.println("Радиус шин: " + WheelRadius.getWheelRadius());
    }
}
