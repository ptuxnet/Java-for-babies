package LowLevelDesign.BehavioralPattern.Strategy.VehicleDriveModes.Solution.Strategies;

// Concrete strategy for electric drive mode
public class EVDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving Capability: Electric Vehicle");
    }
}
