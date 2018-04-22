package calculator_test.test_other;

import calculator_test.CalculatorTestBase;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestPow extends CalculatorTestBase {

    @Test(testName = "TestPow", dataProvider = "dataProvider_TestPow")
    public void testPow(double a, double b, double expectedResult) throws Exception {
        double result = calculator.pow(a, b);
        Assert.assertEquals(result, expectedResult, 0.001, "Test for TestPow failed: ");
    }

    @DataProvider(name = "dataProvider_TestPow")
    public Object[][] dataProvider() {
        return new Object[][]{
                {2, 3, 8},
                {2, -3, 0.125},
                {-2, -3, -0.125},
                {2, 0, 1},
                {0, 2, 0},
                {2.22, 3.33, 14.23}
        };
    }
}