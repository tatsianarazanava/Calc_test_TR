package calculator_test.test_sum;

import calculator_test.CalculatorTestBase;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestSumLong extends CalculatorTestBase {

    @Test(testName = "TestSumLongPositive", dataProvider = "dataProvider_TestSumLong")
    public void testSumLong(long a, long b, long res) {
        Assert.assertEquals(calculator.sum(a, b), res, "Invalid result of TestSumLong:");
    }

    @DataProvider(name = "dataProvider_TestSumLong")
    public Object[][] dataProvider() {
        return new Object[][]{
                {2, 3, 5},
                {-2, -3, -5},
                {-2, 3, 1},
                {2, -3, -1},
                {-2, 0, -2}
        };
    }

    @Test(testName = "TestSumLongNegative", dataProvider = "dataProvider_TestSumLong2")
    public void testSumLong2(long a, long b, long res) {
        Assert.assertNotEquals(calculator.sum(a, b), res, "Invalid result of TestSumLong: "
                + a + " + " + b + " - result should not be " + res);
    }

    @DataProvider(name = "dataProvider_TestSumLong2")
    public Object[][] dataProvider2() {
        return new Object[][]{
                {2, 3, 0}
        };

    }
}