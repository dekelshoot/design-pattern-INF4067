package structuration.composite.Composite;

import structuration.adaptateur.Adaptateur.Interface;

public class Client {
     public static void main(String[] args) {
        Component Leaf = new Leaf();
        Composite composite = new Composite();

        System.out.println("test de Leaf");
        Leaf.operation1();
        Leaf.operation2();
        System.out.println("");

        System.out.println("test de Composite");
        composite.operation1();
        composite.operation2();

        composite.addComponent(Leaf);
        System.out.println("la taille de mes composantes est de "+ composite.getComponentCount());
    }
    
}
