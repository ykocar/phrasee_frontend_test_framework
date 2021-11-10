package com.phrasee.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phrasee.utilities.Driver;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//input[@placeholder='Enter email']")
    public WebElement email1;

    @FindBy(xpath = "//input[@placeholder='Enter password']")
    public WebElement password1;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBttn;

    @FindBy(xpath = "//label[text()='Please enter a valid email address']")
    public WebElement actualEmailErrorMessage;

    @FindBy(xpath = "//label[text()='Please enter a valid password']")
    public WebElement actualPasswordErrorMessage;

    //method for valid credentials
    public void login(String email, String password) {
        email1.sendKeys(email);
        password1.sendKeys(password);
        loginBttn.click();
    }

    // method for invalid email (username) or password
    public void login1(String email2, String password2) {
        email1.sendKeys(email2);
        password1.sendKeys(password2);
        loginBttn.click();
    }

}
