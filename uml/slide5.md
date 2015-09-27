##Design Patterns in UML

####Scope of this Slide

For this presentation, I will not explain design patterns. That is the topic of
another student's presentation. I will only provide proof of concept that 
design patterns can be clearly expressed in UML. I will only demonstrate UML
on a couple of design patterns because there are too many to cover in this 
presentation.

I have taken examples from Source Making (https://sourcemaking.com/design_patterns) to make this slide.

####Singleton in UML

A singleton is a design pattern in which we only want one instance of an object. We can accomplish this by making a class that has only one public static method to instantiate the singleton. That way once a client checkouts out the singleton, another client can't do the same. The class diagram is given below.

![Singleton](https://github.com/trekbaum/present/blob/master/uml/resourses/singleton.png "Singleton")

####Command in UML

The command pattern allows encapsulates requests as objects. This allows clients to be parameterized with different requests. The example below is a common occurence of command. At a restaurant, a waiter will take your order as a command by writing it on a slip of paper. This paper can contain the unique parameters of that customers order. When the paper slip object is passed to the cook, it allows him or her to carry out the command. The sequence diagram is given below.

![Command](https://github.com/trekbaum/present/blob/master/uml/resourses/command.png "Command")

####Next Steps
Let's conclude by [reviewing what we've covered.](https://github.com/trekbaum/present/blob/master/uml/slide6.md)

Or return to the [table of contents.](https://github.com/trekbaum/present/blob/master/uml/README.md)
