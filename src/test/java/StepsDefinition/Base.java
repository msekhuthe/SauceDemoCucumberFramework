package StepsDefinition;

import Pages.*;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("Edge", "https://www.way2automation.com/angularjs-protractor/webtables/");

    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    AddUserPage addUserPage = PageFactory.initElements(driver, AddUserPage.class);

}
