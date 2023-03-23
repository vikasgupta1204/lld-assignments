package printspooler;

import java.util.LinkedList;
import java.util.Queue;

public class PrintSpooler {
	
	private static PrintSpooler ps;
	private PrintSpooler() {}
	
	public static PrintSpooler getInstance() {
		if(ps==null) {
			ps=new PrintSpooler();
		}
		return ps;
	}
	
	 private Queue< String> jobs=new LinkedList<>();
	public void addPrintJob(String job) {
		jobs.add(job);
	}
	
	public String processNextJob() {
		if(jobs.isEmpty())return null;
		
		return jobs.poll();
	}
}
