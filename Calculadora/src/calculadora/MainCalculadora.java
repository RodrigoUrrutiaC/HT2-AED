
package calculadora;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Vector;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 01.02.2018
 * MainCalculadora
 */

public class MainCalculadora extends StackVector {
        
    public static void main(String[] args){
 
        Stack<String> baraja = new StackArrayList<String>();
        Calculadora c = new Calculadora(baraja);
        
        try{
          
            FileReader fr = new FileReader("datos.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea;
            
            while((linea = br.readLine())!=null){
                String respuesta= c.calcular(linea);
                System.out.println(""+linea+" = "+respuesta);
           }
            
        }
        catch(Exception ex){
            
        }  
         
    }
    
}
