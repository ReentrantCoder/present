##Adapter

#### What is an Adapter?
An adapter takes a class or object coded towards one interface and converts it for use against another interface. The adapter pattern performs the exact same functionality as a physical adapter. Consider how a VGA-to-HDMI adapter converts between the two different video inputs. It's like that.

####In UML
The figure below is the class diagram from an object adapter. We can see that the adapter implements the target interface. This allows the client to use the interface that to which it is accustomed. Also, the adapter delegates to the adaptee. This allows the adapter to convert requests that it receives into a request that can be accepted by the adaptee.

![Adapter!](https://github.com/trekbaum/present/blob/master/sdp/resourses/adapter.png "Object Adapter UML")

####Code Example
In our example below, we wish to adapt a turkey object into the duck interface. Let's compare this with UML diagram above. The Turkey class is our adaptee. The TurkeyAdapter class is our adapter. The Duck interface is our target. The DuckTestDrive is our cleint.

Adapting can many different forms and is specific to the application. For example, a quack is simply a gobble that a duck makes. Thus to adapt, we delegate a quack request to a gobble request. But even though flying has the same request name between a duck and a turkey, the implementation is totally different. Ducks can fly far, but turkeys can only fly short distances. In this case, we need to rework the implementation to adapt properly. In this example, a duck fly request is adapt into 5 turkey fly requests to compensate for the distance.

Because we have successfully implemented the turkey adapter, a client can instantiate a new duck object that is just an adapted turkey. The client can make quack and fly requests to the new duck object and the turkey adapter will convert them into requests that are handled by the turkey adaptee. The client can interact with the turkey adapter in the exact same way the client would interact with a mallard duck object.

```
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
```

####Next Steps
The facade pattern is similar to adapter so [let's continue with the facade pattern](https://github.com/trekbaum/present/blob/master/sdp/facade.md)

Or return to the [table of contents.](https://github.com/trekbaum/present/blob/master/sdp/README.md)
