package Builder_ajout_troisieme_type;

abstract class MonteurPizza {

    protected Pizza pizza;
    
    public void createNouvellePizza(){pizza = new Pizza();}
    public abstract void monterPate();
    public abstract void monterSauce();
    public abstract void monterGarniture();
    public abstract Pizza getPizza();
    
}
