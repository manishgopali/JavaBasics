package lab3.Q1;



import java.sql.*;


public class ShopDatabase {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/Shop";
            String username="root";
    		String password="manish123";

            Connection con = DriverManager.getConnection(url,username,password);

            insertRecord(con,"first_item",18.76,30,"2012-01-26");
            insertRecord(con,"second_item",22.34,35,"2012-05-06");
            insertRecord(con,"third_item",29.87,25,"2012-11-05");

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void insertRecord(Connection con, String name,double unitPrice,int units, String expiryDate) throws SQLException
    {
        try{
            String sql = "insert into item(name,unitPrice,units,expiryDate) values (?,?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1,name);
            pstm.setDouble(2,unitPrice);
            pstm.setInt(3,units);
            pstm.setString(4,expiryDate);

            int flag = pstm.executeUpdate();
            if(flag>0)
            {
                System.out.println("Data inserted Successfully !");

            }
            else{
                System.out.println("Data insertion failed !");
            }

        }catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
