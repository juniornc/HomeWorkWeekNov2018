package com.page;

import baseTest.BasePage;
import baseTest.SyncUtil;
import com.sun.xml.internal.rngom.parse.host.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePage extends BasePage {



    public  GoogleHomePage(WebDriver driver) {
        super(driver);

    }

    @FindBy(name="q")
    WebElement txtQueryBox;

    @FindBy(name="btnk")
    WebElement btnGoogleSearch;

    public GoogleSearchResultPage performSearch(String textToSearch) {
        txtQueryBox.sendKeys(textToSearch);
        txtQueryBox.submit();
        SyncUtil.wait(3);
        //btnGoogleSearch.click();


        return PageFactory.initElements(driver(), GoogleSearchResultPage.class);

    }
}




