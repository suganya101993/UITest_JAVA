package com.QA_Test.homepage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

    private HomePage homePage;

    public HomePageSteps() {
        this.homePage = new HomePage();
    }

    @Given("^A user navigates to HomePage")
    public void aUserNavigatesToHomePage() {
        this.homePage.goToHomePage();
    }

    @Then("^Page is displayed$")
    public void pageIsDisplayed() {
        this.homePage.checkPageDisplay();
    }

    @Then("^page title is \"([^\"]*)\"$")
    public void pageTitleIs(String title) {
        this.homePage.checkTitle(title);
    }

    @When("^a user searches for \"([^\"]*)\"$")
    public void aUserSearchesFor(String searchValue) {
        this.homePage.searchFor(searchValue);
    }

    @Then("product list is displayed")
    public void productListIsDisplayed() {
        this.homePage.productList();
    }
}
