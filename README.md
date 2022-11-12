### Factory Method
The Abstract creator has some core business logic related to products.    
This pattern helps to decouple business logic, present in the abstract creator, from product creation, present in concrete creators.

### Abstract Factory
This pattern is usefulle when our code need to work with various families of related products, but we dont want it
to depend of concrete classes of tose products. They might be unknown, or we need extensibility.


### Factory Method vs Abstract Factory
**Facotory Method** is just a method, there is some other business logic in the object.
Is **Abstract Factory** there is an entier object responsible for product creation. 