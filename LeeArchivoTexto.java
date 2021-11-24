//Ejemplo 3: Lectura de archivo de texto (archivos ya existentes)
import java.io.*;
import java.util.*;


class LeeArchivoTexto{
	int[] calificaciones = new int [21];
	
	public void leeArchivo(){
		File archivo = null;
		
		
		try{
			//Apertura del archivo y creación de BufferedReader para
			//poder hacer una lectura comoda (disponer del metodo readLine()).			
			archivo = new File("practica9.csv");
			
			Scanner inputStream = new Scanner(archivo);
			while (inputStream.hasNext()){
				String data = inputStream.next();
				
				String[] values = data.split(",");
				calificaciones[0]=67;
				for (int i = 1; i < values.length; i++ ){
					calificaciones[i] = Integer.parseInt(values[i]);
				}
			}
		}/*try*/
		
		catch(FileNotFoundException e){
			System.out.println("Error");
		}/*catch*/	

		
	}//método leeArchivo
	
	public void imprimeArreglo(){
		for (int i = 0; i < calificaciones.length; i++ ){
			System.out.println(calificaciones[i]);
		}
	}
	
	public int[] getCalificaciones(){
		return calificaciones;
	}
}//clase LeeArchivoTexto


