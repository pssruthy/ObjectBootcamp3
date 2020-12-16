package measurment.volume;

public interface Measurable {
    double convertTo(double value, Measurable otherUnit);
}
