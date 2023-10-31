package structuration.composite.ComositeTexte;



public class Client {

     public static void main(String[] args) {
        Paragraphe paragraphe = new Paragraphe();
        Section section = new Section();

        System.out.println("test du paragraphe");
        paragraphe.print();
        System.out.println("");

        System.out.println("test de Section");
        section.print();
        System.out.println("");


    }
}
