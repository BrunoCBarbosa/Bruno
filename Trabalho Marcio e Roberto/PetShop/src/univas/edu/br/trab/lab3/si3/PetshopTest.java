package univas.edu.br.trab.lab3.si3;

import static org.junit.Assert.*;

import org.junit.Test;

public class PetshopTest {

	@Test
	public void testCadastroDeCliente() {
		Cachorro c = new Cachorro(1, "Bruno","09365640679","AntonioRafael",0, "Tuca","Labrador");
		Cachorro c1 = new Cachorro(2, "Marcos","09565640679","Centro",0, "Bolinha","PitBull");
		Gato c3 = new Gato(3, "Daniella","095656407549","Cruzeiro","Mingau","Siames");
	}

}
