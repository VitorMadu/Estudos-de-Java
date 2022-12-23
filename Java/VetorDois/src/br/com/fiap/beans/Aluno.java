package br.com.fiap.beans;

public class Aluno {
	private String nome;
	private int idade;
	private int faltas;
	private double media;
	
	public Aluno(){
		super();
	}
	public Aluno(String n, int i, int f,double m) {
		setFaltas(f);
		setIdade(i);
		setMedia(m);
		setNome(n);
	}
	public final String getNome() {
		return nome;
	}
	public final void setNome(String nome) {
		this.nome = nome;
	}
	public final int getIdade() {
		return idade;
	}
	public final void setIdade(int idade) {
		this.idade = idade;
	}
	public final int getFaltas() {
		return faltas;
	}
	public final void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	public final double getMedia() {
		return media;
	}
	public final void setMedia(double media) {
		this.media = media;
	}
	
}
