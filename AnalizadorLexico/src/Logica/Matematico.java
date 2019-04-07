
package Logica;

import java.util.ArrayList;

public class Matematico {
    public Matematico(String Instruccion, ArrayList<String> Array){
        double num1, num2, Resultado = 0;
        if(!Array.isEmpty() && Array.size() == 3 && Array.get(0).matches("[-+]?[0-9]*\\.?[0-9]*") && Array.get(1).matches("[-+]?[0-9]*\\.?[0-9]*")){
            num1 = Double.parseDouble(Array.get(0));
            num2 = Double.parseDouble(Array.get(1));
            switch(Instruccion.toLowerCase()){
                case "suma":{
                    Resultado = num1+num2;
                    break;
                }
                case "resta":{
                    Resultado = num1-num2;
                    break;
                }
                case "producto":{
                    Resultado = num1*num2;
                    break;
                }
                case "division":{
                    Resultado = num1/num2;
                    break;
                }
                case "potencia":{
                    Resultado = Math.pow(num1,num2);
                    break;
                }
                case "modulo":{
                    Resultado = num1%num2;
                    break;
                }
            }
            System.out.println(Resultado);
        }else{
            System.out.println("Error de Sintaxis");
        }
    }
}
