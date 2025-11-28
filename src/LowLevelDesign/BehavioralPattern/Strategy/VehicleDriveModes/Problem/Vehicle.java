package LowLevelDesign.BehavioralPattern.Strategy.VehicleDriveModes.Problem;

public class Vehicle {
    public void drive() {
        System.out.println("\n" + this.getClass().getSimpleName() + ": ");
        System.out.println("Driving Capability: Normal driving mode engaged.");
    }
}
