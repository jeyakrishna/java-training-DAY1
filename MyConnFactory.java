package com.interfaces;

public class MyConnFactory {

	public static MyConnection getDBConn(String db) {//use of static makes it loosely coupled code
	
		if(db.equals("oracle")) {
			return new OracleDBImpl();
		}
		
		if(db.equals("mysql")) {
			return new MySQLDBImpl();
		} 
		
		else {
			throw new RuntimeException("DB doesnot match...");		
		}
		
	}
	
}
