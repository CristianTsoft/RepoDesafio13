package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Multidestino extends SeleniumWrapper {

    public Multidestino(WebDriver driver) {
        super(driver);
    }

    By btnDestino1 = By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]");
    By btnDestino2 = By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]");

    By btnOpcionDestino = By.xpath("//div[contains(text(),'Madrid, España')]");
    By btnAñadirDestino = By.xpath("//div[contains(text(),'Añadir destino')]");

    By btnBuscar = By.xpath("//div[contains(text(),'Buscar')]");
    By locatorNoCookies = By.xpath("//button[@id='cookies_accept']//div[@class='ButtonPrimitiveContent__StyledButtonPrimitiveContent-sc-1nfggrh-0 fgxWQF']");
    By btnPasajeros = By.xpath("//body/div[@id='react-view']/div[@class='MainViewstyled__Container-sc-17vqwtc-0 fdeVjQ']/div[@id='SearchFormStickyBoundary']/div[@class='Box__StyledBox-sc-bvm5o6-0 iRlSkf']/div[@class='Box__StyledBox-sc-bvm5o6-0 hkCYyV']/div[@class='Stack__StyledStack-sc-53pobq-0 eQfZlS']/div[@class='Stack__StyledStack-sc-53pobq-0 lbIWRK']/div[@class='PassengersAndBagsFieldstyled__StyledPassengersField-sc-kasop6-0 jIWfvr']/div[@class='Popover__StyledPopoverChild-sc-te0bas-0 cLKCiR']/div[@class='ButtonWrapsstyled__ButtonTabletWrap-sc-zf781k-0 cCMLcD']/button[@type='button']/div[@class='ButtonPrimitiveContent__StyledButtonPrimitiveContent-sc-1nfggrh-0 cTwcGp']/div[@class='ButtonPrimitiveContentChildren__StyledButtonPrimitiveContentChildren-sc-mra4yy-0 NRXsW']/div[1]");
    By btnAñadirPasajero = By.xpath("//div[@data-test='PassengersRow-adults']//button[@aria-label='increment']//div[@class='ButtonPrimitiveIconContainer__StyledButtonPrimitiveIconContainer-sc-1bqiptv-0 fWaFsS']//*[name()='svg']");
    By btnConfirmar = By.xpath("//button[@class='ButtonPrimitive__StyledButtonPrimitive-sc-j8pavp-0 sKVkT']//div[@class='ButtonPrimitiveContent__StyledButtonPrimitiveContent-sc-1nfggrh-0 fgxWQF']");
    By btnReservar = By.xpath("(//class=ButtonPrimitive__StyledButtonPrimitive-sc-j8pavp-0 PaxoX)[1]");
    public void CambiarVentana(){
        String ventanaActual = driver.getWindowHandle();
        System.out.println("ID de la ventana actual: " + ventanaActual);
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
    }

    public void CompletarMultidestino(){
        CambiarVentana();
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnDestino1));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnOpcionDestino));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnAñadirDestino));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnDestino2));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnOpcionDestino));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnBuscar));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(locatorNoCookies));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnPasajeros));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnAñadirPasajero));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnConfirmar));
        esperarXSegundos(10000);
        clickear(esperarPorElemento(btnReservar));


    }






}
