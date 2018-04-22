package calculator_test.test_pos_neg;

import calculator_test.CalculatorTestBase;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestIsNeg extends CalculatorTestBase {

    @Test(description = "TestIsNeg", dataProvider = "dataProvider_TestIsNeg")
    public void testIsNeg(long a) throws Exception {
        boolean isNeg = calculator.isNegative(a);
        Assert.assertTrue(isNeg, "Test for TestIsNeg failed: " + a + " is not negative.");
    }

    @DataProvider(name = "dataProvider_TestIsNeg")
    public Object[] dataProvider() {
        return new Object[]{0, -1, -3, -5, -101, 213};
    };
}