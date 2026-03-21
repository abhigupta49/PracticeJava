import Static.*;
import inheritance.*;
import javanestedclasses.Computer;

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


//        Book book1 = new Book("The man and myth","Ravi Das","SKOLL");
//
//
//        Book book2 = new Book("The Legend","Ankit Ji","DIJKSTRA");
//
//        Book.addBook(book1);
//        Book.addBook(book2);
//
//        ArrayList<Book> bookArrayList = Book.getBookCollection();
//
//        for(Book book:bookArrayList){
//            System.out.println(book.getTitle() +" by " + book.getAuthor() + ", ISBN "+ book.getISBN());
//        }
//
//        Book.removeBook(book1);
//
//        System.out.println("\nAfter removing " + book1.getTitle() + ":");
//
//        System.out.println("List of books:");
//
//        for(Book book:bookArrayList){
//            System.out.println(book.getTitle() +" by " + book.getAuthor() + ", ISBN "+ book.getISBN());
//        }

//        Cat cat = new Cat();
//        cat.display();

//        Dog dog = new Dog("Lucy","german");
//        System.out.println(dog.getName());

//        Book book1 = new Book();
//        System.out.println("Boook1 Title: "+ book1.getTitle());
//
//        Book book2 = new Book("Karo Maro","Netaji");
//        System.out.println("Book 2 Titile: "+book2.getAuthor());
//
//        Book book3 = new Book("Karo Maro","Netaji",43.2);
//        System.out.println("Book 3 price: "+book3.getPrice());

//        Student stu = new Student();
//        System.out.println(stu.getStudentName());
//        System.out.println(stu.getStudentId());
//
//        Counter c1 = new Counter();
//        Counter c2 = new Counter();
//        Counter c3 = new Counter();

//        System.out.println(Counter.getCount());

//        System.out.println(MathUtility.add(2,5));
//        System.out.println("Before creating instance: "+Initializer.initialVal);
//        Initializer initializer = new Initializer();
//        System.out.println("After creating instance: "+ Initializer.initialVal);


//        System.out.println(Constants.areaOfCircle(2));
//        System.out.println(Configuration.configValue);
//        Computer computer = new Computer();
//        computer.showProcessorDetails();

//        Cat cat = new Cat();
//        cat.makeSound();
//        Car vehicle = new Car();
//        vehicle.drive();

//        Rectangle rectangle = new Rectangle(4,3);
//        System.out.println(rectangle.getArea());

//        HRmanager hRmanager = new HRmanager();
//        hRmanager.addEmployee();

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(160);
        savingsAccount.withdrawCash(180);
        System.out.println(savingsAccount.getBalance());


    }

}
