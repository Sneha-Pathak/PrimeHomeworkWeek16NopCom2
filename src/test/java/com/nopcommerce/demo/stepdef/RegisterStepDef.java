package com.nopcommerce.demo.stepdef;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class RegisterStepDef
{
    RegisterPage registerPage = new RegisterPage();

    @Given("^I am on Homepage$")
    public void iAmOnHomepage()
    {

    }

    @When("^I click on register link$")
    public void iClickOnRegisterLink()
    {
        new HomePage().clickOnRegisterLink();
    }

    @Then("^I should navigate to register page successfully$")
    public void iShouldNavigateToRegisterPageSuccessfully()
    {
        Assert.assertEquals("Register", registerPage.getWelcomeText());
    }

    @And("^I leave first name blank$")
    public void iLeaveFirstNameBlank() throws InterruptedException
    {
        Thread.sleep(2000);
        registerPage.clickOnGender();
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() throws InterruptedException
    {
        Thread.sleep(5000);
        registerPage.clickOnRegisterButton();
    }

    @Then("^I should get error message register$")
    public void iShouldGetErrorMessageRegister() throws InterruptedException
    {
        Thread.sleep(2000);
        Assert.assertEquals("First name is required.",registerPage.getErrorMessage());
    }

    @And("^I select gender male$")
    public void iSelectGenderMale()
    {
        registerPage.clickOnGender();
    }

    @And("^I enter firstname \"([^\"]*)\"$")
    public void iEnterFirstname(String firstname)
    {
        registerPage.enterFirstName(firstname);
    }

    @And("^I enter lastname \"([^\"]*)\"$")
    public void iEnterLastname(String lastname)
    {
        registerPage.enterLastName(lastname);
    }

    @And("^I select date of birth \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void iSelectDateOfBirth(String day, String month, String year)
    {
        registerPage.selectDateOfBirth(day,month,year);
    }

    @And("^I enter email \"([^\"]*)\"$")
    public void iEnterEmail(String email) throws InterruptedException
    {
        Thread.sleep(2000);
        registerPage.enterEmail(email);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)
    {
        registerPage.enterPassword(password);
    }

    @And("^I enter confirm password \"([^\"]*)\"$")
    public void iEnterConfirmPassword(String confirmPassword)
    {
        registerPage.enterConfirmPassword(confirmPassword);
    }

    @Then("^I should register successfully$")
    public void iShouldRegisterSuccessfully()
    {
        Assert.assertEquals("Your registration completed",registerPage.getRegisterMessage());
    }
}
