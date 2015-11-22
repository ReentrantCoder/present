##Introduction to ORMs

####What is an ORM?

ORM stands for object-relational database. Objected-oriented programming and relational
databases are two very disparate systems. They store entities in different ways, and this is called the
object-relational impedance mismatch problem. But they do share a common goal of trying
to describe entities. Sometimes, there is a need in object-oriented systems to 
persist the objects in a database. This is where ORMs come into place to help. 

Persistence is the ability of an entitity to outlive the applications process. In Java,
this would me that the object can live outside the scope of the Java Virtual Machine by
living with an relational database. This persistence could be used to restore the state at some later time.

Relational databases are simply databases that store information about relationships
between data. For example, an apartment entity might store a reference to tenant
entities which could then each store a reference to a room number entity. Relationships
can be one-to-one, one-to-many, or many-to-many. 

Java developers also have the option of making SQL queries directly in the application
by using Java Database Connectivity. But ORMs seek to handle simply the task by
handling many of the requests that a developer would make through the JDBC application
program interface.

####Scope of this Presentation

In this presentation, I will focus specifically on the Hibernate ORM and MySQL
databases. I will walk the reader through a full example application of hibernate
all the way from set up to execution.

####Next Steps
First we'll need to setup up Hibernate so [let's begin with setup](https://github.com/trekbaum/present/blob/master/orm/setup.md)

Or return to the [table of contents.](https://github.com/trekbaum/present/blob/master/orm/README.md)
