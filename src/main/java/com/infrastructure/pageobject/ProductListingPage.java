package com.infrastructure.pageobject;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.infrastructure.dataProviders.ConfigFileReader;

import cucumber.TestContext;

public class ProductListingPage {
	
	TestContext testContext;
	ProductListingPage productListingPage;
	 WebDriver driver;
	 ConfigFileReader configFileReader;

    public ProductListingPage(WebDriver driver) {
		 this.driver = driver;
         PageFactory.initElements(driver, this);
        // configFileReader = new ConfigFileReader();
    	
    }

    @FindBy (xpath= "//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]/span")
    //(css="button.ajax_add_to_cart_button span") 
    //(css = "button.single_add_to_cart_button")
    public WebElement btn_AddToCart;
 
    @FindAll(@FindBy(css = ".noo-product-inner"))
    public List<WebElement> prd_List;

    @FindBy(id="color_1")//pa_color
    public WebElement selectColour;

    @FindBy(id="pa_size")
    public WebElement selectSize;

    public void select_Product(int productNumber) {
        prd_List.get(productNumber).click();
    }

    public void makeSelection(int index) {
        Select colour = new Select(selectColour);
        colour.selectByIndex(index);
     //   Select size  = new Select(selectSize);
       // size.selectByIndex(index);
    }

    public void clickOn_AddToCart() {
    	btn_AddToCart.isDisplayed();
        btn_AddToCart.click();
    }
}