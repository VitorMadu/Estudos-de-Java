package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resp= 0, indice=0, intIdade= 0, intFaltas= 0;
		String strNome= null;
		double dblMedia= 0;
		Aluno[] objeto = new Aluno[3];
		while (resp==0) {
			strNome = JOptionPane.showInputDialog("digite o nome: ");
			dblMedia= Double.parseDouble(JOptionPane.showInputDialog("Digite a sua media"));
			intIdade= Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
			intFaltas= Integer.parseInt(JOptionPane.showInputDialog("Digite as faltas"));
			
			objeto[indice]= new Aluno();
			objeto[indice] .setIdade(intIdade);	
			objeto[indice] .setFaltas(intFaltas);
			objeto[indice] .setMedia(dblMedia);
			objeto[indice] .setNome(strNome);
			indice += 1;
			
			resp=JOptionPane.showConfirmDialog(null, "deseja continuar? ", "caixa", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			
			for(int i=0;i<indice;i++) {
				System.out.println("\n"+ objeto[i].getNome()+ "\n"+ objeto[i].getMedia());
			
			}
			
		}
	}
}
