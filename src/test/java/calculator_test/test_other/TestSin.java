package calculator_test.test_other;

import calculator_test.CalculatorTestBase;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestSin extends CalculatorTestBase {

    @Test(description = "TestSin", dataProvider = "dataProvider_TestSin", groups = "group_sin_cos")
    public void testSin(double a, double expectedResult) throws Exception {
        double result = calculator.sin(a);
        Assert.assertEquals(result, expectedResult, 0.001, "Test for TestSin failed: ");
    }

    @DataProvider(name = "dataProvider_TestSin")
    public Object[][] dataProvider() {
        return new Object[][]{
                {30, Math.sin(30)},
                {45.0, Math.sin(45)},
                {360.0, Math.sin(360)}
        };
    }
}