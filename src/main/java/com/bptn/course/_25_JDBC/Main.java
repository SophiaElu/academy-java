package com.bptn.course._25_JDBC;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
    
		  ToDoListClass jdbc = new ToDoListClass();
		  Connection conn = jdbc.createConnection();
		  jdbc.closeConnection(conn);
		 }

	}

