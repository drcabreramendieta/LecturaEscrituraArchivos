/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usofilereaderwriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author hola
 */
public class ConRead {
    public void leerArchivo(){
        try {
            // TODO code application logic here
            FileReader lector = new FileReader("archivo.txt");
            int ch;
            ch = lector.read();
            while(ch != -1){
                System.out.print((char)ch);
                ch = lector.read();
            }
            lector.close();
            
            FileReader lector2 = new FileReader("archivo.txt");
            char[] buf = new char[10];
            ch = lector2.read(buf);
            while(ch != -1){
                System.out.print(buf);
                ch = lector2.read(buf);
            }
            lector2.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
