package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LandingPage {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'First Name')]")
    WebElement firstNameLabel_xpath;

    @FindBy(xpath = "//button[contains(.,'Add User')]")
    WebElement addUserButton_xpath;

    public LandingPage(WebDriver driver) {
        this.driver = driver;

    }

    public void verifyFirstNameLabel(String actualText) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(visibilityOf(firstNameLabel_xpath));
        //firstNameLabel.isDisplayed();
        actualText = firstNameLabel_xpath.getText();
        Assert.assertEquals(actualText, "First Name");
    }

    public void clickAddUserButton() {
        addUserButton_xpath.click();
    }

}
