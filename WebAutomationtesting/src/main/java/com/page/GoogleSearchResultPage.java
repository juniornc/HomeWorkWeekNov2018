package com.page;

import baseTest.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchResultPage extends BasePage {



    public GoogleSearchResultPage(WebDriver driver){
        super(driver);

    }

    @FindBy(id="resultStats")
    WebElement divResultStats;


    @FindBy(name="q")
    WebElement txtSearchBox;

    public String  getSearchText(){
        return txtSearchBox.getAttribute("value");

    }






}
