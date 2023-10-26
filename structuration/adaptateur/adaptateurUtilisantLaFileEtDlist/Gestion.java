package structuration.adaptateur.adaptateurUtilisantLaFileEtDlist;

import structuration.adaptateur.Adaptateur.Interface;

public class Gestion {
      public static void main(String[] args) {
        Object o = null;
        Ifile adapte = new Adaptateur();
        adapte.push(o);
        adapte.pop();
        adapte.top();
    }
}
