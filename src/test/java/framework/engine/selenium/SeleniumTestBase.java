package framework.engine.selenium;

import aut.testcreation.pages.HomePage;
import aut.testcreation.pages.HotelesPage;
import aut.testcreation.pages.HotelesResults;
import framework.engine.utils.LoadProperties;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Properties;

public class SeleniumTestBase {

    private DriverFactory driverFactory;
    WebDriver driver;

    static Properties properties;


    @BeforeAll
    public static void LoadProperties() {
        properties = LoadProperties.loadProperties();
    }

    @BeforeEach
    void webDriverSetup() {
        String browserName = properties.getProperty("browser");
        driverFactory = new DriverFactory();
        driver = driverFactory.inicializarDriver(browserName);
    }
/*
    void preTests() {
        driver = new ChromeDriver();
        PageFactory.initElements(driver, this);
        driver.get("https://www.rumbo.es/");

        // Maximizar la página
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
       */

/*
    @AfterEach
    void close() {
        driver.quit();
    } //para cerrar la página.
*/
}
