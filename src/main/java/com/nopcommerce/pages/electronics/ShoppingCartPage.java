package com.nopcommerce.pages.electronics;


import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Go to cart']")
    WebElement goToCart;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Shopping cart']")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='itemquantity11240']")
    WebElement quantityInCart;

    @CacheLookup
    @FindBy(css = ".product-subtotal")
    WebElement productSubtotalInCart;

    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement termsOfService;

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutBtn;

    public void moveToShoppingCart(){
        mouseHoverToElement(shoppingCart);
    }

    public void moveToGoToCartAndClick(){
        scrollDown(driver, (By) goToCart);
        clickOnElement(goToCart);
    }




    public String getShoppingCartTextFromElement(){
        String cart = getTextFromElement(shoppingCartText);
        CustomListeners.test.log(Status.PASS,"Get Password");
        return  cart;
    }

    public String getQuantityInCartWebElementText(){
        String element =  getTextFromElement(quantityInCart);
        CustomListeners.test.log(Status.PASS,"Get Password");
        return  element;
    }

    public String getProductSubtotalInCartWebElementText(){
        String subtotal =  getTextFromElement(productSubtotalInCart);
        CustomListeners.test.log(Status.PASS,"Get Password");
        return subtotal ;
    }

    public void clickOnTermsOfServiceCheckBox(){
        clickOnElement(termsOfService);
        CustomListeners.test.log(Status.PASS," clickOnTermsOfServiceCheckBox");
    }

    public void clickOnCheckoutButton(){
        clickOnElement(checkoutBtn);
        CustomListeners.test.log(Status.PASS," click On Checkout Button");

    }
}
