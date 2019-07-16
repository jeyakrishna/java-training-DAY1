package com.interfaces;

public class MySQLDBImpl implements MyConnection {

	@Override
	public String DBInfo() {
		
		return "Oracle DB 12c";
	}

	@Override
	public String getConnectionInfo() {
		
		return "Oracle DB Connection";
	}

}
