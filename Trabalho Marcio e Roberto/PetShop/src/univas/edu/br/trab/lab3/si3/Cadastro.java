package univas.edu.br.trab.lab3.si3;

import java.util.ArrayList;

public class Cadastro {
	private ArrayList<Cliente>clientes = new ArrayList<Cliente>();
	
	public void cadastrarCliente(Cliente cliente){
		clientes.add(cliente);
	}

}
