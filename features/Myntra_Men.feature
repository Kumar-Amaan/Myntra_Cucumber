Feature: Mynta Men Section
@Men
Scenario: MEn section functionality
Given User is on Myntra HomePage
When User hover on Men and click Sweatshirts
And User Scroll Down 
And User select an item
And  User navigate to the new tab of that item details
And User click on the Size Chart
And User check the XL size
And User close the Chart Size
And User enter the pincode "826001" and click Check
Then User scroll down 
And User select the More Sweatshirt by H&M
And User checked the Boys in Filters
Then User navigate to boys sections