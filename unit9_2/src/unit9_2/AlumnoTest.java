package unit9_2;


import org.junit.Assert;
import org.junit.Test;

public class AlumnoTest {

	/*************************/
	/**   Test validadNif   **/
	/*************************/
	
	@Test
	public void testValidaNif1() {
		//Primera condición: si no mide 9 caracteres
		Alumno a = new Alumno();
		String dni = "1234";
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
	public void testCalculaTasaMatricula1(){
		//Si la edad no es menor de 25 ni mayor de 50 y no es familia numerosa
		//Devuelve la tasa inicial
		Alumno a = new Alumno();
		int edad = 30;
		boolean familiaNumerosa = false;
		boolean repetidor = false;
		
		float tasaDevuelta = a.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
		float tasaEsperada = 500.00f;
		
		Assert.assertEquals(tasaEsperada, tasaDevuelta, 0.0f);
	}
	
	@Test
	public void testCalculaTasaMatricula2(){
		//El primer IF es cierto
		//Tasa esperada 20000.00f
		Alumno a = new Alumno();
		int edad = 20;
		boolean familiaNumerosa = false;
		boolean repetidor = true;
		
		float tasaDevuelta = a.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
		float tasaEsperada = 2000.00f;
		
		Assert.assertEquals(tasaEsperada, tasaDevuelta, 0.00f);
	}
	

	@Test
	public void testCalculaTasaMatricula3(){
		//Sólo la primera condición del primer if es cierta y es familia numerosa
		//Tasa esperada 250.00f
		Alumno a = new Alumno();
		int edad = 20;
		boolean familiaNumerosa = true;
		boolean repetidor = false;
		
		float tasaDevuelta = a.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
		float tasaEsperada = 250.00f;
		
		Assert.assertEquals(tasaEsperada, tasaDevuelta, 0.00f);
	}
	@Test
	public void testCalculaTasaMatricula4(){
		//La segunda condición dell primer if dentro del else es cierto
		//Tasa esperada 250.00f
		Alumno a = new Alumno();
		int edad = 66;
		boolean familiaNumerosa = false;
		boolean repetidor = true;
		
		float tasaDevuelta = a.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
		float tasaEsperada = 250.00f;
		
		Assert.assertEquals(tasaEsperada, tasaDevuelta, 0.00f);
	}
	
	@Test
	public void testCalculaTasaMatricula4_1(){
		//El segundo if dentro del else es cierto, pero no es familia numerosa
		//Tasa esperada 400.00f
		Alumno a = new Alumno();
		int edad = 55;
		boolean familiaNumerosa = false;
		boolean repetidor = true;
		
		float tasaDevuelta = a.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
		float tasaEsperada = 400.00f;
		
		Assert.assertEquals(tasaEsperada, tasaDevuelta, 0.00f);
	}
	
	@Test
	public void testCalculaTasaMatricula4_2(){
		//El segundo if dentro del else es cierto y es familia numerosa
		//Tasa esperada 150.00f
		Alumno a = new Alumno();
		int edad = 55;
		boolean familiaNumerosa = true;
		boolean repetidor = true;
		
		float tasaDevuelta = a.calculaTasaMatricula(edad, familiaNumerosa, repetidor);
		float tasaEsperada = 150.00f;
		
		Assert.assertEquals(tasaEsperada, tasaDevuelta, 0.00f);
	}
	

}
