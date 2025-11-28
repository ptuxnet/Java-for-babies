package LowLevelDesign.BehavioralPattern.Strategy.VehicleDriveModes.Solution.context;

import LowLevelDesign.BehavioralPattern.Strategy.VehicleDriveModes.Solution.Strategies.DriveStrategy;

// Concrete context subclass
public class SportsVehicle extends Vehicle {

    public SportsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
