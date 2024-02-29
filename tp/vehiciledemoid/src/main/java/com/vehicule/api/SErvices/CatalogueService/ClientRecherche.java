
package com.vehicule.api.SErvices.CatalogueService;

import java.util.ArrayList;

import java.util.List;
import com.vehicule.Patrons.AbstractFactory.Vehicule;
import com.vehicule.api.Data.VehiculeData;

public class ClientRecherche {
    public static void main(String[] args) {
        ArrayList<Vehicule> vehicules = new ArrayList<Vehicule>();
        VehiculeData vehiculeData = new VehiculeData();
        vehicules= vehiculeData.vehicules;
        Recherche recherche = new Recherche(vehicules);

        List<Vehicule> resultats =  recherche.rechercher("Automobile et Scooter");
        System.out.println(resultats);
        for (Vehicule vehicle : resultats) {
            vehicle.afficherVehicule();
        }
    }
}
