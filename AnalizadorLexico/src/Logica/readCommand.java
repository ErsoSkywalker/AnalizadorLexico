package Logica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class readCommand {

    public readCommand(ArrayList<String> Array) throws IOException {
        if (!Array.isEmpty() && Array.size() == 3 && Array.get(0).equalsIgnoreCase("Path")) {
            String cadena;
            try {
                FileReader f = new FileReader(Array.get(1));
                BufferedReader b = new BufferedReader(f);
                while ((cadena = b.readLine()) != null) {
                    System.out.println(cadena);
                }
                b.close();
            } catch (FileNotFoundException e) {
                System.out.println("Archivo no encontrado");
            }

        } else {
            System.out.println("Sintaxis Incorrecta");
        }
    }
}
