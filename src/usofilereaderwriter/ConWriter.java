/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usofilereaderwriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

/**
 *
 * @author hola
 */
public class ConWriter {
    public void escribirArchivo (String path, String contenido) throws IOException{
        FileWriter fr = new FileWriter(path,true);
        fr.write(contenido);
        fr.close();
    }
    public void cargarArchivo(String path) throws FileNotFoundException, IOException{
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        while(linea != null){
            System.out.println(linea);
            linea = br.readLine();
        }
    }
}
