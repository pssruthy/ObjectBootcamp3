package measurment.addabale.length;

import measurment.addabale.AddableQuantity;

public class Length extends AddableQuantity<LengthUnit> {
    
    public Length(double value, LengthUnit unit) {
        super(value, unit);
    }
    
    @Override
    protected AddableQuantity<LengthUnit> createAddableQuantity(double magnitude, LengthUnit unit) {
        return new Length(magnitude, unit);
    }
    
    @Override
    protected LengthUnit getStandardUnit() {
        return LengthUnit.INCH;
    }
}
