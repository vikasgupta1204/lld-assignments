package com.lld.lld;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import singleton.DatabaseConnection;

public class DataBaseConnectionTester {

	private final ByteArrayOutputStream outputStreamCaptor=new ByteArrayOutputStream();
	

	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}
	
	@Test
	@DisplayName("Singleton Instance Test")
	void testSinngletonInstance() {
		DatabaseConnection db1=DatabaseConnection.getInstance();
		DatabaseConnection db2=DatabaseConnection.getInstance();
		assertSame(db1, db2);
	}
	
	@Test
	@DisplayName("Connect and Execute Query test")
	void testConnectAndExecuteQuery() {
		DatabaseConnection dbConnection=DatabaseConnection.getInstance();
		dbConnection.connect();
		assertSame("Connected to the database", outputStreamCaptor.toString());
		
		outputStreamCaptor.reset();
		
		dbConnection.executeQuery("Select * from student");
		assertEquals("Executing query: Select * from student\n", outputStreamCaptor.toString());
		
	}
}

