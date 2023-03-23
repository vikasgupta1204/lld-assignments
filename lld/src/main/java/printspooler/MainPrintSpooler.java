package printspooler;

import java.awt.print.PrinterAbortException;

public class MainPrintSpooler {

	public static void main(String[] args) {

		PrintSpooler ps=PrintSpooler.getInstance();
		ps.addPrintJob("job 1");
		ps.addPrintJob("job 2");
		ps.addPrintJob("job 3");
		ps.addPrintJob("job 4");;
		System.out.println(ps.processNextJob());
		System.out.println(ps.processNextJob());
		System.out.println(ps.processNextJob());
		System.out.println(ps.processNextJob());
	}

}
