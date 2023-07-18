package com.nopcommerce.pages.computer;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WelComeSignInPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeSignIn;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Checkout as Guest']")
    WebElement  checkoutGuestBtn ;
    @CacheLookup
    @FindBy(css = "#FirstName")
    WebElement firstNameWebEle;
    @CacheLookup
    @FindBy(css = "#LastName")
    WebElement lastNameWebEle;
    @CacheLookup
    @FindBy(css = "#Email")
    WebElement  emailWebEle;
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countryDropdown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement  cityTextField ;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement addressTextField ;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postCodeTextField  ;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumberTextField ;
    @CacheLookup
            @FindBy(xpath = "//button[@onclick='Billing.save()']")
            WebElement  continueBtn ;

    String firstName;
    String lastName;
    String email;

    public String getWelcomeSignInText() {
         String message = getTextFromElement(welcomeSignIn);
        CustomListeners.test.log(Status.PASS," click On Desktop Tab");
        return message;
    }

    public void clickOnCheckOutAsGuestButton() {
        clickOnElement(checkoutGuestBtn);
        CustomListeners.test.log(Status.PASS," check out GuestBtn");

    }

    public String getFirstName() {

        firstName = getRandomString(4);
        CustomListeners.test.log(Status.PASS," getRandomString " );

        return firstName;
    }


    public String getLastName() {
        lastName = getRandomString(8);
        CustomListeners.test.log(Status.PASS," LastName");
        return lastName;
    }

    public String getEmail() {
        email = getRandomString(8) + "@gmail.com";
        CustomListeners.test.log(Status.PASS," Email");
        return email;
    }

    public void selectCounrtyFromDropdown() {
        selectByVisibleTextFromDropDown(countryDropdown, "United Kingdom");
        CustomListeners.test.log(Status.PASS,"CounrtyFromDropdown");
    }

    public void enterCityName() {
        sendTextToElement(cityTextField, "London");
        CustomListeners.test.log(Status.PASS," CityName");
    }

    public void enterAddress() {
        sendTextToElement(addressTextField, "101 Repton Street");
        CustomListeners.test.log(Status.PASS,"enterAddress");
    }

    public void enterPostcode() {
        sendTextToElement(postCodeTextField, "BR5 1AB");
        CustomListeners.test.log(Status.PASS," Postcode");
    }

    public void enterPhoneNumber() {
        sendTextToElement(phoneNumberTextField, "07122234554");
        CustomListeners.test.log(Status.PASS," PhoneNumber");
    }

    public void fillCheckoutForm() {
        sendTextToElement(firstNameWebEle, getFirstName());
        sendTextToElement(lastNameWebEle, getLastName());
        sendTextToElement(emailWebEle, getEmail());
        selectCounrtyFromDropdown();
        enterCityName();
        enterAddress();
        enterPostcode();
        enterPhoneNumber();

    }

    public void clickOnContinueButton() {
        clickOnElement(continueBtn);
        CustomListeners.test.log(Status.PASS," clickOnContinueButton ");
    }


}
