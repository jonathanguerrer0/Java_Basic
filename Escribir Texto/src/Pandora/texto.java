package Pandora;
import java.io.*;
public class texto {


	public static void main(String[] args) {
	
		
		File f;
		f =new File ("archivo");
		
		try{
			FileWriter w= new FileWriter (f);
			BufferedWriter bw = new BufferedWriter (w);
			PrintWriter wr = new PrintWriter (bw);
			
			wr.write("Esto es una linea de texto");
			wr.append(" - esto es una concatenacion al texto");
			wr.close();
			bw.close();
			}catch(IOException e){};
		
	
		

	}
	

	
	
	
}
