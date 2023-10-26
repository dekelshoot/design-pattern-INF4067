package structuration.adaptateur.AdapteurImpressionDocument;

public class ServeurWeb {
    public static void main(String[] args) {
        IDocument pdf = new DocumentPdf();
        pdf.setContenu();
        pdf.dessine();
        pdf.imprime();
    }
}