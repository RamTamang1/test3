package ai.takeo.bootcamp.customermgmt;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CustomerDAOTest {
	private Connection conn;
	@Before
	public void setUp() {
		String url = "jdbc:mysql://localhost:3306/test_db1";
		String username = "root";
		String password = "admin@123_123";
		try {
			// Register the JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Open a connection
			this.conn = DriverManager
					.getConnection(url, username, password);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	@After
	public void cleanUp() {
		try {
			this.conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(expected = SQLSyntaxErrorException.class)
	public void testCreateTableThrowExceptionIfTableExist() throws SQLException {
		long rowAffected = CustomerDAO.createTable(conn);
		assertEquals(0, rowAffected);
	}
	@Test
	public void testDropTable() throws SQLException {
		long rowAffected = CustomerDAO.dropTable(conn);
		assertEquals(0, rowAffected);
	}
	//TODO remove E
	@Test
	public void testECreateTable() throws SQLException {
		long rowAffected = CustomerDAO.createTable(conn);
		assertEquals(0, rowAffected);
	}
	//TODO With specific inserted data
	@Test
	public void testInsertData() throws SQLException {
		CustomerDAO.insertData(conn);
		int size = CustomerDAO.displayData(conn);
		assertEquals(2, size);
	}
}
