Feature: feature to verify PRICING

  Scenario: Validate pricing
    Given browser is open
    When User opens URL "https://www.telerik.com/"
    And clicks on PRICING
    Then user is navigated to the PRICING banner
    When User clicks on PRODUCT BUNDLES
    Then user is navigated to the PRODUCT BUNDLE banner
    When User clicks on INDIVIDUAL PRODUCTS
    #Then user is navigated to the INDIVIDUAL PRODUCT banner
    When user clicks on Web Js Components banner
    Then user is navigates to the Web Js Components banner
    When user clicks on Web .NET Components banner
    Then user is navigates to the Web .NET Components banner
    When user clicks on Desktop Components banner
    Then user is navigates to the Desktop Components banner
    When user clicks on Mobile Components banner
    Then user is navigates to the Mobile Components banner
   	When user clicks on Demos
    Then user is navigates to the Demos
