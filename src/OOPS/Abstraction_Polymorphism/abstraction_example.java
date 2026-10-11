package OOPS.Abstraction_Polymorphism;

public class abstraction_example {
    public static void main(String[] args) {

        Car car = new ElectricCar();
        car.start();
        car.accelerate();
        car.brake();

        Car car2 = new FuelCar();
        car2.start();
        car2.accelerate();
        car2.brake();


    }
 
}

abstract class Car {
    void start() {
        System.out.println("Car is starting");
    }

    abstract void accelerate();

    abstract void brake();

}

class ElectricCar extends Car {
    @Override
    void accelerate() {
        System.out.println("Electric car is accelerating");
    }

    @Override
    void brake() {
        System.out.println("Electric car is braking");
    }

}

class FuelCar extends Car {
    @Override
    void accelerate() {
        System.out.println("Fuel car is accelerating");
    }

    @Override
    void brake() {
        System.out.println("Fuel car is braking");
    }

}