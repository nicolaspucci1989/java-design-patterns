package creational.factoryMethod.products;

public class Truck implements Transport {
  public Truck() {
  }

  @Override
  public void deliver() {
    System.out.println("Delivering by truck");
  }
}
