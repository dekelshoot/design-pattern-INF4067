package Builder_getPizza_dans_class_concrete;


public class Client {
   
    public static void main(String[] args){
        Directeur directeur = new Directeur();
        Pizza pizzaReine;
        Pizza pizzaPiquante;

        directeur.construire();
        pizzaReine = directeur.monteurPizzaReine.getPizza();
        pizzaPiquante = directeur.monteurPizzaPiquante.getPizza();
        System.out.println("pizza reine");
        
        pizzaReine.print();
        System.out.println("");
        System.out.println("pizza piquante");
        pizzaPiquante.print();
    }
}
