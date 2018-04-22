package calculator_test.test_pos_neg;

import calculator_test.CalculatorTestBase;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestIsNeg extends CalculatorTestBase {

    @Test(testName = "TestIsNeg", dataProvider = "dataProvider_TestIsNeg")
    public void testIsNeg(long a) throws Exception {
        boolean isNeg = calculator.isNegative(a);
        Assert.assertTrue(isNeg, "Test for TestIsNeg failed: " + a + " is not negative.");
    }

    @DataProvider(name = "dataProvider_TestIsNeg")
    public Object[] dataProvider() {
        return new Object[]{-1, -3, -5, -101};
    };

    @Test(testName = "TestIsNeg2", dataProvider = "dataProvider_TestIsNeg2")
    public void testIsNeg2(long a) throws Exception {
        boolean isNeg = calculator.isNegative(a);
        Assert.assertFalse(isNeg, "Test for TestIsNeg failed: " + a + " is not negative.");
    }

    @DataProvider(name = "dataProvider_TestIsNeg2")
    public Object[] dataProvider2() {
        return new Object[]{1, 3, 5, 101, 213};
    };
}