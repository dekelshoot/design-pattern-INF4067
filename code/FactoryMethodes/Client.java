package FactoryMethodes;

public class Client {

    public static void main(String[] args) {
        ProduitFactory produitFactory = new ProduitFactory();

        Produit produit = null;

        produit = produitFactory.getProduit(ProduitFactory.TYPE_PRODUIT1);
        produit.methodeProduit();

        produit = produitFactory.getProduit(ProduitFactory.TYPE_PRODUIT2);
        produit.methodeProduit();

        produit = produitFactory.getProduit(ProduitFactory.TYPE_PRODUIT3);
        produit.methodeProduit();
    }
    
}
