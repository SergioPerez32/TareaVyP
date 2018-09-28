package notas;

import org.junit.Assert;
import org.junit.Test;

public class DocenteTest {
	@Test
	public void verifyTheAgeMethod(){
		Estudiante[] estudiantes = new Estudiante[3];
		Docente docente = new Docente(estudiantes);
		docente.setFechaNac(1998);
		
		int expRes = 20;
		int acttualRes = docente.getEdad();
		
		Assert.assertEquals("Error, edad calculada incorrectamente", expRes, acttualRes);
	}
	
	@Test
	public void verifySortNotaMethod(){
		
		Estudiante E1 = new Estudiante();
		Estudiante E2 = new Estudiante();
		Estudiante E3 = new Estudiante();
		E1.setNota(100, 100, 100);
		E2.setNota(60, 60, 60);
		E3.setNota(10, 10, 10);
		Estudiante[] estudiantes = new Estudiante[3];
		estudiantes[0]=E1;
		estudiantes[1]=E2;
		estudiantes[2]=E3;
		Docente docente = new Docente(estudiantes);
		docente.sortPorNota();
		int exp = 60;
		int actual = docente.getEstudiantes()[1].getNota().getTotal();
		Assert.assertEquals("Error en la lista de estudiantes, notas", exp, actual);
	}
	
	@Test
	public void verifySortNombreMethod(){
		
		Estudiante E1 = new Estudiante();
		Estudiante E2 = new Estudiante();
		Estudiante E3 = new Estudiante();
		E1.setNota(100, 100, 100);
		E2.setNota(60, 60, 60);
		E3.setNota(10, 10, 10);
		E1.setNombre("Orlando");
		E2.setNombre("Mario");;
		E3.setNombre("Alberto");;
		Estudiante[] estudiantes = new Estudiante[3];
		estudiantes[0]=E1;
		estudiantes[1]=E2;
		estudiantes[2]=E3;
		Docente docente = new Docente(estudiantes);
		docente.sortPorNombre();
		String exp = "Orlando";
		String actual = docente.getEstudiantes()[1].getNombre();
		Assert.assertEquals("Error en la lista de estudiantes, nombre", exp, actual);
	}
	
}
