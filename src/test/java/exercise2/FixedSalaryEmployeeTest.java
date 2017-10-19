package exercise2;

import exercise1.Employee;

public class FixedSalaryEmployeeTest extends AbstractEmployeeTest {
	private final Exercise2 exercise2 = new Exercise2();

	@Override
	protected Employee buildEmployeeAndEarnSomeMoney() {
		return exercise2.buildFixedSalaryEmployee("India", 1234);
	}

	@Override
	protected int getExpectedSalary() {
		return 1234;
	}
}
