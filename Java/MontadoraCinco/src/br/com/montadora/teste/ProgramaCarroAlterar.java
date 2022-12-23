package br.com.montadora.teste;

import java.sql.Connection;

import br.com.montadora.beans.Carro;
import br.com.montadora.conexao.Conexao;
import br.com.montadora.dao.CarroDAO;


public class ProgramaCarroAlterar {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();

		Carro carro = new Carro();
		CarroDAO carrodao = new CarroDAO(con);

		// Testando o método alterar
		carro.setCapacidadeCombustivel(52);
		carro.setModelo("HRV");
		System.out.println(carrodao.alterar(carro));

		Conexao.fecharConexao(con);
	}
}

