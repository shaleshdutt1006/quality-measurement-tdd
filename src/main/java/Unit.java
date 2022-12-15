public enum Unit {

    FEET(12.0),INCH(1.0),Yard(36);
    Double baseUnitConversion;
    Unit(double baseUnitConversion){
        this.baseUnitConversion=baseUnitConversion;
    }

    public double compare(Length l1,Length l2){
        return Double.compare(l1.value=l1.unit.baseUnitConversion,
                            l2.value=l2.unit.baseUnitConversion);
    }
}
