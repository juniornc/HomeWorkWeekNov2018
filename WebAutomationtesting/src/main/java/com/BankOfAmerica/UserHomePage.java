package com.BankOfAmerica;

import baseTest.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserHomePage extends BasePage {


    public UserHomePage(WebDriver driver) {

        super(driver);
    }


    @FindBy(id = "ListAccounts")
    private WebElement listAccounts;


    @FindBy(id = "btnGetAccount")
    private WebElement bntGo;

}
