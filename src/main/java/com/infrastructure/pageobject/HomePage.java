package com.infrastructure.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
   //*[@id="search_query_top"]

   @FindBy(id="search_query_top")
    public WebElement btn_Search ;//= driver.findElement(By.id("search_query_top"));

    @FindBy(name="submit_search")
    public WebElement input_Search;//= driver.findElement(By.id("submit_search"));


    public void navigateTo_HomePage() {
        driver.get("http://automationpractice.com/index.php");
    }

    public void perform_Search(String search) {
        btn_Search.click();
        btn_Search.sendKeys(search);
        input_Search.isDisplayed();
        input_Search.sendKeys(search);
        input_Search.sendKeys(Keys.RETURN);
    }
}