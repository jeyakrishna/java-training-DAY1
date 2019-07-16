package com.interfaces;

public class InterfaceMain {

	public static void main(String[] args) {
		
		
		//MyConnection con = new OracleDBImpl();
		MyConnection con = MyConnFactory.getDBConn("mysql ");
		System.out.println(con.getConnectionInfo());
		System.out.println(MyConnection.TYPE);
	}

}
