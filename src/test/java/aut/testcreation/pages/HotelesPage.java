package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelesPage extends SeleniumWrapper {
    //Localizadores
    By btnUbicacion = By.xpath("//label[@id=':R8qjalalaqlql2mm:-label']");
    By btnFechaEntrada = By.xpath("//label[normalize-space()='Fecha de entrada']");
    By btnFechaSalida = By.xpath("//label[normalize-space()='Fecha de salida']");
    By btnPersona = By.xpath("//label[normalize-space()='Personas']");
    By btnBusqueda = By.xpath("//button[contains(@aria-label,'Buscar')]");

    public HotelesPage(WebDriver driver) {
        super(driver);
    }

    //Métodos


    public void Ubicacion(){
        clickear(esperarPorElemento(btnUbicacion));
    }
    public void FechaEntrada(){
        clickear(esperarPorElemento(btnFechaEntrada));
    }
    public void FechaSalida(){
        clickear(esperarPorElemento(btnFechaSalida));
    }
    public void Persona(){
        clickear(esperarPorElemento(btnPersona));
    }
    public void Busqueda(){
        clickear(esperarPorElemento(btnBusqueda));
    }
}
