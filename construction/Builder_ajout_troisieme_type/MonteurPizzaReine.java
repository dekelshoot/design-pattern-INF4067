package Builder_getPizza_dans_class_concrete;

public class MonteurPizzaReine extends MonteurPizza {
    public void monterPate(){pizza.setPate("croisé");}
    public void monterSauce(){ pizza.setSauce("douce"); }
    public void monterGarniture() {pizza.setGarniture("jambon+champignon"); }
    public Pizza getPizza() {return pizza;}
}