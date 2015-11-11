##Introduction

####What is an antipattern?
An antipattern is a common counterproductive solution to a software problem. 
Antipatterns increase development time, introduce risk, or obscure code.

It is important to learn antipatterns so that they can be avoided.

####How does is vary from a code smell?
Code smell are snippets of code that hint at a problem. They are not always bad
like antipatterns. The line between antipattern and code smell is very blurred.
For example, about half of my citations claims magics numbers are a smell while
the other half of my citations claims magic numbers are an antipattern. But this
is just a matter of opinion with which I will not bother.

####Scope of this presentation?
There are over 40 known antipatterns. That's far more than I can cover in this talk.
I chose to cover the antipatterns that I thought were interesting. I focused on
antipatterns that lent themselves better to code or UML examples.

####Types of antipatterns
Antipatterns have many different varieties. Different sources categorizes them
differently. Sourcemaking groups them as follows:

######Software development antipatterns
These problems are what match closest to code smell. They are harmful manifestations
in the code itself. Spaghetti code is a classic example. We'll focus mostly on antipatterns
of this kind in our presentation because they are most easily represented with code.

######Software architecture antipatterns
These problems focus on the system-level and enterprise-level structure of applications and components.
Reinventing the wheel is a well known idiom that is also an architectural antipattern. But because of the
inefficient technology transfer between and even within companies, reinventing the wheel does happen. 

######Management antipatterns
These problems are far more human-centric in nature. They deal with aspects of
psychology and emotions. For example, analysis paralysis is when designers seek
to achieve perfection in the planning stage to the extent that they never actually
begin any actions.

####Next Steps
One of the easiest antipatterns is magic number so [let's begin with the magic number antipattern](https://github.com/trekbaum/present/blob/master/anti/slide1.md)

Or return to the [table of contents.](https://github.com/trekbaum/present/blob/master/anti/README.md)
