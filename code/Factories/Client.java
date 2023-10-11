package Factories;

public class Client {

    public static void main(String[] args) {
        ProduitFactory produitFactory1 = new ProduitFactory1();
        ProduitFactory produitFactory2 = new ProduitFactory2();
        ProduitFactory produitFactory3 = new ProduitFactory3();

        Produit produit = null;

        System.out.println("Utilisation de la première fabrique");
        produit = produitFactory1.getProduit();
        produit.methodeProduit();

        System.out.println("Utilisation de la seconde fabrique");
        produit = produitFactory2.getProduit();
        produit.methodeProduit();

        System.out.println("Utilisation de la troisième fabrique");
        produit = produitFactory3.getProduit();
        produit.methodeProduit();
    }
    
}
