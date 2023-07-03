package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static framework.engine.utils.Constants.BASE_URL_AUT;


public class HomePage extends SeleniumWrapper {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    //Localizadores

    By locatorNoCookies = By.xpath("//button[@class='iubenda-cs-reject-btn iubenda-cs-btn-primary']");
    By btnVuelos = By.xpath("//div[@class='d-1ytebqy e10w470p3']//a[@title='Vuelos'][normalize-space()='Vuelos']");
    By btnHoteles = By.xpath("//div[@class='d-1ytebqy e10w470p3']//a[@title='Hoteles'][normalize-space()='Hoteles']");
    By btnTrenes = By.xpath("//div[@class='d-1ytebqy e10w470p3']//a[@title='Trenes'][normalize-space()='Trenes']");


    //Métodos

    public void noCookies(){
        clickear(esperarPorElemento(locatorNoCookies));
    }
    public void irAVuelos(){
        clickear(esperarPorElemento(btnVuelos));
    }
    public void irAHoteles(){
        clickear(esperarPorElemento(btnHoteles));
    }
    public void irATrenes(){
        clickear(esperarPorElemento(btnTrenes));
    }

    public void IngresarARumbo(){
        navigateTo(BASE_URL_AUT);

    }





}
