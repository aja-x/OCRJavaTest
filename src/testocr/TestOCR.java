/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testocr;

import java.io.File;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

/**
 *
 * @author yuuki
 */
public class TestOCR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tesseract tesseract = new Tesseract();
        try {
            tesseract.setLanguage("eng");
            tesseract.setDatapath("E:\\PENS\\Semester 4\\Pemrograman Lanjut\\Praktikum\\Minggu 7 (project db)\\OCRJavaTest-master\\src\\tessdata");
            String text = tesseract.doOCR(new File("E:\\Capture.png"));		
            System.out.print(text);
        } catch (TesseractException e) {		
            e.printStackTrace();
        }
    }
    
}
