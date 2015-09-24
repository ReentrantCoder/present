##Activity Diagrams

####What is an Activity Diagram?


####Learning by Example

Let's look at a basic non-sensical java program and its accociated activity diagram. We'll break it down piece-by-piece to learn what each piece of the diagram means.

```
public class slide2 {

   public static int method1(int x, int y) {
      return x + y;
   }

   public static int method2(int x, int y) {
      return x - y;
   }

   public static void main(String[] args) {
      if (args.length != 2)   { 
         System.out.println("Requires two int inputs");
         return; 
         }
      try {
         int firstArg  = Integer.parseInt(args[0]);
         int secondArg = Integer.parseInt(args[1]);
         if ( firstArg < secondArg ) {
             int temp  = firstArg;
             firstArg  = secondArg;
             secondArg = temp;
          }
          int out1 = method1(firstArg, secondArg);
          int out2 = method2(firstArg, secondArg);
          int out  = out1 + out2;
          System.out.println("Two times the larger input is " + out);
          return;
      } catch (NumberFormatException e) {
         System.out.println("Requires two int inputs");
         System.exit(1);
      }      
   }
}
```

![Activity!](https://github.com/trekbaum/present/blob/master/uml/resourses/activity.jpeg "Example Activity Diagram")
