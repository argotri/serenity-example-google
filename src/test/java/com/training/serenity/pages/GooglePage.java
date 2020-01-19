package com.training.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.google.co.id/")
public class GooglePage extends PageObject {
    @FindBy(name = "q")
    private WebElementFacade txtGoogleSearch;

    @FindBy(xpath = "//a[contains(@href,\"https://id.wikipedia.org\")]")
    private WebElementFacade linkWikipedia;

    public void searchInGoogle(String text){
        txtGoogleSearch.typeAndEnter(text);
    }

    public void goToWikipediaPage(){
        linkWikipedia.click();
    }
}
