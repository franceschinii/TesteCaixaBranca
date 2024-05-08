package login;

import java.sql.*;

public class oldUser {
    public Connection conectarBD() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
        }
        return conn;
    }

    public String nome = "";
    public boolean result = false;

    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();
        //INSTRUÇÃO SQL
        sql += "select nome from usuarios";
        sql += "where login = " + "'" + login + "'";
        sql += " and senha = " + "'" + senha + "'";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                result = true;
                nome = rs.getString(nome);
            }
        } catch (Exception e) {
        }
        return result;
    }//fim da class
}

/*
        Erros no código

        1. **Carregamento do driver JDBC:**
        - O nome da classe do driver do MySQL está incorreto. Deve ser `com.mysql.cj.jdbc.Driver` em vez de `com.mysql.Driver.Manager`.
        - `newInstance()` é desnecessário ao carregar o driver.

        2. **Manuseio de exceções:**
        - Os blocos `catch` estão vazios, o que não é uma boa prática, pois você não terá informações sobre falhas. É importante pelo menos registrar ou imprimir a exceção.

        3. **Construção da instrução SQL:**
        - Está faltando um espaço antes da cláusula `where` na string SQL, o que causará um erro ao executar a query.
        - A concatenação direta de valores na query pode levar a vulnerabilidades de SQL Injection. Use `PreparedStatement` para evitar isso.

        4. **Recuperação do nome do usuário:**
        - Quando você chama `rs.getString(nome)`, você deve passar o nome da coluna em vez da variável `nome` que você definiu como uma string vazia. Deveria ser algo como `rs.getString("nome")`.
*/