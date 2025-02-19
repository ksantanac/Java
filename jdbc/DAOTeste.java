package jdbc;

public class DAOTeste {

    public static void main(String[] args) {

        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";

        System.out.println(dao.incluir(sql, "Kaue Matheus Santana"));
        System.out.println(dao.incluir(sql, "Fabio Ippolito"));
        System.out.println(dao.incluir(sql, "Renata Santana"));

        dao.close();

    }

}
