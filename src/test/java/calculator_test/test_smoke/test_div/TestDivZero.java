package calculator_test.test_smoke.test_div;

import calculator_test.CalculatorTestBase;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestDivZero extends CalculatorTestBase {

    @Test(testName = "TestDivZero")
    public void testDiv() {
        boolean exceptionExists = false;
        try {
            calculator.div(5, 0);
        } catch (NumberFormatException ex) {
            exceptionExists = true;
        }
        Assert.assertTrue(exceptionExists, "Missing alert when divided by zero.");
    }
}

