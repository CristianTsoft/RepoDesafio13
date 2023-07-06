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

    //Metodos
    public void Modificar(){
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnModificar));
        esperarXSegundos(5000);

    }
}
