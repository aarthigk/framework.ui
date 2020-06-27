#Feature: Automated End2End Tests
#  Description: The purpose of this feature is to test End 2 End integration.
# @smoketest
#  Scenario: Customer place an order by purchasing an item from search
#    Given I am on Home Page_old
#    When I search for product in dress category_old
#    And I choose to buy the first item_old
#	And I move to checkout from mini cart_old
#    And I enter my personal details_old
#    And I place the order_old
#    Then Order details are successfully verified