package Pandora;
import java.util.LinkedList;
class Main {

	
	public static void main(String[] args) {
		
		
		
		LinkedList lista = new LinkedList();
		
		lista.add("Palabra");
		lista.add("Palabra1");
		lista.add("Palabra2");
		lista.add("Palabra3");
		
		lista.remove(0);
		
		System.out.println("El tama�o de la lista es : "+ lista.size());
		
		System.out.println(lista.get(0));
		

	}

}
