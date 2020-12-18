package measurment;

import measurment.unit.LengthUnit;

import java.util.Objects;

public class Length extends AddableQuantity<LengthUnit> {
    
    private final LengthUnit standardUnit;
    
    public Length(double value, LengthUnit unit) {
        super(value, unit);
        this.standardUnit = LengthUnit.INCH;
    }
    
    @Override
    protected AddableQuantity<LengthUnit> createAddableQuantity(double magnitude, LengthUnit unit) {
        return new Length(magnitude, unit);
    }
    
    @Override
    protected LengthUnit getStandardUnit() {
        return this.standardUnit;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Length length = (Length) o;
        return Objects.equals(standardUnit, length.standardUnit);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), standardUnit);
    }
}
