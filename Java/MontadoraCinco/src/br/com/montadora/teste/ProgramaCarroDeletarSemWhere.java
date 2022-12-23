package br.com.montadora.teste;

import java.sql.Connection;

import br.com.montadora.conexao.Conexao;
import br.com.montadora.dao.CarroDAO;

public class ProgramaCarroDeletarSemWhere {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();

		CarroDAO carrodao = new CarroDAO(con);

		// Testando o m�todo deletar
		System.out.println(carrodao.deletarCarroSemWhere());

		Conexao.fecharConexao(con);
	}
}
