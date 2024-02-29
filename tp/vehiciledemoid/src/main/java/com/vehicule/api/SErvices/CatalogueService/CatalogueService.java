package com.vehicule.api.SErvices.CatalogueService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.vehicule.Patrons.AbstractFactory.IvehiculeFactory;
import com.vehicule.Patrons.AbstractFactory.VehicleFactoryEssence;
import com.vehicule.Patrons.AbstractFactory.Vehicule;
import com.vehicule.Patrons.AbstractFactory.VehiculeFactoryElectrique;
import com.vehicule.Patrons.Iterator.Catalogue;
import com.vehicule.Patrons.Iterator.CatalogueVehicule;
import com.vehicule.api.Data.VehiculeData;
public class CatalogueService {
    ArrayList<Vehicule> vehicules = new ArrayList<Vehicule>();
    VehiculeData vehiculeData = new VehiculeData();
    Catalogue catalogue;

    public CatalogueService(){
        this.initCatalogue();
    }
    private void initCatalogue() {
        this.vehicules= vehiculeData.vehicules;
        this.catalogue = new CatalogueVehicule();
        catalogue.setVehicules(vehicules);
      }
      public List<Vehicule> findAll() {
        return catalogue.vehicules.stream().collect(Collectors.toList());
      }
      public Vehicule findById(final String id) {
        for(Vehicule v : catalogue.vehicules){

            if(v.id.equals(id)){
                return v;
            }
        }
        return null;
      }

      public Vehicule update(String id, String nom, String type, String carburation,  String options, String animations,int prix, String images) {
        IvehiculeFactory vehiculeFactory1 = new VehicleFactoryEssence();
        IvehiculeFactory vehiculeFactory2 = new VehiculeFactoryElectrique();
        Vehicule vehicule ;
  
        if(type.equals("Automobile") ){
            if(carburation.equals("Essence") ){
                vehicule=vehiculeFactory1.getAutomobile(id, nom, vehiculeData.convertStringToArrayList(options), vehiculeData.convertStringToArrayList(animations), prix, vehiculeData.convertStringToArrayList(images));
                for(Vehicule v : catalogue.vehicules){

                    if(v.id.equals(id)){
                        this.catalogue.vehicules.set(catalogue.vehicules.indexOf(v), vehicule);
                        return vehicule;
                    }
                }
                
                return null;
            }else{
                vehicule=vehiculeFactory2.getAutomobile(id, nom, vehiculeData.convertStringToArrayList(options), vehiculeData.convertStringToArrayList(animations), prix, vehiculeData.convertStringToArrayList(images));
                for(Vehicule v : catalogue.vehicules){

                    if(v.id.equals(id)){
                        this.catalogue.vehicules.set(catalogue.vehicules.indexOf(v), vehicule);
                        return vehicule;
                    }
                }
                return null;
            }
        }else{
            if(carburation.equals("Essence") ){
                vehicule=vehiculeFactory1.getScooter(id, nom, vehiculeData.convertStringToArrayList(options), vehiculeData.convertStringToArrayList(animations), prix, vehiculeData.convertStringToArrayList(images));
                for(Vehicule v : catalogue.vehicules){
                    if(v.id.equals(id)){
                        this.catalogue.vehicules.set(catalogue.vehicules.indexOf(v), vehicule);
                        return vehicule;
                    }
                }
                return null;
            }else{
                vehicule=vehiculeFactory2.getScooter(id, nom, vehiculeData.convertStringToArrayList(options), vehiculeData.convertStringToArrayList(animations), prix, vehiculeData.convertStringToArrayList(images));
                for(Vehicule v : catalogue.vehicules){
                    if(v.id.equals(id)){
                        this.catalogue.vehicules.set(catalogue.vehicules.indexOf(v), vehicule);
                        return vehicule;
                    }
                }
                return null;
            }
        }
   
      }

      
      public String remove(final String id) {
        for(Vehicule v: catalogue.vehicules){
            if(v.id.equals(id)){
                int index = catalogue.vehicules.indexOf(v);
                catalogue.vehicules.remove(v);
                for(int i = index; i < catalogue.vehicules.size(); i++){
                    System.out.print(i);
                    v =  catalogue.vehicules.get(i);
                    v.id = ""+(i+1);
                    catalogue.vehicules.set(i,v);
                }
                return id;
            }
        }
        return null;

      }
      public Vehicule add(final Vehicule vehicule) {
        catalogue.vehicules.add(vehicule);
        return vehicule;
      }

      public Vehicule addCreate(String nom, String type, String carburation,  String options, String animations,int prix, String images){
         IvehiculeFactory vehiculeFactory1 = new VehicleFactoryEssence();
        IvehiculeFactory vehiculeFactory2 = new VehiculeFactoryElectrique();
        Vehicule vehicule ;

        if(type.equals("Automobile") ){
            if(carburation.equals("Essence")){
                vehicule=vehiculeFactory1.getAutomobile(""+(catalogue.vehicules.size()+1), nom, vehiculeData.convertStringToArrayList(options), vehiculeData.convertStringToArrayList(animations), prix, vehiculeData.convertStringToArrayList(images));
                this.catalogue.vehicules.add(vehicule);
                return vehicule;
            }else{
                vehicule=vehiculeFactory2.getAutomobile(""+(catalogue.vehicules.size()+1), nom, vehiculeData.convertStringToArrayList(options), vehiculeData.convertStringToArrayList(animations), prix, vehiculeData.convertStringToArrayList(images));
                this.vehicules.add(vehicule);
                return vehicule;
            }
        }else{
            if(carburation.equals("Essence")){
                vehicule=vehiculeFactory1.getScooter(""+(catalogue.vehicules.size()+1), nom, vehiculeData.convertStringToArrayList(options), vehiculeData.convertStringToArrayList(animations), prix, vehiculeData.convertStringToArrayList(images));
                this.catalogue.vehicules.add(vehicule);
                
                return vehicule;
            }else{
                vehicule=vehiculeFactory2.getScooter(""+(catalogue.vehicules.size()+1), nom, vehiculeData.convertStringToArrayList(options), vehiculeData.convertStringToArrayList(animations), prix, vehiculeData.convertStringToArrayList(images));
                this.catalogue.vehicules.add(vehicule);
                return vehicule;
            }
        }
      }
}
