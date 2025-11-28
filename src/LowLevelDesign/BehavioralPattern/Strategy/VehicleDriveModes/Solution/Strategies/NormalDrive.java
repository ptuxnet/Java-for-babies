package LowLevelDesign.BehavioralPattern.Strategy.VehicleDriveModes.Solution.Strategies;

// Concrete strategy for normal drive mode
public class NormalDrive implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Driving Capability: Normal");
    }
}
