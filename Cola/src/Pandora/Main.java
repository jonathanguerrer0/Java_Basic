package Pandora;
import java.util.LinkedList;

public class Main {

	/**
	 * Offer,Poli
	 * @param args
	 */
	public void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList cola = new LinkedList();
		
		for (int i=1;1<11;i++) {
			cola.offer(i);
		}
		
		while(cola.peek() != null)
		{
			System.out.println(cola.poll());
		}
	}

}
