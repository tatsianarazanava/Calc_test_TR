package calculator_test.test_timeout;

import org.testng.annotations.*;


public class TestTimeout {

    @Test(timeOut = 1000)
    public void testTimeout() throws InterruptedException{
        Thread.sleep(999);
        System.out.println("Timeout test");
    }
}
