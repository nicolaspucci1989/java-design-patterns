package creational.factoryMethod.creators;

import creational.factoryMethod.products.Transport;

/**
 * Abstract creator class
 */
public abstract class Logistics {
  public void planDelivery() {
    System.out.println("Planning delivery...");
  }

  abstract public Transport createTransport();
}
