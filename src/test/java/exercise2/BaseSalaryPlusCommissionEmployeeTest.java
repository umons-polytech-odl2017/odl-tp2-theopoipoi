package exercise2;

import exercise1.Employee;

public class BaseSalaryPlusCommissionEmployeeTest extends AbstractEmployeeTest {
	private final Exercise2 exercise2 = new Exercise2();

	@Override
	protected Employee buildEmployeeAndEarnSomeMoney() {
		Employee employee = exercise2.buildBaseSalaryPlusCommissionEmployee("Hotel", 1234, 56);
		employee.sell();
		return employee;
	}

	@Override
	protected int getExpectedSalary() {
		return 1290;
	}
}
