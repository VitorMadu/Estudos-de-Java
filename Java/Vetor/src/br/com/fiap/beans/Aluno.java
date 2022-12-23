package br.com.fiap.beans;

public class Aluno {
	private String nome;
	private double media;
	private int faltas;
	private int idade;
	
	public Aluno(String n, double m, int f, int i){
		nome=n;
		media=m;
		faltas=f;
		idade=i;
	}
	public Aluno(){
		super();
	}
	public final String getNome() {
		return nome;
	}
	public final void setNome(String nome) {
		this.nome = nome;
	}
	public final double getMedia() {
		return media;
	}
	public final void setMedia(double media) {
		this.media = media;
	}
	public final int getFaltas() {
		return faltas;
	}
	public final void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	public final int getIdade() {
		return idade;
	}
	public final void setIdade(int idade) {
		this.idade = idade;
	}

	
}
