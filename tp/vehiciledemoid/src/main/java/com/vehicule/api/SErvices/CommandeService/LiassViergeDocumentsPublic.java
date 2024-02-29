package com.vehicule.api.SErvices.CommandeService;

import com.vehicule.Patrons.Adapter.Document;

public  class LiassViergeDocumentsPublic {
    public static LiassViergeDocumentsPublic liassViergeDocuments=null;
    public Document demandeImmatriculation;
    public Document certificatCession;
    public Document bonCommande;

    public LiassViergeDocumentsPublic(Document demandeImmatriculation, Document certificatCession, Document bonCommande ){
        this.demandeImmatriculation = demandeImmatriculation;
        this.bonCommande= bonCommande;
        this.certificatCession= certificatCession;
    }

    
    
}
