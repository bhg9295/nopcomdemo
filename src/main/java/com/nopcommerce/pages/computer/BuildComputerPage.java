package com.nopcommerce.pages.computer;


import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildComputerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildOnYourComputer ;
    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processor;
    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ram;
    @CacheLookup
    @FindBy(xpath ="//input[@id='product_attribute_3_7']")
    WebElement hdd ;
    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement os;
    @CacheLookup
    @FindBy(xpath ="//input[@id='product_attribute_5_12']")
    WebElement software;
    @CacheLookup
    @FindBy(css = "#price-value-1")
     WebElement price ;
    @CacheLookup
    @FindBy(xpath ="//button[@id='add-to-cart-button-1']")
    WebElement addToCard;
    @CacheLookup
    @FindBy(xpath ="//p[@class='content']")
    WebElement prodAddMessage ;

    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement close;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCart1;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCart;



/*

    By buildOnYourComputer = (By.xpath("//h1[contains(text(),'Build your own computer')]"));
    By processor = By.id("product_attribute_1");
    By ram = By.id("product_attribute_2");
    By hdd = By.xpath("//input[@id='product_attribute_3_7']");
    By os = By.xpath("//input[@id='product_attribute_4_9']");
    By software = By.xpath("//input[@id='product_attribute_5_12']");
    By price = By.cssSelector("#price-value-1");
    By addToCard = By.xpath("//button[@id='add-to-cart-button-1']");
    By prodAddMessage = By.xpath("//p[@class='content']");
    By close = By.xpath("//span[@title='Close']");
    By shoppingCart1 = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");
*/


    public String getBuildOnYourComputerText() {
     String com =  getTextFromElement(buildOnYourComputer);
        CustomListeners.test.log(Status.PASS,"Build On Your Computer Tex");
        return com ;
    }

    public void selectProcessorOption() {
        selectByVisibleTextFromDropDown(processor, "2.2 GHz Intel Pentium Dual-Core E2200");
        CustomListeners.test.log(Status.PASS,"Process or Option");
    }

    public void selectRAMOption() {
        selectByVisibleTextFromDropDown(ram, "8GB [+$60.00]");
        CustomListeners.test.log(Status.PASS,"RAM Option");
    }

    public void selectHDDOption() {
        clickOnElement(hdd);
        CustomListeners.test.log(Status.PASS,"select HDD Option");
    }

    public void selectOSOption() {
        clickOnElement(os);
        CustomListeners.test.log(Status.PASS,"select OS Option");
    }

    public void selectSoftwareOption() {
        clickOnElement(software);
        CustomListeners.test.log(Status.PASS,"Software Option");
    }

    public String getPrice() {
      String m = getTextFromElement(price);
        CustomListeners.test.log(Status.PASS,"get Price");
        return m ;
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCard);
        CustomListeners.test.log(Status.PASS,"Add To Car Button");
    }

    public String getMessageProductHasBeenAddedToYourShoppingCart() {
     String message =   getTextFromElement(prodAddMessage);
        CustomListeners.test.log(Status.PASS,"Add Message");
        return message ;

    }

    public void setClose() {
        clickOnElement(close);
        CustomListeners.test.log(Status.PASS,"set close ");
    }

    public void mouseHoverOnShoppingCartAndClick() {
        mouseHoverToElement(shoppingCart1);
        scrolldown(driver, (By) goToCart);
        clickOnElement(goToCart);
        CustomListeners.test.log(Status.PASS," ShoppingCartAndClick");
    }

    private void scrolldown(WebDriver driver, By goToCart) {

    }
}
