package measurment;

import measurment.unit.TemperatureUnit;

public class Temperature extends Quantity<TemperatureUnit>{
    public Temperature(double value, TemperatureUnit unit) {
        super(value,unit);
    }
}
