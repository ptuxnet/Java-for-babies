package LowLevelDesign.BehavioralPattern.Strategy.VehicleDriveModes.Solution;

import LowLevelDesign.BehavioralPattern.Strategy.VehicleDriveModes.Solution.Strategies.EVDrive;
import LowLevelDesign.BehavioralPattern.Strategy.VehicleDriveModes.Solution.Strategies.NormalDrive;
import LowLevelDesign.BehavioralPattern.Strategy.VehicleDriveModes.Solution.Strategies.SportsDrive;
import LowLevelDesign.BehavioralPattern.Strategy.VehicleDriveModes.Solution.context.GoodsVehicle;
import LowLevelDesign.BehavioralPattern.Strategy.VehicleDriveModes.Solution.context.HybridVehicle;
import LowLevelDesign.BehavioralPattern.Strategy.VehicleDriveModes.Solution.context.SportsVehicle;
import LowLevelDesign.BehavioralPattern.Strategy.VehicleDriveModes.Solution.context.Vehicle;

public class Demo {
    public static void main(String[] args) {
        System.out.println("###### Strategy Design Pattern ######");
        System.out.println("###### Example: Vehicle Drive Modes ######");

        Vehicle vehicle = new SportsVehicle(new SportsDrive());
        vehicle.drive();

        vehicle = new GoodsVehicle(new NormalDrive());
        vehicle.drive();

        vehicle = new HybridVehicle(new EVDrive());
        vehicle.drive();

        vehicle = new GoodsVehicle(new NormalDrive());
        vehicle.drive();
    }
}
