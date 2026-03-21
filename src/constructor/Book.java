package constructor;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(){
        this.title = "NA";
        this.author = "NA";
        this.price = 0.0;
    }

    public Book(String title,String author){
        this.title = title;
        this.author = author;

    }

    public Book(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}
