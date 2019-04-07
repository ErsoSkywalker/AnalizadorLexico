package Logica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Analisis {

    public Analisis() throws FileNotFoundException, IOException {
        String Respuesta = "";
        String cadena = "";
        String Instruccion = "";
        String Parametro = "";
        boolean Bandera = false;
        ArrayList<String> Parametros = new ArrayList<>();
        boolean Validante = true;
        int Puntero=0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Inserta Comando");
            Respuesta = sc.nextLine();
            try{
                if(Character.toString(Respuesta.charAt(0)).matches("[a-zA-Z]")){
                   Bandera = true;
                }
            }catch(Exception e){
                Bandera = false;
            }
            
            if (Respuesta.trim() != null && Bandera) {
                for (int i = 0; i <= Respuesta.length()-1; i++) {
                    if(i == Respuesta.length()-1){
                        Instruccion += Respuesta.charAt(i);
                        Validante = true;
                        Puntero = i+1;
                         break;
                    }else if (Respuesta.charAt(i) == ' ') {
                        Validante = false;
                        Puntero = i+1;
                        break;
                    }
                    Instruccion += Respuesta.charAt(i);
                }
                
                if(!Validante && Respuesta.charAt(Puntero) != ' '){
                    for(int i = Puntero; i <= Respuesta.length()-1; i++){
                        Parametro += Respuesta.charAt(i);
                        if(Respuesta.charAt(i) == ' ' || i == Respuesta.length()-1){
                            Parametros.add(Parametro.trim());
                            Parametro = "";
                        }      
                    }
                    Parametros.add("Final");
                }
                
                if(Instruccion.equalsIgnoreCase("help")){
                    helpCommand help = new helpCommand(Parametros);
                }else if(Instruccion.equalsIgnoreCase("write")){
                    writeCommand write = new writeCommand(Parametros);
                }else if(Instruccion.equalsIgnoreCase("read")){
                    readCommand read = new readCommand(Parametros);
                }else if(Instruccion.equalsIgnoreCase("suma") || Instruccion.equalsIgnoreCase("resta") || Instruccion.equalsIgnoreCase("producto") || Instruccion.equalsIgnoreCase("division") || Instruccion.equalsIgnoreCase("potencia") || Instruccion.equalsIgnoreCase("modulo")){
                    Matematico mate = new Matematico(Instruccion, Parametros);
                }else if(!Instruccion.equalsIgnoreCase("exit")){
                    System.out.println("Opción no valida");
                }
                
            }else{
                System.out.println("Para ejecutar acciones, no dejes el campo vacio.");
            }
            Puntero = 0;
            Instruccion = "";
            Parametros.clear();
            Bandera = false;
        } while (!Respuesta.equalsIgnoreCase("exit"));
    }
}

