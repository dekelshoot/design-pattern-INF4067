package structuration.brige.bridgeForme;

public class Cercle extends Forme{
    Cercle(Color color) {
        super(color);
        }
    public void colorIt() {
        System.out.print("Cercle filled with ");
        color.remplirColor();
        }
}
