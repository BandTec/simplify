package br.com.bandtec.apiservicos.gerarPdf;

import br.com.bandtec.apiservicos.entities.Solicitacao;
import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

public class CertidaoNascimento {
    Solicitacao soli = new Solicitacao();
    public static int random_int(int Min, int Max)
    {
        return (int) (Math.random()*(Max-Min))+Min;
    }
    Random protocolo = new Random();
    String protocolinho = String.format("202000"+
            random_int(9000, 90000));
    public void export(HttpServletResponse response) throws IOException {
        String imgSrc = "images\\logo-simplify.png";
        ImageData data = ImageDataFactory.create(imgSrc);
        Image image1 = new Image(data);
        String imgSrc2 = "images\\howTo.jpg";
        ImageData data2 = ImageDataFactory.create(imgSrc2);
        Image image2 = new Image(data2);
        String imgSrc3 = "images\\25.jpg";
        ImageData data3 = ImageDataFactory.create(imgSrc3);
        Image image3 = new Image(data3);

        image1.scaleAbsolute(80, 80);
        image1.setMarginLeft(200);
        image2.scaleAbsolute(150, 150);
        image2.setMarginLeft(175);
        image3.scaleAbsolute(150, 150);
        image3.setMarginLeft(175);
        Text texto = new Text("Obrigada por realizar seu agendamento conosco.\n (¹tolerância de 15 minutos)").setFont(PdfFontFactory.createFont(FontConstants.TIMES_ROMAN));
        Text protoc = new Text("PROTOCOLO SOLICITAÇÃO :"+protocolinho).setFont(PdfFontFactory.createFont(FontConstants.TIMES_ROMAN)).setBold();
        Paragraph paragraph2 = new Paragraph(texto);
        paragraph2.setMarginLeft(130);

        Text sobre = new Text("\n O serviço que você escolheu possui uma taxa de R$25,00. \n pensando no seu conforto agora temos a opção de pagamento com o PIX, siga as instruções abaixo e economize tempo no seu atendimento:").setFont(PdfFontFactory.createFont(FontConstants.TIMES_ROMAN));
        Text qr =  new Text("\n 1- Acesse o APP do seu banco e entre no PIX  \n 2- Escolha a opção pagar com PIX \n  3- Aponte a câmera do seu celular para o QR-CODE como mostra na ilustração abaixo: ").setFont(PdfFontFactory.createFont(FontConstants.TIMES_ROMAN));
        Text seu = new Text("\n SEU QR-CODE :\n R$ 25,00").setFont(PdfFontFactory.createFont(FontConstants.TIMES_ROMAN)).setBold();

        Paragraph paragraph = new Paragraph(protoc);
        paragraph.setMarginLeft(50);
        Paragraph paragraph4 = new Paragraph(sobre);
        paragraph4.setMarginLeft(50);
        Paragraph paragraph5 = new Paragraph(qr);
        paragraph5.setMarginLeft(50);
        Paragraph paragraph6 = new Paragraph(seu);
        paragraph6.setMarginLeft(200);
        PdfWriter pdfWriter = new PdfWriter(response.getOutputStream());
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);
        pdfDocument.addNewPage();

        Document document = new Document(pdfDocument);
        document.add(image1);
        document.add(paragraph);
        document.add(paragraph4);
        document.add(paragraph5);
        document.add(image2);
        document.add(paragraph6);
        document.add(image3);
        document.add(paragraph2);


        document.close();

    }

    public String getProtocolinho() {
        return protocolinho;
    }
}
