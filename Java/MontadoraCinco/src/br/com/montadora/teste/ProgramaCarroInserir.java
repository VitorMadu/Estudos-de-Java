package br.com.montadora.teste;

import java.sql.Connection;
import br.com.montadora.beans.Carro;
import br.com.montadora.conexao.Conexao;
import br.com.montadora.dao.CarroDAO;

public class ProgramaCarroInserir {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();
		
		Carro carro = new Carro();
		CarroDAO carrodao = new CarroDAO(con);
		
		//Testando o método inserir
		carro.setModelo("HRV");
		carro.setCapacidadeCombustivel(50);
		carro.setQuantidadeJanela(8);
		
		System.out.println(carrodao.inserirCarro(carro));
		
		Conexao.fecharConexao(con);
	}
}
