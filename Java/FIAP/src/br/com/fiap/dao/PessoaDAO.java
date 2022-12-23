package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.Pessoa;

public class PessoaDAO {
	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}
	
	public PessoaDAO(Connection con) {
		setCon(con);
	}
	
	public String inserir(Pessoa pessoa) {
		String sql = "insert into pessoa(nome, endereco) values (?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, pessoa.getNome());
			ps.setString(2, pessoa.getEndereco());
			if(ps.executeUpdate() > 0) {
				return "Inserido com sucesso";
			}	else {
				return "Erro ao inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();}
		}
	public String deletar (Pessoa pessoa) {
		String sql = "delete from pessoa where nome = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, pessoa.getNome());
			if (ps.executeUpdate() > 0) {
				return "deletado com sucesso";
			} else {
				return "Erro ao deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	
		
	}

	
}


