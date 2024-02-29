package com.vehicule.Patrons.Builder;
import java.util.ArrayList;

import com.vehicule.Patrons.AbstractFactory.Vehicule;
import com.vehicule.Patrons.Adapter.Document;
import com.vehicule.Patrons.Adapter.DocumentHtml;
import com.vehicule.Patrons.Adapter.PdfDocumentAdapteur;
import com.vehicule.Patrons.FactoryMethod.Commande;
import com.vehicule.Patrons.Singleton.LiassViergeDocuments;

public class MonteurLiasseDocumentVehicule extends MonteurLiassDocument{

    @Override
    public void monteurDemandeImmatriculation(Commande commande) {
        String contenu ="";
        contenu = "Les vehicule avec les id: ";
        for(Vehicule v: commande.vehicules){
            contenu = contenu +v.id+" ,";
        }
        contenu = contenu+" commandés par "+commande.societeCliente.nomSociete+" portent les immatriculations: ";
        for(Vehicule v: commande.vehicules){
            contenu = contenu +v.id+"-"+commande.societeCliente.nomSociete+"-"+commande.type;
        }
        
        Document immatriculation = new DocumentHtml("IMM"+commande.idCommande+"pdf", "Demmande d'immatriculation", contenu);
        new PdfDocumentAdapteur("IMM"+commande.idCommande+"pdf", "Demmande d'immatriculation", contenu);
            this.liassDocuments.setDemandeImmatriculation(immatriculation);
            
        
    }

    @Override
    public void monteurCertificatCession(Commande commande) {
        String contenu = "com.vehicule sarl et "+commande.societeCliente.nomSociete+" remplissent et signent un certificat de cession pour officialiser la vente des vehicules portants les id: ";
           for(Vehicule v: commande.vehicules){
               contenu = contenu +v.id+" ,";
           }
        Document certificatCession = new DocumentHtml("CC"+commande.idCommande+"pdf", "Certificat Cession", contenu);
        new PdfDocumentAdapteur("CC"+commande.idCommande+"pdf", "Certificat Cession", contenu);
        this.liassDocuments.setCertificatCession(certificatCession);
        
    }

    @Override
    public void monteurBonCommande(Commande commande) {
        String contenu = "com.vehicule sarl et "+commande.societeCliente.nomSociete+" signent un bon de commande qui récapitule les conditions de la vente, notamment le prix des voiture: "+commande.montantTtc+" , les options choisies et la date de livraison";
      Document bonCommande = new DocumentHtml("BC"+commande.idCommande+"pdf", "Bon de commande", contenu);
      new PdfDocumentAdapteur("BC"+commande.idCommande+"pdf", "Bon de commande", contenu);
      this.liassDocuments.setBonCommande(bonCommande);
      
      
    }

    @Override
    public LiassViergeDocuments getLiasseDocument() {
        return  this.liassDocuments;
    }
    
}
