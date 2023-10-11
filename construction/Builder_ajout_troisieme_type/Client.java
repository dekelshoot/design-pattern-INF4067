package Builder_ajout_troisieme_type;


public class Client {
   
    public static void main(String[] args){
        Directeur directeur = new Directeur();
        Pizza pizzaReine;
        Pizza pizzaPiquante;
        Pizza pizzaLocale;

        directeur.construire();
        pizzaReine = directeur.monteurPizzaReine.getPizza();
        pizzaPiquante = directeur.monteurPizzaPiquante.getPizza();
        pizzaLocale = directeur.monteurPizzaLocale.getPizza();
        System.out.println("pizza reine");
        
        pizzaReine.print();
        System.out.println("");
        System.out.println("pizza piquante");
        pizzaPiquante.print();

        System.out.println("");
        System.out.println("pizza Locale");
        pizzaLocale.print();
    }
}
