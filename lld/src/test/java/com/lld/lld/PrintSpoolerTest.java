package com.lld.lld;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import printspooler.PrintSpooler;

public class PrintSpoolerTest {

	@Test
	void testSingletonInstance() {
		PrintSpooler ps1=PrintSpooler.getInstance();
		PrintSpooler ps2=PrintSpooler.getInstance();
		assertSame(ps1, ps2, "Both instances should be same");
	}
	
	@Test
	void testAddAndProcessPrintJobs() {
		PrintSpooler ps=PrintSpooler.getInstance();
		ps.addPrintJob("Job 1");
		ps.addPrintJob("Job 2");
		assertSame("Job 1", ps.processNextJob());
		assertSame("Job 2", ps.processNextJob());
		assertNull(ps.processNextJob());
	}
}
