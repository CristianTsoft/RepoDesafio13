package aut.testcreation.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelesResults extends SeleniumWrapper {


    public HotelesResults(WebDriver driver) {

        super(driver);

    }


    By btnEstrellas = By.xpath("//div[@id='Pill-StarsContainer']");
    By checkEstrellas = By.xpath("//li[@id='exp_elem_hotel_stars_3']");
    By btnAplicar = By.xpath("//div[@class='sc-eZYOHW khSA-dJ']");
    By btnAlojamiento = By.xpath("//div[@id='Pill-PropertyTypeContainer']");
    By btnHuespedes = By.xpath("//button[@class='d-1k0nsg5']");
    By btnSumar = By.xpath("//button[@aria-label='Aumentar el número de adultos']");
    By btnUbicacion = By.xpath("//input[@id=':R8qjalalaqlql2mm:']");
    By btnBusqueda = By.xpath("//button[contains(@aria-label,'Buscar')]");
    By btnTipoHotel = By.xpath("//li[@id='exp_elem_accomodation_type_1']");
    By btnValoracion = By.xpath("//div[@id='Pill-RatingContainer']");
    By btnExcelente = By.xpath("//li[@id='exp_elem_rating_excellent']");
    By btnServicios = By.xpath("//div[@id='Pill-FacilitiesContainer']");
    By btnWifi = By.xpath("//li[@id='exp_elem_accomodation_facilities_0']");
    By btnPiscina = By.xpath("id='exp_elem_accomodation_facilities_4'");

    By locatorResultado = By.xpath("(//div[@class='sc-bTRovv hBqRjU'])[1]");

    public void Estrellas() throws InterruptedException {
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnEstrellas));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(checkEstrellas));
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnAplicar));
        esperarXSegundos(5000);
    }


    public void motel() throws InterruptedException {

        Thread.sleep(5000);

        clickear(esperarPorElemento(btnAlojamiento));

        Thread.sleep(5000);

    }


    public void huespedes(String lugar) {

        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnUbicacion));
        esperarXSegundos(5000);
        agregarTexto(esperarPorElemento(btnUbicacion), lugar);
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnHuespedes));
        esperarXSegundos(5000);
        for (int i = 0; i < 8; i++) {
            clickear(esperarPorElemento(btnSumar));
        }
        esperarXSegundos(5000);
        clickear(esperarPorElemento(btnBusqueda));
        esperarXSegundos(5000);
    }
    public void Filtros() throws InterruptedException {
        //Estrellas
        Thread.sleep(20000);
        Estrellas();
        //Tipo de alojamiento

        Thread.sleep(5000);
        clickear(esperarPorElemento(btnAlojamiento));
        Thread.sleep(5000);
        clickear(esperarPorElemento(btnTipoHotel));
        Thread.sleep(5000);
        clickear(esperarPorElemento(btnAplicar));
        Thread.sleep(2000);

        //Valoracion

        Thread.sleep(5000);
        clickear(esperarPorElemento(btnValoracion));
        Thread.sleep(5000);
        clickear(esperarPorElemento(btnExcelente));
        Thread.sleep(5000);
        clickear(esperarPorElemento(btnAplicar));
        Thread.sleep(2000);
    }

    public void Filtros2() throws InterruptedException {
        //Estrellas
        Thread.sleep(20000);
        Estrellas();
        //Tipo de alojamiento

        Thread.sleep(5000);
        clickear(esperarPorElemento(btnAlojamiento));
        Thread.sleep(5000);
        clickear(esperarPorElemento(btnTipoHotel));
        Thread.sleep(5000);
        clickear(esperarPorElemento(btnAplicar));
        Thread.sleep(2000);

        //Servicios

        Thread.sleep(5000);
        clickear(esperarPorElemento(btnServicios));
        Thread.sleep(5000);
        clickear(esperarPorElemento(btnWifi));
        Thread.sleep(5000);
        clickear(esperarPorElemento(btnPiscina));
        Thread.sleep(5000);
        clickear(esperarPorElemento(btnAplicar));
        Thread.sleep(2000);
    }

    public void selecResultado(){
        esperarXSegundos(5000);
        clickear(esperarPorElemento(locatorResultado));
        esperarXSegundos(5000);

    }
}


