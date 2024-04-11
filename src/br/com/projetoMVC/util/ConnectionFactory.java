package br.com.projetoMVC.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionFactory {
	
	// Constantes = para criar uma constante no java precisamos usar o FINAL
	
	// Endereço do banco de dados
	public static final String PATH = "jdbc:postgresql://localhost:5432/db_adas";
	// Dados para validação no banco de dados
	public static final String USER = "postgres";
	public static final String PASSWORD = "admin";
	
	// Método que retorna a conexão estabelecida
	// Get - obtendo um valor - obter conexão 
	public static Connection getConnection() throws Exception {
		// try - catch = é uma estrutura para tratamento de exceção
		try {
			// Carregar o driver do postgresql
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection(PATH, USER, PASSWORD);
		} catch (Exception e) {
			// Mostra uma mensagem de erro caso a conexão falhar
			throw new Exception(e.getMessage());
		}
	}
	
	public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) throws Exception {
		close(conn,stmt,rs);
	}
	
	public static void closeConnection(Connection conn, Statement stmt) throws Exception {
		close(conn,stmt,null);
	}
	
	public static void closeConnection(Connection conn) throws Exception {
		close(conn,null,null);
	}
	
	// Método responsável por fechar a conexão de um dos objetos por parâmetro
	private static void close(Connection conn,Statement stmt,ResultSet rs) throws Exception {
		try {
			// Se o objeto da Connection.. aberto será fechado assim que acionado esse método
			if(rs != null) {
				rs.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			if(conn != null){
				conn.close();
			}
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}
}
