Feature: Cruise Line Information
  As a user I want to see Port of departure and shore excursions information
    Scenario : Guest explores shore excursion destinations

  Given a Guest enters  to webpage url
  And user is on  NCL Homepage
  Then user navigates to “Shore Excursions” page
  When user searches for destination “Alaska Cruises”
  Then shore Excursions page is displayed
  And results are filtered by "Alaska Cruises"
  And filter By Ports are only belong to "Alaska,British Columbia"