package Utils;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserFactory {

    static WebDriver driver;

    @BeforeTest
    public static WebDriver startBrowser(String browserChoice, String url) {
//        if (browserChoice.equalsIgnoreCase("Edge")){
//            EdgeOptions edgeOptions = new EdgeOptions();
//            driver = new EdgeDriver(edgeOptions);
//        }else if (browserChoice.equalsIgnoreCase("Firefox")) {
//            driver = new FirefoxDriver();
//        } else if (browserChoice.equalsIgnoreCase("Chrome")) {
//            driver = new ChromeDriver();
//        } else if (browserChoice.equalsIgnoreCase("Safari")) {
//            driver = new SafariDriver();
//        } else {
//            throw new IllegalArgumentException("Browser not supported: " + browserChoice);
//        }

        switch (browserChoice.toLowerCase()) {
            case "edge":
               // EdgeOptions edgeOptions = new EdgeOptions();
                driver = new EdgeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                throw new IllegalArgumentException("Browser not supported: " + browserChoice);
        }

        driver.manage().window().maximize();
        driver.get(url);
        return driver;
    }
    @Test
    public void test() {
        startBrowser("Edge", "https://www.way2automation.com/angularjs-protractor/webtables/");

    }
}
