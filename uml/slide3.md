##Class Diagrams

####What is a Class Diagram?

A class diagram is static because it illustrates the set structure of classes in a project. A class diagram is more specific than an activity diagram. A class diagram details the specific classes, interfaces, attributes, and other components of a project.

####Learning by Example

```
class School {
   public int ranking;
   private int funds;
   private int spendFunds(int spend) {
      this.funds -= spend;
      return funds;
   }
   private final Campus campus = new Campus;
   private List<Person> people;
   private void matriculate(Person person) {
      people.add(person);
   }
}

class Campus {
   public location;
}

abstract class Person {
   public String name;
   public boolean atSchool;
   public void goToSchool() {
      this.atSchool = true;
   }
   public void leaveSchool() {
      this.atSchool = false;
   }
}

class Student extends Person {}

class Professor extends Person implements Teaches {
   boolean teach() {
      return Math.random() > .5 ? true : false;
   }
}

interface Teaches {
   public boolean teach(); 
}
```

![Class](https://github.com/trekbaum/present/blob/master/uml/resourses/class.jpeg "Class Diagram")

![Fig5](https://github.com/trekbaum/present/blob/master/uml/resourses/fig5.png "Class Name, Attributes, & Operations")

![Fig6](https://github.com/trekbaum/present/blob/master/uml/resourses/fig6.png "Composition and Aggregation")

![Fig7](https://github.com/trekbaum/present/blob/master/uml/resourses/fig7.png "Inheritance and Interface")
