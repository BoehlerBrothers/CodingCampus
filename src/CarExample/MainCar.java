package CarExample;

public class MainCar {
    public static void main(String[] args) {
        Car myCar = new Car(4, 6500, 4.5);

        System.out.println("The car:");
        System.out.println("Tiers: " + myCar.getNumberTiers());
        System.out.println("Price" + myCar.getPrice());
        System.out.println("Gasolin Usage: " + myCar.getGasolinUsage());

        System.out.println("The car should brake");
        myCar.brakes();
        System.out.println("The car should  accelerate");
        myCar.accelerate();



    }
}
