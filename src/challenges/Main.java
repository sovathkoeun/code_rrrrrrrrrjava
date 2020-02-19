package challenges;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		
		Compagny compagny = new Compagny("coca-cola");
		System.out.println(compagny);
		compagny.addEmployee(new Employee("Mike", "DoYouLikeRice", 1200));
		compagny.addEmployee(new Employee("Dave", "Rice", 600));
		compagny.addEmployee(new Employee("Robert", "GoodMorning", 1500));
		compagny.addEmployee(new Employee("Daniel", "SusdayBong", 950));
		compagny.addEmployee(new Employee("Samnang", "ILoveJava", 950));
		compagny.addEmployee(new Employee("Roberta", "EatSleepAndEat", 1200));
		compagny.addEmployee(new Employee("Bob", "Potatoe", 600));
		compagny.addEmployee(new Employee("Peter", "Banana", 1500));
		compagny.addEmployee(new Employee("Jack", "Mango", 600));
		System.out.println(compagny.toString());

		// TODO uncomment for exercice3
		List<Employee> employeesMore1000 = compagny.getEmployeesWithSalaryMoreThan(1000);
		System.out.println(employeesMore1000.size() + " employees earn more than 1000 dollars");
		for(Employee employee : employeesMore1000) {
			System.out.println(employee.getShapeName());
		 }
	}
}
