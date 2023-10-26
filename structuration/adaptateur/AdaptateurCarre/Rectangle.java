package structuration.adaptateur.AdaptateurCarre;

public class Rectangle {
    private float longueur;
    private float largeur;

    public float perimetre(){
        return (longueur+largeur)*2;
    }
    public float aire(){
        return longueur*largeur;
    }

    public void setLong(float data){
        this.longueur = data;
    }
    public void setLarg(float data){
        this.largeur = data;
    }
    
}
