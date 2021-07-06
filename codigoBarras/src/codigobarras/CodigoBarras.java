package codigobarras;

import java.io.FileOutputStream;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BarcodeEAN;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;

public class CodigoBarras {

    public static void main(String[] args) {

        //Criando um objeto da classe Document
        Document document = new Document(PageSize.A4, 50, 50, 50, 50);
        try {
            //O documento criado acima será direcionado para um arquivo PDF. 
            //Caminho do arquivo PDF
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("C:\\Codigo_Barra.pdf"));
            //Abrindo o documento. 
            document.open();
            //Adicionando um novo parágrafo. 
            document.add(new Paragraph("Geração de código de barras"));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            //Começando a configurar o cod de barras
            PdfContentByte cb = writer.getDirectContent();
            BarcodeEAN codeEAN = new BarcodeEAN();
            // O iText suporta os principais tipos de código de barras, como Barcode39,
            // Barcode128 (128, 128_UCC, 128_RAW), BarcodeEAN (EAN13, EAN8, UPCA, UPCE), EANSUP, etc. 
            codeEAN.setCodeType(codeEAN.EAN13);
            codeEAN.setCode("7898363332493");
            Image imageEAN = codeEAN.createImageWithBarcode(cb, null, null);
            document.add(new Phrase(new Chunk(imageEAN, 0, 0)));
        } catch (Exception de) {
            de.printStackTrace();
        }
        document.close();
        System.out.println("Código de barras criado...");
    }
}
