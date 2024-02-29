package com.vehicule.api.Data;

import java.util.ArrayList;
import java.util.Arrays;

import com.vehicule.Patrons.AbstractFactory.Vehicule;
import com.vehicule.Patrons.Composite.Societe;
import com.vehicule.Patrons.Composite.SocieteCliente;
import com.vehicule.Patrons.FactoryMethod.Commande;
import com.vehicule.Patrons.FactoryMethod.FabriqueCommande;
import com.vehicule.Patrons.FactoryMethod.FabriqueCommandeCredit;
import com.vehicule.Patrons.FactoryMethod.FabriqueCommandePayeComptant;

public class CommandeData {
    public ArrayList<Commande> commandes = new ArrayList<Commande>();
    public ArrayList<Vehicule> vehicules = new ArrayList<Vehicule>();
    public ArrayList<Societe> societes = new ArrayList<Societe>();
    public CommandeData(){    
        FabriqueCommande fabriqueCommandePayeComptant = new FabriqueCommandePayeComptant();
        FabriqueCommande fabriqueCommandeCredit = new FabriqueCommandeCredit();
        this.vehicules = new VehiculeData().vehicules;
        this.societes = new SocietesData().societes;

        this.commandes.add(fabriqueCommandePayeComptant.fabriqueCommande("1",this.societes.get(0),this.getVehicule(),"Gabon"));
        this.commandes.add(fabriqueCommandeCredit.fabriqueCommande("2",this.societes.get(1),this.getVehicule(),"Gabon"));
        this.commandes.add(fabriqueCommandePayeComptant.fabriqueCommande("3",this.societes.get(2),this.getVehicule(),"Gabon"));
        this.commandes.add(fabriqueCommandeCredit.fabriqueCommande("4",this.societes.get(3),this.getVehicule(),"Cameroun"));
        this.commandes.add(fabriqueCommandePayeComptant.fabriqueCommande("5",this.societes.get(5),this.getVehicule(),"Cameroun"));
        this.commandes.add(fabriqueCommandePayeComptant.fabriqueCommande("6",this.societes.get(6),this.getVehicule(),"Cameroun"));
        this.commandes.add(fabriqueCommandeCredit.fabriqueCommande("7",this.societes.get(7),this.getVehicule(),"Cote d'ivoire"));
        this.commandes.add(fabriqueCommandePayeComptant.fabriqueCommande("8",this.societes.get(8),this.getVehicule(),"Cote d'ivoire"));

        
    }

    public ArrayList<String> convertStringToArrayList(String texte){
        String[] splitted = texte.split(",");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(splitted));
        return arrayList;

    }

    public ArrayList<Vehicule> getVehicule () {
        ArrayList<Vehicule> arrayList = new ArrayList<Vehicule>();
        int nombreVehicule = (int) (Math.random() * 10) + 1;
        for (int i = 0; i < nombreVehicule; i++) {
            arrayList.add(vehicules.get((int) (Math.random() * 34)));
        }
        return arrayList;
    }

    public ArrayList<Vehicule> getVehiculeInList(String texte){
        ArrayList<Vehicule>  list = new ArrayList<>();
        ArrayList<String> splitted = convertStringToArrayList(texte);
        for(String split : splitted){
            for(Vehicule v : this.vehicules){
                if(v.id.equals(split)){
                    list.add(v);
                    break;
                }
            }
        }
        return list;
    }


}
