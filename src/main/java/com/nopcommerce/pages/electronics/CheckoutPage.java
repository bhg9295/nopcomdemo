package com.nopcommerce.pages.electronics;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countryDropdown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement cityTextField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement addressTextField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement postCodeTextField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumberTextField;

    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement continueBtn;

    @CacheLookup
    @FindBy(css = "#shippingoption_2")
    WebElement secondDayShippingRadioBtn;

    @CacheLookup
    @FindBy(css = ".button-1.shipping-method-next-step-button")
    WebElement continueBtnShipping;

    @CacheLookup
    @FindBy(css = "#paymentmethod_1")
    WebElement creditCardRadioBtn;

    @CacheLookup
    @FindBy(css = "button[class='button-1 payment-method-next-step-button']")
    WebElement continueBtnPayment;

    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement creditCardDropdown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement cardHolderNameTextField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumberTextField;

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement expireMonth;

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement expireYear;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCode;

    @CacheLookup
    @FindBy(css = ".button-1.payment-info-next-step-button")
    WebElement continueBtnPaymentInfo;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Credit Card']")
    WebElement paymentMethodWebEle;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='2nd Day Air']")
    WebElement shippingMethodWebEle;

    @CacheLookup
    @FindBy(css = ".product-subtotal")
    WebElement totalPriceAtCheckout;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirmBtn;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Thank you']")
    WebElement thankYouWebEle;

    @CacheLookup
    @FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement orderNotification;

    @CacheLookup
    @FindBy(css = ".button-1.order-completed-continue-button")
    WebElement continueBtnOrderCompleted;

    @CacheLookup
    @FindBy(css = "div[class='topic-block-title'] h2")
    WebElement welcomeToStoreWebEle;

    @CacheLookup
    @FindBy(css = ".ico-logout")
    WebElement logOutBtn;



    public void selectCounrtyFromDropdown() {
        selectByVisibleTextFromDropDown(countryDropdown, "United Kingdom");
        CustomListeners.test.log(Status.PASS,"Select Counrty From Dropdown");
    }

    public void enterCityName() {
        sendTextToElement(cityTextField, "London");
        CustomListeners.test.log(Status.PASS,"Enter CityName");
    }

    public void enterAddress() {
        sendTextToElement(addressTextField, "101 Repton Street");
        CustomListeners.test.log(Status.PASS,"Enter Address");
    }

    public void enterPostcode() {
        sendTextToElement(postCodeTextField, "BR5 1AB");
        CustomListeners.test.log(Status.PASS," Enter Postcode");
    }

    public void enterPhoneNumber() {
        sendTextToElement(phoneNumberTextField, "07122234554");
        CustomListeners.test.log(Status.PASS," Enter Phone Number");
    }

    public void clickOnContinueButton() {
        clickOnElement(continueBtn);
        CustomListeners.test.log(Status.PASS,"click On Continue Button");
    }

    public void clickOnSecondDayShippingRadioButton() {
        clickOnElement(secondDayShippingRadioBtn);
        CustomListeners.test.log(Status.PASS,"click On SecondDay Shipping RadioButton");
    }

    public void clickOnContinueButtonOnShippingSection() {
        clickOnElement(continueBtnShipping);
        CustomListeners.test.log(Status.PASS,"click On Continue Button On Shipping Section");
    }

    public void clickOnCreditCardRadioButton() {
        clickOnElement(creditCardRadioBtn);
        CustomListeners.test.log(Status.PASS,"click On Credit CardRadio Button");
    }

    public void clickOnContinueButtonOnPaymentSection() {
        clickOnElement(continueBtnPayment);
        CustomListeners.test.log(Status.PASS,"clickOnContinueButtonOnPaymentSection");
    }

    public void selectCardTypeFromDropdown() {
        selectByVisibleTextFromDropDown(creditCardDropdown, "Visa");
        CustomListeners.test.log(Status.PASS,"selectCardTypeFromDropdown");
    }

    public void enterCardHolderName() {
        sendTextToElement(cardHolderNameTextField, "Raj Patel");
        CustomListeners.test.log(Status.PASS,"enter Card Holder Name");
    }

    public void enterCardNumber() {
        sendTextToElement(cardNumberTextField, "4111 1111 1111 1111");
        CustomListeners.test.log(Status.PASS,"enterCardNumber");
    }

    public void selectExpireMonth() {
        selectByVisibleTextFromDropDown(expireMonth, "09");
        CustomListeners.test.log(Status.PASS,"selectExpireMonth");
    }

    public void selectExpireYear() {
        selectByVisibleTextFromDropDown(expireYear, "2025");
        CustomListeners.test.log(Status.PASS,"Select Expire Year");
    }

    public void enterCardCode() {
        sendTextToElement(cardCode, "123");
        CustomListeners.test.log(Status.PASS,"Enter CardCode");
    }

    public void enterPaymentDetails() {
        enterCardHolderName();
        enterCardNumber();
        selectExpireMonth();
        selectExpireYear();
        enterCardCode();
    }

    public void clickOnContinueButtonOnPaymentInfoPage() {
        clickOnElement(continueBtnPaymentInfo);
        CustomListeners.test.log(Status.PASS,"click On Continue Button On Payment InfoPage");
    }

    public String getPaymentMethodTextFromWebElement() {
        String payment =  getTextFromElement(paymentMethodWebEle);
        CustomListeners.test.log(Status.PASS,"Payment Method Text From WebElement");
        return payment;
    }

    public String getShippingMethodTextFromWebElement() {
        String Textfrom =  getTextFromElement(shippingMethodWebEle);
        CustomListeners.test.log(Status.PASS,"set Product Macbook");
        return  Textfrom;
    }

    public String getTotalPriceAtCheckout() {
        String Total =  getTextFromElement(totalPriceAtCheckout);
        CustomListeners.test.log(Status.PASS,"set Product Macbook");
        return Total;
    }

    public void clickOnConfirmButton() {
        clickOnElement(confirmBtn);
        CustomListeners.test.log(Status.PASS,"click On Confirm Button");
    }

    public String getThankYouTextFromWebElement() {
        String Text =  getTextFromElement(thankYouWebEle);
        CustomListeners.test.log(Status.PASS,"set Product Macbook");
        return  Text;
    }

    public String getOrderNotification() {
       String order = getTextFromElement(orderNotification);
        CustomListeners.test.log(Status.PASS,"set Product Macbook");
        return  order;
    }

    public void clickOnContinueButtonOnOrderCompletion() {
        clickOnElement(continueBtnOrderCompleted);
        CustomListeners.test.log(Status.PASS,"click On Continue Button On Order Completion");
    }

    public String getWelcomeToStoreTextFromWebElement() {
        String store = getTextFromElement(welcomeToStoreWebEle);
        CustomListeners.test.log(Status.PASS,"set Product Macbook");
        return store;
    }

    public void clickOnLogOutButton() {
        clickOnElement(logOutBtn);
        CustomListeners.test.log(Status.PASS,"click On Log Out Button");
    }

}
