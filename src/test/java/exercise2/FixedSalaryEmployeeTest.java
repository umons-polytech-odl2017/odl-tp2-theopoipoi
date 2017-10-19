package exercise2;

import exercise1.Employee;

public class FixedSalaryEmployeeTest extends AbstractEmployeeTest {
	private final Exercise2 exercise2 = new Exercise2();

	@Override
	protected Employee buildEmployee() {
		return exercise2.buildFixedSalaryEmployee("India", 1234);
	}
}
