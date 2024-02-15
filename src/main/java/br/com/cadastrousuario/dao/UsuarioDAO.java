package br.com.cadastrousuario.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.cadastrousuario.beans.Usuario;

public class UsuarioDAO {
    
    private static Connection con;
    
    public UsuarioDAO(Connection recebeCon) {
        con = recebeCon;
    }
    
    //Cadastrar
     
    public static boolean cadastrar(Usuario usuario) // throws Exception {

    {
        String sql = "insert into usuario (nome, login, senha) values (?,?,?)";

        try {
            PreparedStatement estrutura = con.prepareStatement(sql);
            estrutura.setString(1, usuario.getNome());
            estrutura.setString(2, usuario.getLogin());
            estrutura.setString(3, usuario.getSenha());

            if (estrutura.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }
    }
}
