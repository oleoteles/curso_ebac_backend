/**
 * 
 */
package dao.jdbc;

import java.sql.Connection;

/**
 * 
 */
public class TestaConexao {
	    public static void main(String[] args) {
        try {
            Connection conn = ConnectionFactory.getConnection();
            if (conn != null && !conn.isClosed()) {
                System.out.println("✅ Conexão bem-sucedida!");
            } else {
                System.out.println("❌ Falha na conexão!");
            }
        } catch (Exception e) {
            System.err.println("Erro ao conectar ao banco: " + e.getMessage());
        }
    }
}

