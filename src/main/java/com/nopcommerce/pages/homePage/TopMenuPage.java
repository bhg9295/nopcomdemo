package com.nopcommerce.pages.homePage;

import com.aventstack.extentreports.Status;
import com.nopcommerce.customlisteners.CustomListeners;
import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility {
    public void selectMenu(String menu) {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='" + menu + "']"));
        CustomListeners.test.log(Status.PASS, "click on button" + menu);
    }

    public String getPageName(String menu){
       driver.findElement(By.xpath("//h1[normalize-space()='"+menu+"']")).getText();
        CustomListeners.test.log(Status.PASS, "click on button" + menu);
        return menu;
    }

}
