package creational.factoryMethod.products;

public class Ship implements Transport{
  public Ship() {
  }

  @Override
  public String deliver() {
    return "Delivering by ship";
  }
}
