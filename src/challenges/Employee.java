package challenges;

public class Employee {
	private final String lastName;
	private final int Salary;
	private final String firstName;
	
	public Employee(String firstName, String lastName, int Salary){
		this.firstName = firstName;
		this.lastName  = lastName;
		this.Salary = Salary;
	}
	public String getShapeName() {
		return firstName;
	}
	
	@Override
	public String toString() {
		return " Employee lastName = " + lastName +", firstName = " + firstName + ", Salary=" + Salary 			  	           + "\n";
	}
	
}
