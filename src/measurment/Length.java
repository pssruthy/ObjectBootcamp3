package measurment;

import measurment.unit.LengthUnit;

import java.util.Objects;

public class Length extends Quantity<LengthUnit> {
    
    private final LengthUnit standardUnit;
    
    public Length(double value, LengthUnit unit) {
        super(value, unit);
        this.standardUnit = LengthUnit.INCH;
    }
    
    public Length add(Length other) {
        double sumInBase =other.convertToBase() + this.convertToBase();
        double sumInStandard = this.standardUnit.convertFromBase(sumInBase);
        return new Length(sumInStandard, this.standardUnit);
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
