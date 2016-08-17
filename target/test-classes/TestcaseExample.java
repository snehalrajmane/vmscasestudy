package dao;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class TestcaseExample {

	@Test
	public void test() {
		DatabaseManager db;
		String result;
		boolean res=false;
		int count=0;
		try {
			
			db = DatabaseManager.getInstance();
			ResultSet rs=db.showAllSearch("sda55");
			while(rs.next())
				count++;
			/*if (!rs.next() ) {
			    System.out.println("no data");
			}*/
			/*if(rs.next()){
				System.out.println("In if block");
				res=true;
			}*/
			//boolean res=rs.next();
			//System.out.println("Result="+res);
			if(count>0)
			{
				System.out.println("Entries are available");
				res=true;
			}
			
				result=Boolean.toString(res);;
			assertEquals("true", result);
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
