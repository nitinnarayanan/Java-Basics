/*Create a class Rectangle with attributes length and width, each defaulting to 1.
The class should include set and get methods for both attributes,
and a method to calculate the area of the rectangle.*/
public class Rectangle {
    private int length;
    private int width;

    public Rectangle(){
        this.length = 5;
        this.width = 5;
    }
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength(){
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth(){
        return width;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int area(){
        int areaCal = length * width;
        return areaCal;
    }
    public static void main (String[] args){
        Rectangle obj = new Rectangle(87, 99);
        System.out.println("Area in Custom method: "+obj.area());

        Rectangle obj1 = new Rectangle();
        System.out.println("(Default) Area before Setting values : "+obj1.area());
        obj1.setLength(45);
        obj1.setWidth(20);
        System.out.println("Area after Setting values : "+obj1.area());
    }
}
