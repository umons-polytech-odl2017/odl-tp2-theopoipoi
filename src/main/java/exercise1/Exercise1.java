package exercise1;

public class Exercise1 {
	public Employee buildFixedSalaryEmployee(String name, int fixedSalary) {
		return new FixedSalaryEmployee(name,fixedSalary);
	}

	public Employee buildBaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission) {
		return null;
	}

	public Employee buildWorkHourSalaryEmployee(String name, int hourlyRoute) {
		return null;
	}
}
