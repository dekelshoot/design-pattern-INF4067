package structuration.adaptateur.AdapteurImpressionDocument;

public class DocumentPdf implements IDocument{

    ComposantePdf outilPdf = new ComposantePdf();
    public void imprime(){
        System.out.print("imprime() appel ");
        outilPdf.pdfEnvoieImprimante();
    }
    public void dessine(){
        System.out.print("dessine() appel ");
        outilPdf.pdfPrepareAffichage();
    }
    public void setContenu(){
        System.out.print("setContenu() appel ");
        outilPdf.pdfFixeContenu();
    }
}
