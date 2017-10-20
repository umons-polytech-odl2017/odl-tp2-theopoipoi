package exercise1;

public class FixedSalaryEmployee extends Employee {
	public int fixedSalary;

	public FixedSalaryEmployee(String a, int b) {
		this.Name = a;
		this.fixedSalary = b;
	}

	@Override
	public int computeSalary() {
		return fixedSalary;
	}
}
