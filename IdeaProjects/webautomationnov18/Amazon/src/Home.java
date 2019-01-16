import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {


public static void main(String[] args){

    String exePath = "/Users/germaniconavas/IdeaProjects/WebAutomationDec18/drivers/chromedriver";
    System.setProperty("webdriver.chrome.driver", exePath);
    WebDriver driver = new ChromeDriver();
    driver.get("http://automationpractice.com/index.php");

}






}
