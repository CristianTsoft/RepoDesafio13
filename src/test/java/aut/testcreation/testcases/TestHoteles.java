package aut.testcreation.testcases;

import aut.testcreation.pages.HomePage;
import aut.testcreation.pages.HotelesPage;
import aut.testcreation.pages.HotelesResults;
import aut.testcreation.pages.HotelesSearch;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestHoteles extends SeleniumTestBase {

    private HomePage homepage;
    private HotelesPage hotelesPage;
    private HotelesSearch hotelessearch;
    private HotelesResults hotelesResults;


    @BeforeEach
    public void preTest(){
        homepage = new HomePage(DriverFactory.getDriver());
        hotelesPage = new HotelesPage(homepage.getDriver());
        hotelesResults = new HotelesResults(homepage.getDriver());
        hotelessearch = new HotelesSearch(homepage.getDriver());
        homepage.navigateTo("https://www.rumbo.es");
        homepage.noCookies();
    }


   
    @AfterEach
    public void posTest(){
        // driver.close();
    }

    @Test
    public void rh001 () throws InterruptedException {
        homepage.irAHoteles();
        hotelesPage.completarBusqueda("Roma,Italia");
        hotelesResults.Estrellas();
    }

    @Test
    public void rh002 () throws InterruptedException {
        homepage.irAHoteles();
        hotelesPage.completarBusqueda("Roma,Italia");
        hotelesResults.motel();
    }

    @Test
    public void rh003 () throws InterruptedException {
        homepage.irAHoteles();
        hotelesResults.huespedes("Roma,Italia");
    }
    @Test
    public void rh004 () throws InterruptedException {
        homepage.irAHoteles();
        hotelesPage.completarBusqueda("Madrid");
        hotelesResults.Filtros();
        hotelesResults.selecResultado();
        hotelessearch.CambiarVentana();
        hotelessearch.Modificar();
    }
//Hay que conseguir id Ventana

    @Test
    public void rh005 () throws InterruptedException {
        homepage.irAHoteles();
        hotelesPage.completarBusqueda("Madrid");
        hotelesResults.Filtros2();
    }
    @Test
    public void rh006 () throws InterruptedException {
        homepage.irAHoteles();
        hotelesPage.Habitaciones("Roma");
    }
}