package AbstractFactoryNouvelleFamille;

public class ProduitFactory3 implements IProduitFactory{
    public ProduitA getProduitA(){
        return new ProduitA3();
    }
    public ProduitB getProduitB(){
        return new ProduitB3();
    }

}
