package univas.edu.br.trab.lab3.si3;

import java.util.ArrayList;

public class Principal {
	private ArrayList<Cliente>clientes = new ArrayList<Cliente>();
	private Cliente cliente;
	
	
	
	public void cadastrar(Cliente cadastro){
		clientes.add(cadastro);
	}
	
	public float compra(float valor){
		return cliente.getTotalCompras() += valor;
		
				
	}
	
}
