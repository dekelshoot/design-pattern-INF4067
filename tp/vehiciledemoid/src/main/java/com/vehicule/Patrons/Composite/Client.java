package com.vehicule.Patrons.Composite;

public class Client {
    public static void main(String[] args) {
        Societe societe1 = new SocieteCliente("CMC","Cameroun");
        Societe societe2 = new SocieteCliente("Sorepco","Cameroun");
        GroupeSocieteCliente societe3 = new GroupeSocieteCliente("Fokou","Cameroun");
        societe3.ajouterSociete(societe1);
        societe3.ajouterSociete(societe2);
        societe3.afficherSociete();
    }
    
}
