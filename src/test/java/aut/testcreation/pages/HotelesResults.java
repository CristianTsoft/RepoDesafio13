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

    By btnTipoHotel = By.xpath("//li[@id='exp_elem_accomodation_type_1']//*[name()='svg']//*[name()='rect' and contains(@width,'18')]");

    By btnValoracion = By.xpath("//div[@id='Pill-RatingContainer']");

    By btnExcelente = By.xpath("//li[@id='exp_elem_rating_excellent']//*[name()='svg']//*[name()='rect' and contains(@width,'18')]");

    By btnResultado = By.cssSelector("body > div:nth-child(1) > main:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > a:nth-child(4) > span:nth-child(1)");

    By btnServicios = By.xpath("//div[@id='Pill-FacilitiesContainer']");

    By btnWifi = By.xpath("//li[@id='exp_elem_accomodation_facilities_0']//*[name()='svg']//*[name()='rect' and contains(@width,'18')]");

    By btnPiscina = By.xpath("//li[@id='exp_elem_accomodation_facilities_4']//*[name()='svg']//*[name()='rect' and contains(@width,'18')]");

    public void Estrellas() throws InterruptedException {

        Thread.sleep(5000);

        clickear(esperarPorElemento(btnEstrellas));

        Thread.sleep(5000);

        clickear(esperarPorElemento(checkEstrellas));

        Thread.sleep(5000);

        clickear(esperarPorElemento(btnAplicar));

        Thread.sleep(2000);

    }


    public void motel() throws InterruptedException {

        Thread.sleep(5000);

        clickear(esperarPorElemento(btnAlojamiento));

        Thread.sleep(5000);

    }


    public void huespedes(String lugar) throws InterruptedException {

        Thread.sleep(5000);

        clickear(esperarPorElemento(btnUbicacion));

        Thread.sleep(5000);

        agregarTexto(esperarPorElemento(btnUbicacion), lugar);

        Thread.sleep(5000);

        clickear(esperarPorElemento(btnHuespedes));

        Thread.sleep(5000);

        for (int i = 0; i < 8; i++) {

            clickear(esperarPorElemento(btnSumar));

        }

        Thread.sleep(5000);

        clickear(esperarPorElemento(btnBusqueda));

        Thread.sleep(2000);

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
    public void SeleccionarResultado() throws InterruptedException{
        Thread.sleep(5000);
        clickear(esperarPorElemento(btnResultado));
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
}


