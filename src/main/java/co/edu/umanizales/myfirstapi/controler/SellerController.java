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
        Location city3 = new Location(3, "Barranquilla");
        Location city4 = new Location(4, "Medellin");
        Location city5 = new Location(5, "Pasto");



        Seller seller1 = new Seller("101", "Juan", "Pérez", 'M', (byte) 30 , manizales);
        Seller seller2 = new Seller("102", "Peter", "Pan", 'M', (byte) 40, pereira);
        Seller seller3 = new Seller("103", "Oscar", "Acosta", 'M', (byte) 43, city3);
        Seller seller4 = new Seller("104", "Maria", "Valencia", 'F', (byte) 54, city4);
        Seller seller5 = new Seller("105", "Mariana", "Cifuentes", 'F', (byte) 27, city5);
        return "vendedores creados correctamente";
    }
}