package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TrenesResults extends SeleniumWrapper {

    public TrenesResults(WebDriver driver) {
        super(driver);
    }
    //Localizadores
    By btnMasBarato = By.xpath("//h5[normalize-space()='Más barato']");
    By btnResultado = By.xpath("(//div[@class='FullTransportPrices__SelectedPriceContainer-sc-1qck0l5-1 knGmgC'])[1]");
    By btnOrigen = By.xpath("//input[@aria-label='Origen']");
    By btnDestino = By.xpath("//input[@aria-label='Destino']");
    By btnPasajeros = By.xpath("//span[normalize-space()='1 pasajero']");
    By btnSumar = By.xpath("//*[name()='path' and contains(@d,'M19 13H13V')]");
    By btnBusqueda = By.xpath("//button[contains(@aria-label,'Buscar')]");
    By mensajeerror = By.cssSelector("//*[name()='path' and contains(@d,'M19 13H13V')]");


    ///////////////  NO BORRAR   ///////////////////////////

    By btnModificar = By.xpath("//span[@class='search-summary__search']");
    By modOrigen = By.xpath("(//input[@role='combobox'])[1]");
    By modDestino = By.xpath("(//input[@role='combobox'])[2]");

    By modSoloida = By.xpath("//div[@class='css-e3uqr8-textOverflowEllipsis-ToggleGroup-ToggleGroup']");
    By modFecha = By.xpath("//button[@class='css-1wfur8z-DateInput-styled']");
    By modElegirFecha = By.xpath("(//button[@type='button'])[32]");
    By modPersonas = By.xpath("//button[@class='css-tr4xm3-Dropdown-styled']");
    By sumarPersona = By.xpath("//button[@aria-label='Aumentar el número de adultos']");

    By modBuscar = By.xpath("//div[@class='css-e3uqr8-textOverflowEllipsis-ToggleGroup-ToggleGroup']");
    //Metodos
    public void MasBarato(){
        esperarXSegundos(10000);
        clickear(esperarPorElemento(btnMasBarato));
    }
    public void Unresultado(){
        esperarXSegundos(8000);
        clickear(esperarPorElemento(btnResultado));
        esperarXSegundos(10000);
    }

    public void pasajesMaximos(String origen, String destino) {

        esperarXSegundos(7000);
        clickear(esperarPorElemento(btnOrigen));
        agregarTexto((btnOrigen), origen);
        esperarXSegundos(7000);
        clickear(esperarPorElemento(btnDestino));
        esperarXSegundos(7000);
        agregarTexto((btnDestino), destino);
        esperarXSegundos(10000);
        clickear(esperarPorElemento(btnPasajeros));
        for (int i = 0; i < 4; i++) {
            clickear(esperarPorElemento(btnSumar));
        }
        clickear(esperarPorElemento(btnBusqueda));
        esperarXSegundos(10000);
    }

    public void modificacionFiltros (String origen){
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnModificar));
        esperarXSegundos(5000);
        agregarTexto(esperarPorElemento(modOrigen),origen);
        esperarXSegundos(5000);
        clickear(esperarPorElemento(modFecha));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(modElegirFecha));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(modPersonas));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(sumarPersona));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(modBuscar));
        esperarXSegundos(5000);

    }


}