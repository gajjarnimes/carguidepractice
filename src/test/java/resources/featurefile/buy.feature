Feature: Search functionality

  Scenario Outline: Search buy the car with model
    Given I am on homepage
    When I mouse hover on "buy+sell"tab
    And I click "Search Cars" link
    Then I navigate to "new and used car search" page
    And I select make"<make>"
    And I select model"<model>"
    And I select location"<location>"
    And I select price"<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
       |    make     |   model     | location      | price     |
       |AlphaRomeo   |  147        |ACT-All        |$1000      |
       |Audi         | A5          |NSW -ALL       |$2000      |
       |BMW          |1 series     |NSW-Hunter     |$3000      |
       |Honda        |Accord       |NSW-Sydeny     |$5000      |
       |Honda        |Civic        |NT-South       |$7500      |
       |Volvo        |V90          |QLD-Brisbane   |10000      |

    Scenario Outline: Search the used car with model
      Given I am on homepage
      When I mouse hover on "buy+sell" tab
      And I click on "Used" link
      Then I navigate to "Used Cars For Sale" page
      And I select make "<make>"
      And I select model"<model>"
      And I select loction"<location>"
      And I select price"<price>"
      And I click on Find My Next Car tab
      Then I should see the make "<make>" in results
      Examples:
         |    make      |  model      |  location   |  price      |
         |  MG          | B           |NSW-All      |$1000        |
         |  Jeep        |Compass      |NT-All       |$3000        |
         |  Kia         |EV6          |QLD-All      |$5000        |
         |  Toyota      |700          |SA-All       |$7500        |
         |  BYD         |E6           |VIC-All      |$10000       |
         |  Bentley     |Flying Spur  |WA-All       |$15000       |

