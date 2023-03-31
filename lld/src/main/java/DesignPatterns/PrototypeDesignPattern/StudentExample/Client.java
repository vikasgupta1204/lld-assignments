package DesignPatterns.PrototypeDesignPattern.StudentExample;

public class Client {

	public static final String APR_22="APR_22";
	public static final String INTELLIGENT_APR_22="INTELLIGENT_APR_22"	;
	
	public static void main(String[] args) {
				StudentRegistry studentRegistry=new StudentRegistry();
				fillRegistry(studentRegistry);
				Student s1=studentRegistry.get(APR_22).clone();
				s1.setName("Ram");
				s1.setEmail("ram@gmail.com");
				s1.setAge(26);
				s1.setPsp(99);
				
				System.out.println(s1);
				
				Student i1=studentRegistry.get(INTELLIGENT_APR_22).clone();
				i1.setName("Keshav");
				i1.setAge(29);
				i1.setPsp(100);
				i1.setEmail("keshav@gmail.com");
				
				System.out.println(i1);
				
	}

	private static void fillRegistry(StudentRegistry studentRegistry) {
		Student apr22=	new Student();
		apr22.setBatch("April 22");
		apr22.setAvgBatchPsp(90);
		studentRegistry.register(APR_22, apr22);
		
		IntelligentStudent intelligentStudent=new IntelligentStudent();
		intelligentStudent.setBatch("April 22");
		intelligentStudent.setAvgBatchPsp(95);
		
		studentRegistry.register(INTELLIGENT_APR_22, intelligentStudent);
	
	}

}
