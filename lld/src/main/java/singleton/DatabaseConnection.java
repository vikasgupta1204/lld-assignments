package singleton;

public class DatabaseConnection {
	
	private static DatabaseConnection db;
	private DatabaseConnection() {}
	
	public static DatabaseConnection getInstance() {
		if(db==null) {
			db=new DatabaseConnection();
		}
		return db;
	}
	public void connect() {
		System.out.println("Connected to the database");
	}
	
	public void executeQuery(String query) {
		System.out.println("Executing query: "+query);
	}
}
