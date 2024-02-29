package com.vehicule.api.SErvices.CatalogueService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.vehicule.Patrons.AbstractFactory.Vehicule;

public class Recherche {

  private HashMap<String, List<Vehicule>> index = new HashMap<String, List<Vehicule>>();

  public Recherche(List<Vehicule> vehicules) {
    List<Vehicule> vehicleAutomibile = new ArrayList<Vehicule>();
    List<Vehicule> vehicleScooter = new ArrayList<Vehicule>();
    List<Vehicule> vehicleEssence = new ArrayList<Vehicule>();
    List<Vehicule> vehicleElectrque = new ArrayList<Vehicule>();
    for (Vehicule vehicule: vehicules) {
        if(vehicule.type.equals("Automobile")){
            vehicleAutomibile.add(vehicule);
        }else if(vehicule.type.equals("Scooter")){
            vehicleScooter.add(vehicule);
        }
    }
    for (Vehicule vehicule: vehicules) {
        if(vehicule.carburation.equals("Essence")){
            vehicleEssence.add(vehicule);
        }else if(vehicule.carburation.equals("Electrique")){
            vehicleElectrque.add(vehicule);
        }
    }
    

    index.put("Automobile",vehicleAutomibile);
    index.put("Scooter",vehicleScooter);
    index.put("Essence",vehicleEssence);
    index.put("Electrique",vehicleElectrque);

    // Initialiser l'index avec les documents et leurs mots clés
  }

  public List<Vehicule> rechercher(String requete) {
    // Décomposer la requête en mots clés et opérateurs
    String[] motsCles = requete.split(" ");
    System.out.println("hello "+ Arrays.asList(motsCles));
    // Parcourir les mots clés et appliquer les opérateurs logiques
    List<Vehicule> resultats = new ArrayList<>();
    for (String motCle : motsCles) {
      if (motCle.equals("et")) {
        // Intersection des résultats
        System.out.println(motCle+index.get(motCle));
        resultats = intersection(resultats, index.get(motCle));
      } else if (motCle.equals("ou")) {
        // Union des résultats
        resultats = union(resultats, index.get(motCle));
      } else {
        // Recherche des documents pour le mot clé
        System.out.println(motCle+index.get(motCle));
        resultats = index.get(motCle);
      }
    }

    return resultats;
  }

  private List<Vehicule> intersection(List<Vehicule> a, List<Vehicule> b) {
    // Implémenter l'intersection de deux listes de documents
    List<Vehicule> result = new ArrayList<Vehicule>();
    if(a==null){
        result = b;
    }else{
        if(b==null){
            result = b;
        }else{
            for (Vehicule aVehicule : a) {
                if (b.contains(aVehicule)){
                }else{
                    result.add(aVehicule);
                }
            }
            for (Vehicule bVehicule : b) {
                if (a.contains(bVehicule)){
                }else{
                    result.add(bVehicule);
                }
            }
        }
    }
    return result;
  }

  private List<Vehicule> union(List<Vehicule> a, List<Vehicule> b) {
    // Implémenter l'union de deux listes de documents
    if(a==null){
    }else{
        if (b==null) {
            
        }else{
            for (Vehicule bVehicule : b) {
                a.add(bVehicule);
            }
        }
    }
    
    return a;
  }


}