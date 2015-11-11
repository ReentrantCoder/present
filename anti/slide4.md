##Poltergeist

####What is a poltergeist?
The poltergeist antipattern is when a class doesn't do enough.
It's when a class usually stateless pops in for a quick moment to invoke a method in some
other permanent class. The classic example of this is a start up class.
The poltergeist pops in to spring to life the other permanent class, and then the 
poltergeist is never seen again.

Poltergeist add unnecessary complexity and resource utilization.

####UML Example

In this example, the Peach Canner Controller class is the poltergeist. It has
no state of its own. It exist only to start up all the other processes that it
is redundantly connected to.

![Poltergeist!](https://github.com/trekbaum/present/blob/master/anti/resources/poltergeist.png "Poltergeist UML")

Unfortunately, the poltergeist is too strongly coupled to just remove. The system
would no longer work. But we can restructure the system to turn the poltergeist
into a legitimate coordinator class. By doing so, we impose a good object-oriented
hierarchy.

![Poltergeist!](https://github.com/trekbaum/present/blob/master/anti/resources/poltergeist2.png "Poltergeist UML")

####Next Steps
[Let's continue with the next antipattern](https://github.com/trekbaum/present/blob/master/anti/slide5.md)

Or return to the [table of contents.](https://github.com/trekbaum/present/blob/master/anti/README.md)
