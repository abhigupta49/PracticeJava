import javaOOPs.Book;
import javaOOPs.Dog;
import javaOOPs.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person("Abhi","24");
//        String name = person.getName();
//        String age = person.getAge();

//        Dog d = new Dog("Lucy","German");
//        d.setName("Chiku");
//        String name = d.getName();
//        String breed = d.getBreed();
//        System.out.println(name+" "+breed);


        Book book1 = new Book("The man and myth","Ravi Das","SKOLL");


        Book book2 = new Book("The Legend","Ankit Ji","DIJKSTRA");

        Book.addBook(book1);
        Book.addBook(book2);

        ArrayList<Book> bookArrayList = Book.getBookCollection();

        for(Book book:bookArrayList){
            System.out.println(book.getTitle() +" by " + book.getAuthor() + ", ISBN "+ book.getISBN());
        }

        Book.removeBook(book1);

        System.out.println("\nAfter removing " + book1.getTitle() + ":");

        System.out.println("List of books:");

        for(Book book:bookArrayList){
            System.out.println(book.getTitle() +" by " + book.getAuthor() + ", ISBN "+ book.getISBN());
        }
    }
}
