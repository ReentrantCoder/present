##Clipboard Coding

####What is clipboard coding?
The clipboard coding antipattern is the accidental repetition or inappropriate use of the copy-paste feature
in programming. This happens because in software development there will be multiple
spots in the code that will require the same or similarly functionality. Unfortunately,
code might get duplicated into those spots because of an individual developer's laziness 
or a teammate's lack of knowledge of an existing solution.

This can lead to problems. This leads to code bloat. Maintenance becomes much more difficult because
every instance of the clipboard code must be maintained. If there was a bug in the original code, then it will
get repeated throughout the software. Even if developers fix one instance of the
fault, the same failure can happen again because the fault has multiple instances
in the software. 

####Coding Example

For example, suppose we wanted python code to add a constant to each element in numerical
arrays without using numpy. The clipboard coding antipattern might look like this.

```
a = range(5)
b = range(10)
c = range(15)

for i in range(len(a)):
   a[i] += 1
   
for i in range(len(b)):
   b[i] += 2
   
for i in range(len(c)):
   c[i] += 3
```

But we can refactor this by moving out all the repeated code into its own method.
Now, if there is any bug, it only shows up once in the elem_add method instead of
three times in the copy-paste code. We have even reduced the code by two lines.

```
elem_add(array, const):
   for i in range(len(array)):
      array[i] += const
   return array

a = elem_add(range(5),  1)
b = elem_add(range(10), 2)
c = elem_add(range(15), 3)
```

####Next Steps
[Let's continue with the next antipattern](https://github.com/trekbaum/present/blob/master/anti/slide7.md)

Or return to the [table of contents.](https://github.com/trekbaum/present/blob/master/anti/README.md)
