package calculator_test.test_other;

import calculator_test.CalculatorTestBase;
import org.testng.Assert;
import org.testng.annotations.*;

import static java.lang.Double.NaN;


public class TestSqrt extends CalculatorTestBase {

    @Test(testName = "TestSqrt", dataProvider = "dataProvider_TestSqrt")
    public void testSqrt(double a, double expectedResult) throws Exception {
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, expectedResult, 0.001, "Test for TestSqrt failed:");
    }

    @DataProvider(name = "dataProvider_TestSqrt")
    public Object[][] dataProvider() {
        return new Object[][]{
                {2, 1.414},
                {0, 0},
                {0.14, 0.374},
                {-1, NaN}
        };
    }
}