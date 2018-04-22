package calculator_test.test_other;

import calculator_test.CalculatorTestBase;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestTg extends CalculatorTestBase {

    @Test(testName = "TestTg", dataProvider = "dataProvider_TestTg", dependsOnGroups = "group_sin_cos")
    public void testTg(double a, double expectedResult) throws Exception {
        double result = calculator.tg(a);
        Assert.assertEquals(result, expectedResult, 0.001, "Test for TestTg failed: ");
    }

    @DataProvider(name = "dataProvider_TestTg")
    public Object[][] dataProvider() {
        return new Object[][]{
                {30, Math.sin(30)/Math.cos(30)},
                {45.0, Math.sin(45.0)/Math.cos(45.0)},
                {360.0, Math.sin(360.0)/Math.cos(360.0)}
        };
    }
}