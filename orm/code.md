##Hibernate Code Example

####My Code Example

For my example, there are four different classes, Book, DVD, Media, and a driver class.
Book and DVD are subclasses of Media. Book and DVD share the title attribute so that is
stored in the Media class. Book has the author attribute but DVD does not. And vice-versa
with the year attribute.

In our driver, we want to make instances of Book and DVD, add them to a library, and 
store them in their own respective databases.

Let's look at the Book, DVD, and Media classes. We'll point out and explain the 
Hibernate annotations. These annotations come from javax.persistence package. So
we will first need to import the package.

######@Entity
This tells Hibernate that each instance of this class object is something that we
want to persist in a row of a table.

######@Table
This allows us to explicitly name the table that we will be persisting entities in.

######@Id
This tells us the key attribute we will be associating with that entity. Each ID is
unique to that entity. So it allows us to quickly referenc that entity.

![Book!](https://github.com/trekbaum/present/blob/master/orm/resourses/book.png "Book")

######@GeneratedValue
Here I have asked Hibernate to automatically generate unique keys for me.
We could have also chosen the options of Identity, Sequence, and Table.

######@Column
This explicitly tells Hibernate the name of the attribute column in the table. We could have
left this blank. Then Hibernate will name the column with the exact same name as
the attribute that it is storing. We could have also add "nullable=false" to the
arguements of annotation. This would make the table reject any entities that have
null values for this attribute.

![DVD!](https://github.com/trekbaum/present/blob/master/orm/resourses/dvd.png "DVD")

######@MappedSupperClass
This tells Hibernate this is not a entity for which we wish to make a new table. Instead,
this says that this is a superclass that contains attributes that are needed to complete
the table for the subclasses DVD and Book. 

![Media!](https://github.com/trekbaum/present/blob/master/orm/resourses/media.png "Media")

####Next Steps
Finally we can run our Hibernate code so [let's finish by running the code](https://github.com/trekbaum/present/blob/master/orm/run.md)

Or return to the [table of contents.](https://github.com/trekbaum/present/blob/master/orm/README.md)
