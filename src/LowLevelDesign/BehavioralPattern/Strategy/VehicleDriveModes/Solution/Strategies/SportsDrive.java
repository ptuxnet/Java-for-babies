package LowLevelDesign.BehavioralPattern.Strategy.VehicleDriveModes.Solution.Strategies;

// Concrete strategy for sports drive mode
public class SportsDrive implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Driving Capability: Sports");
    }
}
