package structuration.adaptateur.Adaptateur;

public class Adaptateur implements Interface{

    Adaptee adapte = new Adaptee();

    public void service(){
        adapte.service_specific();
    }
    
}
