package Pandora;

import java.util.Stack;

class Main {

	/**
	 * push
	 * pop
	 * peek
	 * empty
	 * 
	 */
	public static void main(String[] args) {
	
		
	//Filo first in , last out
		
		
		Stack pila = new Stack();
		pila.push("50"); // Indice 0
		pila.push("String"); //Indice 1
		pila.push("Q"); // Indice 2
		pila.push("W"); // Indice 3
		pila.push("E"); // Indice 4
		pila.push("R"); // Indice 5
		pila.push("T"); // Indice 6
		pila.push("Y"); // Indice 7
		
		//Solo se puede ver el ultimo valor
		//peek para ver , y el metodo pop para obtener
		
		
		System.out.println("El ultimo elemento en la pila es:  "+ pila.peek());
		
		while(pila.empty() == false)
		{
			System.out.println(pila.pop());
		}
		
		
	}

}
