##Facade

####What is a Facade?
Similar to an adapter, a facade focuses on modifying the interface. But unlike an adapter which focuses on converting between existing interfaces, a facade focuses on simplifying an existing interface to a new interface. Like its name suggests, a facade gives a system a fake face to which a client can submit requests. 

Consider how your home media entertainment system turns on your TV, DVD player, and stereo system all at the same time when you press the "ON" button your remote control. In this case, the remote control is acting as your facade.

####In UML
The figure below shows an example of a facade. The dotted arrows indicate a dependency. The actual system in this diagram is the collection of classes 1, 2, and 3. The clients depend on the facade to interact with the system. The facade depends on the system to fulfill its requests from the client.

![Facade!](https://github.com/trekbaum/present/blob/master/sdp/resourses/facade.png "Facade UML")

####Code Example
For our facade code example, we will use the code snippet featured in the illustration
given above. The facade receives the doSomething() request from its clients. The facade can then break up this request into any number of subrequests necessary and delegate them amongst the system. We can see this because methods amongst c1, c2, and c3 are being called when doSomething() is called in the facade.

If the clients wanted, they could call c1, c2, and c3 individually to complete the doSomething() request. But a much easier solution is for the clients to call the simplified interface of facade to do it for them.

####Next Steps
[Let's continue with the composite pattern](https://github.com/trekbaum/present/blob/master/sdp/composite.md)

Or return to the [table of contents.](https://github.com/trekbaum/present/blob/master/sdp/README.md)
