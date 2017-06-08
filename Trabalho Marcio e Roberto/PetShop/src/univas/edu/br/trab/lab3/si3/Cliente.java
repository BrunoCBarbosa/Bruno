package univas.edu.br.trab.lab3.si3;

public class Cliente {
	private int numero;
	private String proprietario;
	private String cpf;
	private String endereco;
	private float totalCompras;
	
	
	public Cliente(int numero,String proprietario,String cpf, String endereco, float totalCompras){
		this.numero = numero;
		this.proprietario = proprietario;
		this.cpf = cpf;
		this.endereco = endereco;
		this.totalCompras = totalCompras;
		
	}
	
	public float getTotalCompras(){
		return totalCompras;
	}

}
