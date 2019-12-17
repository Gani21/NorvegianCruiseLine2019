Feature: Cruise Line Information
  As a user I want to see Port of departure and shore excursions information

  Scenario: Guest explores Ports of Departure

    Given a Guest enters  to webpage url
    When user is on  NCL Homepage
    Then user navigates to "Explore“ and  "Ports”
    When user searches for “Honolulu” port
    Then map zoomed to show selected port
    And port displayed as “Port Of Departure”


