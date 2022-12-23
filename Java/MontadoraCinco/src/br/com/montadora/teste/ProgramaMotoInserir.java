package br.com.montadora.teste;

import java.sql.Connection;

import br.com.montadora.beans.Moto;
import br.com.montadora.conexao.Conexao;
import br.com.montadora.dao.MotoDAO;


public class ProgramaMotoInserir {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();
		
		Moto moto = new Moto();
		MotoDAO motodao = new MotoDAO(con);
		
		//Testando o método inserir
		moto.setModelo("Twister");
		moto.setCapacidadeCombustivel(8);
		moto.setQuantidadeAdesivo(2);
		
		System.out.println(motodao.inserirMoto(moto));
		
		Conexao.fecharConexao(con);
	}
}
