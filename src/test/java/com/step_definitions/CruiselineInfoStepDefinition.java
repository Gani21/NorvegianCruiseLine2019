package com.step_definitions;

import com.utilities.BrowserUtils;
import com.utilities.ConfigurationReader;
import com.utilities.NclUtils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CruiselineInfoStepDefinition {

    public WebDriver driver;


    @Given("a Guest enters  to webpage url")
    public void a_Guest_enters_to_webpage_url(String webpage) throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gbozo\\Documents\\Selenium Dependenncies\\Drivers\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @When("user is on  NCL Homepage")
    public void user_is_on_NCL_Homepage()  throws Throwable {
        driver.get("https://www.ncl.com");
        Thread.sleep(3000);

    }

    @Then("user navigates to {string}Ports”")
    public void user_navigates_to_Ports(String tab,String module)throws Throwable {
        NclUtils.navigateToModule(tab, module);

    }

    @When("user searches for “Honolulu” port")
    public void user_searches_for_Honolulu_port() throws Throwable {
        driver.findElement(By.id("searchbar")).sendKeys("Honolulu", Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title='Honolulu, Oahu']")).click();
        Thread.sleep(3000);
    }

    @Then("map zoomed to show selected port")
    public void map_zoomed_to_show_selected_port()throws Throwable {
        driver.findElement(By.xpath("//a[@class='title']")).getText();
        Thread.sleep(2000);

    }

    @And("port displayed as “Port Of Departure”")
    public void port_displayed_as_Port_Of_Departure()throws Throwable {
        String text = driver.findElement(By.xpath("//*[@id=\"map-key\"]/ul/li[1]/div[2]/span[1]")).getText();
        Assert.assertEquals(true,text.contains("Port of Departure"));
        Thread.sleep(3000);
        driver.close();
    }

    }

