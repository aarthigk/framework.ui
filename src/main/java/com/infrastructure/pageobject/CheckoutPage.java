package com.infrastructure.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.infrastructure.dataProviders.ConfigFileReader;

import cucumber.TestContext;

public class CheckoutPage {
	TestContext testContext;
	CheckoutPage checkoutPage;
	WebDriver driver;
	ConfigFileReader configFileReader;

    public CheckoutPage(WebDriver driver) {
			
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    	//configFileReader = new ConfigFileReader();
}

    @FindBy(xpath="//*[@id=\"address_delivery\"]/li[7]/a/span")
    public WebElement update;
    
    @FindBy(xpath="//*[@id='submitAddress']/span")
    public WebElement save;
    
    @FindBy(xpath="//*[@id=\"center_column\"]/form/p/button/span")
    public WebElement proceed;
    
    @FindBy(xpath="//*[@id='form']/p/button/span")
    public WebElement proceedtwo;
    
    @FindBy(id = "firstname")
    public WebElement txtbx_FirstName;

    @FindBy(id = "lastname")
    public WebElement txtbx_LastName;

    //@FindBy(id = "billing_email")
    //public WebElement txtbx_Email;

    @FindBy(id = "phone")
    public WebElement txtbx_Phone;

    @FindBy(id = "id_country")
    public WebElement select_Country;

    @FindBy(id = "city")
    public WebElement txtbx_City;

    @FindBy(id = "address1")
    public WebElement txtbx_Address;

    @FindBy(id = "postcode")
    public WebElement txtbx_PostCode;

    @FindBy(id = "cgv")
    public WebElement chkbx_AcceptTermsAndCondition;

    @FindBy(id = "place_order")
    public WebElement btn_PlaceOrder;

    public void enter_Name(String name) {
    	txtbx_FirstName.clear();
        txtbx_FirstName.sendKeys(name);
    }

    public void enter_LastName(String lastName) {
    	 txtbx_LastName.clear();
        txtbx_LastName.sendKeys(lastName);
    }

//    public void enter_Email(String email) {
//        txtbx_Email.sendKeys(email);
//    }

    public void enter_Phone(String phone) {
    	txtbx_Phone.clear();
        txtbx_Phone.sendKeys(phone);
    }

    public void enter_City(String city) {
    	txtbx_City.clear();
        txtbx_City.sendKeys(city);
    }

    public void enter_Address(String address) {
    	txtbx_Address.clear();
        txtbx_Address.sendKeys(address);
    }

    public void enter_PostCode(String postCode) {
    	txtbx_PostCode.clear();
        txtbx_PostCode.sendKeys(postCode);
    }

    public void select_Country(String countryName) {
        Select country = new Select(select_Country);
        country.selectByVisibleText(countryName);
    }

    public void check_TermsAndCondition() {
        chkbx_AcceptTermsAndCondition.click();
    }

    public void clickOn_PlaceOrder() {
        btn_PlaceOrder.submit();
    }

    public void fill_PersonalDetails() throws InterruptedException {
        enter_Name("TestAutomation");
        enter_LastName("Opencast");
        select_Country("United States");
        enter_Address("Hoults Yard, Walker Road");
        enter_City("Newcastle upon Tyne");
        enter_PostCode("99524");
        Thread.sleep(2000);
        enter_Phone("07438862327");
       // enter_Email("test@test.com");
    }

	public void click_update() {
		// TODO Auto-generated method stub
		update.click();
	}

	public void click_save() {
		// TODO Auto-generated method stub
		save.click();
	}

	public void click_proceed() {
		// TODO Auto-generated method stub
		proceed.click();
	}
	public void click_proceedtwo() {
		// TODO Auto-generated method stub
		proceedtwo.click();
	}
}