package com.vehicule.Patrons.DecorateurObserver;

import java.util.ArrayList;

import com.vehicule.Patrons.AbstractFactory.Automobile;
import com.vehicule.Patrons.AbstractFactory.IvehiculeFactory;
import com.vehicule.Patrons.AbstractFactory.Scooter;
import com.vehicule.Patrons.AbstractFactory.VehicleFactoryEssence;
import com.vehicule.Patrons.AbstractFactory.Vehicule;
import com.vehicule.Patrons.AbstractFactory.VehiculeFactoryElectrique;

public class Client {
    public static void main(String[] args) {
         IvehiculeFactory vehiculeFactory1 = new VehicleFactoryEssence();
        IvehiculeFactory vehiculeFactory2 = new VehiculeFactoryElectrique();
        Automobile automobile = null;
        Scooter scooter = null;

        ArrayList options= new ArrayList<String>();
        options.add("chaise en cuire");
        ArrayList animation= new ArrayList<String>();
        animation.add("animation 1");
        ArrayList images= new ArrayList<String>();
        images.add("http://localhost");
        images.add("http://localhost");


        
        scooter = vehiculeFactory1.getScooter("001", "senke", options, animation, 1233, images);
        automobile = vehiculeFactory1.getAutomobile("002", "Carina", options, animation, 299040, images);
        
        ArrayList<Vehicule> vehicleList = new ArrayList<Vehicule>();
        vehicleList.add(scooter);
        vehicleList.add(automobile);

        AfficherVehicule composantAfficherVehicule = new ComposantAfficheVehicule(vehicleList);
        AfficherVehicule decorateurAfficheVehicule1 = new OptionDecorateur(composantAfficherVehicule);
        AfficherVehicule decorateurAfficheVehicule2 = new ImagesDecorateur(composantAfficherVehicule);
        decorateurAfficheVehicule2.afficherVehicule();

    }
}
