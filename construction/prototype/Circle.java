package prototype;

public class Circle extends Shape {
    private float radius;

    public Circle(float x, float y, String color, float radius) {
        super(x, y, color);
        this.radius = radius;
    }
    public Circle(Circle circle) {
    }
    @Override
    public Shape clone() {
        // TODO Auto-generated method stub
        return new Circle(this.x,this.y,this.color,this.radius);
    }

    public void print() {
        System.out.println("je suis un cercle");
        System.out.println("x = " + x + "\ny = " + y +
        "\ncolor = " + color+ "\nradius = "+radius);}

    
}
