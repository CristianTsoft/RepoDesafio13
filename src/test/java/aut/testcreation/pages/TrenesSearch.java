package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrenesSearch extends SeleniumWrapper {
    public TrenesSearch(WebDriver driver) {
        super(driver);
    }

    //Localizadores
    By btnModificar = By.xpath("/html/body/div[6]/div/div/div/div/div[1]/div[1]/div/div/div/div[1]/div/div/div/div/div[5]");
    By btnModificarFecha = By.xpath("//button[@aria-label='Fecha de entrada']");
    By btnDia14 = By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[10]");

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
        clickear(esperarPorElemento(btnOrigenCambio));
        agregarTexto((btnOrigenCambio), origen);
        esperarXSegundos(7000);
        agregarTexto((btnDestinoCambio), destino);
        esperarXSegundos(7000);
        clickear(esperarPorElemento(btnModificarFecha));
        clickear(esperarPorElemento(btnDia14));
        clickear(esperarPorElemento(btnPasajeros));
        clickear(esperarPorElemento(btnSumar));
        clickear(esperarPorElemento(btnBusqueda));
    }

}
