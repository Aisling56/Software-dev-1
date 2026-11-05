/*create a “person” class. People all have names and ages. 
    Create a function that returns “(this persons name) says hi!” */
    person person1 = new person("John", 25);
    person1.sayHi();

    /*create a “book” class. All books have a title, author, and genre. 
    Create a function that checks if the book is “the giving tree”. 
    If it is, talk about how creepy shel silverstein looks on the book. 
    Create 2 books and check if theyre the giving tree. */

    book book1= new book("The Giving Tree", "Shel Silverstein", "fiction");
    book book2 = new book("1984", "George Orwell", "sci-fi");
    book1.checkBook();
    book2.checkBook();

    /*create a car class with at least 2 variables to keep track of, 
    one function, and then create 3 cars in main. */
    car car1 = new car("Toyota", 2016);
    car car2 = new car("Mercedes", 2026);
    car car3 = new car("Ford", 1980);
    car1.isClassic();
    car2.isClassic();
    car3.isClassic();



    }
   
}
