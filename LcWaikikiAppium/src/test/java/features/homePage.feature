@HomePage
Feature: Home Page

  @NavigationButtons
  Scenario: Check Navigation Button
    Given Enes is on Home Page
    Then should see "Ana sayfa" navigation button
    Then should see "Kategoriler" navigation button
    Then should see "Sepetim" navigation button
    Then should see "Favoriler" navigation button
    Then should see "Profil" navigation button
    Then should see "Ana sayfa" selected navigation button





