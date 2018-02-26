package sef.ATestTask.FirstActivity;


public class Person {
	public static void main (String []args){

		private String firstName;
		private String secondName;
		private int age;

	}

//TODO 1 Implement Person Attributes



	//Behavior - default constructor
	public Person(string name, int age){
		this.firstName="Unknown";
		this.secondName = "Unknown";
		this.age = 0;

	}

	//Behavior - parameterized constructor
	public Person(){
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	// getter for String firstName
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	} throws PesronException {
		if (firstName.contains ("1"))|| fristName.contains ("2")throw PersonException ("Find number");
		else{
			this.firstName = firstName;
		}
	}


	// getter for int age
	public int getAge() {
		return age;
	}

	// setter for int age
	public void setAge(int age) {
		this.age = age;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String introduce (){
		String introduction;
		introduction = "Hello! My name is" + this.firstName + this.secondName + "" + this.age;
		return introduction;
	}
}

public class PersonException extends Exception{
	public void PersonException (String message){
		super(message +_"");
	}
}


