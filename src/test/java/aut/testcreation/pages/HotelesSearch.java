package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelesSearch extends SeleniumWrapper {



    public HotelesSearch(WebDriver driver) {
        super(driver);

    }
    //Localizadores
    By btnModificar = By.xpath("//button[@id='modifyCSW']");
    By btnModificarFecha = By.xpath("//button[@aria-label='Fecha de entrada']");
    By btnDia14 = By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[10]");

    By btnHuespedes = By.xpath("//button[@class='css-ecd3q7-Dropdown-styled']");

    By btnSumar = By.xpath("//*[name()='path' and contains(@d,'M19 13H13V')]");

    By btnBusqueda = By.xpath("//button[@aria-label='Buscar']");
    //Metodos
    public void Modificar(){
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnModificar));
        clickear(esperarPorElemento(btnModificarFecha));
        clickear(esperarPorElemento(btnDia14));
        clickear(esperarPorElemento(btnHuespedes));
        clickear(esperarPorElemento(btnSumar));
        clickear(esperarPorElemento(btnBusqueda));
    }
    public void CambiarVentana(){
        String ventanaActual = driver.getWindowHandle();
        System.out.println("ID de la ventana actual: " + ventanaActual);
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
    }
}
