package com.training.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


public class WikipediaPage extends PageObject {
    @FindBy(tagName = "body")
    private WebElementFacade wikipediaBody;

    public String getWikipediaBody() {
        return wikipediaBody.getText();
    }
}
