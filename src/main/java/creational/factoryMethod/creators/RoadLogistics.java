package creational.factoryMethod.creators;

import creational.factoryMethod.products.Transport;
import creational.factoryMethod.products.Truck;

/**
 * Concrete creator class
 */
public class RoadLogistics extends Logistics{
  @Override
  public Transport createTransport() {
    return new Truck();
  }
}
