
package calculadora;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 01.02.2018
 */

/**
 * Calculadora
 *Clase que implementa la interfaz de calculadora
 */
public class Calculadora implements CalculadoraI{

    Stack<String> baraja;
    /**
     * Constructor de Calculadora con parametros
     */
	public Calculadora() {
		baraja = new StackVector();
	}
        /**
         * metodo implementado de la clase CalculadoraI, reliza las operaciones y separaciones de escritura tipo postfix
         * @param exp, linea con escritura postfix
         * @return resultado de la operacion
         */
    @Override
    public String calcular(String exp) {
        
        
        char j;
        String respuesta, k;
        int t, ans, p;
        //ciclo que define que operacion se debe realizar
        
        //try y catch para realizar los calculos indicados por el string. Retorna MATH ERROR si se ingresa algun caracter
        //no valido o si se da la division entre cero
        try{
            for(int i=0; i< exp.length(); i++){
           
           j = exp.charAt(i);
           k = Character.toString(j);
           
           if (Character.isDigit(j)){
               baraja.push(k);
           }
           
           else {

                switch (k) {
             case "+":  ans = Integer.parseInt((String) baraja.pop());
                        t = baraja.size();

                        for (int n=0; n<t; n++){
                            p= Integer.parseInt(baraja.pop());
                            ans+=p;
                        }
                        baraja.push(Integer.toString(ans));
                     
             case "-":  ans = Integer.parseInt((String) baraja.pop());
                        t = baraja.size();

                        for (int n=0; n<t; n++){
                            p= Integer.parseInt(baraja.pop());
                            ans = p-ans;
                        }
                        baraja.push(Integer.toString(ans));
                  
             case "*":  ans = Integer.parseInt((String) baraja.pop());
                        t = baraja.size();

                        for (int n=0; n<t; n++){
                            p= Integer.parseInt(baraja.pop());
                            ans = ans*p;
                        }
                        baraja.push(Integer.toString(ans));
                   
             case "/":  ans = Integer.parseInt((String) baraja.pop());
                        t = baraja.size();

                        for (int n=0; n<t; n++){
                            p= Integer.parseInt(baraja.pop());
                            ans = p/ans;
                        }
                        baraja.push(Integer.toString(ans));
                      
                           }

           }
           
        }
            respuesta= baraja.pop();
            
        return respuesta;
              
        }
        
        catch(Exception e){
            return "MATH ERROR";
        }  
        
    }

 }