package com.vehicule.Patrons.Bridge;

 public abstract class Widget {
    String type;
    String contenu;
    public  Widget(String contenu){
        this.contenu = contenu;
    };

    public Widget getWidget(){
        return this;
    }
}
