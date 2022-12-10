import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given1YardAnd3FeetShouldReturnEqual() {
        CompareLength compareLength = new CompareLength();
        boolean result = compareLength.checkFeetIntoYard(10, 30);
        Assert.assertTrue(result);
    }

    @Test
    public void given1FeetAnd1YardShouldReturnNotEqual() {
        CompareLength compareLength = new CompareLength();
        boolean result = compareLength.checkFeetIntoYard(1, 1);
        Assert.assertFalse(result);
    }

    @Test
    public void given1YardEqual36InchesShouldReturnEqual() {
        CompareLength compareLength = new CompareLength();
        boolean result = compareLength.checkFeetIntoInches(1, 36);
        Assert.assertTrue(result);
    }

    @Test
    public void given1FeetAnd1InchesShouldReturnNotEqual() {
        CompareLength compareLength = new CompareLength();
        boolean result = compareLength.checkFeetIntoInches(1, 1);
        Assert.assertFalse(result);
    }

}
