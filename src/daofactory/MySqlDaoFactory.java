package daofactory;


import java.sql.Connection;
import java.sql.DriverManager;

import dao.interfaces.*;
import dao.mysql.*;

public class MySqlDaoFactory extends DaoFactory {

	public static Connection obtenerConexion(){
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
	
		/*	String url = "jdbc:mysql://us-cdbr-azure-central-a.cloudapp.net/bd_aragon";
			String user = "b47dc286de2f19";
			String password ="f1460e2f";
			*/	
			String url = "jdbc:mysql://localhost:3306/bd_aragon";
			String user = "root";
			String password ="root";
	
			con = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
		
		return con;
	}

		

		@Override
		public ProformaDao getProformaDao() {
			// TODO Auto-generated method stub
			return new MySql_ProformaDao();
		}

		
}