package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.SeleniumUtils;

public class EmployeeDashboard extends TestBase {
    public EmployeeDashboard(){
        PageFactory.initElements(driver,this);

    }
    @FindBy(className = "page-title")
    public WebElement dashBoardTitle;

    @FindBy(xpath="//li[@id='menu_admin_viewAdminModule']")
    public WebElement admin_Btn;


    @FindBy(xpath="//li[@id='menu_news_Announcements']")
    public WebElement annoncement_Btn;

    @FindBy(xpath="//a[@id='menu_news_viewNewsList'] ")
    public WebElement news_Btn;


    public void navigateToNewPage(){
        SeleniumUtils.click(admin_Btn);
        SeleniumUtils.click(annoncement_Btn);
        SeleniumUtils.click(news_Btn);

    }
}

