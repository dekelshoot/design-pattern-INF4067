package com.vehicule.Patrons.FactoryMethod;

import java.util.ArrayList;

import com.vehicule.Patrons.AbstractFactory.Automobile;
import com.vehicule.Patrons.AbstractFactory.IvehiculeFactory;
import com.vehicule.Patrons.AbstractFactory.Scooter;
import com.vehicule.Patrons.AbstractFactory.VehicleFactoryEssence;
import com.vehicule.Patrons.AbstractFactory.Vehicule;
import com.vehicule.Patrons.AbstractFactory.VehiculeFactoryElectrique;
import com.vehicule.Patrons.Composite.GroupeSocieteCliente;
import com.vehicule.Patrons.Composite.Societe;
import com.vehicule.Patrons.Composite.SocieteCliente;

public class Client {
    public static void main(String[] args) {
        IvehiculeFactory vehiculeFactory1 = new VehicleFactoryEssence();
        IvehiculeFactory vehiculeFactory2 = new VehiculeFactoryElectrique();
        Automobile automobile = null;
        Scooter scooter = null;

        ArrayList options= new ArrayList<String>();
        options.add("carina");
        ArrayList animation= new ArrayList<String>();
        animation.add("animation 1");
        ArrayList images= new ArrayList<String>();
        images.add("http://localhost");


        Societe societe1 = new SocieteCliente("CMC","Cameroun");
        Societe societe2 = new SocieteCliente("Sorepco","Cameroun");
        GroupeSocieteCliente societe3 = new GroupeSocieteCliente("Fokou","Cameroun");
        societe3.ajouterSociete(societe1);
        societe3.ajouterSociete(societe2);
        scooter = vehiculeFactory1.getScooter("001", "senke", options, animation, 1233, images);
        automobile = vehiculeFactory1.getAutomobile("002", "Carina", options, animation, 299040, images);
        
        ArrayList<Vehicule> vehicleList = new ArrayList<Vehicule>();
        vehicleList.add(scooter);
        vehicleList.add(automobile);
        FabriqueCommandePayeComptant fabriqueCommande = new FabriqueCommandePayeComptant();

        Commande commande = null;

        commande = fabriqueCommande.fabriqueCommande("A20",societe3,vehicleList, "Cameroun");
        commande.afficherFacture();
        commande.ajouterCommand(scooter);
        commande.afficherFacture();
    }
}
