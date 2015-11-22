##Configuring Hibernate

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
<?xml version='1.0' encoding='utf-8'?>
<!DOCTYPE hibernate-configuration PUBLIC
        "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
        "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">
 
<hibernate-configuration>
    <session-factory>
        <!-- Database connection settings -->
        <property name="connection.driver_class">com.mysql.jdbc.Driver</property>
        <property name="connection.url">jdbc:mysql://localhost:3306/Behm_Quiz4</property>
        <property name="connection.username">root</property>
        <property name="connection.password">weisen</property>
        
        
        
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
