Feature: Myntra Home Page Links

  @lamps
  Scenario: Lamps
    Given USer is on Myntra Home Page
    When User hover on Home&Living and select Floor lamps
    And User  select Ceiling lamps
    And User  select Table lamps
    And User  select Wall lamps
    And User select Outdoor lamps
    And User select String lamps
    Then User navigate to the String lamps Page
