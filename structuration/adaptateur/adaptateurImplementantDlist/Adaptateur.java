package structuration.adaptateur.adaptateurImplementantDlist;

public class Adaptateur implements Istack {
    Dlist dlist = new Dlist();
    Object o = null;

    public void push(Object o){
        System.out.print("push() appel ");
        dlist.insertTail(o);
    }
    public void pop (){
        System.out.print("pop() appel ");
        dlist.removeTail();
    }
    
    public void top(){
        System.out.print("top() appel ");
        dlist.getTail();
    }
}
