Feature: As a user , i want to search blibli in google and go to wikipedia page

  Scenario: user go to google and search for blibli.com
    Given user go to google home page
    When user type "blibli" in search bar
    And user click on wikipedia link on google recomendation
    Then i should able to see "Blibli.com adalah salah satu situs web perdagangan elektronik di Indonesia." in the body