import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0FeetShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void given0FeetAnd1FeetShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void NullCheck() {
        Feet feet1 = new Feet(2.0);
        Feet feet2 = null;
        Assert.assertNull(feet2);
    }

    @Test
    public void ReferenceCheck() {
        Feet feet1 = new Feet(2.0);
        Feet feet2 = feet1;
        Assert.assertSame(feet1, feet2);
    }
    @Test
    public void TypeCheck() {
        Feet feet1 = new Feet(0.0);
        Assert.assertTrue(feet1 instanceof Feet);
    }
    @Test
    public void valueCheckForEquality(){
        Feet feet1 = new Feet(3.0);
        Feet feet2 = new Feet(3.0);
        Assert.assertEquals(feet1,feet2);
    }
}
