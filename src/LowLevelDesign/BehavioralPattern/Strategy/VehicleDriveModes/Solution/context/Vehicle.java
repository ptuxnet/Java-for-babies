package LowLevelDesign.BehavioralPattern.Strategy.VehicleDriveModes.Solution.context;

import LowLevelDesign.BehavioralPattern.Strategy.VehicleDriveModes.Solution.Strategies.DriveStrategy;

// Context class - holds a reference to a strategy object
public class Vehicle {
    DriveStrategy driveStrategy;

    // Constructor injection
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        System.out.print("\n" + this.getClass().getSimpleName() + ": ");
        driveStrategy.drive();
    }
}
