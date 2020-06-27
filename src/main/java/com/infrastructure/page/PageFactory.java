package com.infrastructure.page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import com.infrastructure.pageobject.CartPage;
import com.infrastructure.pageobject.CheckoutPage;
import com.infrastructure.pageobject.ConfirmationPage;
import com.infrastructure.pageobject.HomePage;
import com.infrastructure.pageobject.ProductListingPage;

public class PageFactory {
	
	
    private WebDriver driver;
    private ProductListingPage productListingPage;
    private CartPage cartPage;
    private HomePage homePage;
    private CheckoutPage checkoutPage;
    private ConfirmationPage confirmationPage;

    // Constructor
    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    //Creating an Object of Page Class only if the object is null,
    //Supplying the already created object if it is not null:

    public HomePage getHomePage(){
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public ProductListingPage getProductListingPage() {
        return (productListingPage == null) ? productListingPage = new ProductListingPage(driver) : productListingPage;
    }

    public CartPage getCartPage() {
       return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;
    }

    public CheckoutPage getCheckoutPage() {
        return (checkoutPage == null) ? checkoutPage = new CheckoutPage(driver) : checkoutPage;
    }


}