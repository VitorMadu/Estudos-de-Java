package br.com.fiap.beans;

public class Brigadeiro extends Doce implements Comparable<Brigadeiro>{

	private double quantidadeChocolate;

	Brigadeiro() {

	}

	public Brigadeiro(String nome, double quantidadeLeite, double quantidadeChocolate) {
		super(nome, quantidadeLeite);
		setQuantidadeChocolate(quantidadeChocolate);
	}

	public final double getQuantidadeChocolate() {
		return quantidadeChocolate;
	}

	public final void setQuantidadeChocolate(double quantidadeChocolate) {
		this.quantidadeChocolate = quantidadeChocolate;
	}

	@Override
	public String retornaAtributos() {
		return "O nome do doce é: " + getNome() + "\n A quantidade de leite é de: " + getQuantidadeLeite()
				+ "\n e a quantidade de chocolate é de: " + getQuantidadeChocolate();

	}

	public int compareTo(Brigadeiro brigadeiro) {
		if (getQuantidadeLeite()< brigadeiro.getQuantidadeLeite())
			return -1;
		if(getQuantidadeLeite()>brigadeiro.getQuantidadeLeite())
			return 1;
		return 0;
	}
}
