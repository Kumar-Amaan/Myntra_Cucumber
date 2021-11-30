Feature: Myntra Home Page Links

  @Bath
  Scenario: Home_Living-Baths
    Given User is on Myntra Home Page
    When User hover on Home&Living and select Bath Towels
    And User navigate to the Bath Towels Page
    When User  select Hand&Face Towels
    And User navigate to the Hand&Face Towels Page
    When User  select Beach Towel
    And User navigate to the Beach Towels Page
    When User  select Towels Set
    And User navigate to the Towels Set Page
    When User select Bath Rugs
    And User navigate to the Bath Rugs Page
    When User select Bath Robes
    And User navigate to the Bath Robes Page
    When User select Bathroom Accessories
    Then User navigate to the Bathroom Accessories Page

  @HomeDecor
  Scenario: Home_Living-Home_Decors
    Given User is on Myntra Home Page
    When User hover on Home&Living and select Plants&Planters
    And User navigate to the Plants&Planters Page
    When User  select Aromas&Candels
    And User navigate to the Aromas&Candels Page
    When User  select Clocks
    And User navigate to the Clocks Page
    When User  select Mirrors Set
    And User navigate to the Mirrors Page
    When User select Wall Décor
    And User navigate to the Wall Décor Page
    When User select Wall Shelves
    And User navigate to the Wall Shelves Page
    When User select Fountains
    Then User navigate to the Fountains Page
    When User select Showpieces & Vases
    Then User navigate to the Showpieces & Vases Page
