##Blob

####What is the blob?
The blob antipattern is when a class tries to do too much.
It violates the single responsibility principle. 

####UML Example

In this example, we can see that the blob is the Library Main Control class. It
has taken over responsibilities of the catalog and item class. This bloats the 
class to large blob-like proportions.

When we need to modify something about catalog code, we would have to sift through
all the library and item code as well. This makes maintenance unnecessary difficult.

The refactor in this situation is to identify the catalog and item code and move
them out into their own respective classes.

![Blob!](https://github.com/trekbaum/present/blob/master/anti/resourses/blob.png "Blob UML")

####Next Steps
A blob does too much. Let's look at the opposite problem. 
[Let's continue with the poltergeist antipattern](https://github.com/trekbaum/present/blob/master/anti/slide4.md)

Or return to the [table of contents.](https://github.com/trekbaum/present/blob/master/anti/README.md)
