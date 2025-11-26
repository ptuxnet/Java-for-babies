package LLD.SolidPrinciple.LiskovSubtitution.Example.Violation;

// BAD: This design violates LSP
public interface Bike {

    void turnOnEngine();

    void turnOffEngine();

    void accelerate();

    void applyBrakes();
}
