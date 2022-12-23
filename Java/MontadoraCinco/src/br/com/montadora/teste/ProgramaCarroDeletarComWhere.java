package br.com.montadora.teste;

import java.sql.Connection;

import br.com.montadora.beans.Carro;
import br.com.montadora.conexao.Conexao;
import br.com.montadora.dao.CarroDAO;

public class ProgramaCarroDeletarComWhere {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();

		CarroDAO carrodao = new CarroDAO(con);
		Carro carro =  new Carro();
		carro.setModelo("Civic");
		
		// Testando o método deletar
		System.out.println(carrodao.deletarCarroComWhere(carro));

		Conexao.fecharConexao(con);
	}
}
