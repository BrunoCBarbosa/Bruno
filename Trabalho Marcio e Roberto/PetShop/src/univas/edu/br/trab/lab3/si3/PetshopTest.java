package univas.edu.br.trab.lab3.si3;

import static org.junit.Assert.*;

import org.junit.Test;

public class PetshopTest {

	@Test
	public void testCadastroDeCliente() {
		Cachorro ca = new Cachorro("Labrador","Bolinha");
		Cachorro ca1 = new Cachorro("PitBull","Matador");
		Gato ga = new Gato("Siames","Mingau");
		
		Cliente c = new Cliente(1, "Bruno",ca);
		Cliente c1 = new Cliente(2, "Marcos", ca1);
		Cliente c3 = new Cliente(3, "Josefina", ga);
	}
	
	@Test
	public void testCompra(){
		Cachorro ca = new Cachorro("Labrador","Bolinha");
		Cliente c = new Cliente(1, "Bruno",ca);
		assertEquals(0,c.getTotalCompras(),0.01);
		c.compra(20);
		assertEquals(20,c.getTotalCompras(),0.01);
		c.compra(30);
		assertEquals(50,c.getTotalCompras(),0.01);
		c.compra(100);
		assertEquals(150,c.getTotalCompras(),0.01);
		
		Gato ga = new Gato("Siames","Mingau");
		Cliente c3 = new Cliente(3, "Josefina", ga);
		assertEquals(0,c3.getTotalCompras(),0.01);
		c3.compra(100);
		assertEquals(100,c3.getTotalCompras(),0.01);
	}

			
	
}
