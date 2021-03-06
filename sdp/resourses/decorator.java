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
