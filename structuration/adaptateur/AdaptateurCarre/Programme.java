package structuration.adaptateur.AdaptateurCarre;

public class Programme {
    public static void main(String[] args) {
        Icarre carre = new AdaptRectangle();
        float cote = 3;

        System.out.println("je suis un périmtre et une aire d'un carré calculé à partir des formules d'un rectangle");
        System.out.println("mon coté est égal à: "+cote+" mon périmètre est: "+carre.perimetre(cote)+" mon aire est:"+carre.aire(cote));
    }
}
