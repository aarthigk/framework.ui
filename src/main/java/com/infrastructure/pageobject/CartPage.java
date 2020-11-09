package com.infrastructure.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    //(css = ".cart-button")
    public WebElement btn_Cart;

    @FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    //(css = ".checkout-button.alt")
    public WebElement btn_ContinueToCheckout;
    
    @FindBy(xpath="//*[@id='center_column']/p[2]/a[1]/span")
    public WebElement btn_ContinueToCheckoutwo;
    
    public void clickOn_Cart() {
        btn_Cart.click();
    }

    public void clickOn_ContinueToCheckout(){
        btn_ContinueToCheckoutwo.click();
    }
}