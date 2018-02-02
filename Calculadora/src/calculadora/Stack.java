
package calculadora;

/**
 * @author Rodrigo Urrutia 16139
 * @author Kevin Macario 17369
 * @version 01.02.2018
 */

/**
 * Stack
 * interface de stack
 * @param <E>
 */
public interface Stack <E> 
{
    /**
     * metodo que que le da push al primer intem del stack
     * @param item, stack que va a utilizar
     */
   public void push(E item);
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push
   
   /**
    * metodo que remueve el primer item del stack
    * @return item remocido del stack
    */
   public E pop();
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
   
   /**
    * obtiene el primer item del stack sin removerlo
    * @return primer item del stack
    */
   public E peek();
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
   /**
    * metodo que verifica si el stack esta vacio
    * @return boolean que indica si esta vacio o no el stack
    */
   public boolean empty();
   // post: returns true if and only if the stack is empty
   
   /**
    * metodo que obtiene el largo del stack
    * @return int, largo de la cadena
    */
   public int size();
   // post: returns the number of elements in the stack

}