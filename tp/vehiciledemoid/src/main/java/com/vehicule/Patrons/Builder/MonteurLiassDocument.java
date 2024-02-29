package com.vehicule.Patrons.Builder;
import java.util.ArrayList;

import com.vehicule.Patrons.Adapter.Document;
import com.vehicule.Patrons.FactoryMethod.Commande;
import com.vehicule.Patrons.Singleton.LiassViergeDocuments;

public abstract class MonteurLiassDocument {
    public LiassViergeDocuments liassDocuments = LiassViergeDocuments.getInstance();
    public abstract void monteurDemandeImmatriculation(Commande commande);
    public abstract void monteurCertificatCession(Commande commande);
    public abstract void monteurBonCommande(Commande commande);
    public abstract LiassViergeDocuments  getLiasseDocument();
}
