import baseTest.BaseTest;
import baseTest.BrowserFactory;
import com.beust.jcommander.Parameters;
import com.google.common.annotations.VisibleForTesting;
import com.page.AmazonHomePage;
import com.page.AmazonSearchResultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sun.jvm.hotspot.utilities.Assert;

import java.util.Optional;

public class AmazonTests extends BaseTest{


    @BeforeMethod
    public void openUrl() {
        driver().get("http://amazon.in");

    }

    @Test
    public void testProductSearch() {
        AmazonHomePage homePage = PageFactory.initElements(driver(), AmazonHomePage.class);
        AmazonSearchResultPage resultPage = homePage.searchProduct("Pixel");
        String actualText = resultPage.getSearchResultText();
        Assert.assertEquals(actualText, "Showing results in Electronics.Show instead results in All Categories.", "search result text failed");


    }
    @Parameters(value={"product_name","param2"})


    @Test
    public void testProductSearch2(String product,String param2){
        AmazonHomePage homePage = PageFactory.initElements(driver(), AmazonHomePage.class);
        AmazonSearchResultPage resultPage = homePage.searchProduct("Pixel");
        String actualText = resultPage.getSearchResultText();
        Assert.assertEquals(actualText, "Showing results in Electronics.Show instead results in All Categories.", "search result text failed");

}
    @Parameters(value={"product_name"})


    @Test
    public void testProductSearch3(@Optional("pixel") String product) {
        AmazonHomePage homePage = PageFactory.initElements(driver(), AmazonHomePage.class);
        AmazonSearchResultPage resultPage = homePage.searchProduct(product);
        String actualText = resultPage.getSearchResultText();
        Assert.assertEquals(actualText, "Showing results in Electronics.Show instead results in All Categories.", "search result text failed");

    }




    @Test(dataProvider =  "getSearchData")
    public void testProductSearch4(String product){
        AmazonHomePage homePage = PageFactory.initElements(driver(), AmazonHomePage.class);
        AmazonSearchResultPage resultPage = homePage.searchProduct("Pixel");
        String actualText = resultPage.getSearchResultText();
        Assert.assertEquals(actualText, "Showing results in Electronics.Show instead results in All Categories.", "search result text failed");

    }
    @DataProvider (parallel = true)
    public Object[][] getSearchData(){


        Object[][] data=new Object[][] {
                {"pixel"},
                {"iphone"},
                {"Samsung"}

        } ;

        
         return  data;
    }

}