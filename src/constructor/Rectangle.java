package constructor;

//Copy constructor with object
public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length,int width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(Rectangle rectangle){
        this.length = rectangle.length;
        this.width = rectangle.width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}
