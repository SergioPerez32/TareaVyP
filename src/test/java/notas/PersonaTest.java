package notas;


import org.junit.Assert;
import org.junit.Test;

public class PersonaTest {
	@Test
	public void verifyTheAgeMethod(){
		Persona persona = new Persona();
		persona.setFechaNac(1998);
		
		int expRes = 20;
		int acttualRes = persona.getEdad();
		
		Assert.assertEquals("Error, edad calculada incorrectamente", expRes, acttualRes);
	}
}
