package creational.factoryMethod.products;

public class Truck implements Transport {
  public Truck() {
  }

  @Override
  public String deliver() {
    return "Delivering by truck";
  }
}
