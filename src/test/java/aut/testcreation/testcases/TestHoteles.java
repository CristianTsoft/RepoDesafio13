package aut.testcreation.testcases;

import aut.testcreation.pages.HomePage;
import aut.testcreation.pages.HotelesPage;
import aut.testcreation.pages.HotelesResults;
import aut.testcreation.pages.HotelesSearch;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Test;


public class TestHoteles extends SeleniumTestBase {

    private HomePage homepage;
    private HotelesPage hotelesPage;
    private HotelesResults hotelesresults;
    private HotelesSearch hotelessearch;
    @Test
    public void rh001 () throws InterruptedException {
        homepage = new HomePage(DriverFactory.getDriver());
        hotelesPage = new HotelesPage(homepage.getDriver());
        homepage.navigateTo("https://www.rumbo.es");
        homepage.noCookies();
        homepage.irAHoteles();
        hotelesPage.completarBusqueda("Roma,Italia");
        hotelesPage.Estrellas();
    }

    @Test
    public void rh002 () throws InterruptedException {
        homepage = new HomePage(DriverFactory.getDriver());
        hotelesPage = new HotelesPage(homepage.getDriver());
        homepage.navigateTo("https://www.rumbo.es");
        homepage.noCookies();
        homepage.irAHoteles();
        hotelesPage.completarBusqueda("Roma,Italia");
        hotelesPage.motel();
    }

    @Test
    public void rh003 () throws InterruptedException {
        homepage = new HomePage(DriverFactory.getDriver());
        hotelesPage = new HotelesPage(homepage.getDriver());
        homepage.navigateTo("https://www.rumbo.es");
        homepage.noCookies();
        homepage.irAHoteles();
        hotelesPage.huespedes("Roma,Italia");
    }

    @Test
    public void rh004 () throws InterruptedException {
        homepage = new HomePage(DriverFactory.getDriver());
        hotelesPage = new HotelesPage(homepage.getDriver());
        hotelesresults = new HotelesResults(homepage.getDriver());
        hotelessearch = new HotelesSearch(homepage.getDriver());
        homepage.navigateTo("https://www.rumbo.es");
        homepage.noCookies();
        homepage.irAHoteles();
        hotelesPage.completarBusqueda("Madrid");
        hotelesresults.Filtros();
        hotelesresults.SeleccionarResultado();
        hotelessearch.Modificar();
    }
//Hay que conseguir id Ventana

    @Test
    public void rh005 () throws InterruptedException {
        homepage = new HomePage(DriverFactory.getDriver());
        hotelesPage = new HotelesPage(homepage.getDriver());
        hotelesresults = new HotelesResults(homepage.getDriver());
        hotelessearch = new HotelesSearch(homepage.getDriver());
        homepage.navigateTo("https://www.rumbo.es");
        homepage.noCookies();
        homepage.irAHoteles();
        hotelesPage.completarBusqueda("Madrid");
        hotelesresults.Filtros2();
    }
    @Test
    public void rh006 () throws InterruptedException {
        homepage = new HomePage(DriverFactory.getDriver());
        hotelesPage = new HotelesPage(homepage.getDriver());
        homepage.navigateTo("https://www.rumbo.es");
        homepage.noCookies();
        homepage.irAHoteles();
        hotelesPage.Habitaciones("Roma");
    }
}