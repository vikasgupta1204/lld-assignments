package BuilderDesignPattern;

public class Student {
	   private int age;
	    private String fName;
	    private String lName;
	    private String gender;
	    private double psp;
	    private double weight;
	    
	   private boolean validate(Builder b) {
		   if(b.getfName()==null)return false;
		   if(b.getAge()<18)return false;
		   return true;
	   }
	   
	    
	    private Student(Builder builder) {
	    	if(!validate(builder))throw new IllegalArgumentException("Illegal Arguments error. Please provide valid values");
	    	this.age=builder.age;
	    	this.fName=builder.fName;
	    	this.lName=builder.lName;
	    	this.gender=builder.gender;
	    	this.psp=builder.psp;
	    	this.weight=builder.weight;
	    }

		public static Builder createBuilder() {
	    	return new Builder();
	    }
	    
	    	    
	     static class Builder{
	 	   private int age;
		    private String fName;
		    private String lName;
		    private String gender;
		    private double psp;
		    private double weight;
		    public Student build() {
		    	return new Student(this);
		    }
		    
			public int getAge() {
				return age;
			}
			public Builder setAge(int age) {
				this.age = age;
				return this;
			}
			public String getfName() {
				return fName;
			}
			public Builder setfName(String fName) {
				this.fName = fName;
				return this;
			}
			public String getlName() {
				return lName;
			}
			public Builder setlName(String lName) {
				this.lName = lName;
				return this;
			}
			public String getGender() {
				return gender;
			}
			public Builder setGender(String gender) {
				this.gender = gender;
				return this;
			}
			public double getPsp() {
				return psp;
			}
			public Builder setPsp(double psp) {
				this.psp = psp;
				return this;
			}
			public double getWeight() {
				return weight;
			}
			public Builder setWeight(double weight) {
				this.weight = weight;
				return this;
			}
	    	
	    }


		@Override
		public String toString() {
			return "Student [age=" + age + ", fName=" + fName + ", lName=" + lName + ", gender=" + gender + ", psp="
					+ psp + ", weight=" + weight + "]";
		}
}
