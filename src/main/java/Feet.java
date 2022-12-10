public class Feet {
    private final double value;
    public Feet() {
        value=0;
    }
    public Feet(double value) {
        this.value = value;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Feet feet = (Feet) o;

        return Double.compare(feet.value, value) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(value);
        return (int) (temp ^ (temp >>> 32));
    }

}
