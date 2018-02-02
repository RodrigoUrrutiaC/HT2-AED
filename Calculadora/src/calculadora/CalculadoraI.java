
package calculadora;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 01.02.2018
 */

/**
 * CalculadoraI
 * Interface de calculadora
 */
public interface CalculadoraI {
    /**
     * metodo que define que opera escritura tipo postfix
     * @param exp, linea con operaciones postfix
     * @return resultado de la operacion
     */
    public String calcular(String exp);
    
}
