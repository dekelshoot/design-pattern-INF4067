package com.vehicule.Patrons.TemplateMethode;

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
import com.vehicule.Patrons.FactoryMethod.FabriqueCommandePayeComptant;
import com.vehicule.Patrons.FactoryMethod.Commande;

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

        System.out.println("utilisation de la premiere fabrique");
       
        scooter = vehiculeFactory1.getScooter("001", "senke", options, animation, 1233, images);
        automobile = vehiculeFactory1.getAutomobile("002", "Carina", options, animation, 299040, images);
        
        ArrayList<Vehicule> vehicleList = new ArrayList<Vehicule>();
        vehicleList.add(scooter);
        vehicleList.add(automobile);
        
        Societe societe1 = new SocieteCliente("CMC","Cameroun");
        Societe societe2 = new SocieteCliente("Sorepco","Cameroun");
        GroupeSocieteCliente societe3 = new GroupeSocieteCliente("Fokou","Cameroun");
        societe3.ajouterSociete(societe1);
        societe3.ajouterSociete(societe2);

        Commande commandeCM = new CommandeCreditCameroun("AOO3",societe3,vehicleList);
        Commande commandeCi = new CommandePayeComptantCoteIvoire("AOO4",societe3,vehicleList);
        commandeCM.ajouterCommand(scooter);
        commandeCi.ajouterCommand(scooter);
        commandeCM.afficherFacture();
        commandeCi.afficherFacture();
    }
}