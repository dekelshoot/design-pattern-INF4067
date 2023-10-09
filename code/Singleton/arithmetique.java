package Singleton;

public final class arithmetique {
      // instance de arithmetique
    private static arithmetique instance = null;

    // attributs de arithmetique no static mais privés
    private int x;
    private int y;
    private String nom;

    // constructeur de l'objet arithmetique
    private arithmetique (){
        super();
    }

    // autre constructeur 
      private arithmetique(int x,int y){
        this.x =x;
        this.y = y;
    }

    private arithmetique(int x,int y, String nom){
        this.x =x;
        this.y = y;
        this.nom = nom;
    }

    //Methode renvoyant une instance de la classe arithmetique

    public static arithmetique getInstance(){
        if (instance==null){
            instance = new arithmetique();
            return new arithmetique();
        }
            return instance;
    }

    //Methode renvoyant une instance de la classe arithmetique

     public static arithmetique getInstance(int x, int y){
        if (instance==null){
            instance = new arithmetique(x,y);
            return new arithmetique();
        }
            return instance;
    }

    public static arithmetique getInstance(int x, int y, String nom){
        if (instance==null){
            instance = new arithmetique(x,y,nom);
            return new arithmetique();
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
    }
    // redefinir la méthode clone pour empêcher son utilisation

    @Override

    public Object clone() throws
    CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
