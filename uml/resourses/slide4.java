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
