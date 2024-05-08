public class User {
    // Nodo 1
    public Connection conectarBD() {
        Connection conn = null;  // Nodo 2
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // Nodo 3
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";  // Nodo 4
            conn = DriverManager.getConnection(url);  // Nodo 5
        } catch (Exception e) {
            e.printStackTrace();  // Nodo 6
        }
        return conn;  // Nodo 7
    }

    // Nodo 8
    public String nome = "";
    // Nodo 9
    public boolean result = false;

    // Nodo 10
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";  // Nodo 11
        Connection conn = conectarBD();  // Nodo 12
        sql += "select nome from usuarios where login = ? and senha = ?";  // Nodo 13
        try {
            PreparedStatement ps = conn.prepareStatement(sql);  // Nodo 14
            ps.setString(1, login);  // Nodo 15
            ps.setString(2, senha);  // Nodo 16
            ResultSet rs = ps.executeQuery();  // Nodo 17
            if (rs.next()) {  // Nodo 18
                result = true;  // Nodo 19
                nome = rs.getString("nome");  // Nodo 20
            }
        } catch (Exception e) {
            e.printStackTrace();  // Nodo 21
        }
        return result;  // Nodo 22
    }
}
