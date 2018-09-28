package notas;

import org.junit.Assert;
import org.junit.Test;

public class EstudianteTest {
	@Test
	public void verifyTheAgeMethod(){
		Estudiante estudiante = new Estudiante();
		estudiante.setFechaNac(1998);
		int expRes = 20;
		int acttualRes = estudiante.getEdad();
		
		Assert.assertEquals("Error, nota calculada incorrectamente", expRes, acttualRes);
	}
}
