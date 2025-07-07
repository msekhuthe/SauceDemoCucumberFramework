package StepsDefinition;

import io.cucumber.java.en.*;
import org.testng.annotations.Test;

import java.util.Random;


public class Steps extends Base {
    @Given("I am on the user table page")
    public void i_am_on_the_user_table_page() {
        landingPage.verifyFirstNameLabel("First Name");
    }
    @When("I click on the Add User button")
    public void i_click_on_the_Add_User_button() {
        landingPage.clickAddUserButton();
    }
    @Then("I should see a form to add a new user")
    public void i_should_see_a_form_to_add_a_new_user() {
        addUserPage.verifyAddUserHeader("Add User");

    }
    @Then("I will enter the first name (.*)$")
    public void i_will_enter_the_first_name(String firstName) {
        addUserPage.enterFirstName(firstName);
    }
    @Then("I will enter the last name (.*)$")
    public void i_will_enter_the_last_name_last_name(String lastName) {
        addUserPage.enterLastName(lastName);
    }
    @Then("I will enter the username (.*) and (.*)$")
    public void i_will_enter_the_username_firstName_and_lastName(String firstName, String lastName) {
        Random random = new Random();
        int randomNumber = 1000 + random.nextInt(9000); // Generate a random number between 0 and 999

        String username = firstName + lastName + randomNumber; // Concatenate first name, last name, and random number
        addUserPage.enterUsername(username);

       // System.out.println("Generated Username: " + username); // Print the generated username
    }
//    @Then("I will enter the password <password>")
//    public void i_will_enter_the_password_password() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I will select the customer")
//    public void i_will_select_the_customer() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I will select the role")
//    public void i_will_select_the_role() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I will enter the email <email>")
//    public void i_will_enter_the_email_email() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I will enter the cell phone <cellPhone>")
//    public void i_will_enter_the_cell_phone_cell_phone() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//    @Then("I will click on the Save button")
//    public void i_will_click_on_the_save_button() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }

}
