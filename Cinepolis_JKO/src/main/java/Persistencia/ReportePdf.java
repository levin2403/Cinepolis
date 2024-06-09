package Persistencia;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;

import java.io.FileOutputStream;
import java.io.IOException;

public class ReportePdf {

    public void generarBoletoCine(String tituloPelicula, String fechaHoraFuncion, String nombreSala,
                                   String numeroAsiento, String nombreSucursal, String direccionSucursal,
                                   double precioBoleto, String rutaArchivo) {
        Document document = new Document(PageSize.A4);
        try {
            PdfWriter.getInstance(document, new FileOutputStream(rutaArchivo));
            document.open();

            // Definir fuentes
            Font fontTitulo = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD, BaseColor.WHITE);
            Font fontNormal = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL, BaseColor.BLACK);

            // Tabla para el boleto
            PdfPTable table = new PdfPTable(2);
            table.setWidthPercentage(100); // Porcentaje del ancho de la página

            // Celda para el título
            PdfPCell cell;
            cell = new PdfPCell(new Phrase("Cinépolis", fontTitulo));
            cell.setColspan(2);
            cell.setBackgroundColor(BaseColor.BLUE);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            table.addCell(cell);

            // Contenido del boleto
            table.addCell(new Phrase("Película:", fontNormal));
            table.addCell(new Phrase(tituloPelicula, fontNormal));
            table.addCell(new Phrase("Fecha y hora de función:", fontNormal));
            table.addCell(new Phrase(fechaHoraFuncion, fontNormal));
            table.addCell(new Phrase("Sala:", fontNormal));
            table.addCell(new Phrase(nombreSala, fontNormal));
            table.addCell(new Phrase("Asiento:", fontNormal));
            table.addCell(new Phrase(numeroAsiento, fontNormal));
            table.addCell(new Phrase("Sucursal:", fontNormal));
            table.addCell(new Phrase(nombreSucursal, fontNormal));
            table.addCell(new Phrase("Dirección:", fontNormal));
            table.addCell(new Phrase(direccionSucursal, fontNormal));

            // Nueva fila para el precio
            table.addCell(new Phrase("Precio del boleto:", fontNormal));
            table.addCell(new Phrase(String.valueOf(precioBoleto), fontNormal));

            // Agregar tabla al documento
            document.add(table);

            // Insertar imagen de código QR
            Image qrImage = Image.getInstance("qr_code.png");
            qrImage.setAlignment(Image.ALIGN_CENTER);
            qrImage.scaleToFit(100, 100); // Ajustar tamaño
            document.add(qrImage);

            document.close();
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReportePdf reportePdf = new ReportePdf();
        reportePdf.generarBoletoCine("Pulp Fiction", "Miércoles, 12 de junio de 2024, 20:00 hrs",
                "Sala 1", "A12", "Cinépolis Centro", "Av. Insurgentes Sur 123, Col. Roma, CDMX",
                150.0, "boleto_cine.pdf");
    }
}












