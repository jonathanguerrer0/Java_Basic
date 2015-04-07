package Pandora;
//import Pandora.carro;


class Main {

	public static void main(String[] args) {
	
		carro c;
		c= new CarroBMW();
		c.apagado();
		c.encender();
		c.informacion();
		System.out.println(c.modelo());
	

		
	}

}
