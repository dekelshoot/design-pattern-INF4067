package structuration.composite.ComositeTexte;

abstract class Texte {
    String titre;
    String preambule;

    public abstract int longueur();
    public abstract void ajout(Texte txt);
    public abstract void retrait(int index);
    public abstract void print();
}
