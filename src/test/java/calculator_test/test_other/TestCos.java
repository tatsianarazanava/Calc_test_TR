package calculator_test.test_other;

import calculator_test.CalculatorTestBase;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestCos extends CalculatorTestBase {

    @Test(testName = "TestCos", dataProvider = "dataProvider_TestCos", groups = "group_sin_cos")
    public void testCos(double a, double expectedResult) throws Exception {
        double result = calculator.cos(a);
        Assert.assertEquals(result, expectedResult, 0.001, "Test for TestCos failed: ");
    }

    @DataProvider(name = "dataProvider_TestCos")
    public Object[][] dataProvider() {
        return new Object[][]{
                {30, Math.cos(30)},
                {45.0, Math.cos(45)},
                {360.0, Math.cos(360)}
        };
    }
}