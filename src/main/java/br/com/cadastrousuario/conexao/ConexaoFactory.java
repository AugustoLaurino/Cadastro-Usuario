package br.com.cadastrousuario.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
    public static void main(String[] args) throws SQLException {
        Connection conexao = null;
        String url = "url";
        conexao = DriverManager.getConnection(url, "usuario", "senha");
        System.out.println("Abriu a conexão");
        conexao.close();
    }
}
