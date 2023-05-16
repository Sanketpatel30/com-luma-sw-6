package com.softwaretestingboard.magento.www.pages;

import com.softwaretestingboard.magento.www.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BagsPage extends Utility {

    private static final Logger log = LogManager.getLogger(BagsPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement duffleBagOption;

    public void clickOnDuffleBagOption() {
        Reporter.log("clickODuffleBagOption " + duffleBagOption.toString());
        clickOnElement(duffleBagOption);
    }
}
