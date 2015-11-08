##Spaghetti Code
The spaghetti code antipattern consist of tangled control structure or unstructured
branching constructs. The most notorious example of this is the GOTO statement.

GOTO is regarded as such a progenitor of problems that it is unusable in most modern
programming languages like Java, Python, and PHP.

####Code Example
To show the full effect of spaghetti code, we need to look back to an older programming
language like FORTRAN where GOTO is still available.

In the broken example, notice how the control is tangled. The first GOTO can 
jump past the second GOTO. And the second GOTO can jump before the first GOTO.
The control has become tangled.

```
10 i = 0
20 i = i + 1
30 PRINT i; " squared = "; i * i
40 IF i >= 10 THEN GOTO 60
50 GOTO 20
60 PRINT "Program Completed."
70 END
```

In the fixed example, proper structured programming resolves the issue while a for loop.
```
10 FOR i = 1 TO 10
20     PRINT i; " squared = "; i * i
30 NEXT i
40 PRINT "Program Completed."
50 END
```

####Next Steps
[Let's continue with the next antipattern](https://github.com/trekbaum/present/blob/master/anti/slide3.md)

Or return to the [table of contents.](https://github.com/trekbaum/present/blob/master/anti/README.md)
