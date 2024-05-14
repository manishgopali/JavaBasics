package assing3.Q14;


import java.sql.*;

public class EmployeeCRUD {
	public static void main(String[] args) {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

           

            String url = "jdbc:mysql://localhost:3306/csitSeven";
            String username = "root";
            String password = "manish123";
            Connection con =  DriverManager.getConnection(url,username,password);
            
           
            	    // Create table
                    createEmployeeTable(con);
                  
            
            	 // Insert a new employee
                 int newEmployeeId = createEmployee(con, "sita", "nepal", "sitanepal@email.com", "sr.Developer", 90000);
        
               
            	 
            
            	    // Read and display all employees
                     readEmployees(con);
                    
            	 
            	 
             
            	  // Update the salary of the new employee
                 newEmployeeId = 3;
                 updateEmployeeSalary(con, newEmployeeId, 100000);
                
         	    // Read and display all employees after update
                 readEmployees(con);
            
            	 // Delete the new employee
                   newEmployeeId = 2;
                   deleteEmployee(con, newEmployeeId);
                 
           	    // Read and display all employees after delete
                   readEmployees(con);
                   
                  
             
           
          
       

        }
        catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }
   }
	
	 private static void createEmployeeTable(Connection connection) throws SQLException {
	        String createTableSQL = "CREATE TABLE Employee (" +
	                "employee_id INT AUTO_INCREMENT PRIMARY KEY," +
	                "first_name VARCHAR(255)," +
	                "last_name VARCHAR(255)," +
	                "email VARCHAR(255)," +
	                "job_title VARCHAR(255)," +
	                "salary INT" +
	                ")";
	        try (Statement statement = connection.createStatement()) {
	            statement.executeUpdate(createTableSQL);
	        }
	    }

	    private static int createEmployee(Connection connection, String firstName, String lastName,
	                                      String email, String jobTitle, int salary) throws SQLException {
	        String insertSQL = "INSERT INTO Employee (first_name, last_name, email, job_title, salary) VALUES (?, ?, ?, ?, ?)";
	        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL, Statement.RETURN_GENERATED_KEYS)) {
	            preparedStatement.setString(1, firstName);
	            preparedStatement.setString(2, lastName);
	            preparedStatement.setString(3, email);
	            preparedStatement.setString(4, jobTitle);
	            preparedStatement.setInt(5, salary);
	            preparedStatement.executeUpdate();

	            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
	            if (generatedKeys.next()) {
	                return generatedKeys.getInt(1); // Return the auto-generated employee_id
	            } else {
	                throw new SQLException("Creating employee failed, no ID obtained.");
	            }
	        }
	    }

	    private static void readEmployees(Connection connection) throws SQLException {
	        String selectSQL = "SELECT * FROM Employee";
	        try (Statement statement = connection.createStatement();
	             ResultSet resultSet = statement.executeQuery(selectSQL)) {

	            System.out.println("Employee Table:");
	            System.out.println("-----------------------------------------------------");
	            System.out.printf("%-15s%-15s%-15s%-30s%-20s%-10s\n", "Employee ID", "First Name", "Last Name", "Email", "Job Title", "Salary");
	            System.out.println("-----------------------------------------------------");

	            while (resultSet.next()) {
	                int employeeId = resultSet.getInt("employee_id");
	                String firstName = resultSet.getString("first_name");
	                String lastName = resultSet.getString("last_name");
	                String email = resultSet.getString("email");
	                String jobTitle = resultSet.getString("job_title");
	                int salary = resultSet.getInt("salary");

	                System.out.printf("%-15s%-15s%-15s%-30s%-20s%-10s\n", employeeId, firstName, lastName, email, jobTitle, salary);
	            }
	            System.out.println();
	        }
	    }

    private static void updateEmployeeSalary(Connection connection, int employeeId, int newSalary) throws SQLException {
        String updateSQL = "UPDATE Employee SET salary = ? WHERE employee_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
            preparedStatement.setInt(1, newSalary);
            preparedStatement.setInt(2, employeeId);
            preparedStatement.executeUpdate();
        }
	    }

    private static void deleteEmployee(Connection connection, int employeeId) throws SQLException {
        String deleteSQL = "DELETE FROM Employee WHERE employee_id = ?";
	        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {
            preparedStatement.setInt(1, employeeId);
            preparedStatement.executeUpdate();
        }
    }
	
	
}
