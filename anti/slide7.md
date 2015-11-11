##Arrowhead

####What is arrowhead?
The arrowhead antipattern is when if, for, and other statements become so nested
that the code takes the form of an arrowhead. This can be caused by a rigid
adherence to the "one return per function" practice. While this practice is normally
a good thing that eases readability, it is a bad thing that does the opposite in
this case. Exception handling also contributes to the arrowhead.

There are many ways to refactor this antipattern. Guard clauses allow a program
to return early from an simple or undesirable input. Inverting conditions can
help lead to guard clauses. Using filters and processing partial results decreases
nesting.

####Coding Example

```
public void AddRole(Role role)
{
    if (role != null)
    {
        if (!string.IsNullOrEmpty(role.Name))
        {
            if (!IsInRole(role))
            {
                roles.Add(role);
            }
            else
            {
                throw new InvalidOperationException("User is already in this role.");
            }
        }
        else
        {
            throw new ArgumentException("role does not have a name", "role");
        }
    }
    else
    {
        throw new ArgumentNullException("role");
    }
}
```

```
public void AddRole(Role role)
{
    if (role == null)
        throw new ArgumentNullException("role");
 
    if (string.IsNullOrEmpty(role.Name))
        throw new ArgumentException("role does not have a name", "role");
 
    if (IsInRole(role))
        throw new InvalidOperationException("User is already in this role.");
 
    roles.Add(role);
}
```

####Next Steps
Let's conclude by [reviewing what we've covered.](https://github.com/trekbaum/present/blob/master/anti/conclusion.md)

Or return to the [table of contents.](https://github.com/trekbaum/present/blob/master/anti/README.md)
