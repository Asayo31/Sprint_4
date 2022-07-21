package testPackage;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import pageObject.MainPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseUITest {
    public static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
        MainPage mainPage = new MainPage(driver)
                .open()
                .clickCookie();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
