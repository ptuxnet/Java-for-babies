package LowLevelDesign.BehavioralPattern.Strategy.VehicleDriveModes.Solution.context;

import LowLevelDesign.BehavioralPattern.Strategy.VehicleDriveModes.Solution.Strategies.DriveStrategy;

// Concrete context subclass
public class GoodsVehicle extends Vehicle {

    public GoodsVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
