package ai.takeo.bootcamp.customermgmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//clean code
//resource management
// create table 
//DATA ACCESS OBJECT
//CustomerRepository
public class CustomerDAO {
	public static void main(String[] args) {

		// connection url
		String url = "jdbc:mysql://localhost:3306/test_db1";
		String username = "root";
		String password = "admin@123_123";

		try {
			// Register the JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Open a connection
			Connection conn = DriverManager
					.getConnection(url, username, password);
			// create table
			createTable(conn);
			// Insert data into the customers table
			insertData(conn);

			// Display data from the customers table
			displayData(conn);

			// Close the connection
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static long dropTable(Connection conn) throws SQLException {
		PreparedStatement statement = conn.prepareStatement(
				"drop TABLE customers");
		long rowAffected = statement.executeUpdate();
		System.out.println("Table drop successfully.");
		statement.close();
		return rowAffected;
	}
	public static long createTable(Connection conn) throws SQLException {
		PreparedStatement statement = conn.prepareStatement(
				"CREATE TABLE customers "
				+ "(customer_id INT PRIMARY KEY, customer_name VARCHAR(50) "
				+ "NOT NULL, email VARCHAR(50) NOT NULL, address VARCHAR(100))");
		long rowAffected = statement.executeUpdate();
		System.out.println("Table created successfully.");
		statement.close();
		return rowAffected;
	}

	public static void insertData(Connection conn) throws SQLException {
		// Create a prepared statement
		PreparedStatement stmt = conn.prepareStatement(
				"INSERT INTO customers "
				+ "(customer_id, customer_name, email, address) "
				+ "VALUES (?, ?, ?, ?)");

		// Insert data into the table
		stmt.setInt(1, 1);
		stmt.setString(2, "John Doe");
		stmt.setString(3, "john.doe@example.com");
		stmt.setString(4, "123 Main St");
		stmt.executeUpdate();

		stmt.setInt(1, 2);
		stmt.setString(2, "Jane Smith");
		stmt.setString(3, "jane.smith@example.com");
		stmt.setString(4, "456 High St");
		stmt.executeUpdate();

		// Close the statement
		stmt.close();
	}

	public static int displayData(Connection conn) throws SQLException {
		int size = 0;
		// Create a statement
		Statement stmt = conn.createStatement();

		// Execute a query and get the result set
		ResultSet rs = stmt.executeQuery("SELECT * FROM customers");

		// Display the data
		while (rs.next()) {
			int id = rs.getInt("customer_id");
			String name = rs.getString("customer_name");
			String email = rs.getString("email");
			String address = rs.getString("address");
			System.out.println("ID: " + id + ", Name: " + name + ", "
					+ "Email: " + email + ", Address: " + address);
			size++;
		}
		
		// Close the result set and statement
		rs.close();
		stmt.close();
		return size;
	}
}
