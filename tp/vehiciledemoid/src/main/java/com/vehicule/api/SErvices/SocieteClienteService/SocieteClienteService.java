package com.vehicule.api.SErvices.SocieteClienteService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.vehicule.Patrons.Composite.GroupeSocieteCliente;
import com.vehicule.Patrons.Composite.Societe;
import com.vehicule.Patrons.Composite.SocieteCliente;
import com.vehicule.api.Data.SocietesData;

public class SocieteClienteService {
    ArrayList<Societe> societes = new ArrayList<Societe>();
    SocietesData societesData = new SocietesData();


    public SocieteClienteService(){
        this.initSociete();
    }
    private void initSociete() {
        this.societes= societesData.societes;
      }

      public List<Societe> findAll() {
        return societes.stream().collect(Collectors.toList());
      }

      public Societe findByName(final String nom) {
        for(Societe s : societes){

            if(s.nomSociete.equals(nom)){
                return s;
            }
        }
        return null;
      }

   
      public Societe add(String nomSociete, String pays, String listPartenaires){
        Societe societe ;

        if(listPartenaires.equals("") ){
            societe = new SocieteCliente(nomSociete,pays);
            societes.add(societe);
            return societe;
        }else{
            societe = new GroupeSocieteCliente(nomSociete,pays,this.societesData.getSocieteInList(listPartenaires));
            societes.add(societe);
            return societe;
        }
      }
}
