package br.com.montadora.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.montadora.beans.Moto;


public class MotoDAO {

	private Connection con;

	public final Connection getCon() {
		return con;
	}

	public final void setCon(Connection con) {
		this.con = con;
	}

	public MotoDAO(Connection con) {
		setCon(con);
	}

	public String inserirMoto(Moto moto) {
		String sql = "insert into motodois(modelo, capacidadecombustivel, " 
	+ "quantidadeadesivo) values (?,?,?)";
		try {
			PreparedStatement ps = getCon().prepareStatement(sql);
			ps.setString(1, moto.getModelo());
			ps.setInt(2, moto.getCapacidadeCombustivel());
			ps.setInt(3, moto.getQuantidadeAdesivo());
			if (ps.executeUpdate() > 0) {
				return "Moto inserida com sucesso.";
			} else {
				return "Erro ao inserir ao inserir a moto.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
}