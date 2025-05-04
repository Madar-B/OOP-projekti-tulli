import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ExitEvent {
    public static void main(String[] args) throws Exception {
        Class.forName("org.mariadb.jdbc.Driver");

        String url = "jdbc:mariadb://localhost:3306/Tulli";
        String user = "root";       // ← replace this
        String password = "maria";   // ← replace this

        Connection conn = DriverManager.getConnection(url, user, password);

        String sql = "INSERT INTO ajoneuvot (Rekisteri, saapumisaika, Maahantulolupa, AjoneuvoPaperit) VALUES (?, ?, ?, ?)";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, "BRUH-666");    // Rekisteri
        stmt.setString(2, "16.45");       // saapumisaika (as VARCHAR)
        stmt.setBoolean(3, true);         // Maahantulolupa
        stmt.setBoolean(4, false);        // AjoneuvoPaperit

        stmt.executeUpdate();
        conn.close();

        System.out.println("Inserted row into Tulli.Ajoneuvot.");
    }
}
