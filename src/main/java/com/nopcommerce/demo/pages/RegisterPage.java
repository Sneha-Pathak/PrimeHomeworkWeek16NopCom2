package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility
{
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @FindBy(xpath = "//div[@class='page-title']/h1")
    WebElement welcomeText;

    @FindBy(xpath = "//div[@id='gender']/span/input[@id='gender-male']")
    WebElement gen_female;

    @FindBy (id = "FirstName")
    WebElement firstnameField;

    @FindBy (id = "LastName")
    WebElement lastnameField;

    @FindBy (name = "DateOfBirthDay")
    WebElement day_of_DOB;

    @FindBy (name = "DateOfBirthMonth")
    WebElement month_of_DOB;

    @FindBy (name = "DateOfBirthYear")
    WebElement year_of_DOB;

    @FindBy (id = "Email")
    WebElement emailField;

    @FindBy (id = "Password")
    WebElement passwordField;

    @FindBy (id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @FindBy (id = "register-button")
    WebElement registerButton;

    @FindBy(xpath = "//div[text()='Your registration completed']") //Your registration completed
    WebElement registerMessage;

    @FindBy(id = "FirstName-error")
    WebElement errorMessage;

    public String getWelcomeText()
    {
        log.info("Getting Text from ...." + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void clickOnGender()
    {
        clickOnElement(gen_female);
        log.info("Selecting gender female ...." + gen_female.toString());
    }

    public void enterFirstName(String first_name)
    {
        sendTextToElement(firstnameField,first_name);
        log.info("Entering firstname : " + firstnameField.toString());
    }

    public void enterLastName(String last_name)
    {
        sendTextToElement(lastnameField,last_name);
        log.info("Entering lastname : " + lastnameField.toString());
    }

    public void selectDateOfBirth(String day, String month, String year)
    {
        selectByValueFromDropDown(day_of_DOB,day);
        selectByValueFromDropDown(month_of_DOB,month);
        selectByValueFromDropDown(year_of_DOB,year);
        log.info("Selecting Date of Birth...");
    }

    public void enterEmail(String email)
    {
        sendTextToElement(emailField, email);
        log.info("Entering email address : " + email + " to email field : " + emailField.toString());
    }

    public void enterPassword(String pass_word)
    {
        sendTextToElement(passwordField,pass_word);
        log.info("Entering password : " + passwordField.toString());
    }

    public void enterConfirmPassword(String confirm_pass_word)
    {
        sendTextToElement(confirmPasswordField,confirm_pass_word);
        log.info("Entering confirm password : " + confirmPasswordField.toString());
    }

    public void clickOnRegisterButton()
    {
        clickOnElement(registerButton);
        log.info("Click on register. " + registerButton.toString());
    }

    public String getErrorMessage()
    {
        return getTextFromElement(errorMessage);
    }

    public String getRegisterMessage()
    {
        return getTextFromElement(registerMessage);
    }
}
