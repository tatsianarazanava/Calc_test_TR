package calculator_test.test_smoke.test_mult;

import calculator_test.CalculatorTestBase;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestMultDouble extends CalculatorTestBase {

    @Test(testName = "TestMultDouble", dataProvider = "dataProvider_TestMultDouble")
    public void testMultDouble(double a, double b, double res) {
        Assert.assertEquals(calculator.mult(a, b), res, 0.0001,"TestMultDouble result:");
    }

    @DataProvider(name = "dataProvider_TestMultDouble")
    public Object[][] dataProvider() {
        return new Object[][]{
                {2, 3, 6},
                {-2.22, -3.33, 7.3926},
                {-2, 3.1, -6.2},
                {-2.1, 0, 0.00}
        };
    }
}