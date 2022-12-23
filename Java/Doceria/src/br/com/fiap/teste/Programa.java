package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Brigadeiro;

import java.util.Collections;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Brigadeiro b1 = new Brigadeiro("Brigadeiro do choro", 50, 30.2);
		Brigadeiro b2 = new Brigadeiro("Brigadeiro da desgraça", 60,21.2);
		Brigadeiro b3 = new Brigadeiro("Brigadeiro da alegria",21,62.2);
		
		List<Brigadeiro>brigadeiro = new ArrayList<Brigadeiro>();
		
		brigadeiro.add(b1);
		brigadeiro.add(b2);
		brigadeiro.add(b3);
		Collections.sort(brigadeiro);
		
		for(Brigadeiro b : brigadeiro) {
			System.out.println(b.getNome());
		}
	}
	
}
