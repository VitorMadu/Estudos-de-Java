package br.com.fiap.teste;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Aluno;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resp= 0, intFaltas=0, intIdade= 0, indice=0;
		double dblMedia=0;
		String strNome=null;
		Aluno[] objeto= new Aluno[10];
		while (resp==0) {
			strNome = JOptionPane.showInputDialog("Digite o nome do aluno");
			dblMedia = Double.parseDouble(JOptionPane.showInputDialog("Digite a media do aluno"));
			intFaltas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de faltas"));
			intIdade = Integer.parseInt(JOptionPane.showInputDialog("Digite idade"));
			
			objeto[indice]= new Aluno();
			objeto[indice].setIdade(intIdade);
			objeto[indice].setFaltas(intFaltas);
			objeto[indice].setMedia(dblMedia);
			objeto[indice].setNome(strNome);
			indice+=1;
			resp= JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "Camadas", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
		for(int i=0;i<indice;i++) {
			System.out.println("\n"+ objeto[i].getNome()+"\n"+objeto[i].getMedia());
		for(Aluno aluno: objeto) {
			System.out.println("\n"+ aluno.getNome()+"\n"+aluno.getMedia());
		}
		}
		}
	}

}
