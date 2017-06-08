package univas.edu.br.trab.lab3.si3;

public class Cachorro extends Cliente{
	private String nome;
	private String raca;
	
	public Cachorro(int numero,String proprietario, String cpf, String endereco,float totalCompras,String nome, String raca) {
		super(numero,proprietario, cpf, endereco);
		this.nome = nome;
		this.raca = raca;
	}

}
