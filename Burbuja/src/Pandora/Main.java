package Pandora;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int[] arreglo = {5,3,4,2,12,1,21,34,32,333,43,23,12,64,32,65,32};
	
	Ordenador o =new Ordenador();
	o.ordenarBurbuja(arreglo);
	
	for ( int i=0;i<arreglo.length;i++)
	{
		System.out.println(arreglo[i]);
	}
		
	}

}
