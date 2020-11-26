package com.simplify.api.pdf;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;


import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;

public class GerarPDF {

    public void export (HttpServletResponse response) throws IOException {
        String imgSrc = "images\\icon.jpg";
        ImageData data = ImageDataFactory.create(imgSrc);
        Image image1 = new Image(data);
        image1.scaleAbsolute(64,64);
        image1.setMarginLeft(200);
        String titulo = "SIMPLIFY";
        String texto = "Obrigada por realizar seu agendamento conosco.";
        Paragraph paragraph1 = new Paragraph(titulo);
        Paragraph paragraph2 = new Paragraph(texto);
        paragraph1.setMarginLeft(200);
        paragraph2.setMarginLeft(130);
        PdfWriter pdfWriter = new PdfWriter(response.getOutputStream());
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();

        Document document = new Document(pdfDocument);
        document.add(image1);
        document.add(paragraph1);
        document.add(paragraph2);

        document.close();

    }

}
