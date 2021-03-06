public interface Duck {
   public void quack();
   public void fly();
}

public class MallardDuck implements Duck {
   public void quack() {
      System.out.println("Quack");
   }
   
   public void fly() {
      System.out.println("I'm flying");
   }
}

public interface Turkey {
   public void gobble():
   public void fly();
}

public class WildTurkey implements Turkey {
   public void gobble() {
      System.out.println("Gobble gobble");
   }
   
   public void fly() {
      System.out.println("I'm flying a short distance");
   }
}

public class TurkeyAdapter implements Duck {
   Turkey turkey
   
   public TurkeyAdapter(Turkey turkey) {
      this.turkey = turkey;
   }
   
   public void quack() {
      turkey.gobble();
   }
   
   public void fly() {
      for(int i=0; i < 5; i++) {
         turkey.fly();
      }  
   }
}

public class DuckTestDrive {
   public static void main(String[] args) {
      MallardDuck duck = new MallardDuck();
      
      WildTurkey turkey = new Turkey();
      Duck turkeyAdapter = TurkeyAdapter(turkey);
      
      System.out.println("The Turkey says...");
      turkey.gobble();
      turkey.fly();
      
      System.out.println("\nThe Duck says...");
      duck.quack();
      duck.fly();
      
      System.out.println("\nThe TurkeyAdapter says...");
      turkeyAdapter.quack();
      turkeyAdapter.fly();
   }
}
