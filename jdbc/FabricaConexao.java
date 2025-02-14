package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

    public static Connection getConexao() throws SQLException {

        try {
            final String url = "jdbc:mysql://localhost";
            final String usuario = "root";
            final String senha = "rekaue13";

            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
