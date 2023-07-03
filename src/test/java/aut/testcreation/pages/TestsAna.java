package aut.testcreation.pages;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class TestsAna {

    @FindBy(xpath = "xpath=//a[contains(text(),'Vuelos')]")
    WebElement btnVuelos;

    class Test1 {


        @Test
        void browserActions() throws InterruptedException {

            //Ingresar a Rumbo.es

            //Hacer click en la pestaña "Vuelos"
            btnVuelos.click();

            //Hacer click en el botón de búsqueda

            //Hacer click la pestaña "Más rápido"
        }
    }
}

