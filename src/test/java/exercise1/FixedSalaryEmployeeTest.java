package exercise1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FixedSalaryEmployeeTest extends AbstractEmployeeTest {
	@Test
	public void computeSalary() {
		Employee employee = Exercise1.buildFixedSalaryEmployee("Alpha", 2500);
		assertThat(employee.computeSalary()).isEqualTo(2500);
	}

	@Test
	public void computeSalary_with_work_hours() {
		Employee employee = Exercise1.buildFixedSalaryEmployee("Bravo", 2625);
		for (int i = 0; i < 160; i++) {
			employee.workOneHour();
		}
		assertThat(employee.computeSalary()).isEqualTo(2625);
	}

	@Test
	public void computeSalary_with_sales() {
		Employee employee = Exercise1.buildFixedSalaryEmployee("Charlie", 2750);
		for (int i = 0; i < 5; i++) {
			employee.sell();
		}
		assertThat(employee.computeSalary()).isEqualTo(2750);
	}

	@Override
	protected Employee buildEmployee(String name) {
		return Exercise1.buildFixedSalaryEmployee(name, 3125);
	}
}
