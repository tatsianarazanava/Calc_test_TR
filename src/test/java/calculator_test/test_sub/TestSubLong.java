package calculator_test.test_sub;

import calculator_test.CalculatorTestBase;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestSubLong extends CalculatorTestBase {

    @Test(testName = "TestSubLongPositive", dataProvider = "dataProvider_TestSubLong")
    public void testSubLong(long a, long b, long res) {
        Assert.assertEquals(calculator.sub(a, b), res, "TestSubLong result: ");
    }

    @DataProvider(name = "dataProvider_TestSubLong")
    public Object[][] dataProvider() {
        return new Object[][]{
                {7, 4, 3},
                {-2, -3, 1},
                {-2, 3, -5},
                {2, -3, 5},
                {2, 0, 2},
                {0, 2, -2}
        };
    }

    @Test(testName = "TestSubLongNegative", dataProvider = "dataProvider_TestSubLong2")
    public void testSubLong2(long a, long b, long res) {
        Assert.assertNotEquals(calculator.sub(a, b), res, "Invalid result of TestSubLong: "
                + a + " - " + b + " - result should not be " + res);
    }

    @DataProvider(name = "dataProvider_TestSubLong2")
    public Object[][] dataProvider2() {
        return new Object[][]{
                {7, 4, 0}
        };
    }
}