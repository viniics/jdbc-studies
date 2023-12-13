import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AniversariantesDoMes {
    Connection con;

    public AniversariantesDoMes() {
        initializeCon();
    }

    private void initializeCon() {
        String url = "jdbc:mysql://localhost:3306/aniversariantes_app";
        String user = "root";
        String pw = "1234";
        try {
            this.con = DriverManager.getConnection(url, user, pw);
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connection Success!");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ResultSet query(String operation){
        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(operation);
            while (rs.next()) {
                System.out.print(rs.getString("id"));
                System.out.print(" - ");
                System.out.print(rs.getString("Nome"));
                System.out.print(" - ");
                System.out.print(rs.getString("Dia do Aniversario"));
                System.out.print("\n");
            }
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
