public class Length {
    public static final double Feet_to_inch = 12;
    public static final double Yard_to_inch = 36;
    public static final double Yard_to_feet = 3;
    public final Unit unit;
    public double value;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length that) {
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value, that.value) == 0;
        if (this.unit.equals(Unit.FEET) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * Feet_to_inch, that.value) == 0;
        if (this.unit.equals(Unit.Yard) && that.unit.equals(Unit.INCH))
            return Double.compare(this.value * Yard_to_inch, that.value) == 0;
        if (this.unit.equals(Unit.Yard) && that.unit.equals(Unit.FEET))
            return Double.compare(this.value * Yard_to_feet, that.value) == 0;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        if (Double.compare(length.value, value) != 0) return false;
        return unit == length.unit;
    }

}
