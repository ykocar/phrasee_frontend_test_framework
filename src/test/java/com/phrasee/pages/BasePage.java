package com.phrasee.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.phrasee.utilities.Driver;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//li/a[text()='Create new campaign']")
    public WebElement newCampaignBttn;

   }
