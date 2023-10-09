package Factories;

public class ProduitFactory3 extends ProduitFactory{
   protected Produit createProduit() {
    return new Produit3();
   }
}
