package login.registration;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerDAOImp implements CustomerDAO {

	static Connection con;
	static PreparedStatement ps;

	@Override
	public int insertCustomer(Customer c) {
		int status = 0;
		try {
			con = MyConnectionProvider.getConnection();
			ps = con.prepareStatement("insert into customer values(?,?,?,?,?,?)");
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
		try {

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

}
