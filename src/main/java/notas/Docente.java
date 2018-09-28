package notas;

import java.util.Arrays;


public class Docente extends Persona{
	Estudiante[] estudiantes;
	public Docente (Estudiante[] estudiantes){
		super();
		this.estudiantes=estudiantes;
	}
	
	public void setEstudiantes (Estudiante[] estudiantes){
		this.estudiantes=estudiantes;
	}
	
	public Estudiante [] getEstudiantes (){
		return estudiantes;
	}
	
	public Estudiante[] sortPorNota (){
		Arrays.sort(estudiantes);
		return estudiantes;

	}
	public Estudiante[] sortPorNombre (){
		Arrays.sort(estudiantes);
		return estudiantes;
	}
}
