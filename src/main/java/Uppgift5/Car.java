package Uppgift5;

public class Car {

    private String color;
    private String brand;
    private static int numberOfCars;


    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
        numberOfCars += 0;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static int getNumberOfCars() {
        return numberOfCars +=1;
    }

    public static void setNumberOfCars(int numberOfCars) {
        Car.numberOfCars = numberOfCars;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
