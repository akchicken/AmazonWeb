package Procedures;

import java.sql.*;

public class RetreiveUser {

	public static String [] [] Retreive() {
		// TODO Auto-generated method stub
		String [][] usrr=new String [5][2];
		String url="jdbc:sqlserver://ABHIJITWS:1433;DatabaseName=AmazonWebDB1;integratedSecurity=true";
		try
		{ 
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			 Connection con=DriverManager.getConnection(url);
			 CallableStatement  stat=con.prepareCall("{call retreive_user()}");
			 ResultSet rs=stat.executeQuery();
			 System.out.println("USERNAME Password");
			 int i=0,j=0;
			 while (rs.next())
				{
					usrr[i][j]=rs.getString("username");
					usrr[i][j+1]=rs.getString("pass");
					i++;
				}
		}
		catch (SQLException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		return usrr;

	}

}
