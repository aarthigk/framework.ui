/*package com.infrastructure.steps;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.infrastructure.page.PageFactory;
import com.infrastructure.pageobject.HomePage;


import com.infrastructure.pageobject.CartPage;
import com.infrastructure.pageobject.CheckoutPage;
import com.infrastructure.pageobject.HomePage;
import com.infrastructure.pageobject.ProductListingPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class CommonSteps {
    WebDriver driver;
    HomePage homePage;
    ProductListingPage productListingPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    PageFactory pageObjectManager;


    @Given("I am on Home Page")
    public void i_am_on_Home_Page() {
    	   
        System.setProperty("webdriver.chrome.driver","C:/Users/AarthiGk/Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        pageObjectManager = new PageFactory(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePage = pageObjectManager.getHomePage();
        homePage.navigateTo_HomePage();
    }

    @When("I search for product in dress category")
    public void i_search_for_product_in_dress_category() throws InterruptedException {
        homePage = new HomePage(driver);
        Thread.sleep(1000);
        homePage.perform_Search("dress");
        Thread.sleep(1000);

    }

    @When("I choose to buy the first item")
    public void i_choose_to_buy_the_first_item() throws InterruptedException {
        Thread.sleep(1000);
  //      productListingPage = pageObjectManager.getProductListingPage();
        productListingPage.select_Product(0);
        productListingPage.makeSelection(1);
        productListingPage.clickOn_AddToCart();
    }

    @When("I move to checkout from mini cart")
    public void i_move_to_checkout_from_mini_cart() throws InterruptedException{
        Thread.sleep(1000);
   //     cartPage = pageObjectManager.getCartPage();
        cartPage.clickOn_Cart();
        cartPage.clickOn_ContinueToCheckout();
    }

    @When("I enter my personal details")
    public void i_enter_my_personal_details() throws InterruptedException {
        Thread.sleep(1000);
      //  checkoutPage = pageObjectManager.getCheckoutPage();
        checkoutPage.fill_PersonalDetails();

    }

    @When("I place the order")
    public void i_place_the_order() throws InterruptedException {
        Thread.sleep(1000);
        checkoutPage.check_TermsAndCondition();
    //    checkoutPage.clickOn_PlaceOrder();
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}*/