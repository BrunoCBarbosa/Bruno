package univas.edu.br.trab.lab3.si3;

import java.util.ArrayList;

public class Principal {
	private ArrayList<Cliente>clientes = new ArrayList<Cliente>();
	private ControleCompras controleCompras = new ControleCompras();
	
	public void cadastrar(Cliente cadastro){
		clientes.add(cadastro);
	}
	
	public void compra(String produto, float valor){
		
		if(produto == "cachorro"){
			controleCompras.produtoCachorro += valor;
		}else{
			controleCompras.produtoGato += valor;
		}
		
	}
	
	public ControleCompras getcontroleCompras(){
		return controleCompras;
	}

}
