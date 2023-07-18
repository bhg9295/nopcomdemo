package com.nopcommerce.pages.computer;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Shopping cart']")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//td[@class='quantity']/input")
    WebElement quantity;
    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement update;
    @CacheLookup
    @FindBy(xpath ="//span[@class='product-subtotal']")
    WebElement totalPrice ;
    @CacheLookup
    @FindBy(xpath ="//input[@id='termsofservice']")
    WebElement checkBoxAgree ;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOut ;
    @CacheLookup
    @FindBy(css = "#shippingoption_1")
    WebElement shippingNexDayRadioBtn ;
    @CacheLookup
    @FindBy(css = ".button-1.shipping-method-next-step-button")
    WebElement continueBtnShippingMethod;
@CacheLookup
@FindBy(css = "#paymentmethod_1")
WebElement  creditCardRatioBtn ;
    @CacheLookup
    @FindBy(css ="button[class='button-1 payment-method-next-step-button']")
    WebElement continueBtnCreditCardMethod ;
    @CacheLookup
    @FindBy (xpath = "//select[@id='CreditCardType']")
    WebElement creditCardDropdown ;
    @CacheLookup
    @FindBy(xpath ="//select[@id='CreditCardType']")
    WebElement cardHolderNameTextField;
    @CacheLookup
    @FindBy(xpath ="//input[@id='CardNumber']")
    WebElement cardNumberTextField ;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement expireMonth ;
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement expireYear ;
    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCode ;
    @CacheLookup
    @FindBy(css = ".button-1.payment-info-next-step-button")
    WebElement continueBtnPaymentInfo ;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='2nd Day Air']")
    WebElement shippingMethodWebEle ;
    @CacheLookup
    @FindBy(css = ".product-subtotal")
    WebElement totalPriceAtCheckout ;
    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Confirm')]")
    WebElement confirmBtn ;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Thank you']")
    WebElement thankYouWebEle ;
    @CacheLookup
    @FindBy(xpath = "//strong[normalize-space()='Your order has been successfully processed!']")
    WebElement orderNotification;
    @CacheLookup
    @FindBy(css = ".button-1.order-completed-continue-button")
    WebElement continueBtnOrderCompleted ;
    @CacheLookup
    @FindBy(css = "div[class='topic-block-title'] h2")
    WebElement welcomeToStoreWebEle ;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Credit Card']")
    WebElement paymentMethodWebEle;

    /*  By continueBtnPaymentInfo = By.cssSelector(".button-1.payment-info-next-step-button");
    By cssSelector(".button-1.payment-info-next-step-button" = By.xpath("//span[normalize-space()='Credit Card']");
              By shippingMethodWebEle = By.xpath("//span[normalize-space()='2nd Day Air']");
              By totalPriceAtCheckout = By.cssSelector(".product-subtotal");
              By confirmBtn = By.xpath("//button[contains(text(),'Confirm')]");
              By thankYouWebEle = By.xpath("//h1[normalize-space()='Thank you']");
              By orderNotification = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
              By continueBtnOrderCompleted = By.cssSelector(".button-1.order-completed-continue-button");
              By welcomeToStoreWebEle = By.cssSelector("div[class='topic-block-title'] h2");*/
  //  By cssSelector(".button-1.payment-info-next-step-button" = By.xpath("//span[normalize-space()='Credit Card']");
            public String getMessageShoppingCart(){
           String Message =  getTextFromElement(shoppingCartText);
                CustomListeners.test.log(Status.PASS,"add to Cart");
                return Message;
            }

            public void changeQtyNumber(){
            clearWebElementText((By) quantity);
            sendTextToElement(quantity, "2");
                CustomListeners.test.log(Status.PASS," Qty Number");
}

    private void clearWebElementText(By quantity) {
    }

    public void clickOnUpdateShoppingCart() {
        clickOnElement(update);
        CustomListeners.test.log(Status.PASS," Qty Number");
    }

    public String getTotalPrice() {
      String total =   getTextFromElement(totalPrice);
        CustomListeners.test.log(Status.PASS," Qty Number");
        return total;
    }

    public void clickOnCheckout() {
        clickOnElement(checkOut);
        CustomListeners.test.log(Status.PASS," Checkout");
    }

    public void clickOnTermsOfServiceCheckBox() {
        clickOnElement(checkBoxAgree);
        CustomListeners.test.log(Status.PASS," check Box Agree");
    }

    public void clickOnShippingNextDayRadioButton() {
        clickOnElement(shippingNexDayRadioBtn);
        CustomListeners.test.log(Status.PASS," check Box Agree");

    }

    public void clickOnContinueButtonShippingSection() {
        clickOnElement(continueBtnShippingMethod);
        CustomListeners.test.log(Status.PASS," check Box Agree");
    }

    public void clickOnCreditCardRadioButton() {
        clickOnElement(creditCardRatioBtn);
        CustomListeners.test.log(Status.PASS," check Box Agree");
    }

    public void clickOnContinueButtonCreditCardSection() {
        clickOnElement(continueBtnCreditCardMethod);
        CustomListeners.test.log(Status.PASS," check Box Agree");
    }

    public void selectCardTypeFromDropdown() {
        selectByVisibleTextFromDropDown(creditCardDropdown, "Master card");
        CustomListeners.test.log(Status.PASS," check Box Agree");
    }

    public void enterCardHolderName() {
        sendTextToElement(cardHolderNameTextField, "Raj Patel");
        CustomListeners.test.log(Status.PASS," check Box Agree");
    }

    public void enterCardNumber() {
        sendTextToElement(cardNumberTextField, "5555555555554444");
        CustomListeners.test.log(Status.PASS," check Box Agree");
    }

    public void selectExpireMonth() {
        selectByVisibleTextFromDropDown(expireMonth, "09");
        CustomListeners.test.log(Status.PASS," check Box Agree");
    }

    public void selectExpireYear() {
        selectByVisibleTextFromDropDown(expireYear, "2025");
        CustomListeners.test.log(Status.PASS," check Box Agree");
    }

    public void enterCardCode() {
        sendTextToElement(cardCode, "123");
        CustomListeners.test.log(Status.PASS," check Box Agree");
    }

    public void enterPaymentDetails() {
        enterCardHolderName();
        enterCardNumber();
        selectExpireMonth();
        selectExpireYear();
        enterCardCode();
        CustomListeners.test.log(Status.PASS," enter payment details");

    }

    public void clickOnContinueButtonOnPaymentInfoPage() {
        clickOnElement(continueBtnPaymentInfo);
        CustomListeners.test.log(Status.PASS," check Box Agree");
    }

    public String getPaymentMethodTextFromWebElement() {
        String message =  getTextFromElement(paymentMethodWebEle);
        CustomListeners.test.log(Status.PASS," check Box Agree");
        return message;

    }

    public String getShippingMethodTextFromWebElement() {
        String message = getTextFromElement(shippingMethodWebEle);
        CustomListeners.test.log(Status.PASS," check Box Agree");
        return message;
    }

    public String getTotalPriceAtCheckout() {
        String message = getTextFromElement(totalPriceAtCheckout);
     CustomListeners.test.log(Status.PASS," check Box Agree");
        return message;
    }

    public void clickOnConfirmButton() {
        clickOnElement(confirmBtn);
        CustomListeners.test.log(Status.PASS," check Box Agree");
    }

    public String getThankYouTextFromWebElement() {
      String message =   getTextFromElement(thankYouWebEle);
        CustomListeners.test.log(Status.PASS," check Box Agree");
        return message;
    }

    public String getOrderNotification() {
      String message = getTextFromElement(orderNotification);
        CustomListeners.test.log(Status.PASS," check Box Agree");
        return message;
    }

    public void clickOnContinueButtonOnOrderCompletion() {
        clickOnElement(continueBtnOrderCompleted);
        CustomListeners.test.log(Status.PASS," check Box Agree");

    }

    public String getWelcomeToStoreTextFromWebElement() {
       String element =  getTextFromElement(welcomeToStoreWebEle);
        CustomListeners.test.log(Status.PASS," check Box Agree");
        return element;
    }
}
