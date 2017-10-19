package exercise2;

import exercise1.Employee;

public class BaseSalaryPlusCommissionEmployeeTest extends AbstractEmployeeTest {
	private final Exercise2 exercise2 = new Exercise2();

	@Override
	protected Employee buildEmployee() {
		return exercise2.buildBaseSalaryPlusCommissionEmployee("Hotel", 1234, 56);
	}
}
