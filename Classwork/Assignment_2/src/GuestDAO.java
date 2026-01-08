import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class GuestDAO {

    // CREATE
    public void addGuest(Guest guest) throws Exception {
        Connection conn = DatabaseConnection.getConnection();
        String sql = "INSERT INTO guests(name, age, phone) VALUES (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, guest.getName());
        ps.setInt(2, guest.getAge());
        ps.setString(3, guest.getPhoneNumber());
        ps.executeUpdate();
    }

    // READ
    public void getAllGuests() throws Exception {
        Connection conn = DatabaseConnection.getConnection();
        String sql = "SELECT * FROM guests";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " | " +
                            rs.getString("name") + " | " +
                            rs.getInt("age") + " | " +
                            rs.getString("phone")
            );
        }
    }
}
