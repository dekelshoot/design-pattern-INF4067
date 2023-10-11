package arithmetique;

public final class Arithmetique {
      // instance de arithmetique
    private static Arithmetique instance = null;

    // attributs de arithmetique no static mais privés
    private int x;
    private int y;
    private String nom;

    // constructeur de l'objet arithmetique
    private Arithmetique (){
        super();
    }

    // autre constructeur 
      private Arithmetique(int x,int y){
        this.x =x;
        this.y = y;
    }

    private Arithmetique(int x,int y, String nom){
        this.x =x;
        this.y = y;
        this.nom = nom;
    }

    //Methode renvoyant une instance de la classe arithmetique

    public static Arithmetique getInstance(){
        if (instance==null){
            instance = new Arithmetique();
            return new Arithmetique();
        }
            return instance;
    }

    //Methode renvoyant une instance de la classe arithmetique

     public static Arithmetique getInstance(int x, int y){
        if (instance==null){
            instance = new Arithmetique(x,y);
            return new Arithmetique();
        }
            return instance;
    }

    public static Arithmetique getInstance(int x, int y, String nom){
        if (instance==null){
            instance = new Arithmetique(x,y,nom);
            return new Arithmetique();
        }
            return instance;
    }

   

    // D'autres méthodes classiques et non "static".

    public int somme(int x, int y){
        return x+y;
    }

    public int soustraction(int x, int y){
        return x-y;
    }

    public float moyenne(int x, int y){
        return somme(x, y)/2;
    }

    public void affiche(){
        System.out.println("\nJe suis une instance mes valeurs sont : x = " + this.x + " et y = " +this.y+ " et nom = " +this.nom);
        System.out.println("");
    }
    // redefinir la méthode clone pour empêcher son utilisation

    @Override

    public Object clone() throws
    CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
