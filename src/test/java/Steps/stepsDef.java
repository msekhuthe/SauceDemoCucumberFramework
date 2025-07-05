package Steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;


public class stepsDef {

    WebDriver driver;

    @Given("I am on the login game")
    public void i_am_on_the_login_game() {
        driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        // driver.quit();
    }

    @And("I enter username (.*)$")
    public void i_enter_username_standard_user(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    @And("I enter password (.*)$")
    public void i_enter_password_secret_sauce(String password) {
        driver.findElement(By.id("password")).sendKeys(password);

    }

    @When("I click login button")
    public void i_click_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("I should be on the home page")
    public void i_should_be_on_the_home_page() {
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Login successful, on the home page.");
            assert true;
        } else {
            System.out.println("Login failed, not on the home page.");
            assert false;
        }
        // driver.quit();

    }

    @When("I add an item to the cart")
    public void i_add_an_item_to_the_cart() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @Then("I should see the item in the cart")
    public void i_should_see_the_item_in_the_cart() {
        driver.findElement(By.className("shopping_cart_badge"));
        String cartItemCount = driver.findElement(By.className("shopping_cart_badge")).getText();
        Assert.assertEquals(cartItemCount, "1", "Cart item count is not as expected.");
        System.out.println("Item added to cart successfully. Cart item count: " + cartItemCount);
    }

    @When("I click the cart icon")
    public void i_click_the_cart_icon() {
        driver.findElement(By.className("shopping_cart_link")).click();

    }

    @Then("I should see the cart page")
    public void i_should_see_the_cart_page() {
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
        String expectedText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(expectedText, "Your Cart", "Cart page is not displayed correctly.");
    }

    @When("I click the checkout button")
    public void i_click_the_checkout_button() {
        driver.findElement(By.id("checkout")).click();

    }

    @Then("I should see the checkout page")
    public void i_should_see_the_checkout_page() {
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
        String expectedText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(expectedText, "Checkout: Your Information", "Checkout page is not displayed correctly.");

    }

    @When("I enter first name (.*)$")
    public void i_enter_first_name_first_name(String firstName) {
        driver.findElement(By.id("first-name")).sendKeys(firstName);

    }

    @When("I enter last name (.*)$")
    public void i_enter_last_name_last_name(String lastName) {
        driver.findElement(By.id("last-name")).sendKeys(lastName);
    }

    @When("I enter zip code (.*)$")
    public void i_enter_zip_code_zip_code(String postalCode) {
        driver.findElement(By.id("postal-code")).sendKeys(postalCode);

    }

    @When("I click the continue button")
    public void i_click_the_continue_button() {
        driver.findElement(By.id("continue")).click();

    }

    @Then("I should see the overview page")
    public void i_should_see_the_overview_page() {
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
        String expectedText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(expectedText, "Checkout: Overview", "Overview page is not displayed correctly.");

    }

    @When("I click the finish button")
    public void i_click_the_finish_button() {
        driver.findElement(By.id("finish")).click();

    }

    @Then("I should see the completion page")
    public void i_should_see_the_completion_page() {
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
        String expectedText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(expectedText, "Checkout: Complete!", "Completion page is not displayed correctly.");
        System.out.println("Order completed successfully.");

    }

    @When("I click the back home button")
    public void i_click_the_back_home_button() {
        driver.findElement(By.id("back-to-products")).click();

    }

    @Then("I should see the home page")
    public void i_should_see_the_home_page() {
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
        String expectedText = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText();
        Assert.assertEquals(expectedText, "Products", "Home page is not displayed correctly.");
        System.out.println("Returned to home page successfully.");

    }

}
