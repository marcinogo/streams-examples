package zadanko3;

import java.math.BigDecimal;

class Car {
    private String model;
    private String make;
    private int doors;
    private BigDecimal price;
    private int power;


    Car(String model, String make, int doors, BigDecimal price, int power) {
        this.model = model;
        this.make = make;
        this.doors = doors;
        this.price = price;
        this.power = power;
    }

    @Override
    public String toString() {
        return make + " " + model;
    }

    String getMake() {
        return make;
    }

    int getDoors() {
        return doors;
    }

    BigDecimal getPrice() {
        return price;
    }

    int getPower() {
        return power;
    }
}
