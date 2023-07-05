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

    @BeforeEach
    public void preTest(){
        homepage = new HomePage(DriverFactory.getDriver());
        vuelospage = new VuelosPage(homepage.getDriver());
        vuelosresults = new VuelosResults(homepage.getDriver());
        vuelosFlex = new VuelosFlex(homepage.getDriver());
        homepage.navigateTo("https://www.rumbo.es");
        //Cerrar el cartel de cookies
        homepage.noCookies();
        //Hacer click en la pestaña "Vuelos"
    }
    @Test
    public void RV001 () {
        homepage.irAVuelos();
        //Escribir origen y destino
        vuelospage.completarOrigenDestino("Barcelona", "Roma");
        //Hacer click en el botòn "Mas barato"
        vuelosresults.MasBarato();
    }

    @Test
    public void RV002 () throws InterruptedException {
        homepage.irAVuelos();
        vuelosresults.pasajesMaximos("Madrid", "Buenos Aires");
    }

    @Test
    public void RV006 (){
        homepage.irAVuelos();
        vuelospage.BusquedaSoloIda("Barcelona" , "Roma");
        vuelosresults.Unresultado();
        vuelosFlex.Flexible();

    }
}