package lab3.Q3;



import java.sql.*;

public class StudentDetails {
    public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/College";
            String username = "root";
            String password = "manish123";
            Connection con = DriverManager.getConnection(url,username,password);

            String sql = "select * from student";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while(rs.next())
            {
                System.out.println("Student ID : "  + rs.getInt(1));
                System.out.println("Student Roll Number : " + rs.getInt(2));
                System.out.println("Student Name : " + rs.getString(3));
                System.out.println("Student address : " + rs.getString(4));
                System.out.println("Student program : " + rs.getString(5));

            }

            pstm.close();
            rs.close();


        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
