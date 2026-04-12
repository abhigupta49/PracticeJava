import customException.CustomArithmeticException;
import customException.customOddnumberException;
import exception.Question_1;
import exception.Question_2;

import java.util.ArrayList;

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

//        SavingsAccount savingsAccount = new SavingsAccount();
//        savingsAccount.deposit(160);
//        savingsAccount.withdrawCash(180);
//        System.out.println(savingsAccount.getBalance());

//        Animal lion = new Lion();
//        lion.sound();
//
//        Shape shape = new Circle(4);
//        System.out.println(shape.calculateArea());
//        System.out.println(shape.calculatePerimeter());

//        Rectangle rectangle = new Rectangle(3,4);
//        System.out.println(rectangle.getArea());
//        Bicycle bicycle = new Bicycle();
//        bicycle.speedUp();
//        System.out.println(bicycle.getSpeed());
//        bicycle.speedUp();
//        System.out.println(bicycle.getSpeed());
//        bicycle.speedUp();
//        System.out.println(bicycle.getSpeed());
//
//        Shape circle = new Cirlce(4);
//        System.out.println(circle.calculateArea());
//        circle.draw();

//        ArrayList1 arrayList1 = new ArrayList1("pink");
//        for(String str : arrayList1.getArrayList()){
//            System.out.println(str);
//        }

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("abhi");
        arrayList.add("gupta");
        arrayList.add("rahul");
        arrayList.add("aman");
        arrayList.add("amod");


//        Iterate ArrayList Ele
//        for(String str: arrayList){
//            System.out.println(str);
//        }

//        Insert at First Position
//        arrayList.add(0,"raj");
//        System.out.println(arrayList.get(1));

//        Reterive elements by index
//        for(int i=0;i<arrayList.size();i++){
//            System.out.println(arrayList.get(i));
//        }

//      Update array List Ellement
//        arrayList.set(0,"ravi");
//        for(String str: arrayList){
//            System.out.println(str);
//        }
//        System.out.println(arrayList.get(0));

//        Remove third element
//        arrayList.remove(3);

//        Search elements in arraylist
//        if(arrayList.contains("gupta")){
//            System.out.println("true");
//        }

//        Sort ArrayList

//        Exception
//        Question_1 question1 = new Question_1();
//        try{
//            System.out.println(question1.divideNum(5,0));
//        } catch (CustomArithmeticException e) {
//            System.out.println(e.getMessage());
//        }

        Question_2 question2 = new Question_2();
        try {
            System.out.println(question2.checkOdd(3));
        } catch (customOddnumberException e) {
            System.out.println(e.getMessage());
        }



    }


}
