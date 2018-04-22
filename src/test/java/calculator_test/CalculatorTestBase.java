package calculator_test;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.*;


public class CalculatorTestBase {
    protected Calculator calculator = new Calculator();

    @BeforeSuite
    public void beforeSuite() throws Exception {
        System.out.println("@BeforeSuite");
    }

    @AfterSuite
    public void afterSuite() throws Exception {
        System.out.println("@AfterSuite");
    }

    @BeforeClass
    public void beforeClass() throws Exception {
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public void afterClass() throws Exception {
        System.out.println("@AfterClass");
    }

    @BeforeGroups
    public void beforeGroups() throws Exception {
        System.out.println("BeforeGroups");
    }

    @AfterGroups
    public void afterGroups() throws Exception {
        System.out.println("@AfterGroups");
    }

    @BeforeTest
    public void beforeTest() throws Exception {
        System.out.println("@BeforeTest");
    }

    @AfterTest
    public void afterTest() throws Exception {
        System.out.println("@AfterTest");
    }

    @BeforeMethod
    public void setUp() throws Exception {
        System.out.println("@BeforeMethod");
    }

    @AfterMethod
    public void tearDown() throws Exception {
        System.out.println("@AfterMethod");
    }
}