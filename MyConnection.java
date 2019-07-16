package com.interfaces;

public interface MyConnection {

	String TYPE = "RDBMS";//must be initialised bcz by default interfaces are 
	
	String DBInfo();
	
	String getConnectionInfo();
	
}
