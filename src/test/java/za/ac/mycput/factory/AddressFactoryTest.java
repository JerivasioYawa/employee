package za.ac.mycput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.mycput.domain.Address;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AddressFactoryTest {
    private Address address = AddressFactory.createAdress("128", "Molefe", "7800", "Cape Town", "Western Cape", "South Africa");

    @Test
    @Order(2)
    void createAdress() {
        System.out.println("2" +address);
       // assertNotNull(address);
    }
    @Test
    @Order(3)
    void setStreetNumber(){
        address.setStreetNumber("3b");
        System.out.println("3"+address);
    }
    @Test
    @Order(1)
    void setAddress(){
        address.setStreetName("Mandela");
        System.out.println("1"+address);
    }
}