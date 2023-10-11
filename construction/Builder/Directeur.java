package Builder;

public class Directeur {
    MonteurPizza monteurPizzaReine =  new MonteurPizzaReine();
    MonteurPizza monteurPizzaPiquante = new MonteurPizzaPiquante();

    public void construire(){
        monteurPizzaReine.createNouvellePizza();
        monteurPizzaReine.monterPate();
        monteurPizzaReine.monterSauce();
        monteurPizzaReine.monterGarniture();


        monteurPizzaPiquante.createNouvellePizza();
        monteurPizzaPiquante.monterPate();
        monteurPizzaPiquante.monterSauce();
        monteurPizzaPiquante.monterGarniture();
    }
    
}
