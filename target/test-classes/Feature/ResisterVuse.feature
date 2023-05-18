Feature: Sign Up Functionality of Visu
@Createuser
  Scenario: Verify that user is able to Resister
  And click on the accept all cookies button for register page
    And click i am above 18 year button for register page
    And click person account icon
    And click on the resister button
    Then fill all the details
    Then click on the submit button
