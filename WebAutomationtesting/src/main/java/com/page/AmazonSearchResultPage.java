package com.page;

import baseTest.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSearchResultPage  extends BasePage {


    public AmazonSearchResultPage(WebDriver driver) {
        super(driver);


    }

@FindBy(id="autoscoping-backlink")
    WebElement divShowingResulttext;


     public String  getSearchResultText(){
         return divShowingResulttext.getText();


}


}
