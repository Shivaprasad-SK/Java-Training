
import java.sql.*;

public class DbTest {

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:sqlite:college.db");
            System.out.println("DB connection opened");
            Statement stmt = con.createStatement();
            // stmt.executeUpdate("Drop table if Exists student");

            // stmt.executeUpdate("Create table student(usn int,name varchar(25),marks float);");
            // stmt.executeUpdate("INSERT INTO student Values(101,'Varun',100);");
            // stmt.executeUpdate("INSERT INTO student Values(102,'Shiva',96);");
            // stmt.executeUpdate("INSERT INTO student Values(103,'Prasad',90);");
            stmt.executeUpdate("Update student set marks=99 where usn=102;");
            ResultSet rs = stmt.executeQuery("Select * from student;");
            while (rs.next()) {
                System.out.println("\nUSN " + rs.getInt("usn") + "\nName " + rs.getString("name") + "\nMarks " + rs.getFloat("marks"));

            }
            stmt.executeUpdate("delete from student where usn=101;");
            con.close();
            System.out.println("DB connection closed");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
