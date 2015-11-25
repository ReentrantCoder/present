##Running Hibernate Code Example

Before we actually run our code, let's create a MySQL database matching our configuration
file name in MySQL GUI (MySQL WorkBench). This will give our Hibernate code something
to which to connect. 

Now when we run our code, we will get an command output telling us that tables were
created and entities were successfully added to our tables. This verbose output
is because we asked Hibernate to do so in our configuration file with the 
```<property name="show_sql">true</property>``` property. If we put false, it would be
silent.

![Verbose!](https://github.com/trekbaum/present/blob/master/orm/resourses/verbose.png "Verbose")

Let's look at the tables that were produced by our Hibernate code. We asked Hibernate
to autogenerate the ISBN key. We can see that it did in fact generate unique keys for
each entity.

We asked Hibernate to persist the author attribute, and it did. We also asked Hibernate
to map the title attribute from the Media superclass to the subclasses' tables.
We can see that each table has its own title attribute.

![Behm_Book!](https://github.com/trekbaum/present/blob/master/orm/resourses/behm_book.png "Behm_Book")

Because we didn't specify the column name for the title attribute, Hibernate just sets the name "title"
for its column. But because we explicitly told Hibernate to name the year column as "Year"
(with a capital Y), it will have the name "Year".

![Behm_DVD!](https://github.com/trekbaum/present/blob/master/orm/resourses/behm_dvd.png "Behm_DVD")

####Next Steps
We're finished. [Let's conclude by reviewing what we have learned](https://github.com/trekbaum/present/blob/master/orm/conclusion.md)

Or return to the [table of contents.](https://github.com/trekbaum/present/blob/master/orm/README.md)
