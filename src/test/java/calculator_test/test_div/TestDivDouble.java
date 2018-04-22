package calculator_test.test_div;

import calculator_test.CalculatorTestBase;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestDivDouble extends CalculatorTestBase {

    @Test(description = "TestDivDouble", dataProvider = "dataProvider_TestDivDouble")
    public void testDivDouble(double a, double b, double res) {
        Assert.assertEquals(calculator.div(a, b), res, 0.01, "TestDivDouble result:");
    }

    @DataProvider(name = "dataProvider_TestDivDouble")
    public Object[][] dataProvider() {
        return new Object[][]{
                {6, 3, 2},
                {-6.11, -3.22, 1.90},
                {-2, 3.1, -0.65},
                {0, 7, 0}
        };
    }
}