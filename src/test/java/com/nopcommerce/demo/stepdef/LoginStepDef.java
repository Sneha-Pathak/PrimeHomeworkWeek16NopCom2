package com.nopcommerce.demo.stepdef;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.junit.Assert;

public class LoginStepDef 
{
    LoginPage loginPage = new LoginPage();

    @When("^I click on login link$")
    public void iClickOnLoginLink() 
    {
        new HomePage().clickOnLoginLink();
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully()
    {
        Assert.assertEquals("Welcome, Please Sign In!",loginPage.getWelcomeText());
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() throws InterruptedException
    {
        Thread.sleep(3000);
        loginPage.clickOnLoginButton();
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() throws InterruptedException
    {
        Thread.sleep(3000);
        Assert.assertEquals("Welcome to our store",loginPage.getWelcomeStoreMessage());
    }

    @Then("^I should see the error message \"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String errorMsg) throws InterruptedException
    {
        Thread.sleep(3000);
        Assert.assertEquals(errorMsg,loginPage.getErrorMessage());
    }
}
