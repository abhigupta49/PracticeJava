package encapsulation;

public class Person {
    private String name;
    private String age;
    private String country;

    private void setName(String name){
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName(){
        return name;
    }

    public String getAge(){
        return age;
    }

    public String getCountry(){
        return country;
    }
}
