package com.nopcommerce.testsuite;

import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.pages.electronics.*;
import com.nopcommerce.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class ElectronicTest extends BaseTest {
    CellPhonesPage cellPhonesPage ;
    ShoppingCartPage shoppingCartPage ;
    LoginPage loginPage ;
    RegistrationPage registrationPage ;
    CheckoutPage checkoutPage ;
    HomePage homePage ;
    @BeforeMethod(groups = {"sanity", "regression","smoke"})
    public void inIT(){
        cellPhonesPage = new CellPhonesPage();
         shoppingCartPage = new ShoppingCartPage();
       loginPage = new LoginPage();
      registrationPage = new RegistrationPage();
         checkoutPage = new CheckoutPage();
        homePage = new HomePage();


    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){
        cellPhonesPage.clickOnElectronicsTab();
        cellPhonesPage.clickOnCellPhonesTab();

        String expectedProductCategoryText = "Cell phones";
        String actualProductCategoryText = cellPhonesPage.getCellPhonesText();
      Assert.assertEquals(actualProductCategoryText, expectedProductCategoryText, "Cell phones text is not displayed");
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully(){
        cellPhonesPage.clickOnElectronicsTab();
        cellPhonesPage.clickOnCellPhonesTab();
        sleep(20000);
        String expectedProductCategoryText = "Cell phones";
        String actualProductCategoryText = cellPhonesPage.getCellPhonesText();
        Assert.assertEquals(actualProductCategoryText, expectedProductCategoryText, "Cell phones text is not displayed");
        cellPhonesPage.clickOnListViewTab();
        cellPhonesPage.clickOnSpecificProduct();
        sleep(20000);
        String expectedProductName = "Nokia Lumia 1020";
        String actualProductName = cellPhonesPage.getProductName();
        Assert.assertEquals(actualProductName, expectedProductName, "Product name is not displayed");
        String actualProductPrice = cellPhonesPage.getProductPrice();
        Assert.assertEquals(actualProductPrice, "$349.00", "Product price displayed incorrectly");
        cellPhonesPage.changeQuantity();
        cellPhonesPage.clickOnAddToCartButton();
        sleep(20000);
        String expectedProductAddedNotificationMsg = "The product has been added to your shopping cart";
        String actualProductAddedNotificationMsg = cellPhonesPage.getProductAddedNotification();
        Assert.assertEquals(actualProductAddedNotificationMsg, expectedProductAddedNotificationMsg, "Product added message not displayed correctly");
        cellPhonesPage.clickOnCloseButton();
        shoppingCartPage.moveToShoppingCart();
        shoppingCartPage.moveToGoToCartAndClick();
        sleep(20000);
        String expectedCartTitle = "Shopping cart";
        String actualCartTitle = shoppingCartPage.getShoppingCartTextFromElement();
        Assert.assertEquals(actualCartTitle, expectedCartTitle, "Cart title is not displayed correctly");
        sleep(20000);
        String actualQuantityInCart = shoppingCartPage.getQuantityInCartWebElementText();
        Assert.assertEquals(actualQuantityInCart, "2", "Quantity displayed incorrectly in the Cart");
        sleep(20000);
        String actualProductSubtotalInCart = shoppingCartPage.getProductSubtotalInCartWebElementText();
        Assert.assertEquals(actualProductSubtotalInCart, "$698.00", "Product Subtotal displayed incorrectly");
        shoppingCartPage.clickOnTermsOfServiceCheckBox();
        shoppingCartPage.clickOnCheckoutButton();
        sleep(20000);
        String expectedWelcomeMsg = "Welcome, Please Sign In!";
        String actualWelcomeMsg = loginPage.getWelcomeSignInText();
        Assert.assertEquals(actualWelcomeMsg, expectedWelcomeMsg, "Welcome Sign In message not displayed correctly");
        loginPage.clickOnRegisterButton();
        sleep(20000);
        String actualRegisterText = registrationPage.getRegisterTextFromWebElement();
        Assert.assertEquals(actualRegisterText, "Register", "Register text is not displayed");
        registrationPage.fillRegistrationForm();
        registrationPage.clickOnRegisterButton();
        sleep(20000);
        String expectedRegCompletedMsg = "Your registration completed";
        String actualRegCompletedMsg = registrationPage.getRegistrationCompletedWebEleText();
        Assert.assertEquals(actualRegCompletedMsg, expectedRegCompletedMsg, "Register Completed message is not displayed");
        registrationPage.clickOnContinueButton();
        loginPage.clickOnLoginLinkButton();
        loginPage.enterEmail();
        loginPage.enterPassword();
        loginPage.clickOnLoginButton();
        shoppingCartPage.clickOnTermsOfServiceCheckBox();
        shoppingCartPage.clickOnCheckoutButton();
        checkoutPage.selectCounrtyFromDropdown();
        checkoutPage.enterCityName();
        checkoutPage.enterAddress();
        sleep(20000);
        checkoutPage.enterPostcode();
        checkoutPage.enterPhoneNumber();
        checkoutPage.clickOnContinueButton();
        sleep(20000);
        checkoutPage.clickOnSecondDayShippingRadioButton();
        checkoutPage.clickOnContinueButtonOnShippingSection();
        checkoutPage.clickOnCreditCardRadioButton();
        checkoutPage.clickOnContinueButtonOnPaymentSection();
        sleep(20000);
        checkoutPage.selectCardTypeFromDropdown();
        checkoutPage.enterPaymentDetails();
        checkoutPage.clickOnContinueButtonOnPaymentInfoPage();
        sleep(20000);
        String expectedPaymentMethod = "Credit Card";
        String actualPaymentMethod = checkoutPage.getPaymentMethodTextFromWebElement();
        Assert.assertEquals(actualPaymentMethod, expectedPaymentMethod, "Payment option text is incorrect");
        sleep(20000);
        String expectedShippingMethod = "2nd Day Air";
        String actualShippingMethod = checkoutPage.getShippingMethodTextFromWebElement();
        Assert.assertEquals(actualShippingMethod, expectedShippingMethod, "Shipping option text is incorrect");
        sleep(20000);
        String actualTotalPriceAtCheckout = checkoutPage.getTotalPriceAtCheckout();
        Assert.assertEquals(actualTotalPriceAtCheckout, "$698.00", "Total Price at Checkout displayed incorrectly");
        checkoutPage.clickOnConfirmButton();
        sleep(20000);
        String actualThankYouMessage = checkoutPage.getThankYouTextFromWebElement();
        Assert.assertEquals(actualThankYouMessage, "Thank you", "Thank you text is not displayed");
        sleep(20000);
        String expectedOrderNotification = "Your order has been successfully processed!";
        String actualOrderNotification = checkoutPage.getOrderNotification();
        Assert.assertEquals(actualOrderNotification, expectedOrderNotification, "Order notification is not displayed");
        checkoutPage.clickOnContinueButtonOnOrderCompletion();
        sleep(20000);
        String expectedWelcomeToStoreNotification = "Welcome to our store";
        String actualWelcomeToStoreNotification = checkoutPage.getWelcomeToStoreTextFromWebElement();

        Assert.assertEquals(actualWelcomeToStoreNotification, expectedWelcomeToStoreNotification, "Welcome to Our Store notification is not displayed");
        checkoutPage.clickOnLogOutButton();
        sleep(20000);
        String expectedUrl = "https://demo.nopcommerce.com/";
        String actualUrl = homePage.getUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Wrong URL displayed");
    }


}
