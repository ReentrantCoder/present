##Adapter

#### What is an Adapter?
An adapter takes a class or object coded towards one interface and converts it for use against another interface. The adapter pattern performs the exact same functionality as a physical adapter. Consider how a VGA-to-HDMI adapter converts between the two different video inputs. It's like that.

####In UML
The figure below is the class diagram from an object adapter. We can see that the adapter implements the target interface. This allows the client to use the interface that to which it is accustomed. Also, the adapter delegates to the adaptee. This allows the adapter to convert requests that it receives into a request that can be accepted by the adaptee.

![Adapter!](https://github.com/trekbaum/present/blob/master/sdp/resourses/adapter.png "Object Adapter UML")

####Code Example
In our example below, we wish to adapt a turkey object into the duck interface. Let's compare this with UML diagram above. The Turkey class is our adaptee. The TurkeyAdapter class is our adapter. The Duck interface is our target.



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
```

####Next Steps
The facade pattern is similar to adapter so [let's continue with the facade pattern](https://github.com/trekbaum/present/blob/master/sdp/facade.md)

Or return to the [table of contents.](https://github.com/trekbaum/present/blob/master/sdp/README.md)
