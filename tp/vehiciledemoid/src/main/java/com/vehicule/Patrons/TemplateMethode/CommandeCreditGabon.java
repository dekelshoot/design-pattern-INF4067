package com.vehicule.Patrons.TemplateMethode;

import java.util.ArrayList;

import com.vehicule.Patrons.AbstractFactory.Vehicule;
import com.vehicule.Patrons.Composite.Societe;
import com.vehicule.Patrons.FactoryMethod.CommandeCredit;

public class CommandeCreditGabon extends CommandeCredit {

    public CommandeCreditGabon(String idCommande, Societe societeCliente, ArrayList<Vehicule> vehicules) {
        super(idCommande, societeCliente, vehicules);
        this.montantTva= (this.montantHt*18)/100;
        this.paysLivraison = "Gabon";
        this.calculerMontantTtc();
    }

    public void calculerMontantTtc(){
        this.montantTtc = this.montantHt+ this.montantTva;
    }

  
    @Override
    public void afficherFacture(){
        System.out.println("\n\t Facture:( "+this.type+")");
        System.out.println("\n\t IdCommande:( "+this.idCommande+")");
        System.out.println("\t Lieu de livraison: "+this.paysLivraison);
        System.out.println("\t id \t\t Nom \t\t Prix");
        for(Vehicule vehicle :vehicules){
            System.out.println("\t " + vehicle.id + " \t\t " +vehicle.nom+ " \t\t " + vehicle.prix);
        }
        System.out.println("\n\t TotalHt " + this.montantHt  );
        System.out.println("\t TotalTtc " + this.montantTtc  );
    }

    
}
