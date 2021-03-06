package login.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustomerDAOImp implements CustomerDAO {

	static Connection con;
	static PreparedStatement ps;

	@Override
	public int insertCustomer(Customer c) {
		int status = 0;
		String query = "insert into customer(_name, _username, _password, _email, _gender, _city) VALUES (?,?,?,?,?,?)";
		try {
			con = MyConnectionProvider.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1, c.getName());
			ps.setString(2, c.getUserName());
			ps.setString(3, c.getPassword());
			ps.setString(4, c.getEmail());
			ps.setString(5, c.getGender());
			ps.setString(6, c.getCity());
			status = ps.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	@Override
	public Customer getCustomer(String username, String password) {
		Customer c = new Customer();
		String query = "select * from customer where _username=? and _password=?";
		try {
			con = MyConnectionProvider.getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				c.setName(rs.getString(1));
				c.setUserName(rs.getString(2));
				c.setPassword(rs.getString(3));
				c.setEmail(rs.getString(4));
				c.setGender(rs.getString(5));
				c.setCity(rs.getString(6));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return c;
	}

}
