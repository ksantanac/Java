package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarRegistro {

    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);
        Connection conexao = FabricaConexao.getConexao();

        System.out.println("Informe o nome para ser atualizado: ");
        String nomeAntigo = entrada.nextLine();

        System.out.println("Informe o código referente ao nome: ");
        int codigoPessoa = entrada.nextInt();

        String sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nomeAntigo);
        stmt.setInt(2, codigoPessoa);

        stmt.executeUpdate();
        System.out.println("Query executada com sucesso!");
        
        entrada.close();
        stmt.close();

    }

}
