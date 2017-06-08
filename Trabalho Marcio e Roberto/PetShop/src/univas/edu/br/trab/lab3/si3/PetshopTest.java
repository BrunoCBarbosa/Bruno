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
		Cliente c3 = new Cliente(3, "Daniella", ga);
	}

}
