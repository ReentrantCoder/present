##Proxy

####What is a Proxy?
A proxy acts as stand-in for the real thing. The proxy design pattern has a 
variety of advantageous applications. A remote proxy can create a local copy
of a remote subject so that your system can more easily interact with it.
A virtual copy can use a skeleton representation or lazy initialization to delay loading of expensive subjects.
A protection proxy can ensure safety and control when accessing the subject.
A smart proxy, like a logger, can provide additional features when accessing a subject.

There are many real world analogies to the proxy pattern. An assitant might act as a virutal proxy
for a CEO because the CEO's time is more valuable. A bodyguard might act as a protection proxy
by controlling access to a VIP.

####In UML

Below is the UML diagram for proxy. Notice how it bears a striking resemblance to the
UML diagram for composite? The client only needs to know how to interact with the abstract Subject class.
The Proxy and RealSubject class both inherit from the Subject class. Proxy delegates 
commands to the RealSubject. Proxy's Subject, Proxy, and RealSubject classes are analogous
to composite's Component, Composite, and Leaf classes, respectively. The only thing that
is missing in the proxy pattern that is in composite pattern is the one-to-many composition relationship.

This diagram shows us that the client knows how to interface with both the proxy and the real subject.
But in actuality, the client will only send commands to the proxy. Then the proxy will relay those
commands to the real subject if necessary.

![Proxy!](https://github.com/trekbaum/present/blob/master/sdp/resourses/proxy.png "Proxy UML")

####Code Example

Below is a code example for a virtual proxy. Let's compare it to the UML diagram above.
The Image interface is the Subject. The RealImage class is the RealSubject.
The ProxyImage class is the Proxy. And ProxyExample is the Client.

We can see that the ProxyImage class supports lazy initialization by initializing
its image attribute to null. But once the client asks the proxy for the image, the
proxy checks to see if the image is there. If the image is there, the proxy returns it.
If not, the proxy will then finally initialize the image. 

In this example, the proxy pattern will help save memory by preventing unneccessary
loading of the images. Look at the order in which the client calls the displayImage
method. The client asks for IMAGE1 first. Because this has not been initialized yet,
the proxy will load it. Then the client asks for IMAGE1 again. But because this has
already been initialized, the proxy does not need to load it again. This saves
unnecessary use of memory.

```
interface Image {
    public void displayImage();
}

//on System A 
class RealImage implements Image {

    private String filename = null;
    /**
     * Constructor
     * @param filename
     */
    public RealImage(final String filename) { 
        this.filename = filename;
        loadImageFromDisk();
    }

    /**
     * Loads the image from the disk
     */
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    /**
     * Displays the image
     */
    public void displayImage() { 
        System.out.println("Displaying " + filename); 
    }

}

//on System B 
class ProxyImage implements Image {

    private RealImage image = null;
    private String filename = null;
    /**
     * Constructor
     * @param filename 
     */
    public ProxyImage(final String filename) { 
        this.filename = filename; 
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        if (image == null) {
           image = new RealImage(filename);
        } 
        image.displayImage();
    }

}

class ProxyExample {

   /**
    * Test method
    */
   public static void main(String[] args) {
        final Image IMAGE1 = new ProxyImage("HiRes_10MB_Photo1");
        final Image IMAGE2 = new ProxyImage("HiRes_10MB_Photo2");
        
        IMAGE1.displayImage(); // loading necessary
        IMAGE1.displayImage(); // loading unnecessary
        IMAGE2.displayImage(); // loading necessary
        IMAGE2.displayImage(); // loading unnecessary
        IMAGE1.displayImage(); // loading unnecessary
    }

}
```


####Next Steps
Let's explore our last remaining pattern for this presentation.
[It's the flyweight pattern](https://github.com/trekbaum/present/blob/master/sdp/flyweight.md)

Or return to the [table of contents.](https://github.com/trekbaum/present/blob/master/sdp/README.md)
