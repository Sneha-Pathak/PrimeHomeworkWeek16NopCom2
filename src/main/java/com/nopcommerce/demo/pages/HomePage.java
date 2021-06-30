package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by Jay
 */
public class HomePage extends Utility
{
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/child::li")
    WebElement topMenu;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/child::li[1]")
    WebElement computer;

    @FindBy (xpath = "//div[@class='page-title']/h1")
    WebElement topMenuText;

    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;

    public void selectMenu(String menu)
    {
        List<WebElement> elementList = driver.findElements(By.xpath("//div[@class='header-menu']/ul[1]/li/a"));
        for (WebElement element : elementList) {
            if (element.getText().equalsIgnoreCase(menu)) {
                element.click();
                break;
            }
        }
    }

    public void clickOnLoginLink()
    {
        clickOnElement(loginLink);
        log.info("Clicking on Login link...." + loginLink.toString());
    }

    public void clickOnRegisterLink()
    {
        clickOnElement(registerLink);
        log.info("Clicking on Register link...." + registerLink.toString());
    }

    public void mouseHoverOnTopMenu()
    {
        mouseHoverToElement(topMenu);
        log.info("Clicking on Top Menu...." + topMenu.toString());
    }

    public void clickOnComputer()
    {
        clickOnElement(computer);
        log.info("Clicking on Computer Menu...." + computer.toString());
    }
    public String getTopMenuText()
    {
        return getTextFromElement(topMenuText);
    }
}
