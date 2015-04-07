package Pandora;
import java.io.*;

class Main {

	/**
	 * Leer desde Teclado
	 * Concatenar
	 * Upper Case
	 * toLowerCase();
	 * toUpperCase();
	 * Convertir variables numericas a Strings y viceversa
	 */
	
	public static void main(String[] args) {

String texto = "";
int x=0;
System.out.println("Debes escribir un numero");
InputStreamReader in= new InputStreamReader(System.in);
BufferedReader buffer = new BufferedReader (in);

try {
	texto = buffer.readLine();
	x= Integer.parseInt(texto);
}catch(IOException e){};

System.out.println(x+5);






/*
 
texto=texto.toLowerCase();
int a= texto.length();
System.out.println(texto);
System.out.println("La frase tiene "+ a + " letras");

*/

	}

}
