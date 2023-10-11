package Builder_ajout_troisieme_type;

class MonteurPizzaPiquante extends MonteurPizza {
    public void monterPate(){ pizza.setPate("feuilletée"); }
    public void monterSauce(){ pizza.setSauce("piquante"); }
    public void monterGarniture() { pizza.setGarniture("pepperoni+salami");}
    public Pizza getPizza() {return pizza;}
}