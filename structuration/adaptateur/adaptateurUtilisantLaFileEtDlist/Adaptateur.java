package structuration.adaptateur.adaptateurUtilisantLaFileEtDlist;

public class Adaptateur extends Dlist implements Ifile  {

    public void push(Object o){
        System.out.print("push() appel ");
        insertTail(o);
    }
    public void pop (){
        System.out.print("pop() appel ");
        removeHead();
    }
    
    public void top(){
        System.out.print("top() appel ");
        removeHead();
    }
}
