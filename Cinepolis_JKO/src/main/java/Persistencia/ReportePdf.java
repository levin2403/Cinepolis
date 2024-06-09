/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import entidad.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.SQLException;
import java.util.List;

public class ReportePdf {

    public void generarReportePeliculas() {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("ReportePeliculas.pdf"));
            document.open();

            Font fontTitulo = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18);
            Font fontNormal = FontFactory.getFont(FontFactory.HELVETICA, 12);

            document.add(new Paragraph("Reporte de Películas\n\n", fontTitulo));

            PeliculaDAO peliculaDAO = new PeliculaDAO(new ConexionBD());
            List<Pelicula> peliculas = peliculaDAO.obtenerPeliculas();

            for (Pelicula pelicula : peliculas) {
                document.add(new Paragraph("ID: " + pelicula.getIdPelicula(), fontNormal));
                document.add(new Paragraph("Título: " + pelicula.getTitulo(), fontNormal));
                document.add(new Paragraph("Género: " + pelicula.getIdGenero(), fontNormal));
                document.add(new Paragraph("País: " + pelicula.getIdPais(), fontNormal));
                document.add(new Paragraph("\n"));
            }

            document.close();
            System.out.println("Reporte de películas generado correctamente.");

        } catch (FileNotFoundException | DocumentException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReportePdf reportePdf = new ReportePdf();
        reportePdf.generarReportePeliculas();
    }
}
