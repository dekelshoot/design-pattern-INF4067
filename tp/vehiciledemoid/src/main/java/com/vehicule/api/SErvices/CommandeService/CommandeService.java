package com.vehicule.api.SErvices.CommandeService;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.vehicule.Patrons.Adapter.*;
import com.vehicule.Patrons.Builder.Directeur;
import com.vehicule.Patrons.Composite.Societe;
import com.vehicule.Patrons.FactoryMethod.Commande;
import com.vehicule.Patrons.FactoryMethod.FabriqueCommande;
import com.vehicule.Patrons.FactoryMethod.FabriqueCommandeCredit;
import com.vehicule.Patrons.FactoryMethod.FabriqueCommandePayeComptant;
import com.vehicule.Patrons.Singleton.LiassViergeDocuments;
import com.vehicule.api.Data.CommandeData;
import com.vehicule.api.Data.SocietesData;

public class CommandeService {
    ArrayList<Commande> commandes = new ArrayList<Commande>();
    CommandeData commandeData = new CommandeData();
    SocietesData societesData = new SocietesData(); 
    FabriqueCommande fabriqueCommandePayeComptant = new FabriqueCommandePayeComptant();
    FabriqueCommande fabriqueCommandeCredit = new FabriqueCommandeCredit();
    ArrayList<LiassViergeDocuments> liassViergeDocuments = new ArrayList<LiassViergeDocuments>();
    Directeur directeur = new Directeur();

    public CommandeService(){
        this.initCatalogue();
    }
    private void initCatalogue() {
        this.commandes = this.commandeData.commandes;
        for(Commande command:commandes){
            this.liassViergeDocuments.add(directeur.construiLiasseDocuments(command));
        }
   
    }
      public List<Commande> findAll() {
        return commandes.stream().collect(Collectors.toList());
      }
      public Commande findById(final String idCommande) {
        for(Commande c : commandes){

            if(c.idCommande.equals(idCommande)){
                return c;
            }
        }
        return null;
      }
   
      public Commande add(String nomSociete, String vehicule,String type){
        Commande commande ;
        Societe societe = null;

        for(Societe s : societesData.societes){
            if (nomSociete.equals(s.nomSociete)){ 
                societe = s;
                break;
            }

        }

        if(type.equals("Paye Comtant") ){
            commande = fabriqueCommandePayeComptant.fabriqueCommande(""+(commandes.size()+1),societe,this.commandeData.getVehiculeInList(vehicule),societe.pays);
            commandes.add(commande);
            this.liassViergeDocuments.add(directeur.construiLiasseDocuments(commande) );
            return commande;
        }else{
            commande = fabriqueCommandeCredit.fabriqueCommande(""+(commandes.size()+1),societe,this.commandeData.getVehiculeInList(vehicule),societe.pays);
            commandes.add(commande);
            this.liassViergeDocuments.add(directeur.construiLiasseDocuments(commande) );
            return commande;
        }
      }

      public Commande update(String id,String nomSociete, String vehicule,String type) {
        Commande commande ;
        Societe societe = null;

        for(Commande c : commandes){

            if(c.idCommande.equals(id)){
                int index = commandes.indexOf(c);
                for(Societe s : societesData.societes){
                    if (nomSociete.equals(s.nomSociete)){ 
                        societe = s;
                        break;
                    }
        
                }
                if(type.equals("Comptant") ){
                    commande = fabriqueCommandePayeComptant.fabriqueCommande(id,societe,this.commandeData.getVehiculeInList(vehicule),societe.pays);
                    commandes.set(Integer.parseInt(id)-1,commande);
                    this.updateLiassDocument(index, c);
                    return commande;
                }else{
                    commande = fabriqueCommandeCredit.fabriqueCommande(id,societe,this.commandeData.getVehiculeInList(vehicule),societe.pays);
                    commandes.set(Integer.parseInt(id)-1,commande);
                    this.updateLiassDocument(index, c);
                    return commande;
                }
            }
        }
        return null;
    }

    public Commande updateState(String id,String etat) {
        Commande commande ;

        for(Commande c : commandes){

            if(c.idCommande.equals(id)){
                commande = c;
                commande.etat = etat;
                commandes.set(Integer.parseInt(id)-1,commande);
                return commande;
            }
        }
        return null;
    }

    public List<LiassViergeDocumentsPublic> findAllLiassDocuments(){
        ArrayList<LiassViergeDocumentsPublic> liassViergeDocumentsPublic = new ArrayList<>();
        for(LiassViergeDocuments lias : liassViergeDocuments){
            liassViergeDocumentsPublic.add(new LiassViergeDocumentsPublic(lias.getDemandeImmatriculation(),lias.getCertificatCession(),lias.getBonCommande()));
        }
        return liassViergeDocumentsPublic.stream().collect(Collectors.toList());
    }
    public LiassViergeDocuments findLiassDocumentById(final String idCommande) {
        for(Commande c : commandes){

            if(c.idCommande.equals(idCommande)){
                int index = commandes.indexOf(c);
                return this.liassViergeDocuments.get(index);
            }
        }
        return null;
      }

    public LiassViergeDocuments creatLiassDocument(Commande cmd){
        LiassViergeDocuments liassViergeDocuments =  directeur.construiLiasseDocuments(cmd);
        this.liassViergeDocuments.add(directeur.construiLiasseDocuments(cmd));
        return liassViergeDocuments;
    }

    public LiassViergeDocuments updateLiassDocument(int id , Commande cmd){
        LiassViergeDocuments liassViergeDocuments =  directeur.construiLiasseDocuments(cmd);
        this.liassViergeDocuments.set(id, directeur.construiLiasseDocuments(cmd));
        return liassViergeDocuments;
    }




  
    

}
