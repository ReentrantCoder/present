##Decorator

####What is a Decorator?
The decorator pattern is a way of preventing exponential class growth when a system implements classes that can be augmented. By dividing the system into base classes and augmentation classes, we can pick decorations at runtime instead of having to statically implement classes for every possible combination. The decorator design helps with code maintainability by execersing the open-close principle. Because the classes are seperate, we would only need to modify one class as opposed to all the static classes that use that have the modified class in its combination.

For example, if you were implementing a coffee system with condiments. You wouldn't make SoyMochaLatte, SoyLatte, MochaLatte, and Latte class. It makes much more sense to use the decorator to implement Soy, Mocha, and Latte seperately. This will make it easier to add an Espresso class later because we won't have to add SoyEspresso, etc. as well.

####In UML
The figure below shows the quintessential decorator design. Component and Decorator are abstract classes with concrete subclasses. Because Decorator inherits from Component, we know that by decorating a concrete component object with a concrete decorator object the resulting object is still a component object. We can obtain increasing levels of complexity by wrapping component objects with more decorators.

Notice that the component, concrete component, and decorator classes form a composite design pattern within the decorator pattern.

![Decorator!](https://github.com/trekbaum/present/blob/master/sdp/resourses/decorator.png "Decorator UML")

####Code Example
In our example below, we make a Mocha HouseBlend object. Let's compare this code to the UML diagram above. The Beverage class is the abstract component. The HouseBlend class is a concrete component. The CondimentDecorator class is the abstract decorator. The Mocha class is a concrete decorator. The StarbuzzCoffe class is the client.

We start by instantiating a Houseblend object. This has its own description and cost. We then can wrap it with the Mocha decorator to make a new beverage object. This overrides the description and cost to account that it is now a MochaHouseBlend object instead of just a HouseBlend object. We could continue to wrap with extra Mocha decorators if desired.

This code example is open to extension from other component classes like espresso or to extension from other decorator class like soy. Simply add that class and wrap as desired at runtime. No need to modify the previously existing HouseBlend or Mocha classes.

```
public abstract class Beverage {
   String description = "Unknown Beverage";
   
   public String getDescription() {
      return description;
   }
   
   public abstract double cost();
}

public abstract class CondimentDecorator extends Beverage {
   public abstract String getDescription();
}

public class HouseBlend extends Beverage {
   public HouseBlend() {
      description = "House Blend Coffee";
   }
   
   public double cost() {
      return .89;
   }
}

public class Mocha extends CondimentDecorator {
   Beverage beverage;
   
   public Mocha(Beverage beverage) {
      this.beverage = beverage;
   }
   
   public String getDescription() {
      return beverage.getDescription() + ", Mocha";
   }
   
   public double cost() {
      return .20 + beverage.cost();
   }
}

public class StarbuzzCoffee {

   public static void main(String args[]) {
      Beverage beverage = new HouseBlend();
      System.out.println(beverage.getDescription() + " $" + beverage.cost());
      
      beverage = new Mocha(beverage);
      System.out.println(beverage.getDescription() + " $" + beverage.cost());
   }
}
```


####Next Steps
[Let's continue with the flyweight pattern](https://github.com/trekbaum/present/blob/master/sdp/flyweight.md)

Or return to the [table of contents.](https://github.com/trekbaum/present/blob/master/sdp/README.md)
