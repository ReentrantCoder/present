##Adapter

#### What is an Adapter?
An adapter takes a class or object coded towards one interface and converts it for use against another interface. The adapter pattern performs the exact same functionality as a physical adapter. Consider how a VGA-to-HDMI adapter converts between the two different video inputs. It's like that.

####In UML
![Adapter!](https://github.com/trekbaum/present/blob/master/sdp/resourses/adapter.png "Object Adapter UML")

####Code Example

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
