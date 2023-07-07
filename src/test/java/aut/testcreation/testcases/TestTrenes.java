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
    public void rt006 (){
        homepage.irATrenes();
        trenespage.BusquedaSoloIda("Madrid" , "Barcelona");
        trenesresults.Unresultado();
        trenesCheckout.completarDatos("Cristian" , "Vargas" , "cristian.vargas@gmail.com" , "3804556677","Callao","350","5300","La Rioja"," Javier", " Fernandez","14", "1990");
        trenesCheckout.Facturacion("Cristian Vargas", "03", "25", "666");
    }
}