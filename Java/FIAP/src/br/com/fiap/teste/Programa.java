package br.com.fiap.teste;

import java.sql.Connection;

import br.com.fiap.beans.Pessoa;
import br.com.fiap.conexao.Conexao;
import br.com.fiap.dao.PessoaDAO;

public class Programa {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();
		
		Pessoa pessoa = new Pessoa();
		PessoaDAO pessoadao = new PessoaDAO(con);
		
		//Testando o método inserir
		pessoa.setNome("Rafael Ronqui");
		pessoa.setEndereco("Rua X");
		System.out.println(pessoadao.inserir(pessoa));
		
		Conexao.fecharConexao(con);
	}
}
