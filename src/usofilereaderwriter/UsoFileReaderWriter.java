/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usofilereaderwriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hola
 */
public class UsoFileReaderWriter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ConRead cr = new ConRead();
        //cr.leerArchivo();
        
        ConBufferedReader cbr = new ConBufferedReader();
        try {
            cbr.leerArchivo();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
}
