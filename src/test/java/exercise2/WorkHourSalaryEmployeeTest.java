package exercise2;

import exercise1.Employee;

public class WorkHourSalaryEmployeeTest extends AbstractEmployeeTest {
	private final Exercise2 exercise2 = new Exercise2();

	@Override
	protected Employee buildEmployee() {
		return exercise2.buildWorkHourSalaryEmployee("Juliet", 90);
	}
}
