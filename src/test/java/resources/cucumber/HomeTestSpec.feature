Feature: homePage functionality
  As a user  I want to check some functionality of HomePage
  
  Background: 
    Given user is on home page

  @ie
  Scenario: Check whether UBS logo is displayed or not
    Then UBS logo is displayed
    
  @ie
  Scenario: Check home page slide
    When User Press on the right Arrow on the Slider
    Then the Slider will  move to next slide
    When User Press on the left arrow on the slider
    Then the Slider will  move back to Previous slide
    
  @ie
  Scenario: Navigate to complaint page
  	When User press on contact dropdown list and select complaint
  	Then complaint page is opened successfully
    