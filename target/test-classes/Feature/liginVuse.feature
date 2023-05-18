Feature: Verify login functionality 
@Vuse
Scenario: verify that user should navigate to google.com when he click on i am under 18 button
And click on the accept all cookies button for login page
And click i am under age button for login page
Then verify user should navigate to google.com page
