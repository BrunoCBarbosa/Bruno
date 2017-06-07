package univas.edu.br.trab.lab3.si3;

public class Gato extends Cliente{
	private String nome;
	private String raca;
	
	public Gato(String proprietario, String cpf, String endereco,String nome, String raca) {
		super(proprietario, cpf, endereco);
		this.nome = nome;
		this.raca = raca;
	}

}
