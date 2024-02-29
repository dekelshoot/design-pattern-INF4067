package com.vehicule.Patrons.Builder;

import com.vehicule.Patrons.Singleton.LiassViergeDocuments;

import java.util.ArrayList;

import com.vehicule.Patrons.FactoryMethod.Commande;
public class Directeur{
    MonteurLiassDocument monteurLiassDocument =new MonteurLiasseDocumentVehicule();
    public LiassViergeDocuments construiLiasseDocuments(Commande commande){
        this.monteurLiassDocument.monteurDemandeImmatriculation(commande);
        this.monteurLiassDocument.monteurCertificatCession(commande);
        this.monteurLiassDocument.monteurBonCommande(commande);
        return this.monteurLiassDocument.getLiasseDocument();
    }
}

