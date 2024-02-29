package com.vehicule.Patrons.Adapter;
import java.io.IOException;
import java.io.PrintWriter;

public class Client {

public static void main(String[] args) throws IOException {
        Document doc = new DocumentHtml("document 1","immatriculation","kjsdfjksfkjdsfkjdsfsjd dsfbdskf");
        doc.afficherDocument();
        doc.imprimerDocument();

        PdfDocumentAdapte doc1 = new PdfDocumentAdapte();
        doc1.imprimerPdf("doc1",doc.getContenu());
    }
    
}
