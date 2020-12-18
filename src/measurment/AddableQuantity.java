package measurment;

import measurment.unit.Unit;

public abstract class AddableQuantity<U extends Unit> extends Quantity<U>{
    public AddableQuantity(double value, U unit) {
        super(value, unit);
    }
    
    public AddableQuantity<U> add(AddableQuantity<U> other) {
        U standardUnit = this.getStandardUnit();
        double sumInBase = other.convertToBase() + this.convertToBase();
        double sumInStandard = standardUnit.convertFromBase(sumInBase);
        return this.createAddableQuantity(sumInStandard, standardUnit);
    }
    
    protected abstract AddableQuantity<U> createAddableQuantity(double magnitude, U standardUnit);
    
    protected abstract U getStandardUnit();
}
