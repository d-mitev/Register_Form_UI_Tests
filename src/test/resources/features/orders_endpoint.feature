Feature: Orders endpoint
  Users should be able to order books, update orders and cancel orders using the Orders endpoint

  Scenario: I am a registered user and want to order a book
    Given I am logged in with my valid credentials
    When I order one book
    And the "bookId" of the book I want to order is "1"
    And my Customer Name is "Testcho Testov"
    Then I should see a Status Code, which confirms successful order
    And The response should return "created" field as "true"
    And The field "orderId" should not be empty

