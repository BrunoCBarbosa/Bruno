package univas.edu.br.trab.lab3.si3;

public class Cliente {
	private int numero;
	private String proprietario;
	private float totalCompras;
	private Animal animal;
	
	
	public Cliente(int numero,String proprietario,Animal animal){
		this.numero = numero;
		this.proprietario = proprietario;
		this.animal = animal;
	}
	
	public float compra(float valor){
		totalCompras += valor;
		return valor;
	}
		
}
