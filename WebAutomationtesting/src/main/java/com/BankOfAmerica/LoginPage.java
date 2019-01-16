package com.BankOfAmerica;

import baseTest.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "uid")
    private WebElement txtUserId;

    @FindBy(id="passw")
    private WebElement txtPassword;

    @FindBy(id ="btnSubmit" )
    private WebElement btnlogin;

    public void performLoggin(String uname,String password){
        txtUserId.sendKeys(uname);
        txtPassword.sendKeys(password);
        btnlogin.click();
    }

}
