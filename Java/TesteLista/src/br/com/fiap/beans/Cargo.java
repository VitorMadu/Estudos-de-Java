package br.com.fiap.beans;

public class Cargo implements Comparable<Cargo>{
    private String cargo;
    private String nivel;
    private double salario;
    
   Cargo() {

   }

   public Cargo(String recebeCargo, String recebeNivel, double recebeSalario) {
        setSalario(recebeSalario);
        setNivel(recebeNivel);
        setCargo(recebeCargo);
    }
   public final String getCargo() {
        return cargo;
    }
   public final void setCargo(String cargo) {
        this.cargo = cargo;
    }
   public final String getNivel() {
        return nivel;
    }
   public final void setNivel(String nivel) {
        this.nivel = nivel;
    }
   public final double getSalario() {
        return salario;
    }
   public final void setSalario(double salario) {
        this.salario = salario;
    }
   //Esse método não está sendo utilizado, é apenas para demonstração
    public int retornaSomaInteiro(int a) {
        return 36 + a;
    }
    
    public int compareTo(Cargo outro) {
        if (this.salario < outro.salario) {
            return - 1;
        }
        if (this.salario > outro.salario) {
            return 1;
        }
        return 0;
    }




}