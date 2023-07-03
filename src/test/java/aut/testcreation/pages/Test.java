package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Test{

    @FindBy(xpath = "xpath=//a[contains(text(),'Vuelos')]")
    WebElement btnVuelos;

    @FindBy(xpath = "xpath=//div[@id='hub-csw-container']/div/div[2]/div/form/div/div[7]/div/button")
    WebElement btnBusqueda;

    class Test1 {

        WebDriver driver;

        @org.junit.jupiter.api.Test
        void browserActions() throws InterruptedException {

            //Ingresar a Rumbo.es
            driver.get("https://www.rumbo.es/");

            //Hacer click en la pestaña "Vuelos"



            //Hacer click en el botón de búsqueda


            //Hacer click la pestaña "Más rápido"
        }
    }
}

