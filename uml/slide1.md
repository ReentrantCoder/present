##Introduction to UML

####What is UML?

UML stands for "Universal Modelling Language". As it's name suggests, it is a standardized method to conceptually illustrated a variety of topics. Most commonly, UML illustrates things like business operations, logic flows, object-oriented structures, and states of hardware or software.

UML is a tool to make software engineering faster and more reliable. *Ideally*, a UML diagram should be able to created by a project manager. Parts of that diagram could then be delegated to programmers who can then code their component directly from the diagram. Those coded parts should then joined smoothly into the product that the UML diagram represents. Obviously, this process does not behave ideally in practice but at least it provides another channel of communication between collaborators and some direction for design-oriented development.

####Starting UML and Design

Learning UML and design is a bit of a chicken and egg problem. Designs need UML to be visually modelled. But UML needs design patterns to have something to model. Because of this, it might be best to learn them concurrently. For the sake of this class, I have chosen to present UML first. My reasoning is that it will give a basis for which to understand UML diagrams in students' design pattern presentations.

In this presentation, I will present the basics of activity, class, and sequence UML diagrams first. I will state what the symbols mean and how to construct the diagrams. Then I will present some design patterns using UML. 

####History of UML

Before UML, there were many competing modeling methodologies.
Grady Booch, Ivar Jacobson, and James Rumbaugh were the leaders of three different popular modeling methodologies. Adherents to these methods formed staunch factions that hindered colloboration between groups using different models. A organization known as Rational sought to rectify this problem by creating standarization for models. Rational hired Booch, Jacobson, and Rumbaugh. Together, they proposed UML 1.0 to the Object-Management Group in 1997.

Through input from many vendors and organizations, UML became updated and accepted throughout the software community. UML 2.0 was later released in 2005. It is the current major version revision as of the writing of this presentation.

####Scoping of UML Topics

The focus of this presentation is design-oriented UML. Some topics in UML are out-of-scope to this specific topic but are still important to UML in general. Use case documents collect project requirements that are useful for communicating with customers and for verifying completion of a project. Use case diagrams identifiy actors and their corresponding use cases. Both of these are too business level for this presentation. State diagrams models the interactions of methods and states of objects in the system. This is too low level for this presentation. There are many other topics that I cannot cover, but these are the most noteable.

Activity diagrams, class diagrams, and sequence diagrams are the middle ground between use case and state diagrams. I have limited my presentation to them because they illustrate the design pattern potential of UML the best. Activity is the highest level diagram of the three so [let's begin with activity diagrams](https://github.com/trekbaum/present/blob/master/uml/slide2.md)
