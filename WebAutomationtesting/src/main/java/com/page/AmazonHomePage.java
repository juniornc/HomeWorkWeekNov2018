package com.page;

import baseTest.BasePage;
import baseTest.SyncUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage extends BasePage {
    public AmazonHomePage(WebDriver driver){
        super(driver);




    }
    @FindBy(id="twotabsearchtextbox")
    WebElement txtSearchBox;


    @FindBy(css = ".nav-input[type='submit']")
    WebElement btnSearch;

    public AmazonSearchResultPage searchProduct(String productName){
        txtSearchBox.sendKeys(productName);
        SyncUtil.wait(1);
        btnSearch.click();
        return PageFactory.initElements(driver(),AmazonSearchResultPage.class);

    }

}
