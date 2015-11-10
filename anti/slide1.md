##Magic Numbers

####What are magic numbers?
The magic numbers antipattern is when a developer includes unexplained numerical constants
in algorithms. This leads to confusion on the origin of the numbers for others
and possibly to the original developer should she try to modify her code at a
later time.

####Code Example
Here is a bit of code that I actually use in my everyday life. I made this Python code
to calculate what share of the rent my roommate (Roommie) and I should pay. In addition to 
the rent, he pays electricity, and I pay the internet. If the internet and electricity
cost the same for that month, it would be fair if we split the rent 50/50. But if he 
paid more in electricity than I did in internet, it would be fair for me to pay
more of the rent to offset his cost. And vice-versa.

First, below is the example with magic numbers. Because the lease and internet cost
the same each month, we could just use their constants in the code to save a couple
of lines of code. But this is a terrible idea. I could never convince my roommate
that the calculation was fair. He wouldn't know where I got the numbers from!

```
import sys

if len(sys.argv) > 2:
   print "Error: Only input electricity bill"
   
elec = float(sys.argv[1])

def calc_roommie(elec):
   return 602.5 + (66.95 - elec)/2 
   
def calc_tyler(elec):
   return 602.5 - (66.95 - elec)/2
   
print ""
print "Roommie's share is $" + str(calc_roommie(elec))
print "Tyler's   share is $" + str(calc_tyler(elec))
print "Total paid for rent is $" + str(calc_roommie(elec) + calc_tyler(elec))
print ""
```

Here is the fixed code where I have replaced the magic numbers with symbolic constants.
Now my roommate can clearly see that the calculation equation is fair. Furthermore,
if our lease or interent cost were to ever change, it would be fair easier for me
to correct it.

```
import sys

if len(sys.argv) > 2:
   print "Error: Only input electricity bill"
   
elec = float(sys.argv[1])
lease = 1205.0
internet = 66.95

def calc_roommie(elec):
   return lease/2 + (internet - elec)/2 
   
def calc_tyler(elec):
   return lease/2 - (internet - elec)/2
   
print ""
print "Roommie's share is $" + str(calc_roommie(elec))
print "Tyler's   share is $" + str(calc_tyler(elec))
print "Total paid for rent is $" + str(calc_roommie(elec) + calc_tyler(elec))
print ""
```

####Next Steps
[Let's continue with the spaghetti antipattern](https://github.com/trekbaum/present/blob/master/anti/slide2.md)

Or return to the [table of contents.](https://github.com/trekbaum/present/blob/master/anti/README.md)
