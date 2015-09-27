##Sequence Diagrams

####What is a Sequence Diagram?

```
class Student {
   boolean goodStanding;
   void wantBook(Book book, Library library) {
      if (this.goodStanding)
         library.checkout(book) 
   }
}

class Library {
   List<Book> books;
   void checkout(Book book)  { 
      if (book.getAvailable)
         book.setUnavaible();
   }
}

class Book {
   boolean isAvailable = true;
   boolean getAvailable() {
      return isAvailable;
   }
   void setUnavailable() {
      isAvailable = false;
   }
}
```

![Sequence](https://github.com/trekbaum/present/blob/master/uml/resourses/sequence.jpeg "Sequence Diagram")

![Fig8](https://github.com/trekbaum/present/blob/master/uml/resourses/fig8.png "Actor, Class, & Object")

![Fig9](https://github.com/trekbaum/present/blob/master/uml/resourses/fig9.png "Messages")

![Fig10](https://github.com/trekbaum/present/blob/master/uml/resourses/fig10.png "Conditional")
