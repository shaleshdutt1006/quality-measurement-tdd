import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given1FeetAnd12InchesShouldReturnEqual() {
        Length length = new Length(Unit.FEET, 1);
        boolean result = length.compare(new Length(Unit.INCH, 12));
        Assert.assertTrue(result);

    }
    @Test
    public void given0FeetAnd0InchesShouldReturnEqual() {
        Length length = new Length(Unit.FEET, 0);
        boolean result = length.compare(new Length(Unit.INCH, 0));
        Assert.assertTrue(result);

    }
    @Test
    public void given1InchesAnd1FeetShouldReturnNotEqual() {
        Length length = new Length(Unit.FEET, 1);
        boolean result = length.compare(new Length(Unit.INCH, 1));
        Assert.assertFalse(result);

    }
    @Test
    public void given1FeetAnd1YardShouldReturnNotEqual() {
        Length length = new Length(Unit.Yard, 1);
        boolean result = length.compare(new Length(Unit.Yard, 1));
        Assert.assertFalse(result);
    }

    @Test
    public void given1YardEqual36InchesShouldReturnEqual() {
        Length length = new Length(Unit.Yard, 1);
        boolean result = length.compare(new Length(Unit.INCH, 36));
        Assert.assertTrue(result);
    }
    @Test
    public void given1YardAnd3FeetShouldReturnEqual() {
        Length length = new Length(Unit.Yard, 1);
        boolean result = length.compare(new Length(Unit.FEET, 3));
        Assert.assertTrue(result);
    }
    @Test
    public void given1FeetAnd1InchesShouldReturnNotEqual() {
        Length length = new Length(Unit.FEET, 1);
        boolean result = length.compare(new Length(Unit.INCH, 1));
        Assert.assertFalse(result);
    }

}
