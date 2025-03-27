package co.edu.umanizales.myfirstapi.controler;


import co.edu.umanizales.myfirstapi.model.Seller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.umanizales.myfirstapi.model.Location;

@RestController
@RequestMapping(path = "/seller")
public class SellerController {
    @GetMapping
    public String hello() {

        /// Instanciar 5 seller
        Location manizales = new Location("17001", "Manizales");
        Location pereira = new Location( "66001", "Pereira");
        Location barranquilla = new Location("08001", "Barranquilla");
        Location medellin = new Location("05001", "Medellin");
        Location pasto = new Location("52001", "Pasto");



        Seller seller1 = new Seller("101", "Juan", "Pérez", 'M', (byte) 30 , manizales);
        Seller seller2 = new Seller("102", "Peter", "Pan", 'M', (byte) 40, pereira);
        Seller seller3 = new Seller("103", "Oscar", "Acosta", 'M', (byte) 43, barranquilla);
        Seller seller4 = new Seller("104", "Maria", "Valencia", 'F', (byte) 54, medellin);
        Seller seller5 = new Seller("105", "Mariana", "Cifuentes", 'F', (byte) 27, pasto);
        return "vendedores creados correctamente";
    }
}