package univas.edu.br.trab.lab3.si3;

public class Gato extends Cliente{
	private String nome;
	private String raca;
	
	public Gato(int numero,String proprietario, String cpf, String endereco,String nome, String raca) {
		super(numero,proprietario, cpf, endereco);
		this.nome = nome;
		this.raca = raca;
	}

}
