package structuration.composite.Composite;

import java.util.ArrayList; // import the ArrayList class

public class Composite extends Component {
    ArrayList<Component> elements = new ArrayList<Component>();
    public void operation1(){
        System.out.println("je suis l'oération 1 de Composite");
    }
    public void operation2(){
        System.out.println("je suis l'oération 2 de Composite");
    }

    public void addComponent(Component elem){
        elements.add(elem);
    }
    public void removeComponent(int index){
        elements.remove(index);
    }
    public Component getComponent(int index){
        return elements.get(index);
    }
    public int getComponentCount(){
        return elements.size();
    }

}
