package br.com.fiap.teste;

import java.sql.Connection;

import br.com.fiap.beans.Pessoa;
import br.com.fiap.conexao.Conexao;
import br.com.fiap.dao.PessoaDAO;

public class ProgramaDoisDeletar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = Conexao.abrirConexao();

		Pessoa pessoa = new Pessoa();
		PessoaDAO pessoadao = new PessoaDAO(con);}A

		// Testando o método deletar
		// Método deletarDois utilizando o delete com o where para endereco



		   public String deletarDois(Pessoa pessoa) {
		        String sql = "delete from pessoa where endereco = ?";
		        try {
		            PreparedStatement ps = getCon().prepareStatement(sql);
		            ps.setString(1, pessoa.getEndereco());
		            if (ps.executeUpdate() > 0) {
		                return "Deletado com sucesso";
		            } else {
		                return "Erro ao deletar";
		            }
		        } catch (SQLException e) {
		            return e.getMessage();
		        }
		    }
	}

}
