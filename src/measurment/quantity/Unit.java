package measurment.quantity;

public interface Unit {
    double convertTo(double value, Unit otherUnit);
}
