package cadastrocliente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexao {

    public Connection con = null;
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String BDNOME = "bd";
    private final String URL = "jdbc:mysql://localhost/" + BDNOME;
    private final String LOGIN = "root";
    private final String SENHA = "";

    public boolean getConnection() {
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, LOGIN, SENHA);
            JOptionPane.showMessageDialog(null, "Conexão OK!");
            return true;
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado!" + e.toString());
            return false;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao Conectar!" + e.toString());
            return false;
        }
    }

    public void close() {
        try {
            con.close();
            JOptionPane.showMessageDialog(null, "BD desconectou!");
        } catch (SQLException e) {
        }
    }
}
