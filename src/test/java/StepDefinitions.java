import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
    @Given("I am logged in with my valid credentials")
    public void iAmLoggedInWithMyValidCredentials() {
    }

    @When("I order one book")
    public void iOrderOneBook() {
        
    }

    @And("the {string} of the book I want to order is {string}")
    public void theOfTheBookIWantToOrderIs(String arg0, String arg1) {
        
    }

    @And("my Customer Name is {string}")
    public void myCustomerNameIs(String arg0) {
        
    }

    @Then("I should see a Status Code, which confirms successful order")
    public void iShouldSeeAStatusCodeWhichConfirmsSuccessfulOrder() {
        
    }

    @And("The response should return {string} field as {string}")
    public void theResponseShouldReturnFieldAs(String arg0, String arg1) {
        
    }

    @And("The field {string} should not be empty")
    public void theFieldShouldNotBeEmpty(String arg0) {
        
    }

    @When("I make a request to Books endpoint having {string} euqal to {string}")
    public void iMakeARequestToBooksEndpointHavingEuqalTo(String arg0, String arg1) {
        
    }

    @When("I make a request to Books endpoint using optional path parameter {string} equal to {string}")
    public void iMakeARequestToBooksEndpointUsingOptionalPathParameterEqualTo(String arg0, String arg1) {
        
    }

    @Then("The response should return {string} equal to {string}")
    public void theResponseShouldReturnEqualTo(String arg0, String arg1) {

    }
}
