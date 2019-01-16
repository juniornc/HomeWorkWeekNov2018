import baseTest.BasePage;
import baseTest.BaseTest;
import com.page.GoogleHomePage;
import com.page.GoogleSearchResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.uncommons.reportng.HTMLReporter;


@Listeners(value = HTMLReporter.class)

public class SampleTest  extends BaseTest {


int no=1;

    @Test
    public void testCase1(){
        driver().get("https://google.com");
        driver().findElement(By.name("q")).sendKeys("Cars");
        driver().findElement(By.name("q")).submit();
        String pageUrl = driver().getCurrentUrl();
        Assert.assertTrue(pageUrl.startsWith("https://www.google.co.in/search"), "Page url :"+ driver().getCurrentUrl()+" was not starting with https://www.google.co.in/search ");

    }

    @Test(invocationCount = 3)
    public void testCase2(){

       if(no==2){


           Assert.fail("Failing test case");
       }


        if(no==3){

            throw new SkipException("Skipping test case invocation count is 3");

        }
        no++;

        driver().get("http://google.com");

        GoogleHomePage homePage = PageFactory.initElements(driver(),GoogleHomePage.class);
        GoogleSearchResultPage resultPage = homePage.performSearch("cars");


        Assert.assertTrue(resultPage.getUrl().startsWith("https://google.co.in/search"),
                "Page url:"+ resultPage.getUrl()+"was not stating with https://www.google.co.in/search");

        Assert.assertEquals(resultPage.getSearchText(), "cars","Value search did  not match");

    }







}
