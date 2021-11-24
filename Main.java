import java.io.*;

public class Main{
	public static void main(String[] args){
		//Instancia de la clase que lee el archivo csv
		LeeArchivoTexto archivo = new LeeArchivoTexto();
		//Instancias de la clase Alumno
		Alumno alumno1 = new Alumno("Juan",1256672);
		Alumno alumno2 = new Alumno("Manuel", 1234567);
		Alumno alumno3 = new Alumno("Xavier", 2345678);
		
		//arreglo que almacena todas las calificaciones
		//leidas del archivo csv
		int[] todasLasCalificaciones = new int [21];
		
		//arreglos que toman todas las calificaciones
		//y las dividen en 3 arreglos
		int[] calificaciones1 = new int[7];
		int[] calificaciones2 = new int[7];
		int[] calificaciones3 = new int[7];
		
		//Variables usadas para abrir un archivo de txt
		File f = null;
		FileWriter file = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		//invocacion del método de la clase LeeArchivoTexto
		//para "sacar" la info del archivo csv
		archivo.leeArchivo();
		
		//copiar todas las calificaciones a un arreglo de esta clase
		todasLasCalificaciones = archivo.getCalificaciones();
		
		//repartir las calificaciones del archivo csv en 3 
		//areglos diferentes, uno para cada alumno 
		for(int i = 0; i < 7; i++){
			calificaciones1[i] = todasLasCalificaciones[i];
			
		}
		for(int i = 7, j = 0; j < 7; i++,j++){
			calificaciones2[j] = todasLasCalificaciones[i];
		}
		for(int i = 14, j = 0; j < 7; i++,j++){
			calificaciones3[j] = todasLasCalificaciones[i];
		}
		
		//Asignación de calificaciones en la clase alumno 
		//para cada una de sus instancias
		alumno1.setCalificaciones(calificaciones1);
		alumno2.setCalificaciones(calificaciones2);
		alumno3.setCalificaciones(calificaciones3);
		
		try{
			f = new File("CalificacionesAlumnos.txt");
			file = new FileWriter(f);
			bw = new BufferedWriter(file);
			pw = new PrintWriter(bw);
			
			//datos del alumno 1 que se guardaran en el archivo
			//y se mostraran en consola.
			pw.println("Nombre: " + alumno1.getNombre());
			System.out.println("Nombre: " + alumno1.getNombre());
			pw.println("\nMatricula: " + alumno1.getMatricula());
			System.out.println("Matricula: " + alumno1.getMatricula());
			pw.write("\n");
			for(int i = 0; i < 7; i++){
				pw.println("Calificacion " + (i+1) + ": " + calificaciones1[i]);
				System.out.println("Calificacion " + (i+1) + ": " + calificaciones1[i]);
			}
			pw.println("Promedio: " + alumno1.setPromedio());
			System.out.println("Promedio: " + alumno1.setPromedio());
			pw.println("__________________________________\n\n");
			System.out.println("__________________________________\n\n");
			//____________________________________________________
			
			
			//datos del alumno 2 que se guardaran en el archivo
			//y se mostraran en consola.
			pw.println("Nombre: " + alumno2.getNombre());
			System.out.println("Nombre: " + alumno2.getNombre());
			pw.println("\nMatricula: " + alumno2.getMatricula());
			System.out.println("Nombre: " + alumno2.getNombre());
			pw.write("\n");
			for(int i = 0; i < 7; i++){
				pw.println("Calificacion " + (i+1) + ": " + calificaciones2[i]);
				System.out.println("Calificacion " + (i+1) + ": " + calificaciones2[i]);
			}
			pw.println("Promedio: " + alumno2.setPromedio());
			System.out.println("Promedio: " + alumno2.setPromedio());
			pw.println("__________________________________\n\n");
			System.out.println("__________________________________\n\n");
			//____________________________________________________
			
			
			//datos del alumno 3 que se guardaran en el archivo
			//y se mostraran en consola.
			pw.println("Nombre: " + alumno3.getNombre());
			System.out.println("Nombre: " + alumno3.getNombre());
			pw.println("\nMatricula: " + alumno3.getMatricula());
			System.out.println("\nMatricula: " + alumno3.getMatricula());
			pw.write("\n");
			for(int i = 0; i < 7; i++){
				pw.println("Calificacion " + (i+1) + ": " + calificaciones3[i]);
				System.out.println("Calificacion " + (i+1) + ": " + calificaciones3[i]);
			}
			pw.println("Promedio: " + alumno3.setPromedio());
			System.out.println("Promedio: " + alumno3.setPromedio());
			pw.println("__________________________________\n\n");
			System.out.println("__________________________________\n\n");
			
		}
		catch(IOException e){
			System.out.println("Error");
		}
		finally{
			try{
				if(null != file){
					pw.close();
					bw.close();
					System.out.println("\n\nSe genero registro de alumnos.\n\n");
				}	
			}catch(Exception e2){
				e2.printStackTrace();
			}
		}
	}
}