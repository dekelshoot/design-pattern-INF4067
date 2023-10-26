package structuration.adaptateur.adaptateurHeritantDlist;

import structuration.adaptateur.Adaptateur.Interface;

public class Gestion {
      public static void main(String[] args) {
        Object o = null;
        Istack adapte = new Adaptateur();
        adapte.push(o);
        adapte.pop();
        adapte.top();
    }
}
