package Singleton;

public final class Singleton {
    // instance de singleton
    private static Singleton instance = null;

    // attributs de singleton no static mais privés
    private int x;
    private int y;

    // constructeur de l'objet singleton
    private Singleton (){
        super();
    }

    // autre constructeur 
    private Singleton(int x,int y){
        this.x =x;
        this.y = y;
    }

    //Methode renvoyant une instance de la classe singleton

    public static Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
            return new Singleton();
        }
            return instance;
    }

    //Methode renvoyant une instance de la classe singleton

    public static Singleton getInstance(int x, int y){
        if (instance==null){
            instance = new Singleton(x,y);
            return new Singleton();
        }
            return instance;
    }


    // D'autres méthodes classiques et non "static".

    public int somme(int x, int y){
        return x+y;
    }

    public float moyenne(int x, int y){
        return somme(x, y)/2;
    }

    public void affiche(){
        System.out.println("\nJe suis une instance mes valeurs sont : x = " + this.x + " et y = " +this.y);
    }
    // redefinir la méthode clone pour empêcher son utilisation

    @Override

    public Object clone() throws
    CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
