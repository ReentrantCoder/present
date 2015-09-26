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
