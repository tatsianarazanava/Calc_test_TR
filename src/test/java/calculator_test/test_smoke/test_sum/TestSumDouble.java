package calculator_test.test_smoke.test_sum;

import calculator_test.CalculatorTestBase;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestSumDouble extends CalculatorTestBase {

    @Test(testName = "TestSumDoublePositive", dataProvider = "dataProvider_TestSumDouble")
    public void testSumDouble(double a, double b, double res) {
        Assert.assertEquals(calculator.sum(a, b), res, 0.01, "TestSumDouble result:");
    }

    @DataProvider(name = "dataProvider_TestSumDouble")
    public Object[][] dataProvider() {
        return new Object[][]{
                {2, 3, 5},
                {2.0, 3.1, 5.1},
                {-2.0, -3.1, -5.1},
                {-2.2, 1, -1.2},
                {-2.0, 0, -2.0}
        };
    }

    @Test(testName = "TestSumDoubleNegative", dataProvider = "dataProvider_TestSumDouble2")
    public void testSumDouble2(double a, double b, double res) {
        Assert.assertNotEquals(calculator.sum(a, b), res, "Invalid result of TestSumDouble: "
                + a + " + " + b + " - result should not be " + res);
    }

    @DataProvider(name = "dataProvider_TestSumDouble2")
    public Object[][] dataProvider2() {
        return new Object[][]{
                {2.2, 3.3, 0},
        };
    }
}