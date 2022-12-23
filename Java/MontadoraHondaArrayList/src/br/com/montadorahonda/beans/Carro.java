package br.com.montadorahonda.beans;

public class Carro {
	private String nomeCarro;
	private double capacidadeTanque;
	
	Carro() {
		
	}
	public Carro(String recebeNomeCarro, double recebecapacidadeTanque) {
		setNomeCarro(recebeNomeCarro);
		setCapacidadeTanque(recebecapacidadeTanque);
	}
	public final String getNomeCarro() {
		return nomeCarro;
	}
	public final void setNomeCarro(String nomeCarro) {
		this.nomeCarro = nomeCarro;
	}
	public final double getCapacidadeTanque() {
		return capacidadeTanque;
	}
	public final void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
}