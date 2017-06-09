package univas.edu.br.trab.lab3.si3;

public class Cliente {
	private int numero;
	private String proprietario;
	private float totalCompras = 0f;
	private Animal animal;
	
	
	public Cliente(int numero,String proprietario,Animal animal){
		this.numero = numero;
		this.proprietario = proprietario;
		this.animal = animal;
		
	}
	
	public void compra(float valor){
		totalCompras += valor;
		
	}
	
	public float getTotalCompras(){
		return totalCompras;
	}
		
}
