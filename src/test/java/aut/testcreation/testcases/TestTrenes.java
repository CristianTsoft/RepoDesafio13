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
    private TrenesSearch trenessearch;
    private TrenesCheckout trenesCheckout;

    @BeforeEach
    public void preTest(){
        homepage = new HomePage(DriverFactory.getDriver());
        trenespage = new TrenesPage(homepage.getDriver());
        trenesresults = new TrenesResults(homepage.getDriver());
        trenessearch = new TrenesSearch(homepage.getDriver());
        homepage.navigateTo("https://www.rumbo.es");
        homepage.noCookies();
    }
    @Test
    public void rt001 () {
        homepage.irATrenes();
        trenespage.completarOrigenDestino("Madrid", "Barcelona");
        trenesresults.MasBarato();
    }

    @Test
    public void RT003() {/*Tren - Búsqueda de viaje fallida por destino no disponible*/
        homepage.irATrenes();
        trenespage.SoloIda();
        trenespage.completarOrigenDestino("Barcelona", "Logroño");
        //verificar que salga el mensaje de no encontrado
    }

    @Test
    public void RT004 (){/*Tren - Reserva fallida de pasaje por DNI alfanumérico*/
    }

    @Test
    public void RT005 (){/*Tren - Modificación a posteriori de los valores de búsqueda*/
        homepage.irATrenes();
        trenespage.completarOrigenDestino("Madrid", "Barcelona");
        //trenesresults.SeleccionarResultado();
        trenessearch.CambiarVentana();
        trenessearch.Modificar("Madrid", "Sevilla");
    }


    @Test
    public void rt002 () {
        homepage.irATrenes();
        trenespage.completarOrigenDestino("Madrid", "Barcelona");
        trenesresults.MasBarato();
    }
    @Test
    public void rt006 (){
        homepage.irATrenes();
        //trenespage.completarOrigenDestino("Madrid", "Barcelona");
        trenespage.SoloIda();
        trenesresults.SeleccionarResultado();
        trenespage.BusquedaSoloIda("Madrid" , "Barcelona");
        trenesresults.Unresultado();
        trenesCheckout.completarDatos("Cristian" , "Vargas" , "cristian.vargas@gmail.com" , "3804556677","Callao","350","5300","La Rioja"," Javier", " Fernandez","14", "1990");
        trenesCheckout.Facturacion("Cristian Vargas", "03", "25", "666");
    }
}
