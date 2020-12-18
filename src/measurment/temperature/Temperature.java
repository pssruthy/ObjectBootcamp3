package measurment.temperature;

import measurment.Quantity;

public class Temperature extends Quantity<TemperatureUnit> {
    public Temperature(double value, TemperatureUnit unit) {
        super(value,unit);
    }
}
