package br.com.fiap.beans;

public class Doce {

	private String nome;
	private double quantidadeLeite;
	
	Doce(){
		
	}
	public Doce(String nome, double qantidadeLeite){
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
	public String retornaAtributos() {
		return"O nome do doce é: " + getNome()+ "\n A quantidade de leite é de: "+ getQuantidadeLeite();
	}
}
