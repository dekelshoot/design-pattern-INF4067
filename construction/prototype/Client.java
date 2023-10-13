package prototype;

public class Client {
    public static void main(String[] args){
        Shape rectangle = new Rectangle(5, 12, "black", 10, 15);
        Shape circle = new Circle(4,7, "red", 10);
        Shape rectangleClone = rectangle.clone();
        Shape circleShape = circle.clone();

        rectangleClone.print();
        System.out.println("");
        circleShape.print();
    }
}
