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
    @BeforeEach
    public void preTest(){
        homepage = new HomePage(DriverFactory.getDriver());
        trenespage = new TrenesPage(homepage.getDriver());
        trenesresults = new TrenesResults(homepage.getDriver());
        homepage.navigateTo("https://www.rumbo.es");
        homepage.noCookies();
    }
    @Test
    public void RT003() {
        homepage.irATrenes();
        trenespage.SoloIda();
        trenespage.completarOrigenDestino("Barcelona", "Logroño");
        //verificar que salga el mensaje de no encontrado
    }

    @Test
    public void rt002 () {
        homepage.irATrenes();
        trenespage.completarOrigenDestino("Madrid", "Barcelona");
        trenesresults.MasBarato();
    }
    @Test
    public void rt006 () {
        homepage.irATrenes();
        trenespage.completarOrigenDestino("Madrid", "Barcelona");
        trenespage.SoloIda();
        trenesresults.SeleccionarResultado();
    }
}
