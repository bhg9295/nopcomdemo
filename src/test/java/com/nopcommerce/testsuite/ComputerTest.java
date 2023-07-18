package com.nopcommerce.testsuite;

import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.pages.computer.BuildComputerPage;
import com.nopcommerce.pages.computer.CheckoutPage;
import com.nopcommerce.pages.computer.ComputerDesktopPage;
import com.nopcommerce.pages.computer.WelComeSignInPage;
import com.nopcommerce.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.ArrayList;
@Listeners(CustomListeners.class)
public class ComputerTest extends BaseTest {

    ComputerDesktopPage computerDesktopPage ;
    BuildComputerPage buildComputerPage ;
    ArrayList<String> beforeFilterProductNameList;
    ArrayList<String> afterFilterProductNameList;
    CheckoutPage checkoutPage ;
    WelComeSignInPage welComeSignInPage = new WelComeSignInPage();
    @BeforeMethod(groups = {"sanity", "regression","smoke"})
    public void inIT(){
        computerDesktopPage = new ComputerDesktopPage();
        buildComputerPage = new BuildComputerPage();
        checkoutPage = new CheckoutPage();

    }
     @Test(groups = {"sanity", "regression"})
    public void verifyProductArrangeInAlphaBeticalOrder() {
        computerDesktopPage.clickOnComputerTab();
        computerDesktopPage.clickOnDesktopTab();
        beforeFilterProductNameList = computerDesktopPage.desktopProductListBeforeFilter();
        computerDesktopPage.selectShortByPosition();
        driver.navigate().refresh();
        afterFilterProductNameList = computerDesktopPage.desktopProductListAfterFilter();
        Assert.assertEquals(afterFilterProductNameList, beforeFilterProductNameList, "Product not displaying in alphabetical order");
    }

     @Test(groups = {"smoke", "regression"})
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        computerDesktopPage.clickOnComputerTab();
        computerDesktopPage.clickOnDesktopTab();
        computerDesktopPage.selectShortByPositionZtoA();
        Thread.sleep(3000);
        computerDesktopPage.addToCart();
        String expectedText = "Build your own computer";
        String actualText = buildComputerPage.getBuildOnYourComputerText();
        Assert.assertEquals(actualText, expectedText, "Build on your computer is not displayed");
        buildComputerPage.selectProcessorOption();
        buildComputerPage.selectRAMOption();
        buildComputerPage.selectHDDOption();
        buildComputerPage.selectOSOption();
        Thread.sleep(5000);
        buildComputerPage.selectSoftwareOption();
        Thread.sleep(3000);
        String expectedPrice = "$1,475.00";
        String actualPrice = buildComputerPage.getPrice();
        Assert.assertEquals(actualPrice, expectedPrice, "Price displayed incorrectly");
        buildComputerPage.clickOnAddToCartButton();
         Thread.sleep(3000);
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = buildComputerPage.getMessageProductHasBeenAddedToYourShoppingCart();
        Assert.assertEquals(actualMessage, expectedMessage, "Message is not displayed");
        buildComputerPage.setClose();
        buildComputerPage.mouseHoverOnShoppingCartAndClick();
        String expectedShoppingCartText = "Shopping cart";
        String actualShoppingCartText = checkoutPage.getMessageShoppingCart();
        Assert.assertEquals(actualShoppingCartText, expectedShoppingCartText, "Shopping cart text is not displayed");
        checkoutPage.changeQtyNumber();
        checkoutPage.clickOnUpdateShoppingCart();
         Thread.sleep(3000);
        String expectedTotalPrice = "$2,950.00";
        String actualTotalPrice = checkoutPage.getTotalPrice();
        Assert.assertEquals(actualTotalPrice, expectedTotalPrice, "Total price is incorrect");
        checkoutPage.clickOnTermsOfServiceCheckBox();
        checkoutPage.clickOnCheckout();
        String expectedWelcomeMsg = "Welcome, Please Sign In!";
        String actualWelcomeMsg = welComeSignInPage.getWelcomeSignInText();
        Assert.assertEquals(actualWelcomeMsg, expectedWelcomeMsg, "Welcome Sign In message not displayed correctly");
        welComeSignInPage.clickOnCheckOutAsGuestButton();
        welComeSignInPage.fillCheckoutForm();
         Thread.sleep(3000);
        welComeSignInPage.clickOnContinueButton();
        checkoutPage.clickOnShippingNextDayRadioButton();
        checkoutPage.clickOnContinueButtonShippingSection();
        checkoutPage.clickOnCreditCardRadioButton();
        checkoutPage.clickOnContinueButtonCreditCardSection();
        checkoutPage.selectCardTypeFromDropdown();
        checkoutPage.enterPaymentDetails();
        checkoutPage.clickOnContinueButtonOnPaymentInfoPage();
         Thread.sleep(3000);
        String expectedPaymentMethod = "Credit Card";
        String actualPaymentMethod = checkoutPage.getPaymentMethodTextFromWebElement();
        Assert.assertEquals(actualPaymentMethod, expectedPaymentMethod, "Payment option text is incorrect");
         sleep(20000);
        String expectedShippingMethod = "Next Day Air";
        String actualShippingMethod = checkoutPage.getShippingMethodTextFromWebElement();
        Assert.assertEquals(actualShippingMethod, expectedShippingMethod, "Shipping option text is incorrect");
         Thread.sleep(3000);
        String actualTotalPriceAtCheckout = checkoutPage.getTotalPriceAtCheckout();
        Assert.assertEquals(actualTotalPriceAtCheckout, "$2,950.00", "Total Price at Checkout displayed incorrectly");
        checkoutPage.clickOnConfirmButton();
         Thread.sleep(3000);
        String actualThankYouMessage = checkoutPage.getThankYouTextFromWebElement();
        Assert.assertEquals(actualThankYouMessage, "Thank you", "Thank you text is not displayed");
         Thread.sleep(3000);
        String expectedOrderNotification = "Your order has been successfully processed!";
        String actualOrderNotification = checkoutPage.getOrderNotification();
        Assert.assertEquals(actualOrderNotification, expectedOrderNotification, "Order notification is not displayed");
         Thread.sleep(3000);
        checkoutPage.clickOnContinueButtonOnOrderCompletion();
        String expectedWelcomeToStoreNotification = "Welcome to our store";
        String actualWelcomeToStoreNotification = checkoutPage.getWelcomeToStoreTextFromWebElement();
        Assert.assertEquals(actualWelcomeToStoreNotification, expectedWelcomeToStoreNotification, "Welcome to Our Store notification is not displayed");
    }
}
