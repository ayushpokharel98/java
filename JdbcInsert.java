import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcInsert {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc_lab";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);

            String sql = "INSERT INTO student VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 101);
            ps.setString(2, "Ayush");
            ps.setInt(3, 21);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Record inserted successfully.");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}