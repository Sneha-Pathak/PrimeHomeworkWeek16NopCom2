package com.nopcommerce.demo.stepdef;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ComputerStepDef
{
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();

    @When("^I click on Computer Menu$")
    public void iClickOnComputerMenu()
    {
        homePage.clickOnComputer();
    }

    @And("^I click on Desktop menu$")
    public void iClickOnDesktopMenu()
    {
        computerPage.clickOnDesktop();
    }

    @Then("^I should navigate to desktop menu$")
    public void iShouldNavigateToDesktopMenu() throws InterruptedException
    {
        Thread.sleep(2000);
        Assert.assertEquals("Desktops",computerPage.getDesktopPageTittle());
    }

    @And("^I click on Notebook menu$")
    public void iClickOnNotebookMenu()
    {
        computerPage.clickOnNotebook();
    }

    @Then("^I should navigate to Notebook menu$")
    public void iShouldNavigateToNotebookMenu() throws InterruptedException
    {
        Thread.sleep(2000);
        Assert.assertEquals("Notebooks",computerPage.getNotebookPageTittle());
    }

    @And("^I click on Software menu$")
    public void iClickOnSoftwareMenu()
    {
        computerPage.clickOnSoftware();
    }


    @Then("^I should navigate to Software menu$")
    public void iShouldNavigateToSoftwareMenu() throws InterruptedException
    {
        Thread.sleep(3000);
        Assert.assertEquals("Software",computerPage.getSoftwarePageTittle());
    }
}
