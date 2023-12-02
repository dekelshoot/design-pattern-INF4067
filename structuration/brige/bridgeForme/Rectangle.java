package structuration.brige.bridgeForme;

public class Rectangle extends Forme{
    Rectangle(Color color) {
        super(color);
        }
    public void colorIt() {
        System.out.print("Rectangle filled with ");
        color.remplirColor();
        }
}
