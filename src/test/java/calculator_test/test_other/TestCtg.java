package calculator_test.test_other;

import calculator_test.CalculatorTestBase;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestCtg extends CalculatorTestBase {

    @Test(testName = "TestCtg", dataProvider = "dataProvider_TestCtg", dependsOnGroups = "group_sin_cos")
    public void testCtg(double a, double expectedResult) throws Exception {
        double result = calculator.ctg(a);
        Assert.assertEquals(result, expectedResult, 0.001, "Test for TestCtg failed: ");
    }

    @DataProvider(name = "dataProvider_TestCtg")
    public Object[][] dataProvider() {
        return new Object[][]{
                {30, 1/Math.tan(30)},
                {45.0, 1/Math.tan(45)},
                {360.0, 1/Math.tan(360)}
        };
    }
}