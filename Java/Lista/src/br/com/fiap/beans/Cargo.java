package br.com.fiap.beans;

public class Cargo implements Comparable<Cargo>{
	private String Cargo;
	private String nivel;
	private int salario;
	
	Cargo(){
		
	}
	public Cargo(String recebeCargo, String recebeNivel, int recebeSalario) {
		setCargo(recebeCargo);
		setNivel(recebeNivel);
		setSalario(recebeSalario);
	}
	public final String getCargo() {
		return Cargo;
	}
	public final void setCargo(String cargo) {
		Cargo = cargo;
	}
	public final String getNivel() {
		return nivel;
	}
	public final void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public final int getSalario() {
		return salario;
	}
	public final void setSalario(int salario) {
		this.salario = salario;
	}
	@Override
	public int compareTo(Cargo outro) {
		if(this.salario < outro.salario) {
			return -1;
		}
		if(this.salario > outro.salario) {
			return 1;
		}
		return 0;
	}
	
}
