package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Brigadeiro;

import java.util.Collections;


public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Brigadeiro b1 = new Brigadeiro("Brigadeiro de maconha", 30, 50.0);
		Brigadeiro b2 = new Brigadeiro("Brigadeiro feliz", 50.6, 32.1);
		Brigadeiro b3 = new Brigadeiro("Brigadeiro triste", 40.2, 21.2);
		
		List<Brigadeiro>brigadeiro = new ArrayList<Brigadeiro>();
		
		brigadeiro.add(b1);
		brigadeiro.add(b2);
		brigadeiro.add(b3);
		Collections.sort(brigadeiro);
		
		for (Brigadeiro b : brigadeiro) {
			System.out.println( b.getNome());
		}
	}

}
