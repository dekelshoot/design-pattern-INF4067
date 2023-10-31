package structuration.composite.CompositeRepertoire;

abstract class Systeme {
    String nom;
    String type;

    public abstract void decrire();
    public abstract void ajouter(Systeme elm );
    public abstract void suprimer(int index);
    public abstract Systeme obtenir(int index);
}
