package com.phrasee.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CampaignPage extends BasePage {

    @FindBy(xpath = "//div/main/div/form/div/span/div[2]/div[1]")
    public WebElement emailtBttn;

    @FindBy(css = ".ant-form-item-children>div")
    public WebElement selectProjectBttn;

    @FindBy(xpath = "//li[@role='option'][text()='External automation project']")
    public WebElement selectProject;

    @FindBy(id = "campaign_setup_campaign_name")
    public WebElement campaignName;

    @FindBy(id = "campaign_setup_own_subject_line")
    public WebElement controlSubjectLine;

    @FindBy(id = "campaign_setup_list_size")
    public WebElement audienceSize;

    @FindBy(id = "campaign_setup_baseline_open_rate")
    public WebElement avgOpenRate;

    @FindBy(xpath = "//button[@data-cy='campaign-setup-submit-button']")
    public WebElement nextBttn;

}
