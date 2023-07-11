Feature: Books endpoint
  I should be able to receive information regarding the lis of books

  Scenario: I want to get information regarding a specific book
    When I make a request to Books endpoint using optional path parameter "bookId" equal to "5"
    Then The response should return "id" equal to "5"