package aut.testcreation.testcases;

import aut.testcreation.pages.*;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class TestVuelos extends SeleniumTestBase {

    private HomePage homepage;
    private VuelosPage vuelospage;
    private VuelosResults vuelosresults;
    private VuelosFlex vuelosFlex;
    private VuelosCheckout vuelosCheckout;

    @BeforeEach
    public void preTest(){
        homepage = new HomePage(DriverFactory.getDriver());
        vuelospage = new VuelosPage(homepage.getDriver());
        vuelosresults = new VuelosResults(homepage.getDriver());
        vuelosFlex = new VuelosFlex(homepage.getDriver());
        vuelosCheckout = new VuelosCheckout(homepage.getDriver());
        homepage.navigateTo("https://www.rumbo.es");
        homepage.noCookies();
    }
    @Test
    public void RV001 () {
        homepage.irAVuelos();
        vuelospage.completarOrigenDestino("Barcelona", "Roma");
        vuelosresults.MasBarato();
    }

    @Test
    public void RV002 () throws InterruptedException {
        homepage.irAVuelos();
        vuelosresults.pasajesMaximos("Madrid", "Buenos Aires");
    }

    @Test
    public void RV004 () throws InterruptedException {
        homepage.irAVuelos();
        vuelospage.completarOrigenDestino("Barcelona", "Roma");
        vuelosresults.Unresultado();
        vuelosFlex.Flexible();


    }

    @Test
    public void RV006 (){
        homepage.irAVuelos();
        vuelospage.BusquedaSoloIda("Barcelona" , "Roma");
        vuelosresults.Unresultado();
        vuelosFlex.Flexible();
        vuelosCheckout.completarDatos("Cristian" , "Vargas" , "##%%@gmail.com" , "3804556677","Callao","350","5300","La Rioja"," Javier", " Fernandez","15", "enero", "1998");
    }


    



}