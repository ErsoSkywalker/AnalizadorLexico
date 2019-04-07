package Logica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class helpCommand {

    public helpCommand(ArrayList<String> Array) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (!Array.isEmpty()) {
            if(Array.get(1) != "Final"){
                System.out.println("Error de Sintaxis, por favor verifique.");
            }else{
                System.out.println("Comando     Parametros");
                if(Array.get(0).equalsIgnoreCase("help")){
                    System.out.println("Help        NombreDeComando  Sirve para especificar el comando del que se requiere Información");
                }else if(Array.get(0).equalsIgnoreCase("write")){
                    System.out.println("write        Texto  Recibe el Texto que se pretende escribir, se pone en la pantalla y en el .txt de output");
                }else if(Array.get(0).equalsIgnoreCase("read")){
                    System.out.println("read         Path - Hace referencia a la Ruta en la que se leerá el texto");
                }else if(Array.get(0).equalsIgnoreCase("suma")){
                    System.out.println("read         Path - Hace referencia a la Ruta en la que se leerá el texto");
                }else{
                    System.out.println("Comando desconocido");
                }
            }
        } else {
            System.out.println("Comando     Descripción");
            System.out.println("help        Comandode apoyo para conocer acciónes de los demás comandos. Se le puede adjuntar el nombre de otro comando, para conocer sus parametros.");
            System.out.println("write       Comando para escribir texto en la pantalla");
            System.out.println("read        Comando para leer texto de un .txt");
        }
    }
}
