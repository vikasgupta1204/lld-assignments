package singleton;

public class Client {

	public static void main(String[] args) {
		
		DatabaseConnection db =DatabaseConnection.getInstance();
		db.connect();
		db.executeQuery("Select * from student");
		
	}

}
