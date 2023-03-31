package BuilderDesignPattern;

public class Client {

	public static void main(String[] args) {
		Student s1=Student.createBuilder().setfName("Vikas").setlName("Gupta").setAge(28).setGender("Male").setPsp(97.50).setWeight(62).build();		
		System.out.println(s1);	
		Student s2=Student.createBuilder().setfName("Rajesh").build();
		System.out.println(s2);
	}
}
