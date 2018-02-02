/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.ArrayList;

/**
 * StackArrayList
 * clase de Array de stack, implementa la interface stack
 * @param <E> 
 */
public class StackArrayList<E>
 implements Stack<E>
{
	protected ArrayList<E> data;

	public StackArrayList()
	// post: constructs a new, empty stack
	{
		data = new ArrayList<E>();
	}

     /**
     * metodo que que le da push al primer intem del stack
     * @param item, stack que va a utilizar
     */
	public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
	}

    /**
    * metodo que remueve el primer item del stack
    * @return item remocido del stack
    */
	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(size()-1);
	}

   /**
    * obtiene el primer item del stack sin removerlo
    * @return primer item del stack
    */
	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	
   /**
    * metodo que obtiene el largo del stack
    * @return int, largo de la cadena
    */
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
  
        /**
         * metodo que verifica si el stack esta vacio
         * @return true si el stack esta vacio
         */
	public boolean empty()
	// post: returns true if and only if the stack is empty
	{
		return size() == 0;
	}
}