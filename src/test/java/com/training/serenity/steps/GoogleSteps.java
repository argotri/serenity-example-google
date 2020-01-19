package com.training.serenity.steps;

import com.training.serenity.pages.GooglePage;
import com.training.serenity.pages.WikipediaPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class GoogleSteps {

    GooglePage googlePage;
    WikipediaPage wikipediaPage;

    @Given("^user go to google home page$")
    public void userGoToGoogleHomePage() {
        googlePage.open();
    }

    @When("^user type \"([^\"]*)\" in search bar$")
    public void userTypeInSearchBar(String keyword) {
        googlePage.searchInGoogle(keyword);
    }

    @And("^user click on wikipedia link on google recomendation$")
    public void userClickOnWikipediaLinkOnGoogleRecomendation() {
        googlePage.goToWikipediaPage();
    }

    @Then("^i should able to see \"([^\"]*)\" in the body$")
    public void iShouldAbleToSeeInTheBody(String expected) {
        MatcherAssert.assertThat("Blibli Wikipedia is not found" ,
                wikipediaPage.getWikipediaBody(),
                Matchers.containsString(expected));
    }
}
