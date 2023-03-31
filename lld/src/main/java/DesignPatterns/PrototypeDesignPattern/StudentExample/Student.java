package DesignPatterns.PrototypeDesignPattern.StudentExample;

public class Student implements Prototype<Student>{
	   private int age;
	    private double psp;
	    private String email;
	    private String name;

	    private String batch;
	    private double avgBatchPsp;
	    
	    public Student() {}
	    
	    public Student(Student student) {	    
	    	this.name=student.name;
	    	this.age=student.age;
	    	this.email=student.email;
	    	this.psp=student.psp;
	    	this.batch=student.batch;
	    	this.avgBatchPsp=student.avgBatchPsp;		    	
	    }
	    
	    @Override
	    public Student clone() {
	    	return new Student(this);
	    }
		public void setAge(int age) {
			this.age = age;
		}
		public void setPsp(double psp) {
			this.psp = psp;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setBatch(String batch) {
			this.batch = batch;
		}
		public void setAvgBatchPsp(double avgBatchPsp) {
			this.avgBatchPsp = avgBatchPsp;
		}

		@Override
		public String toString() {
			return "Student [age=" + age + ", psp=" + psp + ", email=" + email + ", name=" + name + ", batch=" + batch
					+ ", avgBatchPsp=" + avgBatchPsp + "]";
		} 
}
