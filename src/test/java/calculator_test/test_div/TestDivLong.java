package calculator_test.test_div;

import calculator_test.CalculatorTestBase;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestDivLong extends CalculatorTestBase {

    @Test(description = "TestDivLong", dataProvider = "dataProvider_TestDivLong")
    public void testDivLong(long a, long b, long res) {
        Assert.assertEquals(calculator.div(a, b), res, "TestDivLong result:");
    }

    @DataProvider(name = "dataProvider_TestDivLong")
    public Object[][] dataProvider() {
        return new Object[][]{
                {6, 3, 2},
                {-6, -3, 2},
                {-2, 7, 0},
                {0, -7, 0},
        };
    }
}

