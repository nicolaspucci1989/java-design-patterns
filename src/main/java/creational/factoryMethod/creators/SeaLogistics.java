package creational.factoryMethod.creators;

import creational.factoryMethod.products.Ship;
import creational.factoryMethod.products.Transport;

/**
 * Concrete creator class
 */
public class SeaLogistics extends Logistics {
  @Override
  public Transport createTransport() {
    return new Ship();
  }
}
