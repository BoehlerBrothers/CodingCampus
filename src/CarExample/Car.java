package CarExample;

public class Car {
    public int numberTires;
    public double price;
    public double gasolinUsage;

    public Car(int numberTiers, double price, double gasolinUsage) {
        this.numberTires = numberTiers;
        this.price = price;
        this.gasolinUsage = gasolinUsage;
    }

    public void brakes() {
        System.out.println("brakes");
    }

    public void accelerate() {
        System.out.println("accelerate");
    }

    public int getNumberTiers() {
        return numberTires;
    }

    public double getPrice() {
        return price;
    }


    public double getGasolinUsage() {
        return gasolinUsage;
    }
}
