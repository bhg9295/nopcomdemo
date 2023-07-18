package com.nopcommerce.pages.electronics;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CellPhonesPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']")
    WebElement  electronicsTab;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']")
    WebElement cellPhonesTab;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Cell phones']")
    WebElement cellPhoneProductCategory;
    @CacheLookup
    @FindBy(css = "a[title='List']")
    WebElement listViewTab;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Nokia Lumia 1020']")
    WebElement specificProduct;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Nokia Lumia 1020']")
    WebElement  productName;
    @CacheLookup
    @FindBy(css = "#price-value-20")
    WebElement price;
    @CacheLookup
    @FindBy(css = "#product_enteredQuantity_20 ")
    WebElement quantity;
    @CacheLookup
    @FindBy(css = "#add-to-cart-button-20")
    WebElement addToCartBtn ;
    @CacheLookup
    @FindBy(css = ".content")
    WebElement  productAddedNotification ;
    @CacheLookup
    @FindBy(css = "span[title='Close']")
    WebElement  closeBtn ;


   /* By listViewTab = (By.cssSelector("a[title='List']"));
    By specificProduct = (By.xpath("//a[normalize-space()='Nokia Lumia 1020']"));
    By productName = (By.xpath("//h1[normalize-space()='Nokia Lumia 1020']"));
    By price = (By.cssSelector("#price-value-20"));
    By quantity = By.cssSelector("#product_enteredQuantity_20");
    By addToCartBtn = By.cssSelector("#add-to-cart-button-20");
    By productAddedNotification = By.cssSelector(".content");
    By closeBtn = By.cssSelector("span[title='Close']");*/


    public void clickOnElectronicsTab() {
        clickOnElement(electronicsTab);
        CustomListeners.test.log(Status.PASS," clickOnContinueButton ");
    }

    public void clickOnCellPhonesTab() {
        clickOnElement(cellPhonesTab);
        CustomListeners.test.log(Status.PASS," clickOnContinueButton ");
    }

    public String getCellPhonesText() {
       String mesasge =  getTextFromElement(cellPhoneProductCategory);
        CustomListeners.test.log(Status.PASS," clickOnContinueButton ");
        return mesasge;
    }

    public void clickOnListViewTab() {
        clickOnElement(listViewTab);
        CustomListeners.test.log(Status.PASS," clickOnContinueButton ");
    }

    public void clickOnSpecificProduct() {
        clickOnElement(specificProduct);
        CustomListeners.test.log(Status.PASS," clickOnContinueButton ");
    }

    public String getProductName() {
    String message =    getTextFromElement(productName);
        CustomListeners.test.log(Status.PASS," clickOnContinueButton ");
        return message ;
    }

    public String getProductPrice() {
  String  message =     getTextFromElement(price);
        CustomListeners.test.log(Status.PASS," clickOnContinueButton ");
        return message;
    }

    public void changeQuantity() {
        //clearWebElement(quantity);
        sendTextToElement(quantity, "2");
        CustomListeners.test.log(Status.PASS," changeQuantity ");
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartBtn);
        CustomListeners.test.log(Status.PASS," clickOnContinueButton ");
    }

    public String getProductAddedNotification() {
    String message =  getTextFromElement(productAddedNotification);
        CustomListeners.test.log(Status.PASS," ProductAddedNotification ");
        return message ;
    }

    public void clickOnCloseButton() {
        clickOnElement(closeBtn);
        CustomListeners.test.log(Status.PASS," clickOnContinueButton ");
    }

}
