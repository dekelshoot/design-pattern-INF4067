package structuration.adaptateur.adaptateurHeritantDlist;

public class Adaptateur extends Dlist implements Istack  {

    public void push(Object o){
        System.out.print("push() appel ");
        insertTail(o);
    }
    public void pop (){
        System.out.print("pop() appel ");
        removeTail();
    }
    
    public void top(){
        System.out.print("top() appel ");
        getTail();
    }
}
