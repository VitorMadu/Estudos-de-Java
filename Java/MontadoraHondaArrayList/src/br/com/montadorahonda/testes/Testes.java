package br.com.montadorahonda.testes;

import java.util.ArrayList;
import java.util.List;
import br.com.montadorahonda.beans.Carro;

public class Testes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro carroUm = new Carro("Civic",40.3);
		Carro carroDois= new Carro("Hrv", 49);
		
		List<Carro>carro = new ArrayList<Carro>();
		
		carro.add(carroUm);
		carro.add(carroDois);
		
		for (Carro c: carro) {
			System.out.println(c.getNomeCarro());
		}
	}

}
