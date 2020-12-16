package measurment.unit;

public interface Unit {
    double convertTo(double value, Unit otherUnit);
}
