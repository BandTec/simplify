package br.com.bandtec.apiservicos.gerarPdf;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RG {
    public void export(HttpServletResponse response) throws IOException {
        String imgSrc = "images\\logo-simplify.png";
        ImageData data = ImageDataFactory.create(imgSrc);
        Image image1 = new Image(data);
        String imgSrc2 = "images\\howTo.jpg";
        ImageData data2 = ImageDataFactory.create(imgSrc2);
        Image image2 = new Image(data2);
        String imgSrc3 = "images\\20.jpg";
        ImageData data3 = ImageDataFactory.create(imgSrc3);
        Image image3 = new Image(data3);

        image1.scaleAbsolute(80, 80);
        image1.setMarginLeft(200);
        image2.scaleAbsolute(150, 150);
        image2.setMarginLeft(200);
        image3.scaleAbsolute(150, 150);
        image3.setMarginLeft(200);
        String texto = "Obrigada por realizar seu agendamento conosco.\n (*tolerância de 15 minutos)";
        Paragraph paragraph2 = new Paragraph(texto);
        paragraph2.setMarginLeft(130);
        String instrucao = "\n  Dados do Agendamento: \n DATA: 18/12/2020 \n HORARIO*: 13:30 \n SERVIÇO: 2°via RG";
        String sobre = "\n O serviço que você escolheu possui uma taxa de R$20,00. \n pensando no seu conforto agora temos a opção de pagamento com o PIX, siga as instruções abaixo e economize tempo no seu atendimento:";
        String qr = "\n 1- Acesse o APP do seu banco e entre no PIX  \n 2- Escolha a opção pagar com PIX \n  3- Aponte a câmera do seu celular para o QR-CODE como mostra na ilustração abaixo: ";
        String seu = "\n SEU QR-CODE :\n R$ 20,00";
        Paragraph paragraph3 = new Paragraph(instrucao);
        paragraph3.setMarginLeft(100);
        Paragraph paragraph4 = new Paragraph(sobre);
        paragraph4.setMarginLeft(100);
        Paragraph paragraph5 = new Paragraph(qr);
        paragraph5.setMarginLeft(100);
        Paragraph paragraph6 = new Paragraph(seu);
        paragraph6.setMarginLeft(220);
        PdfWriter pdfWriter = new PdfWriter(response.getOutputStream());
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();

        Document document = new Document(pdfDocument);
        document.add(image1);
        document.add(paragraph3);
        document.add(paragraph4);
        document.add(paragraph5);
        document.add(image2);
        document.add(paragraph6);
        document.add(image3);
        document.add(paragraph2);


        document.close();

    }
}
