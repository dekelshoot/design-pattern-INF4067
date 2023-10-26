package structuration.adaptateur.AdaptateurCarre;

public class AdaptRectangle implements Icarre {

    Rectangle rectangle = new Rectangle();

    public float perimetre(float cote){
        rectangle.setLong(cote);
        rectangle.setLarg(cote);
        return rectangle.perimetre();
    }

    public float aire(float cote){
        rectangle.setLong(cote);
        rectangle.setLarg(cote);
        return  rectangle.aire();
    }
}
