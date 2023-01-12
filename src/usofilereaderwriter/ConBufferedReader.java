/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usofilereaderwriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author hola
 */
public class ConBufferedReader {
    public void leerArchivo() throws FileNotFoundException, IOException{
        FileReader lector = new FileReader("archivo.txt");
        BufferedReader bufferLector = new BufferedReader(lector);
        String linea = bufferLector.readLine();
        while(linea != null){
            System.out.println(linea);
            linea = bufferLector.readLine();
        }
        bufferLector.close();
    }
}
