package com.vehicule.Patrons.Adapter;
import java.io.FileNotFoundException;

// importing the required packages
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

public class PdfDocumentAdapte {
    public void imprimerPdf(String nom,String contenu) {
         
        // path to create the file
        String file_path = "assets/"+nom+".pdf";
 
        // creating PdfWriter object
        PdfWriter pdf_writer;
        try {
            pdf_writer = new PdfWriter(file_path);

        // Representing PdfDocument object
        PdfDocument pdf_doc = new PdfDocument(pdf_writer);
 
        // Creating a Document
        // Instantiating a document object from pdf document
        // object
        Document document = new Document(pdf_doc);
 
        // paragraph to be added
        String para = contenu;
              // Creating Paragraph object
              Paragraph paragraph_obj
            = new Paragraph(para);
 
        // Adding paragraphs to document
        document.add(paragraph_obj);
       
        // Closing the document
        document.close();
       
        // final message
        System.out.println(
            "Finished writing contents to the file!");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
    }

}
