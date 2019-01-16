package com.BankOfAmerica;

import baseTest.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "ONLINE BANKING LOGIN")
    private WebElement linkloginPage;


    public LoginPage openLoginPage(){
        linkloginPage.click();
        return PageFactory.initElements(driver(),LoginPage.class);


    }
}
