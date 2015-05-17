package unit9_2;


import org.junit.Assert;
import org.junit.Test;

public class AlumnoTest {

	/*************************/
	/**   Test validadNif   **/
	/*************************/
	
	@Test
	public void testValidaNif1_1() {
		//Primera condición: si no mide 9 caracteres
		Alumno a = new Alumno();
		String dni = "1234";
		Assert.assertFalse(a.validaNif(dni));		
	}
	
	@Test
	public void testValidaNif1_2() {
		//Primera condición: si no tiene valor
		Alumno a = new Alumno();
		String dni = "";
		Assert.assertFalse(a.validaNif(dni));		
	}
	
	@Test
	public void testValidaNif2() {
		//Comprueba que no pasa del Catch
		Alumno a = new Alumno();
		String dni = "1234A678A";
		Assert.assertFalse(a.validaNif(dni));		
	}
	
	@Test
	public void testValidaNif3_1() {
		//Retorno final: ambas condiciones correctas
		Alumno a = new Alumno();
		String dni = "48570200L";
		Assert.assertTrue(a.validaNif(dni));	
	}
	
	@Test
	public void testValidaNif3_2() {
		//Retorno final: primera condición falsa
		Alumno a = new Alumno();
		String dni = "11111111L";
		Assert.assertFalse(a.validaNif(dni));	
	}
	
	@Test
	public void testValidaNif3_3() {
		//Retorno final: segunda condición falsa
		Alumno a = new Alumno();
		String dni = "48570200a";
		Assert.assertFalse(a.validaNif(dni));	
	}
	
	/***********************************/
	/**   Test calculaTasaMatricula   **/
	/***********************************/
	
	@Test
	public void testCalculaTasaMatricula(){
		//Si la edad no es menor de 25 ni mayor de 50 y no es familia numerosa
		//Devuelve la tasa inicial
		Alumno a = new Alumno();
		int edad = 30;
		boolean familiaNumerosa = false;
		boolean repetidor = false;
		
		float tasaDevuelta = a.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
		
		Assert.assertEquals()
	}


}
