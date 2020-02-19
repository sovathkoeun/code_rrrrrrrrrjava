package challenges;
import java.util.ArrayList;
import java.util.List;

public class Compagny {
	private String name;
	
	public Compagny(String name){
		this.name = name;
	}
	
	private  List<Employee> employee = new ArrayList<>();

	public void addEmployee(Employee employee) {
		this.employee.add(employee); 
	}
	
	public  List<Employee> getEmployeesWithSalaryMoreThan(int Salary) {
		int maxSalary = 0;
		if(Salary < maxSalary) {
			
		}
		return employee; // no
	}
	
	public String getSalaryOverview () {
		return name;	// no
	}

	public void getEmployeesFirstNameWithSalaryBetween(int minSalary, int maxSalary){
					
	}

	@Override
	public String toString() {
		return " Compagny name = " + name + " Employee = "+ employee;
	}
	
}
