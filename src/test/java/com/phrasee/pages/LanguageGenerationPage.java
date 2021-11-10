package com.phrasee.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LanguageGenerationPage extends BasePage {

    @FindBy(xpath = "//i[@class='anticon anticon-check-circle position--absolute right--5 top--14']")
    public WebElement completeIcon;

    @FindBy(xpath = "//div/main/div/div/form/div[1]/div[2]/div/span/span/div/input")
    public WebElement dateCheckbox;

    @FindBy(xpath = "//div[5]/div/div/div/div/div[1]/div/input")
    public WebElement dateSelectBox;

    @FindBy(xpath = "//div/div/form/div[3]/div[2]/div/span/div/div")
    public WebElement campaignTypeCheckbox;

    @FindBy(xpath = "//div[7]/div/div/div/ul/li")
    public List<WebElement> campaignTypeDropdwn;

    @FindBy(xpath = "//div/main/div/div/form/div[4]/div[2]/div/span/input")
    public WebElement productName;

    @FindBy(xpath = "//input[@name='DISCOUNT_PERCENT']")
    public WebElement discount;

    @FindBy(xpath = "//button[@value='yes']")
    public WebElement upToBttn;

    @FindBy(xpath = "//div/div/form/div[7]/div[2]/div/span/div/div")
    public WebElement specificCategoryCheckbox;

    @FindBy(xpath = "//div[11]/div/div/div/ul/li")
    public List<WebElement> categoryTypeDropdwn;

    @FindBy(xpath = "//div/div/form/div[8]/div[2]/div/span/div/div")
    public WebElement calendarEventCheckbox;

    @FindBy(xpath = "/html/body/div[13]/div/div/div/ul/li")
    public List<WebElement> calendarEventDropdwn;

    @FindBy(xpath = "//div/div/form/div[9]/div[2]/div/span/div/div")
    public WebElement offerEndsCheckbox;

    @FindBy(xpath = "/html/body/div[15]/div/div/div/ul/li")
    public List<WebElement> offerEndsDropdwn;

    @FindBy(xpath = "//div[10]/div[2]/div/span/div/span/div/input")
    public WebElement endDateForOfferCheckbox;

    @FindBy(xpath = "//div[17]/div/div/div/div/div[1]/div/input")
    public WebElement endDateOfferSelectBox;

    @FindBy(xpath = "//button[@data-cy='lng-generation-magic-button']")
    public WebElement magicBttn;

    @FindBy(xpath = "//div[@class='content']/h2[text()]")
    public WebElement phraseeMessage;

}
