package br.com.fiap.beans;

public class Doce {
	private String nome;
	private double quantidadeLeite;
	
	public Doce() {
		
	}
	public Doce(String nome, double quantidadeLeite) {
		setNome(nome);
		setQuantidadeLeite(quantidadeLeite);
	}
	public final String getNome() {
		return nome;
	}
	public final void setNome(String nome) {
		this.nome = nome;
	}
	public final double getQuantidadeLeite() {
		return quantidadeLeite;
	}
	public final void setQuantidadeLeite(double quantidadeLeite) {
		this.quantidadeLeite = quantidadeLeite;
	}
	public String retornarAtributos() {
		return "O nome do doce é: " + getNome()+ "\n e a quantidade de leite é :" + getQuantidadeLeite();
	}
}
