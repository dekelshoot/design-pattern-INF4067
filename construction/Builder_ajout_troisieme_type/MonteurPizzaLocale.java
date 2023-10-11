package Builder_ajout_troisieme_type;

public class MonteurPizzaLocale extends MonteurPizza {
    public void monterPate(){pizza.setPate("feuille de macabo ");}
    public void monterSauce(){ pizza.setSauce("sauce jaune"); }
    public void monterGarniture() {pizza.setGarniture("escargo"); }
    public Pizza getPizza() {return pizza;}
}