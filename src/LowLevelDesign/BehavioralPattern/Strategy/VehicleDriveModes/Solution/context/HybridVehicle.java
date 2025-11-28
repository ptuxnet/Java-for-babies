package LowLevelDesign.BehavioralPattern.Strategy.VehicleDriveModes.Solution.context;

import LowLevelDesign.BehavioralPattern.Strategy.VehicleDriveModes.Solution.Strategies.DriveStrategy;

// Concrete context subclass
public class HybridVehicle extends Vehicle {

    public HybridVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
