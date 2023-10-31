package structuration.composite.CompositeRepertoire;



public class Client {
        public static void main(String[] args) {
        Systeme pdf = new Fichier("hellopdf","pdf");
        Systeme txt = new Fichier("hellotxt","txt");
        Systeme dossier1 = new Dossier("Composite","dossier");
        Systeme dossier2 = new Dossier("Composite2","dossier");

        System.out.println("test de fichier");
        pdf.decrire();
        txt.decrire();
        System.out.println("");

        System.out.println("test de dossier");
        dossier1.ajouter(dossier2);
        dossier1.ajouter(pdf);
        dossier1.ajouter(txt);
        dossier1.decrire();

    }
}
