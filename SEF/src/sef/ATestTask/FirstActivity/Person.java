package sef.ATestTask.FirstActivity;


public class Person {

	private int age;
	private String firstName;
	private String secondName;

	public static void main (String []args){

		String firstName;
		String secondName;
		int age;

	}

//TODO 1 Implement Person Attributes


	//Behavior - parameterized constructor//Behavior - default constructor
	public Person(String name, String firstName, int age){
		this.firstName= firstName;
		this.secondName = name;
		this.age = age;

	}

	//Behavior - default constructor
	public Person(){

	}

	// getter for String firstName
	public String getFirstName(){
		return firstName;
	}


	public void setFirstName(String firstName) throws Exception {
			if ((firstName.contains("1")) || (firstName.contains("2"))) {
				throw new Exception("Wrone name entered");
			} else {
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

	public String introduce() {
		String introduction;
		introduction = "Hello! My name is" + this.firstName + this.secondName + "" + this.age;
		return introduction;
	}

}
//public class PersonException extends Exception{
//	public void PersonException (String message){
//		super(message);
//	}
//}


