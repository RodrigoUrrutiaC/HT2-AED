
package calculadora;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Vector;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 01.02.2018
 */

/**
 * MainCalculadora
 * interfaz en donde el usuario interaciona con el programa
 */
public class MainCalculadora extends StackVector {
        
    public static void main(String[] args){
        //declaracion de stack y calculadora
     
        Calculadora c = new Calculadora();
        //try y catch para leer un archixo txt de nombre "datos", debe de estar en la misma ruta que el programa calculadora
        try{
          
            FileReader fr = new FileReader("datos.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea;
            
            while((linea = br.readLine())!=null){
                String respuesta= c.calcular(linea);
                System.out.println(""+linea+" = "+respuesta);
           }
            
        }
        //si no logra leer el archivo o no lo encuentra muestra una alerta
        catch(Exception ex){
            System.out.print("INCAPACIDAD PARA LEER EL ARCHIVO .TXT");
        }  
         
    }
    
}
