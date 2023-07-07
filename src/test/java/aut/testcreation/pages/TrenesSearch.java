package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrenesSearch extends SeleniumWrapper {
    public TrenesSearch(WebDriver driver) {
        super(driver);
    }

    //Localizadores
    By btnModificar = By.xpath("//div[@class='search-summary__section search-summary__section--search']");
    By btnModificarFecha = By.xpath("//button[@aria-label='Fecha de entrada']");
    By btnDia14 = By.xpath("(//button[@type='button'])[27]");

    By btnPasajeros = By.xpath("//button[@class='css-ecd3q7-Dropdown-styled']");

    By btnSumar = By.xpath("//*[name()='path' and contains(@d,'M19 13H13V')]");
    By btnBusqueda = By.xpath("//div[@class='css-1elrqbe-SubmitButton-styled']//*[name()='svg']");
    By btnOrigenCambio = By.xpath("//label[@id=':r5l:-label']");
    By btnDestinoCambio = By.xpath("//label[@id=':r5m:-label']");

    //Metodos

    public void CambiarVentana() {
        String ventanaActual = driver.getWindowHandle();
        System.out.println("ID de la ventana actual: " + ventanaActual);
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }

    public void Modificar(String origen, String destino){
        CambiarVentana();
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnModificar));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnOrigenCambio));
        esperarXSegundos(5000);
        agregarTexto((btnOrigenCambio), origen);
        esperarXSegundos(7000);
        agregarTexto((btnDestinoCambio), destino);
        esperarXSegundos(7000);
        clickear(esperarPorElemento(btnModificarFecha));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnDia14));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnPasajeros));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnSumar));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnBusqueda));
        esperarXSegundos(5000);

    }

}
