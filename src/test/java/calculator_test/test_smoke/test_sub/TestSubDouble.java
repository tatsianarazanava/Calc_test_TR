package calculator_test.test_smoke.test_sub;

import calculator_test.CalculatorTestBase;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestSubDouble extends CalculatorTestBase {

    @Test(testName = "TestSubDoublePositive", dataProvider = "dataProvider_TestSubDouble")
    public void testSubLong(double a, double b, double res) {
        Assert.assertEquals(calculator.sub(a, b), res, 0.1, "TestSubDouble result: ");
    }

    @DataProvider(name = "dataProvider_TestSubDouble")
    public Object[][] dataProvider() {
        return new Object[][]{
                {3, 2, 1},
                {2.0, 3.1, -1.1},
                {-2.0, -3.1, 1.1},
                {-2.2, 3, -5.2},
                {-2.0, 0, -2.0}
        };
    }

    @Test(testName = "TestSubDoubleNegative", dataProvider = "dataProvider_TestSubDouble2")
    public void testSubLong2(double a, double b, double res) {
        Assert.assertNotEquals(calculator.sub(a, b), res, "Invalid result of TestSubDouble: "
                + a + " - " + b + " - result should not be " + res);
    }

    @DataProvider(name = "dataProvider_TestSubDouble2")
    public Object[][] dataProvider2() {
        return new Object[][]{
                {3.3, 2.2, 10}
        };
    }


}