package com.trabalho1;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Utility class for generating participation certificates as PDF files.
 */

public class CertificateUtil {

    /**
     * Generates a PDF certificate for a participant in a specific event.
     * The certificate content varies according to the event type.
     */

    public static void certificateGenarate(People p,Event e){
        Document document = new Document();
        try {
            String fileName = "certificate_" + p.getName().replaceAll("\\s+", "_") + "_" + e.getName().replaceAll("\\s+", "_") + ".pdf";
            PdfWriter.getInstance(document, new FileOutputStream(fileName));
            document.open();
            document.add(new Paragraph("========================================"));
            document.add(new Paragraph("         Certificate of Participation"));
            document.add(new Paragraph("========================================"));
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Event: " + e.getName())); 
            document.add(new Paragraph(" "));

            if (e instanceof Lecture) {
                Lecture l = (Lecture) e;
                document.add(new Paragraph("Type: Lecture"));
                document.add(new Paragraph("Theme: " + l.getThemeOfLecture()));
            } else if (e instanceof WorkShop) {
                WorkShop w = (WorkShop) e;
                document.add(new Paragraph("Type: Workshop"));
                document.add(new Paragraph("Apprenticeship: " + w.getApprenticeship()));
            } else if (e instanceof Course) {
                Course c = (Course) e;
                document.add(new Paragraph("Type: Course"));
                document.add(new Paragraph("Hours: " + c.getHoursCourse()));
            } else if (e instanceof AcademicFair) {
                AcademicFair f = (AcademicFair) e;
                document.add(new Paragraph("Type: Academic Fair"));
                document.add(new Paragraph("Exhibitions:"));
                for (String exhibition : f.getExhibitions()) {
                    document.add(new Paragraph(" - " + exhibition));
                }
            } else {
                document.add(new Paragraph("Type: Generic Event"));
            }

            document.add(new Paragraph("----------------------------------------"));
            document.add(new Paragraph("Participant: " + p.getName()));
            document.add(new Paragraph("Date: " + e.getDate()));
            document.add(new Paragraph("Location: " + e.getLocal()));
            document.add(new Paragraph("========================================"));
            document.close();
            System.out.println("----------------------------------------");
            System.out.println("Certificate generated at: " + fileName);
            System.out.println("----------------------------------------");
        } catch (FileNotFoundException | DocumentException ex) {
            ex.printStackTrace();
        }
    
}
}