package constructor;

public class Cat {
    String name;
    int age;

    public Cat(){
        this.name = "Unknown";
        this.age = 0;
    }

    public void display(){
        System.out.println(name+" "+age);
    }
}
