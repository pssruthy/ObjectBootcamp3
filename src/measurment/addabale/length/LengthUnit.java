package measurment.addabale.length;

import measurment.Unit;

public class LengthUnit extends Unit {
    public static final LengthUnit FEET = new LengthUnit(12);
    public static final LengthUnit INCH = new LengthUnit(1);
    public static final LengthUnit CENTIMETER = new LengthUnit(.4);
    public static final LengthUnit MILLIMETER = new LengthUnit(.04);

    private LengthUnit(double equivalentInInch) {
        super(equivalentInInch);
    }
}
