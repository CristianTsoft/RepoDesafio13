package aut.testcreation.testcases;
import aut.testcreation.pages.*;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestTrenes extends SeleniumTestBase {
    private HomePage homepage;
    private TrenesPage trenespage;
    private TrenesResults trenesresults;
    private TrenesSearch trenessearch;
    private TrenesCheckout trenesCheckout;

    @BeforeEach
    public void preTest(){
        homepage = new HomePage(DriverFactory.getDriver());
        trenespage = new TrenesPage(homepage.getDriver());
        trenesresults = new TrenesResults(homepage.getDriver());
        trenessearch = new TrenesSearch(homepage.getDriver());
        trenesCheckout = new TrenesCheckout(homepage.getDriver());
        homepage.navigateTo("https://www.rumbo.es");
        homepage.noCookies();
    }

    //Búsqueda con cantidad máxima de pasajes
    @Test
    public void rt001 () {
        homepage.irATrenes();
        trenesresults.pasajesMaximos("Madrid", "Barcelona");
    }

    //Búsqueda de viaje de menor precio
    @Test
    public void rt002 () {
        homepage.irATrenes();
        trenespage.completarOrigenDestino("Madrid", "Barcelona");
        trenesresults.MasBarato();
    }

    @Test
    public void RT003() {/*Tren - Búsqueda de viaje fallida por destino no disponible*/
        homepage.irATrenes();
        trenespage.SoloIda();
        trenespage.completarOrigenDestino("Barcelona", "Logroño");
    }

    @Test
    public void RT004 (){/*Tren - Reserva fallida de pasaje por DNI alfanumérico*/
         homepage.irATrenes();
         trenespage.completarOrigenDestino("Madrid" , "Barcelona");
         trenesresults.Unresultado();
         trenessearch.CambiarVentana();
         trenesCheckout.completarDatos("Haimes","Robles","tsoftlatam@gmail.com","3804556694","Juis","Bolivar","22","1993","445AB333");
    }

    @Test
    public void RT005 (){/*Tren - Modificación a posteriori de los valores de búsqueda*/
        homepage.irATrenes();
        trenespage.completarOrigenDestino("Madrid", "Barcelona");
        trenesresults.modificacionFiltros("Ciudad Real");

    }

    @Test
    public void RT006 (){/*Tren - Reserva fallida de pasaje por DNI alfanumérico*/
        homepage.irATrenes();
        trenespage.completarOrigenDestino("Madrid" , "Barcelona");
        trenesresults.Unresultado();
        trenessearch.CambiarVentana();
        trenesCheckout.completarDatos("Haimes","Robles","tsoftlatam@gmail.com","3804556694","Juis","Bolivar","22","1993","44533333");
        trenesCheckout.clickNextFac();
    }

}
