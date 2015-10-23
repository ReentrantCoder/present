##Flyweight

####What is a Flyweight?
The flyweight design is a way of saving memory in a system by sharing as much data as possible among other similar objects.
This might sound similar to singleton to you. But this goes slightly beyond singleton by allowing minor modifications of the
state between repetitions. Because the flyweight object is shared amongst uses, it must be immutable.

In order to encapsulate what changes, we divide the flyweight object into two parts. The state-independent part is stored in the flyweight. This is intrinsic and immutable. The state-dependent part is handled by the client and must be passed to the flyweight. This is extrinsic and changes.

When you use a glyph object in a word processor, you are using flyweight. The glyph that you see is only actually a reference
to the glyph object in memory. Thus only its position needs to be stored and not the actual glyph object. In this example, the glyph is the state-independent part, and the position is the state-dependent part.

####In UML

Below is a UML diagram for flyweight. The client needs to know how to call the concrete flyweight's method so that the client can pass the extrinsic state. The factory contains precautions to ensure that no redundant intrisic states are made and to control the production of the flyweights. A factory method is a creational design pattern.

![Flyweight!](https://github.com/trekbaum/present/blob/master/sdp/resourses/flyweight.png "Flyweight UML")

####Code Example

This code is difficult to map to the UML diagram for flyweight, but it is definitely
using flyweight. The Order class is the concrete flyweight. Its state-independent part
is the Coffeeflavor class. We can see that the Menu class acts as a factory to
ensure that only one of each Coffeeflavor is created. Order's state-dependent part
is the table number.

```
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

// Instances of CoffeeFlavour will be the Flyweights
class CoffeeFlavour {
  private final String name;

  CoffeeFlavour(String newFlavor) {
    this.name = newFlavor;
  }

  @Override
  public String toString() {
    return name;
  }
}

// Menu acts as a factory and cache for CoffeeFlavour flyweight objects
class Menu {
  private Map<String, CoffeeFlavour> flavours = new ConcurrentHashMap<String, CoffeeFlavour>();

  CoffeeFlavour lookup(String flavorName) {
    if (!flavours.containsKey(flavorName))
      flavours.put(flavorName, new CoffeeFlavour(flavorName));
    return flavours.get(flavorName);
  }

  int totalCoffeeFlavoursMade() {
    return flavours.size();
  }
}

class Order {
  private final int tableNumber;
  private final CoffeeFlavour flavour;

  Order(int tableNumber, CoffeeFlavour flavor) {
    this.tableNumber = tableNumber;
    this.flavour = flavor;
  }

  void serve() {
    System.out.println("Serving " + flavour + " to table " + tableNumber);
  }
}

public class CoffeeShop {
  private final List<Order> orders = new Vector<Order>();
  private final Menu menu = new Menu();

  void takeOrder(String flavourName, int table) {
    CoffeeFlavour flavour = menu.lookup(flavourName);
    Order order = new Order(table, flavour);
    orders.add(order);
  }
  
  void service() {
    for (Order order : orders) {
      order.serve();
      orders.remove(order);    
    }
  }
  
  String report() {
    return "\ntotal CoffeeFlavour objects made: "
        + menu.totalCoffeeFlavoursMade();
  }

  public static void main(String[] args) {
    CoffeeShop shop = new CoffeeShop();

    shop.takeOrder("Cappuccino", 2);
    shop.takeOrder("Frappe", 1);
    shop.takeOrder("Espresso", 1);
    shop.takeOrder("Frappe", 897);
    shop.takeOrder("Cappuccino", 97);
    shop.takeOrder("Frappe", 3);
    shop.takeOrder("Espresso", 3);
    shop.takeOrder("Cappuccino", 3);
    shop.takeOrder("Espresso", 96);
    shop.takeOrder("Frappe", 552);
    shop.takeOrder("Cappuccino", 121);
    shop.takeOrder("Espresso", 121);

    shop.service();
    System.out.println(shop.report());
  }
}
```

####Next Steps
Let's conclude by [reviewing what we've covered.](https://github.com/trekbaum/present/blob/master/sdp/conclusion.md)

Or return to the [table of contents.](https://github.com/trekbaum/present/blob/master/sdp/README.md)
