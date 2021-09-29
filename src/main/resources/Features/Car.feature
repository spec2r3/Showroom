Feature: CarSelection
  This deals with the car selection functionality under Showroom

  Scenario: Customer wants a car, so he enquires
    Given I go to enquire
    And I enter BMW as car Make and M4 as the car Model
    Then I should see the car specifications

