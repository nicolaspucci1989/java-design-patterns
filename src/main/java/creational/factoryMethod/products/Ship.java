package creational.factoryMethod.products;

public class Ship implements Transport{
  public Ship() {
  }

  @Override
  public void deliver() {
    System.out.println("Delivering by ship");
  }
}
