##Functional Fixation

####What is functional fixation?
The function fixation antipattern is when a developer fixates so much on functions
that she doesn't take advantage of any object-oriented properties. This is why
it is sometimes also called the "no OO" antipattern.

####UML Example

In the example, below is the UML diagram for the functional approach to a loan system.
While it isn't wrong, it doesn't take advantage of the power of object-oriented design
when it really should. It is difficult to modify. Suppose we wanted to add the
ability to select a payment plan after we calculate the load but before we 
calculate the payment schedule. Then it would have been better to use OO.

![Function!](https://github.com/trekbaum/present/blob/master/anti/resources/function1.png "Function UML")

Functions are often methods in an object-oriented design. It's just a matter of 
figuring out what functions are grouped under what objects. In this example,
the three objects are the Customer, the Loan, and the Payment. Thus we would group
the functions into methods to refactor as follows.

![Function!](https://github.com/trekbaum/present/blob/master/anti/resources/function2.png "Function UML")


####Next Steps
[Let's continue with the next antipattern](https://github.com/trekbaum/present/blob/master/anti/slide6.md)

Or return to the [table of contents.](https://github.com/trekbaum/present/blob/master/anti/README.md)
