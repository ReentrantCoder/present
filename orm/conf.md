##Configuring Hibernate

To configure Hibernate, copy-and-paste the XML configuration file below into your
projects source directory.

Let's breakdown this configuraton file so that we can understand what some of the parts do.

###### <!-- Database connection settings -->
This provides the connection information. First is the driver. Second is the connection
URL. Most MySQL databases default to port 3306. But to check your connection, you can run: ps -ef | grep mysql to check the port. 
Third and fourth are the username and password respectively for the MySQL server.

######<!-- SQL dialect -->
This tells Hibernate what type of SQL database to which you will be talking. Here we
said MySQL. But we could have just as easily done SQLite, PostgreSQL, Virtuoso, or 
any other dialect.

######<!-- Drop the existing tables and create new one -->
By specifying "create" for the hbm2ddl property, we are asking Hibernate to make a table for an entity
that we are trying to persist if that table does not already exist. There are three
other options. For "create-drop", Hibernate will do the same thing as "create" except that
if you were to close the session factory object Hibernate will drop the schema . For "update",
Hibernate will store changes to your database without dropping. This should not be used.
For "validate", Hibernate will change nothing. If there are any changes, Hibernate will
throw an error. Otherwise, it will run as normal.

######<!-- Mention here all the model classes along with their package name -->
This part is asking us to explicitly state the all the classes in our project that
will call on Hibernate. Any class that includes annotations or any thing should be
included here. We will show these classes on the next page.

![XML!](https://github.com/trekbaum/present/blob/master/orm/resourses/cfg.png "XML")

```
<?xml version='1.0' encoding='utf-8'?>
<!DOCTYPE hibernate-configuration PUBLIC
        "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
        "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">
 
<hibernate-configuration>
    <session-factory>
        <!-- Database connection settings -->
        <property name="connection.driver_class">com.mysql.jdbc.Driver</property>
        <property name="connection.url">jdbc:mysql://localhost:3306</property>
        <property name="connection.username">root</property>
        <property name="connection.password"></property>      
        
        <!-- JDBC connection pool (use the built-in) -->
        <property name="connection.pool_size">1</property>
        
        <!-- SQL dialect -->
        <property name="dialect">org.hibernate.dialect.MySQLDialect</property>

        <!-- Disable the second-level cache  -->
        <property name="cache.provider_class">org.hibernate.cache.NoCacheProvider</property>
        
        <!-- Echo all executed SQL to stdout -->
        <property name="show_sql">true</property>

        <!-- Drop the existing tables and create new one -->
        <property name="hbm2ddl.auto">create</property>
 
        <!-- Mention here all the model classes along with their package name -->
 		<mapping class="com.Behm.Tyler.Quiz4.DVD"/>
 		<mapping class="com.Behm.Tyler.Quiz4.Book"/>
 		<mapping class="com.Behm.Tyler.Quiz4.Media"/>
 		
 		 
    </session-factory>
</hibernate-configuration>
```

####Next Steps
Next we can begin to build our code that will utilize Hibernate so [let's continue with the code example](https://github.com/trekbaum/present/blob/master/orm/code.md)

Or return to the [table of contents.](https://github.com/trekbaum/present/blob/master/orm/README.md)
