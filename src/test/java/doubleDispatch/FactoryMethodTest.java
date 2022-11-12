package doubleDispatch;


import creational.factoryMethod.creators.SeaLogistics;
import creational.factoryMethod.products.Transport;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FactoryMethodTest {
    SeaLogistics seaLogistics = new SeaLogistics();

    @Test
    @DisplayName("Create ship factory")
    public void createShipFactory() {
        Transport transport = seaLogistics.createTransport();
        String deliver = transport.deliver();
        Assertions.assertEquals("Delivering by ship", deliver);
    }
}
