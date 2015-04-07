package Pandora;

public class carro {

	double peso;
	double altura;
	double ancho;
	double largo;
	int numeroPuertas;
	String modelo;
	boolean encendido=false;
	

		
		public carro()
		
		{
		this.peso = 1000;
		this.altura= 1.90;
		this.ancho=4;
		}
		
		public double obtenerPeso()
		
		
		{
		return this.peso;
		
		}
		
		public void encender()
		
		{
		this.encendido=true;
		System.out.println("El carro esta encendido");
		}
		
		public String modelo()
		{
			
		return this.modelo;
			
		}
		public void apagado()
		
		{
		
			this.encendido=false;
			System.out.println("El carro esta apagado");
		}
		
		public void informacion()
		{
			System.out.println("Este es un carro comun y corriente");
		}
		
		public void estado()
		{
		if (this.encendido == true)
			
			
		{
		System.out.println("El carro esta Encendido");
		}
		
		else
		System.out.println("El carro esta apagado");
		
		                     
		                            }
}


class CarroBMW extends carro
{

	public CarroBMW()
	{
		this.modelo="BMW";
	}
	
	public void turbo()
	{
		System.out.println("Acabas de alcanzar una velocidad de Match 5");
	}
	
	public void informacion()
	{
		System.out.println("Este es un BMW 2015");
	}

}


class CarroToyota extends carro
{

	public CarroToyota()
{
    modelo = "Toyota";	
}
	
	public void informacion()
	{
		System.out.println("Este es un Toyota Corolla 2016 ");
	}


}
