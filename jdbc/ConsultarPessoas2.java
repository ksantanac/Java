package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);
        Connection conexao = FabricaConexao.getConexao();

        System.out.println("Informe uma letra do nome: ");
        String letra = entrada.nextLine();

        String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";

        // Criando um PreparedStatement para evitar SQL Injection e definir os parâmetros
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%" + letra + "%");

        // Executa a consulta SQL e armazena o resultado no ResultSet
        ResultSet resultado = stmt.executeQuery();

        // Criando uma lista para armazenar os objetos Pessoa que serão retornados
        List<Pessoa> pessoas = new ArrayList<>();

        // Percorrendo os resultados da consulta
        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");

            // Adiciona um novo objeto Pessoa na lista com os valores recuperados
            pessoas.add(new Pessoa(codigo, nome));
        }

        for (Pessoa p : pessoas) {
            System.out.println(p.getCodigo() + " ==> " + p.getNome());
        }

        // Fechando recursos para evitar vazamento de memória
        resultado.close();
        stmt.close();
        conexao.close();
        entrada.close();
    }

}
