package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexaodb.Conexao;
import entidade.Usuario;

public class Usuariodao {

	
	public void cadastrarCliente (Usuario usuario) {
		
		String sql = "INSERT INTO USUARIO (cpf, senha, nome) VALUES (?, ?, ?)";
		
		PreparedStatement ps = null;
		
		try {
			ps = Conexao.getConexao().prepareStatement(sql);
			
			ps.setString(1, usuario.getCpf());
			ps.setString(2, usuario.getSenha());
			ps.setString(3, usuario.getNome());
			
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
