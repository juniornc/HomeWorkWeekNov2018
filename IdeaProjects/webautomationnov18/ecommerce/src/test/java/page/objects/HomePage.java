package page.objects;

import application.page.base.ApplicationPageBase;
import base.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePage  extends ApplicationPageBase {

private WebDriver driver;

    @FindBy(how = How.ID, using = "search_query_top")
    private WebElement searchBox;

    @FindBy(how = How.PARTIAL_LINK_TEXT, partialLinkText = "Contact us")
    private WebElement contactUs;



    @FindBy(how = How.PARTIAL_LINK_TEXT,  partialLinkText = "Sign in")
    private WebElement signInButton;


    public LoginPage getLogInPage() {

        signInButton.click();
        return new LoginPage();
    }




    public void clickContactUs(){

        ApplicationPageBase.isEnableStatus(driver, contactUs);

        contactUs.click();

    }

        public String search () {

            searchBox.sendKeys("Shoes", Keys.ENTER);
            String actualText = driver.findElement(By.partialLinkText("Printed Chiffon Dress")).getText();
            return actualText;


        }


    }


