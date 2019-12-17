package com.utilities;

import org.openqa.selenium.By;

public class NclUtils {


    public static void navigateToModule(String tab, String module){
        String tabLocator = "//a[@title='Explore']" + tab +"') and [class='drophover_menu']";
        String moduleLocator = "//a[@title='Shore Excursions']"+module+"') and //li[@class='listing_item[6]']";
        BrowserUtils.clickWithWait(Driver.getDriver(), By.xpath(tabLocator), 2);
        Driver.getDriver().findElement(By.xpath(moduleLocator)).click();
    }
}
