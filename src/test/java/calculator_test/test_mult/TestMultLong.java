package calculator_test.test_mult;

import calculator_test.CalculatorTestBase;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestMultLong extends CalculatorTestBase {

    @Test(description = "TestMultLong", dataProvider = "dataProvider_TestMultLong")
    public void testMultLong(long a, long b, long res) {
        Assert.assertEquals(calculator.mult(a, b), res, "TestMultLong result:");
    }

    @DataProvider(name = "dataProvider_TestMultLong")
    public Object[][] dataProvider() {
        return new Object[][]{
                {2, 3, 6},
                {-2, -3, 6},
                {-2, 3, -6},
                {-2, 0, 0}
        };
    }
}