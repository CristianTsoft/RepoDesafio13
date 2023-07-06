package aut.testcreation.testcases;

import aut.testcreation.pages.*;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestTrenes extends SeleniumTestBase {

    private HomePage homepage;
    private TrenesPage trenespage;
    private TrenesResults trenesresults;
    private TrenesCheckout trenesCheckout;

    @BeforeEach
    public void preTest(){
        homepage = new HomePage(DriverFactory.getDriver());
        trenespage = new TrenesPage(homepage.getDriver());
        trenesresults = new TrenesResults(homepage.getDriver());
        homepage.navigateTo("https://www.rumbo.es");
        homepage.noCookies();
    }
    @Test
    public void rt002 () {
        homepage.irATrenes();
        trenespage.completarOrigenDestino("Madrid", "Barcelona");
        trenespage.Busqueda();
        trenesresults.MasBarato();
    }
    @Test
    public void rt006 () throws InterruptedException {
        homepage.irATrenes();
        trenespage.SoloIda();
        trenespage.completarOrigenDestino("Madrid", "Barcelona");
        trenespage.Busqueda();
        trenesresults.Unresultado();
        trenesCheckout.completarDatos("Dario" , "Marconi" , "marconidarioenrique@gmail.com" , "3804556677","pichana","322","5300","La Rioja"," Javier", " Fernandez","15", "enero", "1998");
        trenesCheckout.botonSiguiente();
    }
}