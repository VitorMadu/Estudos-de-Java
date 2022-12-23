package br.com.montadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.montadora.beans.Carro;

public class CarroDAO {

	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public CarroDAO(Connection con) {
		setCon(con);
	}

	public String inserirCarro(Carro carro) {
		String sql = "insert into carrodois(modelo, capacidadecombustivel, " 
	+ "quantidadejanela) values (?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, carro.getModelo());
			ps.setInt(2, carro.getCapacidadeCombustivel());
			ps.setInt(3, carro.getQuantidadeJanela());
			if (ps.executeUpdate() > 0) {
				return "Inserido com sucesso.";
			} else {
				return "Erro ao inserir.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

	public String deletarCarroSemWhere() {
		String sql = "delete from carrodois";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso.";
			} else {
				return "Erro ao deletar.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public String deletarCarroComWhere(Carro carro) {
		String sql = "delete from carrodois where modelo = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, carro.getModelo());
			if (ps.executeUpdate() > 0) {
				return "Deletado com sucesso e utilizado o where.";
			} else {
				return "Erro ao deletar com where.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	// Método alterar utilizando o update

	public String alterar(Carro carro) {
		String sql = "update carrodois set capacidadecombustivel = ? "
				+ "where modelo = ?";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setInt(1, carro.getCapacidadeCombustivel());
			ps.setString(2, carro.getModelo());
			if (ps.executeUpdate() > 0) {
				return "Alterado com sucesso";
			} else {
				return "Erro ao alterar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}

}