
package calculadora;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 01.02.2018
 * MainCalculadora
 */

public class MainCalculadora {
    
    public static void main(String[] args){
 
        try{
            FileReader fr = new FileReader("datos.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea;
            
            while((linea = br.readLine())!=null){
                System.out.println(""+linea);
            }
            
        }
        catch(Exception ex){
            
        }
        
    }
    
}
