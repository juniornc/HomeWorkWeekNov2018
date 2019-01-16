package test.pageobjects;

import application.page.base.ApplicationPageBase;
import base.BrowserDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;

public class HomePageTest  {

   private HomePage objOfHomePage = null;

   
   @Test
  public void searchTest() {

        String actualText = objOfHomePage.search();
        Assert.assertEquals(actualText, "Printed Chiffon Dress");
      System.out.println("Search Test Passed");
    }

}









