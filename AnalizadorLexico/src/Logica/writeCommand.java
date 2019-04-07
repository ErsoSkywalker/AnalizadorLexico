package Logica;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class writeCommand {

    public writeCommand(ArrayList<String> Array) throws IOException {
        
        if (!Array.isEmpty()) {
            if (Array.size() == 2 || Array.size() == 4 || Array.size() > 5) {
                System.out.println("Error de Sintaxis");
            } else if (Array.size() == 3 && Array.get(0).trim().equalsIgnoreCase("Texto")) {
               
                System.out.println(Array.get(1));

                String ruta = "output.txt";
                File archivo = new File(ruta);
                BufferedWriter bw;
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write(Array.get(1));
                bw.close();

            }else if(Array.size() == 5 && Array.get(0).trim().equalsIgnoreCase("Texto") && Array.get(2).trim().equalsIgnoreCase("Path")){
                
                System.out.println(Array.get(1));

                String ruta = Array.get(3).trim();
                File archivo = new File(ruta);
                BufferedWriter bw;
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write(Array.get(1));
                bw.close();
                
            }else if(Array.size() == 5 && Array.get(2).trim().equalsIgnoreCase("Texto") && Array.get(0).trim().equalsIgnoreCase("Path")){
                
                System.out.println(Array.get(3));

                String ruta = Array.get(1).trim();
                File archivo = new File(ruta);
                BufferedWriter bw;
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write(Array.get(3));
                bw.close();
            }else{
                System.out.println("Sintaxis incorrecta, cambialo.");
            }

        } else {
            System.out.println("Error de Sintaxis, por favor corregir.");
        }
    }
}
