package Builder_ajout_troisieme_type;

public class Directeur {
    MonteurPizza monteurPizzaReine =  new MonteurPizzaReine();
    MonteurPizza monteurPizzaPiquante = new MonteurPizzaPiquante();
    MonteurPizza monteurPizzaLocale = new MonteurPizzaLocale();

    public void construire(){
        monteurPizzaReine.createNouvellePizza();
        monteurPizzaReine.monterPate();
        monteurPizzaReine.monterSauce();
        monteurPizzaReine.monterGarniture();


        monteurPizzaPiquante.createNouvellePizza();
        monteurPizzaPiquante.monterPate();
        monteurPizzaPiquante.monterSauce();
        monteurPizzaPiquante.monterGarniture();


        monteurPizzaLocale.createNouvellePizza();
        monteurPizzaLocale.monterPate();
        monteurPizzaLocale.monterSauce();
        monteurPizzaLocale.monterGarniture();
    }
    
}
