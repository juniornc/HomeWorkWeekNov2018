package baseTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseTest {


    ThreadLocal<WebDriver> drivers = new ThreadLocal<WebDriver>();
    @BeforeMethod
    public void beforeMethod() {
        WebDriver driver = BrowserFactory.getInstance();
        drivers.set(driver);


    }

    @AfterMethod
    public void cleanup() {
        if (driver()!= null) ; {

            driver().quit();


        }
    }

    protected WebDriver driver() {

        return drivers.get();


    }
}

