Feature: check product on clearance fuctionality
  Background: operating system :windows 7
  Browser version :chrome 55.0
  @QueenTest
  Scenario: user search vaccancie sucessfully
    Given User already on home page
    When I click on carreer
    Then I see carreer page
    When I click job search
    And I enter job tital
    And I enter postcode or city name
    When I click on job search
    Then I see all vaccancie list