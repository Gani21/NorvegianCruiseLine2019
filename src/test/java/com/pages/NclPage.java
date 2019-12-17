package com.pages;

import com.utilities.BasePage;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NclPage extends BasePage {
    @FindBy(css="[title='Explore']")
    public WebElement exploreBtn;

    public void NclPage1() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url" + ConfigurationReader.getProperty("environment")));
    }
}
