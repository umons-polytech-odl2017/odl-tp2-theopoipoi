package exercise1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WorkHourSalaryEmployeeTest extends AbstractEmployeeTest {

	private final Exercise1 exercise1 = new Exercise1();

	@Test
	public void computeSalary_with_work_hours() {
		Employee employee = exercise1.buildWorkHourSalaryEmployee("Alpha", 80);
		for (int i = 0; i < 160; i++) {
			employee.workOneHour();
		}
		assertThat(employee.computeSalary()).isEqualTo(80 * 160);
	}

	@Test
	public void computeSalary_with_no_work_hours() {
		Employee employee = exercise1.buildWorkHourSalaryEmployee("Bravo", 80);
		assertThat(employee.computeSalary()).isEqualTo(0);
	}

	@Test
	public void computeSalary_with_sales() {
		Employee employee = exercise1.buildWorkHourSalaryEmployee("Charlie", 65);
		for (int i = 0; i < 160; i++) {
			employee.workOneHour();
		}
		for (int i = 0; i < 5; i++) {
			employee.sell();
		}
		assertThat(employee.computeSalary()).isEqualTo(65 * 160);
	}

	@Override
	protected Employee buildEmployee(String name) {
		return exercise1.buildWorkHourSalaryEmployee(name, 75);
	}
}
