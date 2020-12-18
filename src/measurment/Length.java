package measurment;

import measurment.unit.LengthUnit;

public class Length extends Quantity<LengthUnit> {
    
    private final LengthUnit standardUnit;
    
    public Length(double value, LengthUnit unit) {
        super(value, unit);
        this.standardUnit = LengthUnit.INCH;
    }
    
    public Length add(Length other) {
        double sumInBase = this.round(other.convertToBase() + this.convertToBase());
        double sumInStandard = this.standardUnit.convertFromBase(sumInBase);
        return new Length(sumInStandard, this.standardUnit);
    }
    
    private double round(double value) {
        return Math.round(value * 100)/100.0;
    }
}
