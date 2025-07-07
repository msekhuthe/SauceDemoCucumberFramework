package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class AddUserPage {
    WebDriver driver;

    @FindBy(xpath = "//h3[contains(.,'Add User')]")
    WebElement addUserHeader_xpath;
    @FindBy(name = "FirstName")
    WebElement firstNameInput_xpath;
    @FindBy(name = "LastName")
    WebElement lastNameInput_xpath;
    @FindBy(name = "UserName")
    WebElement userNameInput_xpath;
    @FindBy(name = "Password")
    WebElement passwordInput_xpath;
    @FindBy(name = "RoleId")
    WebElement roleIdInput_xpath;

    public void verifyAddUserHeader(String actualText) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(visibilityOf(addUserHeader_xpath));
        actualText = addUserHeader_xpath.getText();
        Assert.assertEquals(actualText, "Add User");

    }

    public void enterFirstName(String firstName) {
        firstNameInput_xpath.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameInput_xpath.sendKeys(lastName);
    }

    public void enterUsername(String userName) {
        userNameInput_xpath.sendKeys(userName);
    }
    public void selectRole(String userRole) {
        roleIdInput_xpath.click();
        WebElement roleOption = driver.findElement(By.xpath("//option[contains(text(),'" + userRole + "')]"));
        roleOption.click();

    }


}
