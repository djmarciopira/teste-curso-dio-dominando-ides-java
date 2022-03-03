package br.com.dio.modelo;

public class Gato {
	
	private String nome;
	private String cor;
	private Integer idade;
	

	public Gato(String nome, String cor, Integer idade) {
		this.setNome(nome);
		this.setCor(cor);
		this.setIdade(idade);
				
				

	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}
