package com.vehicule.api.Data;

import java.util.ArrayList;
import java.util.Arrays;

import com.vehicule.Patrons.AbstractFactory.IvehiculeFactory;
import com.vehicule.Patrons.AbstractFactory.VehicleFactoryEssence;
import com.vehicule.Patrons.AbstractFactory.Vehicule;
import com.vehicule.Patrons.AbstractFactory.VehiculeFactoryElectrique;

public class VehiculeData {
    public ArrayList<Vehicule> vehicules = new ArrayList<Vehicule>();

    public VehiculeData(){

        IvehiculeFactory vehiculeFactory1 = new VehicleFactoryEssence();
        IvehiculeFactory vehiculeFactory2 = new VehiculeFactoryElectrique();


        

        this.vehicules.add(vehiculeFactory1.getAutomobile("1", "Toyota Yaris", convertStringToArrayList("Climatisation, GPS, Vitres électriques"), convertStringToArrayList("fade, smooth"), 6000000, getImage()));
        this.vehicules.add(vehiculeFactory1.getAutomobile("2", "Renault Clio", convertStringToArrayList("Bluetooth, Jantes alliage, Radar de recul"), convertStringToArrayList("fade, smooth"), 5500000, getImage()));
        this.vehicules.add(vehiculeFactory1.getAutomobile("3", "Peugeot 208", convertStringToArrayList("Toit ouvrant, Pack Sport, Sièges chauffants"), convertStringToArrayList("fade, smooth"), 7500000, getImage()));
        this.vehicules.add(vehiculeFactory1.getAutomobile("4", "Volkswagen Golf", convertStringToArrayList("Climatisation automatique, Phares LED, Système de navigation"), convertStringToArrayList("fade, smooth"), 8000000, getImage()));
        this.vehicules.add(vehiculeFactory1.getAutomobile("5", "Citroën C3", convertStringToArrayList("Antibrouillards, Barres de toit, Caméra de recul"), convertStringToArrayList("fade, smooth"),5500000 , getImage()));
        this.vehicules.add(vehiculeFactory1.getAutomobile("6", "Ford Fiesta", convertStringToArrayList("Climatisation manuelle, Radio CD, Vitres électriques avant"), convertStringToArrayList("fade, smooth"), 7000000, getImage()));
        this.vehicules.add(vehiculeFactory1.getAutomobile("7", "Opel Corsa", convertStringToArrayList("Bluetooth, Jantes alliage, Peinture métallisée"), convertStringToArrayList("fade, smooth"), 8000000, getImage()));
        this.vehicules.add(vehiculeFactory1.getAutomobile("8", "Hyundai i20", convertStringToArrayList("Climatisation automatique, Feux de jour LED, Régulateur de vitesse"), convertStringToArrayList("fade, smooth"), 6000000, getImage()));
        this.vehicules.add(vehiculeFactory1.getAutomobile("9", "Kia Rio", convertStringToArrayList("Climatisation manuelle, Radio MP3, Vitres électriques avant et arrière"), convertStringToArrayList("fade, smooth"), 7500000, getImage()));
        this.vehicules.add(vehiculeFactory1.getAutomobile("10", "Fiat 500", convertStringToArrayList("Toit ouvrant, Jantes alliage, Pack Confort"), convertStringToArrayList("fade, smooth"), 3000000, getImage()));
        this.vehicules.add(vehiculeFactory2.getAutomobile("11", "Tesla Model 3", convertStringToArrayList("Pilotage automatique, Toit ouvrant"), convertStringToArrayList("fade, smooth"), 40000000, getImage()));
        this.vehicules.add(vehiculeFactory2.getAutomobile("12", "Renault Zoe", convertStringToArrayList("Recharge rapide, Climatisation automatique"), convertStringToArrayList("fade, smooth"), 30000000, getImage()));
        this.vehicules.add(vehiculeFactory2.getAutomobile("13", " Hyundai Kona Electric ", convertStringToArrayList("Système de navigation, Jantes alliage "), convertStringToArrayList("fade, smooth"), 35000000, getImage()));
        this.vehicules.add(vehiculeFactory2.getAutomobile("14", "", convertStringToArrayList(" Toit ouvrant, Pack Confort"), convertStringToArrayList("fade, smooth"), 38000000, getImage()));
        this.vehicules.add(vehiculeFactory2.getAutomobile("15", " Peugeot e-208", convertStringToArrayList(" Climatisation automatique, Toit ouvrant"), convertStringToArrayList("fade, smooth"), 40000000, getImage()));
        
        this.vehicules.add(vehiculeFactory1.getScooter("16", " Yamaha NMAX 125", convertStringToArrayList("ABS, Freinage à disque, Top case "), convertStringToArrayList("fade, smooth"), 1500000, getImage()));
        this.vehicules.add(vehiculeFactory1.getScooter("17", " Piaggio Liberty 125", convertStringToArrayList(" ABS, Smart Key, Porte-bagages"), convertStringToArrayList("fade, smooth"), 1300000, getImage()));
        this.vehicules.add(vehiculeFactory1.getScooter("18", "Peugeot Django 125 ", convertStringToArrayList("ABS, Éclairage LED, Prise USB "), convertStringToArrayList("fade, smooth"), 1400000, getImage()));
        this.vehicules.add(vehiculeFactory1.getScooter("19", "Honda PCX 125 ", convertStringToArrayList(" ABS, Smart Key, Stop & Start"), convertStringToArrayList("fade, smooth"), 1600000, getImage()));
        this.vehicules.add(vehiculeFactory1.getScooter("20", " Kymco Agility 125", convertStringToArrayList(" ABS, Grand coffre, Pare-brise"), convertStringToArrayList("fade, smooth"), 1200000, getImage()));
        this.vehicules.add(vehiculeFactory1.getScooter("21", " Sym Orbit 125", convertStringToArrayList(" ABS, Freinage à disque, Plancher plat"), convertStringToArrayList("fade, smooth"), 1100000, getImage()));
        this.vehicules.add(vehiculeFactory1.getScooter("22", " Super Soco CPX", convertStringToArrayList("Autonomie de 120 km, Batterie amovible, Vitesse max 45 km/h "), convertStringToArrayList("fade, smooth"), 2000000, getImage()));
        this.vehicules.add(vehiculeFactory1.getScooter("23", " Niu NQi Sport", convertStringToArrayList(" Autonomie de 100 km, Freinage à disque, Double batterie"), convertStringToArrayList("fade, smooth"), 1800000, getImage()));
        this.vehicules.add(vehiculeFactory1.getScooter("24", " E-Twow Booster GT 2020", convertStringToArrayList(" Autonomie de 40 km, Pliable, Bluetooth"), convertStringToArrayList("fade, smooth"), 1300000, getImage()));
        this.vehicules.add(vehiculeFactory1.getScooter("25", " Zero 10X", convertStringToArrayList("Autonomie de 85 km, Suspension avant et arrière, Pneu large "), convertStringToArrayList("fade, smooth"), 2500000, getImage()));
        this.vehicules.add(vehiculeFactory2.getScooter("26", "Super Soco CPX ", convertStringToArrayList("Autonomie de 120 km, Batterie amovible, Vitesse max 45 km/h"), convertStringToArrayList("fade, smooth"), 2000000, getImage()));
        this.vehicules.add(vehiculeFactory2.getScooter("27", " Niu NQi Sport", convertStringToArrayList("Autonomie de 100 km, Freinage à disque, Double batterie"), convertStringToArrayList("fade, smooth"), 1800000, getImage()));
        this.vehicules.add(vehiculeFactory2.getScooter("28", " E-Twow Booster GT 2020", convertStringToArrayList("Autonomie de 40 km, Pliable, Bluetooth"), convertStringToArrayList("fade, smooth"), 1300000, getImage()));
        this.vehicules.add(vehiculeFactory2.getScooter("29", "Zero 10X ", convertStringToArrayList("Autonomie de 85 km, Suspension avant et arrière, Pneu large"), convertStringToArrayList("fade, smooth"), 2500000, getImage()));
        this.vehicules.add(vehiculeFactory2.getScooter("30", "NIU UQi ", convertStringToArrayList("Autonomie de 55 km, Design compact, LED avant et arrière"), convertStringToArrayList("fade, smooth"), 1000000, getImage()));
        this.vehicules.add(vehiculeFactory2.getScooter("31", " E-Twow Booster S2", convertStringToArrayList("Autonomie de 25 km, Pliable, Léger"), convertStringToArrayList("fade, smooth"), 800000, getImage()));
        this.vehicules.add(vehiculeFactory2.getScooter("32", "Xiaomi Mi Electric Scooter 1S ", convertStringToArrayList("Autonomie de 30 km, Pliable, Freinage à disque"), convertStringToArrayList("fade, smooth"), 900000, getImage()));
        this.vehicules.add(vehiculeFactory2.getScooter("33", "Segway Ninebot ES2 ", convertStringToArrayList("Segway Ninebot ES2"), convertStringToArrayList("fade, smooth"), 7500000, getImage()));
        this.vehicules.add(vehiculeFactory2.getScooter("34", " E-Wheels E2S", convertStringToArrayList("Autonomie de 25 km, Pliable, Double freinage"), convertStringToArrayList("fade, smooth"), 600000, getImage()));
        this.vehicules.add(vehiculeFactory2.getScooter("35", "\tSpeedway Leger", convertStringToArrayList("Autonomie de 40 km, Pliable, Suspension avant"), convertStringToArrayList("fade, smooth"), 1200000, getImage()));
     

    }

    public ArrayList<String> convertStringToArrayList(String texte){
        String[] splitted = texte.split(",");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(splitted));
        return arrayList;

    }

    public ArrayList<String> getImage(){
        
        ArrayList<String> image = new ArrayList<String>();
        image.add("http://localhost");
        image.add("http://localhost");
        image.add("http://localhost");
        return image;

    }
}
