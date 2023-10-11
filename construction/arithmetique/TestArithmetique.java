package arithmetique;


public class TestArithmetique {
    public static void main(String[] args){
        int som = Arithmetique.getInstance(2,5).somme(2, 5);
        System.out.printf("la somme est %d",som);
        System.out.println("");
        int sous = Arithmetique.getInstance().soustraction(2, 5);
        System.out.printf("la différence est %d",sous);
        System.out.println("");
        float mean = Arithmetique.getInstance().moyenne(2, 5);
        System.out.printf("la moyenne est %f",mean);
        System.out.println("");
        Arithmetique s1 = Arithmetique.getInstance(8, 3);
        s1.affiche();
        Arithmetique s2 = Arithmetique.getInstance(5, 9);
        s2.affiche();
    }
 
}