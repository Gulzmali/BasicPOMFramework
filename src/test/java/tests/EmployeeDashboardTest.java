package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EmployeeDashboard;
import pages.HomePage;

public class EmployeeDashboardTest extends TestBase {
    HomePage homePage;
    EmployeeDashboard employeeDashboard;
    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        initializer();
        homePage = new HomePage();
        employeeDashboard = new EmployeeDashboard();
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
    @Test(groups = {"smoke"})
    public void verifyNewsPage() {
        homePage.navigateToHomePage();
        employeeDashboard.navigateToNewPage();
        Assert.assertEquals( employeeDashboard.dashBoardTitle.getText(), "News List");
    }





}
