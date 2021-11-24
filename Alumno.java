/*
Crear una clase llamada alumno, la cual contiene como mínimo los siguientes 
atributos: nombre, matrícula, calificaciones y promedio general
 */

import java.util.*;


public class Alumno {
    String nombre;
    int matricula;
    int[] calificaciones = new int[7];
    double promedio = 0;
    
	//contstutor de la clase
    public Alumno(String nombre, int matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }
    
    public void setCalificaciones(int[] arreglo){
        
		for (int i = 0; i < 7; i++){
			calificaciones[i] = arreglo[i]; 
		}
    }
	
	public int[] getCalificaciones(){
		return calificaciones;
	}
	
	public void imprimeCalificaciones(){
		for (int i = 0; i < 7; i++){
				System.out.println("calificacion " + (i+1) + ": " + calificaciones[i]);
				
		}
	}

	//setters y getters de nombre y matricula
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getPromedio() {
        return promedio;
    }

    public double setPromedio() {
        for (int i = 0; i < 7; i++){
            
            promedio = calificaciones[i] + promedio; 
        }
        return promedio/7;
    }
    
}
