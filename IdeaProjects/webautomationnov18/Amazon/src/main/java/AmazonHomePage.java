import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class AmazonHomePage {

    public static void main(String[] args) {


        String exePath = "/Users/germaniconavas/IdeaProjects/WebAutomationDec18/drivers/chromedriver";

        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver = new ChromeDriver();
        driver.get("http://AmazonHomePage.com/index.php");

    }

}


