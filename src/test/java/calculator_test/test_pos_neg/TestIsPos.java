package calculator_test.test_pos_neg;

import calculator_test.CalculatorTestBase;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestIsPos extends CalculatorTestBase {

    @Test(description = "TestIsPos", dataProvider = "dataProvider_TestIsPos")
    public void testIsPos(long a) throws Exception {
        boolean isPos = calculator.isPositive(a);
        Assert.assertTrue(isPos, "Test for TestIsPos failed: " + a + " is not positive.");
    }

    @DataProvider(name = "dataProvider_TestIsPos")
    public Object[] dataProvider() {
        return new Object[]{1, 3, 5, 101};
    };


    @Test(description = "TestIsPos2", dataProvider = "dataProvider_TestIsPos2")
    public void testIsPos2(long a) throws Exception {
        boolean isPos = calculator.isPositive(a);
        Assert.assertFalse(isPos, "Test for TestIsPos failed: " + a + " is not positive.");
    }

    @DataProvider(name = "dataProvider_TestIsPos2")
    public Object[] dataProvider2() {
        return new Object[]{-1, -3, -5, -101};
    };

}
