package measurment.temperature;

import measurment.Unit;

public class TemperatureUnit extends Unit {
    public static final TemperatureUnit FAHRENHEIT = new TemperatureUnit(5/9.0,-32);
    public static final TemperatureUnit CELSIUS = new TemperatureUnit(1,0);
    private final double additionFactor;
    
    protected TemperatureUnit(double baseValue, double additionFactor) {
        super(baseValue);
        this.additionFactor = additionFactor;
    }
    
    @Override
    public double convertToBase(double value) {
        return super.convertToBase(value + additionFactor);
    }
}
