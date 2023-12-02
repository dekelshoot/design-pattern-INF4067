package structuration.brige.bridgeForme;

public abstract class Forme {
    Color color;
    Forme(Color color){
    this.color=color;
    }
    abstract public void colorIt();
}
