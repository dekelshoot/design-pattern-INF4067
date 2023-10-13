package prototype;

public class Rectangle extends Shape {
    private float width;
    private float height;

    public Rectangle(float x, float y, String color, float width, float height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }



    @Override
    public Shape clone() {
        // TODO Auto-generated method stub
       return new Rectangle(this.x,this.y,this.color,this.width,this.height);
    }

    public void print() {
        System.out.println("je suis un rectangle");
        System.out.println("x = " + x + "\ny = " + y +
        "\ncolor = " + color+ "\nwidth = "+width+"\nheight = "+height);}

}
