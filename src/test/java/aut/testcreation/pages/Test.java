package aut.testcreation.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


class Test {

    WebDriver driver;

    @BeforeAll
    static void preparClase() {

        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void preTests() {
        driver = new ChromeDriver();
        PageFactory.initElements(driver, this);
        driver.get("https://www.rumbo.es/");

    // Maximizar la página
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @FindBy(xpath = "xpath=//a[contains(text(),'Vuelos')]")
    WebElement btnVuelos;
    @FindBy(xpath = "xpath=//div[@id='hub-csw-container']/div/div[2]/div/form/div/div[7]/div/button")
    WebElement btnBusqueda;


    @org.junit.jupiter.api.Test
    void browserActions(){

        //Ingresar a Rumbo.es
        driver.get("https://www.rumbo.es/");

        //Hacer click en la pestaña "Vuelos"
        btnVuelos.click();
        Thread.sleep(10000);

        //Hacer click en el botón de búsqueda
        btnBusqueda.click();
        Thread.sleep(10000);

        //Hacer click la pestaña "Más rápido"
        .click();
        Thread.sleep(10000);

    }
}
