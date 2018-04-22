package calculator_test.test_other;

import calculator_test.CalculatorTestBase;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestSqrt extends CalculatorTestBase {

    @Test(description = "TestSqrt", dataProvider = "dataProvider_TestSqrt", groups = "group_all", priority = 201)
    public void testSqrt(double a, double expectedResult) throws Exception {
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, expectedResult, 0.001, "Test for " + getClass() + " failed:");
    }

    @DataProvider(name = "dataProvider_TestSqrt")
    public Object[][] dataProvider() {
        return new Object[][]{
                {2, 1.414},
                {0, 0},
                {-1, 1.0}, //Корень чётной степени из отрицательного числа не существует в области вещественных чисел - ? in calc = NaN
                {0.14, 0.374},
        };
    }
}