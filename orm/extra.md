##Hibernate Mapping Functionality

Let's take a look at some of the other things Hibernate can do.

######@OnetoOne

One-to-one mapping allows you to directly relate an entity in a parent table with an
entity in child table. We tell Hibernate to do this by having one of the objects
as an attribute in the other and annotating it with @OnetoOne. We can also specify the
type of one-to-one to be cascade. The benefit of this
mapping is that if do an operation on a child table object tells Hibernate to do
the same operation on the associated object in the parent table. This is unidirectional
because operating on the parent will not operate on the child. We can make this
bidirectional by using a @OnetoOne in each class.

######@ManytoOne

Many-to-one mappings are used to store aggregation relationships. Suppose you
have a table for apartment numbers and a table tenants. But several tenants can live
in a 4-bedroom apartment. Thus we need to be able to map many tenant entities to
one apartment number entity. We use @ManytoOne for this. If we save an apartment
number to the database, Hibernate will automatically save the associated tenants
with it. Also, we can use cascade again. Thus if we operate on the apartment number entity,
the effect will cascade to the tenant entities.

######@OnetoMany

Clear if there is a many-to-one relationship, there is also a one-to-many relationship.
Simply go the other direction. But it is still important to tell this explicitly
to Hibernate if you want to utilize features like cascade. By stating both the
many-to-one and one-to-many, we make the relationship bidirectional.


####Next Steps
[Let's conclude by reviewing what we have learned.](https://github.com/trekbaum/present/blob/master/orm/conclusion.md)

Or return to the [table of contents.](https://github.com/trekbaum/present/blob/master/orm/README.md)
