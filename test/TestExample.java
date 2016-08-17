package dao;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class TestExample {

	@Test
	public void test() {
		//fail("Not yet implemented");
		//DatabaseManager db= new DatabaseManager();
		DatabaseManager db;
		String result;
		try {
			
			db = DatabaseManager.getInstance();
			ResultSet rs=db.showCVEIDSearch("CVE-2009-0033");
			boolean res=rs.next();
			System.out.println("Result="+res);
			
				result=Boolean.toString(res);;
			assertEquals("true", result);
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
