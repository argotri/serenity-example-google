package com.training.serenity;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/consult_dictionary/SearchBlibli.feature"
)
public class DefinitionTestSuite {}
