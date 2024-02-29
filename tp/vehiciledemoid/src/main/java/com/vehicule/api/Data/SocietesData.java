package com.vehicule.api.Data;

import java.util.ArrayList;
import java.util.Arrays;


import com.vehicule.Patrons.Composite.Societe;
import com.vehicule.Patrons.Composite.SocieteCliente;

public class SocietesData {
    public ArrayList<Societe> societes = new ArrayList<Societe>();

    public SocietesData(){    

        this.societes.add(new SocieteCliente("Comilog","Gabon"));
        this.societes.add(new SocieteCliente("GOC","Gabon"));
        this.societes.add(new SocieteCliente("SNE","Gabon"));
        this.societes.add(new SocieteCliente("Sorepco","Cameroun"));
        this.societes.add(new SocieteCliente("SNI","Cameroun"));
        this.societes.add(new SocieteCliente("Cogeni","Cameroun"));
        this.societes.add(new SocieteCliente("SIR","Cote d'ivoire"));
        this.societes.add(new SocieteCliente("SAPH","Cote d'ivoire"));
        this.societes.add(new SocieteCliente("CIE","Cote d'ivoire"));
    }

    public ArrayList<String> convertStringToArrayList(String texte){
        String[] splitted = texte.split(",");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(splitted));
        return arrayList;

    }

    public ArrayList<Societe> getSocieteInList(String texte){
        ArrayList<Societe>  list = new ArrayList<>();
        ArrayList<String> splitted = convertStringToArrayList(texte);
        for(String split : splitted){
            for(Societe soc : this.societes){
                if(soc.nomSociete.equals(split)){
                    list.add(soc);
                    break;
                }
            }
        }
        return list;
    }


}
