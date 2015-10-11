##Composite

####What is a Composite?
The composite pattern is used to manage collections of objects composed of identical components. This allows use to organize similar attributes and methods among the component and composite. 

If a bee is a bee object and swarm of bees is a collection of bee objects, then we say that the swarm composite is also a bee object. Because a bee can buzz, so too can a swarm of bees.


####In UML
The figure below shows the quintessential composite design. The client only needs to know how to interact with the component abstract class. But this allows it to interact just as well with the leaf and composite classes because they inherit from the component class. Notice empty diamond from composite to component. This represents their one to many composition relationship.

![Composite!](https://github.com/trekbaum/present/blob/master/sdp/resourses/composite.png "Composite UML")

####Code Example

```
/** "Component" */
interface Graphic {

    //Prints the graphic.
    public void print();
}

/** "Composite" */
import java.util.List;
import java.util.ArrayList;
class CompositeGraphic implements Graphic {

    //Collection of child graphics.
    private List<Graphic> childGraphics = new ArrayList<Graphic>();

    //Prints the graphic.
    public void print() {
        for (Graphic graphic : childGraphics) {
            graphic.print();
        }
    }

    //Adds the graphic to the composition.
    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    //Removes the graphic from the composition.
    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }
}

/** "Leaf" */
class Ellipse implements Graphic {

    //Prints the graphic.
    public void print() {
        System.out.println("Ellipse");
    }
}

/** Client */
public class Program {

    public static void main(String[] args) {
        //Initialize four ellipses
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

        //Initialize three composite graphics
        CompositeGraphic graphic = new CompositeGraphic();
        CompositeGraphic graphic1 = new CompositeGraphic();
        CompositeGraphic graphic2 = new CompositeGraphic();

        //Composes the graphics
        graphic1.add(ellipse1);
        graphic1.add(ellipse2);
        graphic1.add(ellipse3);

        graphic2.add(ellipse4);

        graphic.add(graphic1);
        graphic.add(graphic2);

        //Prints the complete graphic (four times the string "Ellipse").
        graphic.print();
    }
}
```


####Next Steps
The composite pattern helps form the next pattern. Now that we know the composite, we can learn the decorator pattern. [Let's continue with the decorator pattern](https://github.com/trekbaum/present/blob/master/sdp/decorator.md)

Or return to the [table of contents.](https://github.com/trekbaum/present/blob/master/sdp/README.md)
