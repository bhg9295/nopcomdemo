package com.nopcommerce.pages.electronics;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends Utility {

    @CacheLookup
    @FindBy(css = "div[class='page-title'] h1")
    WebElement registerWebElementText;

    @CacheLookup
    @FindBy(css = "#FirstName")
    WebElement firstNameWebEle;

    @CacheLookup
    @FindBy(css = "#LastName")
    WebElement lastNameWebEle;

    @CacheLookup
    @FindBy(css = "#Email")
    WebElement emailWebEle;

    @CacheLookup
    @FindBy(css = "#Password")
    WebElement passwordWebEle;

    @CacheLookup
    @FindBy(css = "#ConfirmPassword")
    WebElement confirmPasswordWebEle;

    @CacheLookup
    @FindBy(css = "#register-button")
    WebElement registerBtn;

    @CacheLookup
    @FindBy(css = ".result")
    WebElement registrationCompletedMsgWebEel;

    @CacheLookup
    @FindBy(css = ".button-1.register-continue-button")
    WebElement continueBtn;

    String firstName;
    String lastName;
    String email;
    String password;

    public String getRegisterTextFromWebElement() {
        return getTextFromElement(registerWebElementText);
    }

    public String getFirstName() {
        firstName = getRandomString(4);
        CustomListeners.test.log(Status.PASS,"Get FirstName");
        return firstName;
    }

    public String getLastName() {
        lastName = getRandomString(8);
        CustomListeners.test.log(Status.PASS,"Get LastName");
        return lastName;
    }

    public String getEmail() {
        email = getRandomString(8) + "@gmail.com";
        CustomListeners.test.log(Status.PASS,"Get Email");
        return email;
    }

    public String getPassword() {
        password = getRandomString(8);
        CustomListeners.test.log(Status.PASS,"Get Password");
        return password;
    }

    public void fillRegistrationForm() {
        sendTextToElement(firstNameWebEle, getFirstName());
        sendTextToElement(lastNameWebEle, getLastName());
        sendTextToElement(emailWebEle, getEmail());
        sendTextToElement(passwordWebEle, getPassword());
        sendTextToElement(confirmPasswordWebEle, password);
    }

    public void clickOnRegisterButton() {
        clickOnElement(registerBtn);
        CustomListeners.test.log(Status.PASS,"Get Password");
    }

    public String getRegistrationCompletedWebEleText() {
        String  text = getTextFromElement(registrationCompletedMsgWebEel);
        CustomListeners.test.log(Status.PASS,"Get Password");
        return  text;
    }

    public void clickOnContinueButton() {
        clickOnElement(continueBtn);
        CustomListeners.test.log(Status.PASS,"Get Password");

    }
}
