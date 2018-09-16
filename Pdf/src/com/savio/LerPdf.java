package com.savio;

import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

/**
 *
 * @author savio
 */
public class LerPdf {
    
    public String getPdf(String caminho) throws IOException {
        String text = "";
        try {
            //carregar arquivo pdf
            File file = new File(caminho);
            PDDocument document = PDDocument.load(file);

            PDFTextStripper pdfStripper = new PDFTextStripper();

            // retirar texto do pdf
            text = pdfStripper.getText(document);
            System.out.println(text);

            // fechar documento
            document.close();

        } catch (Exception e) {
            System.err.println(e);
        }
        return text;
    }
}
